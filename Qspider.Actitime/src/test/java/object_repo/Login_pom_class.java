package object_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_pom_class {
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement password;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbtn;
	public Login_pom_class(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public void loginpom(String username,String password) {
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginbtn().click();
	}
	
	

}
