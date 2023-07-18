package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
				
		WebElement ele=driver.findElement(By.xpath("//span[.='right click me']"));
		WebElement copy=driver.findElement(By.xpath("//span[.='Copy']"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(ele).perform();
		act.click(copy).perform();
		
		//Below Code does not work because ok needs to be clicked on alert which comes after copy is clicked.
		//Will get UnhadledAlertException
		//WebElement dblclick=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		//act.doubleClick(dblclick).perform();
		
		
	}

}
