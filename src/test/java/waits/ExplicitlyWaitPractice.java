package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.*;

public class ExplicitlyWaitPractice
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//Implicitly Wait for 5 seconds - Applicable to all web elements in the program
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://localhost:8888");

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).submit();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Home"));
		System.out.println("Title is printed");
		
		WebElement ele= driver.findElement(By.linkText("Organizations"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		System.out.println("Element is visible");
		
		//wait.until(ExpectedConditions.elementToBeClickable(ele));
	//OR
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Organizations")));
		System.out.println("Elemnet is clickable");
		
		String url=driver.getCurrentUrl();	
		System.out.println(url);
		wait.until(ExpectedConditions.urlContains("host"));
		System.out.println("host is present");
	}

}
