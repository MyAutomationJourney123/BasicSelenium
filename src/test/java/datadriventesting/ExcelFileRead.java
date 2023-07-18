package datadriventesting;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;  // NOTE that it shud be poi.ss.usermodel 
// - if it takes poi.sl.usermodel - it doesnt work... 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileRead
{
	public static void main(String[] args) throws Throwable
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\avt.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh= wb.getSheet("Sheet1");
	
		//IMP - row number and col number always starts from 0.
		Row r = sh.getRow(0);
		Cell cl = r.getCell(2);
		String value=cl.getStringCellValue();
		System.out.println("value of the String in cell:" + value);
		
		r = sh.getRow(1);
		cl = r.getCell(2);
		double value1=cl.getNumericCellValue();
		System.out.println("value of the Number in cell:" + value1);
		
		r = sh.getRow(3);
		cl = r.getCell(0);
	//	Date date=cl.getDateCellValue();
	//System.out.println("value of the Date in cell:" + date.toString());
		//THough i changed the string to date and again copied the excel back and updated the projecct also.
		//is still being taken as string instead of date.
		
		value=cl.getStringCellValue();
		System.out.println("value of the String in cell:" + value);
	}

}
