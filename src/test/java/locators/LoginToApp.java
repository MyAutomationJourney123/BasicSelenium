package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebElement;

public class LoginToApp 
{

	public static void main(String[] args) 
	{
		//Step 1: Launch the browser
		WebDriver driver=new ChromeDriver();
				
		//Step 2: Maximise the window
		driver.manage().window().maximize();
		
		//Step 3: Open the web appln
		driver.get("http://localhost:8888");
		
		//Step 4:Locate the username element
		WebElement usernameEle = driver.findElement(By.name("user_name"));
		
		//Step5: Perform action on identified element
		usernameEle.sendKeys("admin");
		
		//Locate the password element
		WebElement passwordEle = driver.findElement(By.name("user_password"));
		
		// Perform action on identified element
		passwordEle.sendKeys("admin");
		
		//Locate the login button element
		WebElement loginEle=driver.findElement(By.id("submitButton"));	// Perform action on identified element
		loginEle.click();
		
		//After login check for contacts and open it.
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create a Contact")).click();			 							 	
		driver.findElement(By.partialLinkText("Prod")).click();
	//	driver.findElement(By.partialLinkText("Create a ")).click();
		
		//driver.findElement(By.name("Service")).click();
	}

}
