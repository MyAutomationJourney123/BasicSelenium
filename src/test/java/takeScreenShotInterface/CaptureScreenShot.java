package takeScreenShotInterface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CaptureScreenShot 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		
		WebElement uname=driver.findElement(By.name("user_name"));
		WebElement pwd=driver.findElement(By.name("user_password"));
		WebElement login=driver.findElement(By.id("submitButton"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='admin'",uname);
		js.executeScript("arguments[0].value='admin'",pwd);
		js.executeScript("arguments[0].click();",login);
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		Thread.sleep(2000);
		File srclocation= ts.getScreenshotAs(OutputType.FILE);
		
		File deslocation= new File(".\\ScreenShots\\Screenshot1.png");
		
		Files.copy(srclocation, deslocation);
		
		System.out.println("Screenshot taken");
		
				

	}

}
