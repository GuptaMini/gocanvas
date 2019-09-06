package Pages;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.google.common.collect.Multiset.Entry;

import ObjectRepository.AppsPageOR;

public class AppsPageFunc extends AppsPageOR {
	WebDriver driver;

	public AppsPageFunc(WebDriver driver) {
		super(driver);
		this.driver = driver;

		if (!createApp.isDisplayed()) {
			throw new SkipException("this is not Apps page");
		}
	}

	public AppBuilderNewFuncPage clickOnCreateApp() {
		createApp.click();
		return new AppBuilderNewFuncPage(this.driver);
	}

	public AppsPageFunc verifyNewApp() {
		return new AppsPageFunc(this.driver);
	}

	public boolean VerifyNewAppOnAppPg(HashMap<String, String> appt) throws InterruptedException {
		boolean found = false;
		System.out.print(appt.get("newAppName"));
		System.out.println("");
		searchApps.sendKeys(appt.get("newAppName"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();

		for (WebElement applist : lst_CreatedApps) {
			if (applist.findElement(By.xpath(appName)).getText().equalsIgnoreCase(appt.get("newAppName"))) {
				found = true;
				WebElement editLink = applist.findElement(By.xpath(editApp));
				editLink.click();
				Thread.sleep(8000);
			}
		}
		return found;
	}

	public boolean verifyExistingFields(HashMap<String, String> appt) {
		boolean isMatched = false;
		for (HashMap.Entry<String, String> entry : appt.entrySet()) {
			isMatched = false;
			for (WebElement fList : fieldList) {
				if (fList.getText().equalsIgnoreCase("New " + entry.getValue())) {
					System.out.println(entry.getValue() + " found in ui");
					isMatched = true;
					break;
				}
			}
			if (!isMatched) {
				System.out.println(entry.getValue() + "not found in ui");
			}
		}
		return isMatched;
	}
}
