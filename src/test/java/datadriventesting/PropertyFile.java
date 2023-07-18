package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile 
{
	public static void main(String[] args) throws IOException 
	{
		// The file path can be taken by right click on properties of the proerpty file
		//under src/test/resources
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");

		Properties p = new Properties();
		
		p.load(fis);
		
		String value=p.getProperty("username");
		System.out.println("Value of username is:" +value);
		
		//NOTE: browser is not given in properties file.
		value=p.getProperty("browser");
		System.out.println("Value of browser is:" +value);
		
		value=p.getProperty("url");
		System.out.println("Value of url is:" +value);
	}

}
