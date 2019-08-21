package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.SkipException;
import ObjectRepository.LoginPageOR;

public class LoginPageFunc extends LoginPageOR {
	static WebDriver pagedriver;
	public LoginPageFunc(WebDriver driver) {
		super(driver);
		pagedriver = driver;
		if (!firstName.isDisplayed()) {
			throw new SkipException("this is not login page");
		}
	}
	public DashboardPage logincredential(String fname, String pass) throws InterruptedException {
		Thread.sleep(2000);
		firstName.sendKeys(fname);
		password.sendKeys(pass);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		login.click();
		return new DashboardPage(pagedriver);
	}
	
	public DashboardPage logintoApp(String fname, String pass) throws InterruptedException {
		// Log.click();
		Thread.sleep(2000);
		firstName.sendKeys(fname);
		password.sendKeys(pass);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		login.click();
		return new DashboardPage(pagedriver);
	}
}
