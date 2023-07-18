package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileWrite 
{
	public static void main(String[] args) throws Exception, IOException
	{
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\avt.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
	//Sheet sh = wb.createSheet("Write"); - if ur creating new one
		// Use getsheet if u want to update data on existing sheet
		Sheet sh=wb.getSheet("Write");
		Row  r = sh.createRow(5);
		
		Cell cl=r.createCell(3);
		cl.setCellValue("Successfully written");
		
		Cell cl1=r.createCell(4);
		cl1.setCellValue(false);
		
		Cell cl2=r.createCell(5);
		cl2.setCellValue(90876);
		
		
		FileOutputStream fos= new FileOutputStream(".\\src\\test\\resources\\avt.xlsx");

		wb.write(fos);
		
		System.out.println("Data added to workbook");
		
	}

}
