package base.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import actitime.utility.Propertyfile_utility;
import actitime.utility.Webdriver_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import object_repo.Login_pom_class;

public class Base_Class {
	public WebDriver driver=null;
	Propertyfile_utility p=new Propertyfile_utility();
	Webdriver_Utility wu=new Webdriver_Utility();
	@BeforeSuite(alwaysRun = true)
	//new changes
	public void databaseconn() {
		System.out.println("connection");
	}
	@BeforeClass(alwaysRun = true)
	public void launchbrowser() throws Exception {
		String BROWSER=p.readDataFromProperty("browser");
		driver=new ChromeDriver();
		//String BROWSER1=p.readDataFromProperty("firefox");
		/*if(BROWSER.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}	*/
	}
	@BeforeMethod(alwaysRun = true)
	public void login() throws Exception {
		String URL=p.readDataFromProperty("url");
		String UN=p.readDataFromProperty("username");
		String PW=p.readDataFromProperty("password");
		wu.maximize(driver);
		wu.iwait(driver);
		driver.get(URL);
		Login_pom_class lop=new Login_pom_class(driver);
		lop.loginpom(UN, PW);
	}
	@AfterMethod(alwaysRun = true)
	public void logout() {
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}
	@AfterClass(alwaysRun = true)
	public void closebrowser() {
		driver.close();
	}
	@AfterSuite(alwaysRun = true)
	public void closeDB() {
		System.out.println("DB conn close");
	}

}
