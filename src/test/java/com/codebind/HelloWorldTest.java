package com.codebind;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorldTest {
	@Test
	public void Login()
	{
		
		System.setProperty("webdriver.gecko.driver","drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		/*driver.get("https://wordpress.com/log-in");
		WebElement ele = null;
		ele.findElement(By.linkText("Lost your password?"));
*/
	}

}
