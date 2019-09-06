package TestCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class LoginPageTest extends BaseTestCase{
	public static String browser;
	static WebDriver driver;
	
	@DataProvider(name ="login")
	public String[][] logindataprovider(){
		return new String[][] {
			{"mini.gupta@3pillarglobal.com" , "GOCANVAS"},{"mini.gupta@3pillarglobal.com" , "GOCANVAS"}
		};
	}	
	@Test(groups = {"SecondGroup"}, dataProvider="login")
    public void login(String username,String password) throws InterruptedException {
		
		dashboardpage = loginpage.logincredential(username, password);	
		Assert.assertTrue(dashboardpage!=null);		
	}
}