package webelements;

import org.openqa.selenium.chrome.*;

import java.util.List;

import org.openqa.selenium.*;

public class FindElementsMethod 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).submit();
		
		driver.findElement(By.linkText("Organizations")).click();
		
		
		//Multiple ways of getting same elements
	//	List<WebElement> ele=driver.findElements(By.name("selected_id"));
		List<WebElement> ele=driver.findElements(By.xpath("//input[@name='selected_id']"));
				
		for(WebElement element:ele)
		{
			element.click();
			
		}
		
		List<WebElement> ele1=driver.findElements(By.xpath("//a[@title='Organizations']"));
		for(WebElement element:ele1)
		{
			
		//String orgName=element.getDomProperty("textContent");
		String orgName=element.getText();
			System.out.println("Organization Name:"+orgName);
		}
	}

}
