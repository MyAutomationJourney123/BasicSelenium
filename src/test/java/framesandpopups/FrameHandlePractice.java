package framesandpopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandlePractice 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		System.out.println("Control switched into frame");
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act= new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		System.out.println("Element dragged and dropped");

		driver.switchTo().defaultContent();
		System.out.println("Control switched out of frame");
		
		WebElement accept= driver.findElement(By.xpath("//a[text()='Accept']"));
		accept.click();
	
	
	}

}
