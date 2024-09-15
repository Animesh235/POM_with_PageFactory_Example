package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy( xpath = "//input[@name='uid']")
	WebElement uname;
    
    @FindBy( xpath = "//input[@name='password']")
	WebElement pass;
    
    @FindBy( xpath = "//input[@name='btnLogin']")
	WebElement btn;
    
    public LoginPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
    public void login(String username , String password) {
    	uname.sendKeys(username);
    	pass.sendKeys(password);
    	btn.click();
    }
	
}
