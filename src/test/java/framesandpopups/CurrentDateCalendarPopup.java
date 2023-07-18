package framesandpopups;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CurrentDateCalendarPopup
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		Date today=new Date();
		System.out.println(today);
		String[] darr=today.toString().split(" ");
		String Currdate = darr[0]+" "+darr[1]+" "+darr[2]+" "+darr[5];
		System.out.println(Currdate);
		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		
		Actions act= new Actions(driver);
		act.moveByOffset(20,20).click().perform();
				
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Delhi");
		driver.findElement(By.xpath("//p[.='New Delhi, India']")).click();
		driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("Bengaluru");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[.='Bengaluru, India']")).click();
		
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,50)", "");
		driver.findElement(By.xpath("//div[@aria-label='"+Currdate+"']")).click();
	
	}

}
