package actitime.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile_utility {
	public String readDataFromExcel(String sheet,int row,int cell) throws Exception, Exception {
		FileInputStream fis=new FileInputStream(Iconstant_utility.excelfilepath);
		Workbook book = WorkbookFactory.create(fis);
		 String excelvalue = book.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		 return excelvalue;
	}

}
