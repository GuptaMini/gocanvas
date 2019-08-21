package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Pages.AppBuilderNewFuncPage;
import Pages.AppsPageFunc;
import Pages.CreateAppfuncPage;
import Pages.DashboardPage;
import Utility.ConfigReader;



public class CreateAppPageTest extends BaseTestCase{
	AppBuilderNewFuncPage AppBuilder;
	DashboardPage AppsPageTest;
	AppsPageFunc appPage;
	DashboardPage dashboardpage;
	CreateAppfuncPage StartCreateApp;
	HashMap<String, String> appDetails;
	
	@Test(groups = {"FirstGroup"})
	public void verifyCreateApp() throws InterruptedException
	{
		dashboardpage = loginpage.logintoApp(ConfigReader.getProp().getProperty("username").toString(), ConfigReader.getProp().getProperty("password").toString());
		appPage = dashboardpage.clickOnApp();
		AppBuilder=appPage.clickOnCreateApp();
		StartCreateApp = AppBuilder.clickOnStart();
		StartCreateApp.enterAppName("AutoScriptApp");
		appDetails = new HashMap<>();
		appDetails.put("newAppName", StartCreateApp.getNewApp());
		appDetails.put("textgggype", "Short Text");
		appDetails.put("dropdown", "Drop Down");
		appDetails.put("checkbox", "Checkbox");
		appDetails.put("number", "Number");
		appDetails.put("number", "Number");
		appDetails.put("cal", "Calculation");
				
		StartCreateApp.selectItems("Text and Numbers","Short Text");
		StartCreateApp.selectItems("Text and Numbers", "Number");
		StartCreateApp.selectItems("Text and Numbers", "Number");
		StartCreateApp.selectItems("Text and Numbers", "Calculation");
		StartCreateApp.selectItems("Choices","Drop Down");
		StartCreateApp.selectItems("Other","Checkbox");
				
		StartCreateApp.clickonAddscreen();
		StartCreateApp.clickonSaveBtn();
		StartCreateApp.clickonPublishtoDeviceBtn();
		StartCreateApp.clickonAssigntoGroups();
		StartCreateApp.clickonNextAssigntoUsers();
		StartCreateApp.clickonPublishBtn();
		
		appPage=StartCreateApp.clickoncloseBuilderBtn();
		
		Assert.assertTrue(appPage.VerifyNewAppOnAppPg(appDetails));
		Assert.assertTrue(appPage.verifyExistingFields(appDetails));
		
		}
}
