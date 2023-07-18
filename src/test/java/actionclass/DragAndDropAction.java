package actionclass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

		
public class DragAndDropAction
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement src=driver.findElement(By.xpath("//div[.='Washington'][2]"));
		WebElement dest=driver.findElement(By.xpath("//div[.='United States']"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(src,dest).perform();
		
		src=driver.findElement(By.xpath("//div[.='Rome'][2]"));		
		dest=driver.findElement(By.xpath("//div[.='Italy']"));	
		act.dragAndDrop(src,dest).perform();
		
	//	Try with wrong comnibation also
		
	}

}
