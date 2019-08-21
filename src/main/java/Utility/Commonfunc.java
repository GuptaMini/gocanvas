package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Commonfunc {
	WebDriver driver;
	
	public Commonfunc(WebDriver driver)
	{
		this.driver=driver;
	}
	public void webDriverSendKeys(WebElement ele, String value)
	{
		try 
		{			
			ele.sendKeys(value);
			System.out.println();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		public void webDriverClick(WebElement element)
		{
			element.click();
		}
		public WebDriver getDriver() {
			return driver;
		}
		public void setDriver(WebDriver driver) {
			this.driver = driver;
		}
		
	}

