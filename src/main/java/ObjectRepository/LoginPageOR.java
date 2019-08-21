package ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageOR {

	@FindBy(xpath = "//*[@id=\"login\"]")
	protected WebElement firstName;

	@FindBy(xpath = "//*[@id=\"password\"]")
	protected WebElement password;

	@FindBy(xpath = "//button[@id='btn_Log In']/span")
	protected WebElement login;

	public LoginPageOR(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}