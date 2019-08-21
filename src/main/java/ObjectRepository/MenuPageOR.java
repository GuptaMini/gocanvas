package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPageOR{

	public MenuPageOR(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "//span[contains(text(),'Dashboard')]")
	protected WebElement Dashboard;
	
	@FindBy(xpath = "//span[contains(text(),'Apps')]")
	protected static WebElement Apps;
	
	@FindBy(xpath = "//span[contains(text(),'Submissions')]")
	protected WebElement Submissions;
	
	@FindBy(xpath = "//span[contains(text(),'Workflow & Dispatch')]")
	protected WebElement WorkflowandDispatch;
	
	@FindBy(xpath = "//span[contains(text(),'Reference Data & Images')]")
	protected WebElement ReferenceDataandImages;
	
	@FindBy(xpath = "//span[contains(text(),'Account')]")
	protected WebElement Account;
	
	@FindBy(xpath = "//span[contains(text(),'Profile')]")
	protected WebElement Profile;

	

}
