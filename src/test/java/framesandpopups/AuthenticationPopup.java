package framesandpopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth ");
		
	//In above statement - if the admin:admin@ is removed in URl - URL still works but asks user to enter credentials.
		//It is possible that we can provide above credentials using robot class.
	
	//	driver.get("http://admin:admin@localhost:8888");
	// Doesnt work with vTiger as the authentication needs to be a popup and not fields.
		
		

	}

}
