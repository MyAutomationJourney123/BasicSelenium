package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class xPathflipkart 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https:www.flipkart.com");
		
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("phones");
		
	//	driver.findElements(By.xpath("li[contains(text(),'4 GB RAM')]"));
		
	}

}
