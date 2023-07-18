package javascriptExecutorInterface;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollActions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000);", "");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-1000)", "");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(50,0);", "");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(-30,0);", "");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight);", "");
		Thread.sleep(2000);
		
		
		
		
	}

}
