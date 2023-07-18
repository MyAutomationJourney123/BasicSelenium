package webelements;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class FindElementsActiTime
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		
		
		List<WebElement> ele= driver.findElements(By.xpath("//div[@class='projectTitle']"));
		System.out.println(ele.isEmpty());
		
		for(WebElement e: ele)
		{
			System.out.println(e.getText());
		}

	}

}
