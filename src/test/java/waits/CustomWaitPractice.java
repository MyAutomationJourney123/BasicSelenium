package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWaitPractice 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost:8888");

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		WebElement ele= driver.findElement(By.id("submitButton"));
		
		waitAndClick(ele);

	}
	
	public static void waitAndClick(WebElement element) throws InterruptedException
	{
		int count=0;
		while(count<10)
		{
			try
			{
				element.click();
				System.out.println(count);
				break;
			}
			catch(Exception e)
			{
				Thread.sleep(1000);
				count++;
			}
		}
	}

}
