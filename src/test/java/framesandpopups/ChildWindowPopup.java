package framesandpopups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup 
{
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demo.automationtesting.in/Windows.html");
	
	driver.findElement(By.linkText("Open New Seperate Windows")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	
	/* When ever there is only one child window associated with the main window
	 * then we can identify the main window ID using getWindowHanle() and eliminate 
	 * the main window ID using If condition and easily switch to Child winodw ID*/
	
	String MainWinHandle = driver.getWindowHandle();
	
	System.out.println("Main Window ID :" +MainWinHandle);
				
	Set<String> Windows = driver.getWindowHandles();
	
	for(String win:Windows)
	{
		if(!win.equals(MainWinHandle))
		{
			driver.switchTo().window(win);
			System.out.println("Child Window ID:"+ win);
			System.out.println("Switched to child window");
			break;
		}
	}
		
	//Thread.sleep(3000);
//	driver.close(); //- closes only the child window 
	//driver.quit(); //- closes both parent and child window
	
	}

}
