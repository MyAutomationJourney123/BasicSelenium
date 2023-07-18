package framesandpopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FutureDateCalendarPopup
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.makemytrip.com");
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.moveByOffset(20,20).click().perform();
		
		driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
		
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Bengaluru");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[.='Bengaluru, India']")).click();
		
		driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("Delhi");
		driver.findElement(By.xpath("//p[.='New Delhi, India']")).click();
	
		//Below code works for Dec 30, 2023 also..Though half calendar is visible in DOM..It will scroll
		//down itself and select dec 30.
		for(;;)
		{
			try
			{
				driver.findElement(By.xpath("//div[@aria-label='Mon Sep 04 2023']")).click();
				break;
			}
			catch(Exception E)
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		
		}		
	
		
		}
		
		
	}

	


