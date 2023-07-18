package autosuggestions;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class SearchandCapturePhones 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		/* Displaying names of phones didnt work in flipkart
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Redmi phones");
		write code to click on search ivon here
		
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		System.out.println(ele.isEmpty());
		
		for(WebElement e:ele)
		{
			String phoneName=e.getText();
			System.out.println("Phone Name:" +phoneName);
		}
		
		*/
		
		
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Redmi Phones");
		driver.findElement(By.id("nav-search-submit-button")).submit();
		

		List<WebElement> ele=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		System.out.println(ele.isEmpty());
		
		for(WebElement e:ele)
		{
			String phoneName=e.getText();
			System.out.println("Phone Name:" +phoneName);
		}
	}	

}
