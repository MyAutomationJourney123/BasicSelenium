package autosuggestions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.util.*;

public class SearchBoultBrandBluetooth 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		String earphoneName;
			
		//Scenario 1:
		//Search for Boult brand bluetooth earphones
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("boult bluetooth earphones",Keys.ENTER);
	//	driver.findElement(By.id("nav-search-submit-text")).submit();
		List<WebElement> elements=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		System.out.println(elements.isEmpty());
			
		for(WebElement ele:elements)
		{
			earphoneName=ele.getText();
			 System.out.println(earphoneName);
			 
		}
			
		
		
		/*
		//Scenario 2:
		//change to get bluetooth earphones and while printing - print only boult brand earphones 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bluetooth earphones");
		driver.findElement(By.id("nav-search-submit-text")).submit();
		List<WebElement> elements=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		System.out.println(elements.isEmpty());
		
	
		for(WebElement ele:elements)
		{
			earphoneName=ele.getText();
			if(earphoneName.contains("Boult"))
			{
				System.out.println(earphoneName);
			}
			
		}*/
			
	}

}
