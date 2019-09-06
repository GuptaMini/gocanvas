package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Pages.AppsPageFunc;
import Pages.DashboardPage;
import Pages.LoginPageFunc;
import Utility.Commonfunc;
import Utility.ConfigReader;
import Utility.LunchDriver;

public class BaseTestCase {
	static WebDriver driver;
	DashboardPage dashboardpage;
	AppsPageFunc formsfunpage;
	LoginPageFunc loginpage;
	Commonfunc comfunvariable;
	
	@BeforeTest
	public void beforetest() {
		ConfigReader.readPropertiesFile();
	}
		
	@BeforeClass
	public void beforeclass() {

		LunchDriver.startDriver(ConfigReader.getProp().getProperty("browser"));
		driver = LunchDriver.getDriver();
		loginpage = new LoginPageFunc(driver);
		comfunvariable = new Commonfunc(driver);		
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.close();
	}
}