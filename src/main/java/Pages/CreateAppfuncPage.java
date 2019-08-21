package Pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
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
				if (eachPanel.findElement(By.xpath(eachPanelxpath)).getText().equalsIgnoreCase(panelType)) {
					List<WebElement> innerElement = eachPanel.findElements(By.xpath(Innerelementxpath1));
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
	public void enterAppName(String AppNam) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		AppName.click();
		AppName.sendKeys(AppNam + now);
		setAppName(AppNam + now);
	}
	public void clickonAddscreen() {
		Addscreen.click();
	}
	public void clickonSaveBtn() {
		Save.click();
	}
	public void clickonPublishtoDeviceBtn() {
		Publishtodevice.click();
	}
	public void clickonAssigntoGroups() {
		try {
			if (AssigntoGroups.isDisplayed()) {
				AssigntoGroups.click();
				checkboxatmodel1.click();
			}
		} catch (Exception e) {
		}
	}
	public void clickonNextAssigntoUsers() {

		NextAssigntoUsers.click();
	}
	public void clickonPublishBtn() {
		checkboxatmodel2.click();
		Publish.click();
	}
	public AppsPageFunc clickoncloseBuilderBtn() {
		closeappBuilder.click();
		return new AppsPageFunc(this.driver);
	}
}
