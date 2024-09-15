package Script;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.Base;
import Pages.LoginPage;

public class LoginE2eCase extends Base{
	
	WebDriver scriptdriver;
	LoginPage loginpage;
	
	@BeforeClass
	public void setup() {
		scriptdriver = browser();
		scriptdriver.get("https://demo.guru99.com/Agile_Project/Agi_V1/");
		loginpage = new LoginPage(scriptdriver);
	}
	
	@Test
	public void loginAndLogout() {
		loginpage.login("mngr589098" , "gAgehAq");
	}
	
	@AfterClass
	public void closeBrowser() {
		if(scriptdriver != null) {
		scriptdriver.quit();
	}
		}
}
