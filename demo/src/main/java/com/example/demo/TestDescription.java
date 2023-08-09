package com.example.demo;

import java.util.Map;
import java.util.HashMap;

public class TestDescription {

	public TestDescription() {
		// TODO Auto-generated constructor stub
	}
	
	public static Map<String, String> getTestDescriptions() {
        // Define test descriptions based on Test Case Id
        Map<String, String> testDescriptions = new HashMap<>();
        testDescriptions.put("TSQA_12062", "Hello everyone");
        testDescriptions.put("TSQA_12063", "Bye Everyone");
        testDescriptions.put("TSQA_10016","Ensure that set recordings must be displayed under Recent recordings swimlane");
        testDescriptions.put("TSQA_10017","Ensure that user is able to play the Recent Recording with a single click");
        testDescriptions.put("TSQA_10028","Ensure that user is able to see the availability status of recordings");
        testDescriptions.put("TSQA_10083","Ensure that Recordings start from the same point on all the devices when play fom Recent Recordings swimlane");
        testDescriptions.put("TSQA_10094","Ensure that Play icon is displayed when the recorded asset is playable (Single Episode only)");
        testDescriptions.put("TSQA_10096","Ensure that details page is displayed when user clicks on Recordings metadata (Single Program only)");
        testDescriptions.put("TSQA_10098","Ensure that User is able to Cancel the recording from the details page (For Single Program)");
        testDescriptions.put("TSQA_10409","Ensure that user is able to see the played recordings in the Resume swimlane");
        testDescriptions.put("TSQA_10410","Ensure that Bookmark should be retained to the Recording in Resume swimlane");
        testDescriptions.put("TSQA_10735","Ensure that restart  indictor is available in Mini-EPG for the restartable program");
        testDescriptions.put("TSQA_10738","Ensure that restart  indictor is available in EPG for the restartable program");
        testDescriptions.put("TSQA_12058","Ensure that user can  FF up to Live point only for restartable program");
        testDescriptions.put("TSQA_12062","Ensure that on selecting Restart icon, playback starts from the beginning for the current program");
        testDescriptions.put("TSQA_12200","Ensure Game and Sports zone buttons are displayed in Banner");
        testDescriptions.put("TSQA_13109","TSQA_8354 : Ensure that user is able to set the episode recordings from Live playerEnsure that Live button is present in the UI to go to live position with one click");
        testDescriptions.put("TSQA_13121","Ensure user should be able to set recording for Live asset");
        testDescriptions.put("TSQA_13469","Ensure in You might like this user is displayed with maximum 10 assets in a row");
        testDescriptions.put("TSQA_13519","");
        testDescriptions.put("TSQA_15642","Resume_Grouping of series_Recent partially watched episode");
        testDescriptions.put("TSQA_1600","Verify kids profile is able to schedule cPVR recordings");
        testDescriptions.put("TSQA_1604","Home Page_Main menu-UI_Menu");
        testDescriptions.put("TSQA_1608","Home Page_Main menu-UI_RCU");
        testDescriptions.put("TSQA_1613","Home Page_Main Menu Behaviour Change_Main Menu focus");
        testDescriptions.put("TSQA_16146","Home Page_Navigation_Menu and Stripes");
        testDescriptions.put("TSQA_16150","Ensure user is displayed with Who's Watching Screen when launching app");
        testDescriptions.put("TSQA_1617","Ensure standard user cannot enable/disable parental/purchase PIN settings");
        testDescriptions.put("TSQA_1634","Home Page_Navigation_Press back key once");
        testDescriptions.put("TSQA_1637","Search_Basic Search UI_Result Stripes");
        testDescriptions.put("TSQA_1640","Search_Basic Search UI_LiveTV Search metadata");
        testDescriptions.put("TSQA_1643","Search_Basic Search UI_Fallback message");
        testDescriptions.put("TSQA_1645","Search_Basic Search UI_Type character");
        testDescriptions.put("TSQA_1654","Search_Basic Search UI_Enter key");
        testDescriptions.put("TSQA_1660","Settings_Main Settings Page_Icon");
        testDescriptions.put("TSQA_1666","TSQA-3550 : Ensure the toggle switch turns green on enabling DV + Settings_Main Settings Page_Enable CC/AD switch");
        testDescriptions.put("TSQA_1669","Settings_Main Settings Page_System Information");
        testDescriptions.put("TSQA_1672","Ensure user is not able to see Logout option under Settings screen ");
        testDescriptions.put("TSQA_1675","Live Page_Live/Guide Entry Stripe_Surf Zone Stripe Guide");
        testDescriptions.put("TSQA_16799","Ensure user is able to open EPG with focus on ongoing program");
        testDescriptions.put("TSQA_16802","Ensure Custom On Now sports stripe is displayed under Sports zone");
        testDescriptions.put("TSQA_16804","Ensure playback is launched on selecting any showcard from On Now Sports stripe");
        testDescriptions.put("TSQA_16805","Ensure Custom Upcoming sports stripe is displayed under Sports zone");
        testDescriptions.put("TSQA_16808","Ensure upcoming sports stripe showcase different Sports league");
        testDescriptions.put("TSQA_1703","Ensure details page is displayed on selecting any showcard from Upcoming Sports stripe");
        testDescriptions.put("TSQA_17116","Ensure the program playing has no audio and video issues");
        testDescriptions.put("TSQA_17118","Ensure “Restart available” option is displayed in the “Filter & sort” panel");
        testDescriptions.put("TSQA_17119","Ensure Filter & sort panel does not close, on selecting 'Restart available' toggle");
        testDescriptions.put("TSQA_17122","Ensure 'Restart available' option is displayed after “Jump to date” option");
        testDescriptions.put("TSQA_1724","Ensure restart available displayed next to the FIiler option in top-left of the screen");
        testDescriptions.put("TSQA_1731","EPG (TV Guide)_Program info_Program preview");
        testDescriptions.put("TSQA_17943","EPG (TV Guide)_Program info_Program info update");
        testDescriptions.put("TSQA_22590","Lookback-CL_Video player_RestartEnsureEnsure select Restart takes user to the beginning of the current program played");
        testDescriptions.put("TSQA_22606","Ensure clicking on the poster open the details page of the asset");
        testDescriptions.put("TSQA_22609","Ensure E-rated content is displayed under 'On Now' swimlane");
        testDescriptions.put("TSQA_2412","Ensure E-rated content is not displayed under 'Recent Recordings' swimlane");
        testDescriptions.put("TSQA_24399","Ensure the currency displayed in the Rent button is CAD dollars only");
        testDescriptions.put("TSQA_2447","PPV_Purchase_Showtimes panel : Ensure that user is displayed with Showtimes panel, when they are more than one event is present to purchase.");
        testDescriptions.put("TSQA_2478","Ensure the View All is displayed at the end of the stripe for the Search results stripe");
        testDescriptions.put("TSQA_2480","Stripe_Cast&Crew_UI");
        testDescriptions.put("TSQA_2487","Stripe_Cast&Crew_Cast style image");
        testDescriptions.put("TSQA_2489","Stripe_Landing stripe UI_Dynamic metadata");
        testDescriptions.put("TSQA_2536","Ensure landing stripe is displayed if there is atleast one asset to display");
        testDescriptions.put("TSQA_2583","Favourites_VOD favourite stripe_Favourite movies and series");
        testDescriptions.put("TSQA_2627","Home page _Favourites_Favourite channel stripe add/edit_Edit channels Ensure user is able to edit the Favourite channel list.");
        testDescriptions.put("TSQA_2628","Ensure that user is able to remove apps from Featured apps");
        testDescriptions.put("TSQA_2814","Ensure that user is able to remove apps from Installed apps");
        testDescriptions.put("TSQA_2819","Ensure that user is able to see the next episode binge watching overlay to continue watching  if avaliableEnsure <S#E# Episode Title> appears as a first line of metadata for TV showsoverlay to continue watching  if avaliable");
        testDescriptions.put("TSQA_2837","Ensure that clicking the play button starts playback for next asset");
        testDescriptions.put("TSQA_2847","Ensure user is able to access Mini-EPG in different ways");
        testDescriptions.put("TSQA_2849","TSQA-1414 :Ensure pressing ok button on On Nowcard opens the Live player +Live TV playback should start within few seconds");
        testDescriptions.put("TSQA_2887","Ensure that pressing OK on On Next will open program detail");
        testDescriptions.put("TSQA_2889","Details page_VOD movie stripes_Person stripe");
        testDescriptions.put("TSQA_2892","Ensure user is able to open VOD movie cast and crew details by selecting the cast tile");
        testDescriptions.put("TSQA_2910","Ensure user is able to open Live TV Show cast and crew details by selecting the cast tile");
        testDescriptions.put("TSQA_2913","Ensure secondary button Trailer is available for an assets and its playable");
        testDescriptions.put("TSQA_2914","Details page_Buttons_Add to favourites, Details Page_Buttons_Remove from Favourites");
        testDescriptions.put("TSQA_2916","Details Page_Buttons_Remove from Favourites");
        testDescriptions.put("TSQA_2922","My Apps_Apps page_Featured apps stripe");
        testDescriptions.put("TSQA_2927","My Apps_Home My Apps_View all");
        testDescriptions.put("TSQA_2936","Ensure the asset description is displayed and truncated if title is too long");
        testDescriptions.put("TSQA_2938","Ensure appropriate metadata is displayed on the TV series asset details page");
        testDescriptions.put("TSQA_2953","Ensure VOD TV Series detail page is opened from the swimlane tiles");
        testDescriptions.put("TSQA_2954","Search_My search query_Search for Future LiveTV Show/movie");
        testDescriptions.put("TSQA_2956","Ensure user can watch movies trailer from asset details page");
        testDescriptions.put("TSQA_2957","Ensure More Like This stripe is available for TV Shows");
        testDescriptions.put("TSQA_2958","Ensure More Like This stripe is available for movies");
        testDescriptions.put("TSQA_2962","Details Page_Stripes_Related content stripe for Live TV");
        testDescriptions.put("TSQA_2963","Ensure pressing Ok button on View all card opens up the gallery grid page");
        testDescriptions.put("TSQA_2970","Gallery_Grid type_Select an asset");
        testDescriptions.put("TSQA_2977","Ensure selecting an asset from Gallery catalog page opens up the details page of an asset");
        testDescriptions.put("TSQA_3017","Gallery_Actor Static Grid_Details screen on select asset from Cast page");
        testDescriptions.put("TSQA_3020","Ensure user is displayed with Rotten tomatoes score on the movies details page ");
        testDescriptions.put("TSQA_3021","Ensure user is able to navigate between settings menu items using Up and Down keys of the RC , navigation should not be circular");
        testDescriptions.put("TSQA_3030","Settings_Language preference_Backkey press to return to settings menu");
        testDescriptions.put("TSQA_3037","Ensure that move function is unavailable for Installed apps");
        testDescriptions.put("TSQA_3041","Ensure that user is able to apply the filter to view channels");
        testDescriptions.put("TSQA_3044","Ensure that move function is unavailable for Featured apps");
        testDescriptions.put("TSQA_3243","Mini-EPG_Show playable channels _OOH Network");
        testDescriptions.put("TSQA_3398","Ensure user is not able to see green circle for notification icon, when all received notifications are seen");
        testDescriptions.put("TSQA_3399","TSQA-1524 : Ensure user is displayed with Rotten tomatoes score on the movies details page ");
        testDescriptions.put("TSQA_3402","Ensure user can open filter and sort menu from RC when filter and sort button is focused");
        testDescriptions.put("TSQA_3403","Ensure user can view the content section under Gallery filter menu for movies");
        testDescriptions.put("TSQA_3408","Ensure that the sort by section is available under Filters and sort menu");
        testDescriptions.put("TSQA_3420","Ensure that selecting the sorting options applies the changes immediately and the metadata is updated for the selected sorting option immediately");
        testDescriptions.put("TSQA_3458","Ensure that number of titles updates immidately to indicate the number of asset in selected Genre");
        testDescriptions.put("TSQA_39","Ensure user is able to access On boarding tutorials via settings");
        testDescriptions.put("TSQA_4171","Ensure that user is able to play and trickplay any VOD asset without any issues");
        testDescriptions.put("TSQA_4423","Ensure that user is able to access Account Info page and Account related information is displayed ");
        testDescriptions.put("TSQA_4677","Ensure Search can be accessed from home after second level navigation");
        testDescriptions.put("TSQA_4679","Ensure the user is able to access from settings any new tutorial and Contextual help images added");
        testDescriptions.put("TSQA_4681","TSQA_1351 :Ensure user is able to see the System information options on System Information screen ");
        testDescriptions.put("TSQA_4700","Ensure that Intenet data usage page opens up on selcting Internet data usage option under settings ");
        testDescriptions.put("TSQA_4701","Ensure user is able to access the guide settings button by pressing Options button on RC");
        testDescriptions.put("TSQA_4703","Ensure User should able to access the guide settings button by pressing back button on RC");
        testDescriptions.put("TSQA_4704","Ensure that on pressing back or the right arrow key, the guide settings panel gets closed");
        testDescriptions.put("TSQA_4724","Ensure the user is able to see the selected filter option on the top left of the screen");
        testDescriptions.put("TSQA_4729","Ensure that Search icon is displayed on the gallery pages");
        testDescriptions.put("TSQA_5333","Ensure that user is able to see the contextual menu when long press OK on any app");
        testDescriptions.put("TSQA_5334","Ensure that when live events are searched, the search results are in a group and number of search results appear beside the header");
        testDescriptions.put("TSQA_5335","Search_Search results_Search by Title");
        testDescriptions.put("TSQA_6439","Ensure that when TV series are searched, the search results are in a group and number of search results appear beside the header");
        testDescriptions.put("TSQA_6441","Logged in User - Trailer icon on Movies details page");
        testDescriptions.put("TSQA_6444","Trailer_Loggedin user_Seelct icon on Movies details page");
        testDescriptions.put("TSQA_6451","Trailer_Loggedin user_Trailer does not appear in resume");
        testDescriptions.put("TSQA_6452","Movies & TV Shows favourites filtering_Rent/Play on demand for searched VOD asset");
        testDescriptions.put("TSQA_6455","Movies & TV Shows favourites filtering_On Now program");
        testDescriptions.put("TSQA_6459","Ensure count for search results is displayed");
        testDescriptions.put("TSQA_6462","Search_Search results_Space");
        testDescriptions.put("TSQA_6465","Search_Search results_Results dipslayed with 2 min characters");
        testDescriptions.put("TSQA_6467","Search_Search results_CountSearch_Search results_Select asset from searched results");
        testDescriptions.put("TSQA_6523","Search_Search results_Year and rating");
        testDescriptions.put("TSQA_6610","Search_NOT Sensitive to Punctuation, Symbols and Space_Movies");
        testDescriptions.put("TSQA_6611","LiveTV_Asset card_Contextual Menu");
        testDescriptions.put("TSQA_6617","Resume_Movies_Details Page");
        testDescriptions.put("TSQA_6618","LiveTV_Asset card_Contextual Menu");
        testDescriptions.put("TSQA_6619","LiveTV_Contextual Menu_Details");
        testDescriptions.put("TSQA_6620","LiveTV_Contextual Menu_Add to favourites");
        testDescriptions.put("TSQA_6696","LiveTV_Contextual Menu_Remove from favourites");
        testDescriptions.put("TSQA_6817","Ensure new channel list is displayed on entering all 4 digits as a channel number input");
        testDescriptions.put("TSQA_6818","Ensure TV show level poster appears for TV show stripe");
        testDescriptions.put("TSQA_6819","Ensure release year appears as the first row metadata");
        testDescriptions.put("TSQA_6823","Ensure rating appears as a second row metadata");
        testDescriptions.put("TSQA_6825","Ensure <program Title> appears as a first line of metadata for the Movies");
        testDescriptions.put("TSQA_7234","Ensure remaining time appears as a second line of metadata for movies");
        testDescriptions.put("TSQA_8293","Ensure that pressing back button from Universal search page opened from the gallery pages takes back to the gallery page");
        testDescriptions.put("TSQA_8294","Ensure user is able to see Switch Account under Account Info section of settings after auto login");
        testDescriptions.put("TSQA_8296","Ensure user is able to select Switch Account option");
        testDescriptions.put("TSQA_8350","Ensure user is presented manual login screen on selecting Log out option");
        testDescriptions.put("TSQA_8353","Ensure that user is able to set the single episode recordings for On now show from Guide");
        testDescriptions.put("TSQA_8360","Ensure that user is able to set the series recordings for future program from Guide");
        testDescriptions.put("TSQA_8397","Ensure that user is able to set the episode recordings from Live player");
        testDescriptions.put("TSQA_8400","Ensure user is able to see all the recordings with filter by all option selectedn");
        testDescriptions.put("TSQA_8666","Ensure user is able to see the newest recordings first");
        testDescriptions.put("TSQA_8667","Ensure user can set up Parental PIN");
        testDescriptions.put("TSQA_8794","Ensure user can set up Purchase PIN");
        testDescriptions.put("TSQA_8800","Ensure Pressing [OK] key while “Parental PIN toggle” is focused enable parental PIN and user must first set the Parental PIN:");
        testDescriptions.put("TSQA_8808","Ensure that parental PIN is disabled by toggling Parental pin option");
        testDescriptions.put("TSQA_8852","Ensure user is able to disable the Purchase PIN");
        testDescriptions.put("TSQA_9333","Ensure user is able to access web link from 'Recover your Parental PIN' option for Parental PIN active screen ");
        testDescriptions.put("TSQA_9334","Ensure that the Recorded section display all the recorded assets (series, movies, epsiodes)");
        testDescriptions.put("TSQA_9336","Ensure that by default focus is on 1st card in the recordings and Recorded tab is highlighted");
        testDescriptions.put("TSQA_9338","Ensure that total number of recorded assets are dispalyed in Brackets next to section name");
        testDescriptions.put("TSQA_9345","Ensure that while navigating, recording tabs and information related to storage is visible all the time");
        testDescriptions.put("","Ensure that on pressing up arrow from topmost card focus moves to Recordings option in Top menu");
       
        // Add more test descriptions as needed
        return testDescriptions;
    }

}
