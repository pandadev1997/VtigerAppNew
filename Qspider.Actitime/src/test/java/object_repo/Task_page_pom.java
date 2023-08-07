package object_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task_page_pom {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewdrop;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcustomer;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement givename;
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement desc;
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement click;
	public Task_page_pom(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public WebElement getAddnewdrop() {
		return addnewdrop;
	}
	public WebElement getNewcustomer() {
		return newcustomer;
	}
	public WebElement getGivename() {
		return givename;
	}
	public WebElement getDesc() {
		return desc;
	}
	public WebElement getClick() {
		return click;
	}
	public void create(String name,String desc) {
		getAddnewdrop().click();
		getNewcustomer().click();
		getGivename().sendKeys(name);
		getDesc().sendKeys(desc);
		getClick().click();
	}

}
