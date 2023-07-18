package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.*;

public class MouseHoveringAction 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		WebElement element=driver.findElement(By.xpath("//div[.='Electronics']"));
//	Try with By className-		WebElement element=driver.findElement(By.xpath("//div[.='Electronics']"));
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		System.out.println("Mouse Hovering on Electronics done");
		Thread.sleep(1000);
		
		element=driver.findElement(By.xpath("//a[.='Gaming']"));
		act.moveToElement(element).perform();
		System.out.println("Mouse Hovering on Gaming done");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[.='Gamepads']")).click();
	

	}

}
