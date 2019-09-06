package Pages;

import org.openqa.selenium.WebDriver;

import ObjectRepository.billingContactOr;

public class Billingcontactfuncpage extends billingContactOr{
	WebDriver driver;
	public Billingcontactfuncpage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public void clickOnAccount() {
		account.click();
	}
}
