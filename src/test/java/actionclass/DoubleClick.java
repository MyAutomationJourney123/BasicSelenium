package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=java");
		
		WebElement add=driver.findElement(By.id("add"));
		
		WebElement sub=driver.findElement(By.id("minus"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(add).perform();
		System.out.println("item added");
		act.doubleClick(add).perform();
		Thread.sleep(2000);
		System.out.println("item added");
		
		act.doubleClick(sub).perform();
		System.out.println("item removed");
		
		
	}

}
