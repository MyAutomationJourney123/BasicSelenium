package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitPractice 
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
		
		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(Duration.ofMillis(200));
		wait.withTimeout(Duration.ofSeconds(5));
		wait.ignoring(NoAlertPresentException.class);
		wait.ignoring(NoSuchElementException.class);
		
		
		
		

	}

}
