package ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.google.errorprone.annotations.CompileTimeConstant;

public class CreateAppPageOR{
	
	public int timeOut = 20;
	
	public CreateAppPageOR(WebDriver driver) {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, timeOut), this);
	}//
	@FindBy(xpath = "//input[@id='formName']") 
	protected WebElement AppName;
	
	@FindBy(xpath = "//span[text() ='Save']")
	protected WebElement Save;
	
	@FindBy(xpath = "//a[@class='btn btn-sm cvs-prim-btn' or contains ='Publish to device']")
	protected WebElement  Publishtodevice;
	
	
	@FindBy(xpath = "//th[text()='Name']/preceding::label")
	protected WebElement checkboxatmodel1;
	
	@FindBy(xpath = "//button[contains(text(),'Next: Assign to Groups')]")
	protected WebElement AssigntoGroups;
	
	@FindBy(xpath = "//th[text()='Name']/preceding::label")
	protected WebElement checkboxatmodel2; 
	
	@FindBy(xpath = "//button[contains(text(),'Next: Assign to Users')]")
	protected WebElement NextAssigntoUsers;
    	
	@FindBy(xpath = "//button[class='btn cvs-prim-btn' or text() = 'Publish']")
	protected WebElement Publish;
	
	@FindBy(xpath = "//span[text()='Add screen']") 
	protected WebElement Addscreen;
	
	@FindBy(xpath = "//button[class = 'btn cvs-def-btn' or text()='Close App Builder']")
	protected WebElement closeappBuilder;
	
	@FindBy(xpath = "//button[class = 'btn cvs-def-btn' or text()='Keep Editing']")
	protected WebElement KeepEditing;
	
	@FindBy(xpath = "//a[class = 'btn cvs-def-btn' or text()='App Settings']")
	protected WebElement AppSettings;
	
	@FindBy(xpath = "//div[@class='panel-group']/div") 
	protected List<WebElement> panels;
	
	protected String eachPanelxpath ="./div/h4/a/span";
		
	protected String Innerelementxpath1 = ".//ul[@class='palette clearfix list-unstyled ng-scope']/li";
}


