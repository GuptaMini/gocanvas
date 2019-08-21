package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;

import ObjectRepository.AppBuilderNewPageOR;

public class AppBuilderNewFuncPage extends AppBuilderNewPageOR{
	public WebDriver driver;

	public AppBuilderNewFuncPage(WebDriver driver) {
		super(driver);
		this.driver =driver;
		if(!ChooseATemplate.isDisplayed())
		{
			throw new SkipException("this is not Choose a template page");
		}
	}
	public CreateAppfuncPage clickOnStart()
	{
		System.out.println("Control is here");
		Start.click();
		return new CreateAppfuncPage(this.driver);
	}
}
