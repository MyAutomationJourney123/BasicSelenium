package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateOrgInvTiger 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost:8888");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[name='user_name']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin");
		driver.findElement(By.cssSelector("#submitButton")).click();
		
		driver.findElement(By.linkText("Organizations")).click();
		
		//Using the + icon to create an organization
		driver.findElement(By.cssSelector("img[title='Create Organization...']")).click();
		
		// Using the Create an Organization link at the center of the page
		//driver.findElement(By.partialLinkText("Create an Organization")).click();
		driver.findElement(By.cssSelector("input[name='accountname']")).sendKeys("QSpiders");
		
		driver.findElement(By.xpath("(//input[class='crmbutton small save'])[2]")).click();
	}

}
