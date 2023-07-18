package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartActionsClass 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[.='Appliances']")).click();
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//span[.='Home & Furniture']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='Paintings']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Price -- Low to High']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='Indianara Set of 4 Wall Hanging for Living room|Bedroom...']")).click();
	
		//act.moveToElement(ele).click().perform();
		
		
	}

}
