package javascriptExecutorInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToVtigerUsingJSE 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		
		WebElement uname=driver.findElement(By.name("user_name"));
		WebElement pwd=driver.findElement(By.name("user_password"));
		WebElement login=driver.findElement(By.id("submitButton"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(1000);
		js.executeScript("arguments[0].value='admin'",uname);
		js.executeScript("arguments[0].value='admin'",pwd);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();",login);
		
		String title = js.executeScript("return document.title","").toString();
		System.out.println(title);
	}

}
