package actitime.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyfile_utility {
	public String readDataFromProperty(String data) throws Exception {
		FileInputStream fis=new FileInputStream(Iconstant_utility.propertyfilepath);
		Properties por=new Properties();
		por.load(fis);
		String value = por.getProperty(data);
		return value;
	}
	
	

}
