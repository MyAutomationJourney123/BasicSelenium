package framesandpopups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleChildWindowPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		/* When there are more than one child windows, We cannot switch to particular
		 * child based on only window ID, we should consider title or URL of the 
		 * child and switch */
		
		Set<String> Windows = driver.getWindowHandles();
				
		for(String win:Windows)
		{
				WebDriver CurrentWindow= driver.switchTo().window(win);
				String WindowTitle=CurrentWindow.getTitle();
				if(WindowTitle.contains("Selenium"))
				{
					System.out.println("Page title:" +WindowTitle);
					break;
				}						
		}
		Thread.sleep(2000);
		System.out.println("Switched to child window");	
		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		
		Thread.sleep(2000);
		for(String win:Windows)
		{
				WebDriver CurrentWindow= driver.switchTo().window(win);
				String WindowTitle=CurrentWindow.getTitle();
				if(WindowTitle.contains("Frames"))
				{
					System.out.println("Page title:" +WindowTitle);
					break;
				}						
		}
		
		System.out.println("Switched to parent window");
	}

}
