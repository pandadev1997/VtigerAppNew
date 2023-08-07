package testcase;

import java.util.Random;

import org.testng.annotations.Test;

import actitime.utility.ExcelFile_utility;
import base.Utility.Base_Class;
import object_repo.Home_page_operation;
import object_repo.Task_page_pom;

public class Click_task extends Base_Class {
	@Test(alwaysRun = true)
	public void taskc() throws Exception {
		Random r=new Random();
		int ra=r.nextInt(1000);
		Home_page_operation h=new Home_page_operation(driver);
		h.task();
		Task_page_pom t=new Task_page_pom(driver);
		ExcelFile_utility ex=new ExcelFile_utility();
		String name = ex.readDataFromExcel("NAME", 1, 2)+ra;
		String desc = ex.readDataFromExcel("NAME", 4, 2);
		t.create(name, desc);
	}

}
