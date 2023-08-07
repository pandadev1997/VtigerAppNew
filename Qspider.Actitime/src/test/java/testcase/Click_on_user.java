package testcase;

import org.testng.annotations.Test;

import base.Utility.Base_Class;
import object_repo.Home_page_operation;

public class Click_on_user extends Base_Class {
	@Test(alwaysRun = true)
	public void userc() {
		Home_page_operation h=new Home_page_operation(driver);
		h.user();
		
	}
	

}
