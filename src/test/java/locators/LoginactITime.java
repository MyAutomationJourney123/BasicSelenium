package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class LoginactITime {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
	//	Thread.sleep(1000);
		
		//className didnt work for me...Rework on this
	//	driver.findElement(By.className("content tasks")).click();
	//	driver.findElement(By.className("content selected tasks")).click();
		
		
		
	}

}
