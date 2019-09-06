package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class billingContactOr {
	public billingContactOr(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Account')]")
	protected WebElement account;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/div[1]/a[1]") 
	protected WebElement billEditButton ;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[2]/div[2]/div[1]/a[1]")
	protected WebElement payEditButton;
	
	@FindBy(xpath = "//input[@id= 'billing_contact_first_name']") 
	protected WebElement billingFirstName;
	
	@FindBy(xpath = "//input[@id= 'billing_contact_middle_initial']") 
	protected WebElement billingMidName;
	
	@FindBy(xpath = "//input[@id= 'billing_contact_last_name']") 
	protected WebElement billingLastName;

}
