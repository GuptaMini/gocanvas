package Pages;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ObjectRepository.CreateAppPageOR;


public class CreateAppfuncPage extends CreateAppPageOR {

	public static WebDriver driver;
	DashboardPage AppsPageTest;
	AppsPageFunc appPage;

	public static String newAppName = "";

	public static String getNewApp() {
		return newAppName;
	}

	public static void setAppName(String newAppName) {
		CreateAppfuncPage.newAppName = newAppName;
	}

	public CreateAppfuncPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void selectItems(String panelType, String value) {
		try {
			for (WebElement eachPanel : panels) {
				if (eachPanel.findElement(By.xpath(eachPanelXpath)).getText().equalsIgnoreCase(panelType)) {
					List<WebElement> innerElement = eachPanel.findElements(By.xpath(innerElementXpath1));
					for (WebElement webElement : innerElement) {
						if (webElement.getText().contains(value)) {
							webElement.click();
							break;
						}
					}
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public void enterAppName(String appNam) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		appName.click();
		appName.sendKeys(appNam + now);
		setAppName(appNam + now);
	}
	public CreateAppfuncPage clickonAddscreen() {
		addScreen.click();
		return this;
	}
	public CreateAppfuncPage clickonSaveBtn() {
		save.click();
		return this;
		
	}
	public CreateAppfuncPage clickonPublishtoDeviceBtn() {
		publishToDevice.click();
		return this;
	}
	public CreateAppfuncPage clickonAssigntoGroups() {
		try {
			if (assignToGroups.isDisplayed()) {
				assignToGroups.click();
				checkBoxAtModel1.click();
			}
		} catch (Exception e) {
		}
		return this;
	}
	public CreateAppfuncPage clickonNextAssigntoUsers() {
		nextAssignToUsers.click();
		return this;
	}
	public CreateAppfuncPage clickonPublishBtn() {
		checkBoxAtModel2.click();
		publish.click();
		return this;
	}
	public AppsPageFunc clickoncloseBuilderBtn() {
		closeAppBuilder.click();
		return new AppsPageFunc(this.driver);
	}
}
