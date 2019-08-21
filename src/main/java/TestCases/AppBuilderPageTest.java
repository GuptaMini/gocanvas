//package TestCases;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//
//import Pages.AppBuilderNewFuncPage;
//import Pages.AppsPageFunc;
//import Pages.CreateAppfuncPage;
//import Pages.DashboardPage;
//import Pages.LoginPageFunc;
//import Pages.MenuFuncPage;
//
//public class AppBuilderPageTest extends BaseTestCase {
//
//	AppBuilderNewFuncPage AppBuilder;
//	DashboardPage AppsPageTest;
//	AppsPageFunc appPage;
//	DashboardPage dashboardpage;
//	CreateAppfuncPage StartCreateApp;
//
//	@Test
//	public void VerifyStartbutton() throws InterruptedException {
//
//		dashboardpage = loginpage.enterdetails("mini.gupta@3pillarglobal.com", "GOCANVAS");
//		appPage = dashboardpage.clickOnApp();
//		Thread.sleep(2000);
//		try {
//		AppBuilder = appPage.clickOnCreateApp();
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//		Thread.sleep(4000);
//		StartCreateApp = AppBuilder.clickOnStart();
//
//	}
//}
