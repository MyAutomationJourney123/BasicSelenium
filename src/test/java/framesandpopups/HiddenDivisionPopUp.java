package framesandpopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDivisionPopUp
{
	public static void main(String[] args) throws InterruptedException 
	{
WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("container_tasks"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	ele.click();
		
	driver.findElement(By.xpath("(//div[@class='img'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[text()='Copy to'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[.='Copy']/following-sibling::div[.='Cancel'])[3]")).click();

	}

}
