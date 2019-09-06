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
	}
	@FindBy(xpath = "//input[@id='formName']") 
	protected WebElement appName;
	
	@FindBy(xpath = "//span[text() ='Save']")
	protected WebElement save;
	
	@FindBy(xpath = "//a[@class='btn btn-sm cvs-prim-btn' or contains ='Publish to device']")
	protected WebElement  publishToDevice;
	
	
	@FindBy(xpath = "//th[text()='Name']/preceding::label")
	protected WebElement checkBoxAtModel1;
	
	@FindBy(xpath = "//button[contains(text(),'Next: Assign to Groups')]")
	protected WebElement assignToGroups;
	
	@FindBy(xpath = "//th[text()='Name']/preceding::label")
	protected WebElement checkBoxAtModel2; 
	
	@FindBy(xpath = "//button[contains(text(),'Next: Assign to Users')]")
	protected WebElement nextAssignToUsers;
    	
	@FindBy(xpath = "//button[class='btn cvs-prim-btn' or text() = 'Publish']")
	protected WebElement publish;
	
	@FindBy(xpath = "//span[text()='Add screen']") 
	protected WebElement addScreen;
	
	@FindBy(xpath = "//button[class = 'btn cvs-def-btn' or text()='Close App Builder']")
	protected WebElement closeAppBuilder;
	
	@FindBy(xpath = "//button[class = 'btn cvs-def-btn' or text()='Keep Editing']")
	protected WebElement keepEditing;
	
	@FindBy(xpath = "//a[class = 'btn cvs-def-btn' or text()='App Settings']")
	protected WebElement appSettings;
	
	@FindBy(xpath = "//div[@class='panel-group']/div") 
	protected List<WebElement> panels;
	
	protected String eachPanelXpath ="./div/h4/a/span";
		
	protected String innerElementXpath1 = ".//ul[@class='palette clearfix list-unstyled ng-scope']/li";
}


