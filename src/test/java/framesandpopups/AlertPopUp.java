package framesandpopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class AlertPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoqa.com/alerts");
		
		WebElement ele = driver.findElement(By.id("alertButton"));
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();
			
		Alert alert=driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(2000);
		alert.accept();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200);", "");
		
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(2000);
		//METHOD 1 - USE THE ENTIRE LINE OF DEFINING ALERT AND THEN PERFORM ACTION
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		String msg = driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
		System.out.println(msg);
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(2000);
		//METHOD 2- YOU HaVE TO DEFINE ALERT FOR EVERY ALERT BECAUSE ONCE YOU CONFIRM ACCEPT 
		//OR DISMISS - THE CONTROL GOES TO THE MAIN PAGE. 
		Alert al = driver.switchTo().alert();
		al.sendKeys("abcd");
		al.accept();
		msg = driver.findElement(By.xpath("//span[@id='promptResult']")).getText();
		System.out.println(msg);
		
	}
}
