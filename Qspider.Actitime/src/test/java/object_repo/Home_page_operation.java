package object_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page_operation {
	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement task;
	@FindBy(xpath="//div[@id='container_reports']")
	private WebElement reports;
	@FindBy(xpath="//div[@id='container_users']")
	private WebElement users;
	public Home_page_operation(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getTask() {
		return task;
	}
	public WebElement getReports() {
		return reports;
	}
	public WebElement getUsers() {
		return users;
	}
	public void task() {
		getTask().click();
	}
	public void report() {
		getReports().click();
	}
	public void user() {
		getUsers().click();
	}
	

}
