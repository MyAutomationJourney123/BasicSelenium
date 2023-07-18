package locators;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;

public class CssSelector {
	
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://localhost:8888");
	
	
	
	driver.findElement(By.cssSelector("[name='user_name']")).sendKeys("admin");
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin");
	driver.findElement(By.cssSelector("[type='submit']")).click();
	
	
}
}
