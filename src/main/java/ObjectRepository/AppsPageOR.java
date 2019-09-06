package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppsPageOR extends MenuPageOR{

	public AppsPageOR(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Create App']")
	protected WebElement createApp;
	//driver.findElement(By.xpath("//span[text()='Create App']")).click();
	
	
	@FindBy(xpath = "//tr[@class='draggable-app ui-draggable ui-draggable-handle']")
	protected List<WebElement> lst_CreatedApps;
			
	protected String appName="./td[2]/a";
	
	protected String editApp="./td[5]/a[@data-original-title='Edit App']";
	
	@FindBy(xpath = "//input[@id = 'common_search_field']")
	protected WebElement searchApps;
	
	@FindBy(xpath = "//div[@class='field-label']/div")
	protected List<WebElement> fieldList ;
	
	
	
	
	
	
	}
