package com.example.demo;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class XMLTestResultsToExcel{
    public static void main(String[] args) {
        String xmlFilePath = "E:/Siddiq/testng-results.xml";  //Give you input path

        String excelFileName = getExcelFileNameWithTimestamp();
        String excelFilePath = System.getProperty("user.home") + "/Downloads/" + excelFileName;

        List<TestResult> testResults = parseXMLTestResults(xmlFilePath);
        writeToExcel(excelFilePath, testResults);
    }

    private static List<TestResult> parseXMLTestResults(String xmlFilePath) {
        List<TestResult> testResults = new ArrayList<>();
        
        //To get the description from reading the Excel file (By defining Path)
//        Map<String, String> testDescriptions = getTestDescriptions();
        
        //To get the Description from TestDescription class
        TestDescription td = new TestDescription();
        Map<String, String> testDescriptions = td.getTestDescriptions();

        try {
            File xmlFile = new File(xmlFilePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("testng-results");
            Element testngResultsElement = (Element) nodeList.item(0);
            NodeList lineNodes = testngResultsElement.getElementsByTagName("line");

            for (int i = 0; i < lineNodes.getLength(); i++) {
                Node lineNode = lineNodes.item(i);
                String lineContent = lineNode.getTextContent();

                // Extract Test Case Id and Status from the line content
                String testCaseId = extractTestCaseId(lineContent);
                TestStatus status = extractTestStatus(lineContent);
                String description = testDescriptions.getOrDefault(testCaseId, "Unknown description");
                testResults.add(new TestResult(testCaseId, status, description));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return testResults;
    }

    private static String extractTestCaseId(String lineContent) {
        //As the Test Case Id is enclosed in square brackets.
    	int startIdx = lineContent.indexOf("TSQA_");
        int endIdx = lineContent.indexOf("]", startIdx);
        if (startIdx != -1 && endIdx != -1) {
            return lineContent.substring(startIdx, endIdx);
        } else {
            return "Unknown";
        }
        
    }

    private static TestStatus extractTestStatus(String lineContent) {
        if (lineContent.contains("PASSED")) {
            return TestStatus.PASSED;
        } else if (lineContent.contains("FAILED")) {
            return TestStatus.FAILED;
        } else if (lineContent.contains("SKIPPED")) {
            return TestStatus.SKIPPED;
        } else {
            return TestStatus.UNKNOWN;
        }
    }
    
//  --To below code is to get Description from Excel---  
//    private static Map<String, String> getTestDescriptions() {
//        Map<String, String> testDescriptions = new HashMap<>();
//
//        try (FileInputStream fis = new FileInputStream("E:/Siddiq/Data Excel/DescriptionOfTest.xlsx");  //Seting up the path of excel
//             Workbook workbook = new XSSFWorkbook(fis)) {
//            Sheet sheet = workbook.getSheetAt(0);
//
//            for (int rowIdx = 1; rowIdx <= sheet.getLastRowNum(); rowIdx++) {
//                Row row = sheet.getRow(rowIdx);
//                if (row != null) {
//                    String testCaseId = row.getCell(0).getStringCellValue();
//                    String description = row.getCell(1).getStringCellValue();
//                    testDescriptions.put(testCaseId, description);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return testDescriptions;
//    }
    
    private static void writeToExcel(String excelFilePath, List<TestResult> testResults) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Test Results");
            int rowIdx = 0;

            // Create header row
            Row headerRow = sheet.createRow(rowIdx++);
            headerRow.createCell(0).setCellValue("Test Case Id");
            headerRow.createCell(1).setCellValue("Status");
            headerRow.createCell(2).setCellValue("Description");

            // Fill data rows
            for (TestResult testResult : testResults) {
                Row dataRow = sheet.createRow(rowIdx++);
                dataRow.createCell(0).setCellValue(testResult.getTestCaseId());
                dataRow.createCell(1).setCellValue(testResult.getStatus().toString());
                dataRow.createCell(2).setCellValue(testResult.getDescription());
            }

            // Save the workbook to the file
            try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
                workbook.write(outputStream);
                System.out.println("Excel file created successfully.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static String getExcelFileNameWithTimestamp() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
        String timestamp = dateFormat.format(date);
        return "XMLtoExcelFile_" + timestamp + ".xlsx";
    }
    
   

}

enum TestStatus {
    PASSED,
    FAILED,
    SKIPPED,
    UNKNOWN
}

class TestResult {
    private String testCaseId;
    private TestStatus status;
    private String description;

    public TestResult(String testCaseId, TestStatus status, String description) {
        this.testCaseId = testCaseId;
        this.status = status;
        this.description = description;
    }

    public String getTestCaseId() {
        return testCaseId;
    }

    public TestStatus getStatus() {
        return status;
    }

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	} 
      
}

