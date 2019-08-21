package Pages;

import org.openqa.selenium.WebDriver;
import org.testng.SkipException;

import ObjectRepository.DashboardPageOr;

public class DashboardPage extends DashboardPageOr {
	WebDriver formspage;

	public DashboardPage(WebDriver driver) {
		super(driver);
		this.formspage=driver;
		if(!Apps.isDisplayed()) {
			throw new SkipException("this is not dashboard page");
		}
	}
	public AppsPageFunc clickOnApp()
	{
		Apps.click();
		return new AppsPageFunc(formspage);	
	}
	public LoginPageFunc logout()
	{
		logout.click();
		return new LoginPageFunc(formspage);
	}
	
	


}
