package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppBuilderNewPageOR{
	
	public AppBuilderNewPageOR(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//button[@id='start-tamplate' and @class = 'btn letsgo pull-left']") 
	protected WebElement Start;
	
	@FindBy(xpath = "//button[@id='start-tamplate']") 
	protected WebElement ChooseATemplate;
	

}
