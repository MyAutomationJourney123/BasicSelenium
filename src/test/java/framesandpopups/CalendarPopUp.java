package framesandpopups;

import java.time.Duration;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class CalendarPopUp 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[@class='close']")).click();
		//driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
		Actions act=new Actions(driver);
		act.moveByOffset(20, 20).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Bengaluru");;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
		driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("Chennai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[.='Chennai, India']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Thu Aug 03 2023']")).click();
	
	
	}

}
