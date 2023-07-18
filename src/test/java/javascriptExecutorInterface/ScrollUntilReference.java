package javascriptExecutorInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUntilReference
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		WebElement scrollUntil = driver.findElement(By.xpath("//h2[.='Selenium Level Sponsors']"));
		WebElement clickable = driver.findElement(By.xpath("//img[@alt='BrowserStack']"));
		Thread.sleep(1000);
		
		
		
		int yaxis=scrollUntil.getRect().getY();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		//js.executeScript("arguments[0].scrollIntoView()",scrollUntil);
		//SCROLLING UNTIL THE ELEMENT CAN BE DONE IN BOTH ABOVE AND BELOW WAYS
		js.executeScript("window.scrollBy(0,"+yaxis+");","");
		
		Thread.sleep(1000);
		clickable.click();
		
		
	}

}
