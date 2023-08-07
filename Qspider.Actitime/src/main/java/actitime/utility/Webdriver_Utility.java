package actitime.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Webdriver_Utility {
	
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void minimize(WebDriver driver) {
		driver.manage().window().minimize();
	}
	
	public void iwait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
