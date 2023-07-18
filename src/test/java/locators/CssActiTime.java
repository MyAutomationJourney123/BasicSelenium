package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssActiTime {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		
	
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("admin");
		
		// Different ways of accessing the password field using cssSelector 
		// accessing element using css selector and TAGNAME 
	//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
		// accessing element using css selector and WITHOUT TAGNAME 
	//	driver.findElement(By.cssSelector("[class='textField pwdfield']")).sendKeys("manager");
		
		// accessing element using css selector using shortcut for class 
		driver.findElement(By.cssSelector(".pwdfield")).sendKeys("manager");
		
		// Different ways of accessing the login button  using cssSelector 
		//driver.findElement(By.cssSelector("[id='loginButton']")).click();
		
		// accessing element using css selector using shortcut for id
		driver.findElement(By.cssSelector("#loginButton")).click();
		
	//	driver.findElement(By.cssSelector("[id='container_tasks']")).click();
		
	}

}
