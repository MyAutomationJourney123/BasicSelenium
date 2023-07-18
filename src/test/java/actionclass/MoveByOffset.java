package actionclass;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;

public class MoveByOffset
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		
		Actions act=new Actions(driver);
		act.moveByOffset(10,10).click().perform();
		
		WebElement element=driver.findElement(By.xpath("//div[.='Electronics']"));
		act.moveToElement(element).perform();
	
	
	}

}
