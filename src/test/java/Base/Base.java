package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	WebDriver basedriver;
	
	public WebDriver browser() {
		basedriver = new ChromeDriver();
		basedriver.manage().window().maximize();
		basedriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		basedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		return basedriver;
	}

}
