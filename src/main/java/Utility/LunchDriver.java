package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LunchDriver {
	public static WebDriver driver;
	
	
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		LunchDriver.driver = driver;
	}
	public static void startDriver(String browser) {
		
		switch (browser) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
			break;
		case "Internet Explorer":
			break;
		default:
			break;
		}
		driver.get(ConfigReader.getProp().getProperty("url"));
		driver.manage().window().maximize();
		
	}

}
