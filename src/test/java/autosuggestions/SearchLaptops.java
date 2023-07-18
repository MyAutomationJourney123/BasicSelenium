package autosuggestions;

import org.openqa.selenium.chrome.*;

import java.util.List;

import org.openqa.selenium.*;

public class SearchLaptops 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		String laptopName;
		boolean isHP;
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		driver.findElement(By.id("nav-search-submit-text")).submit();
		
		//Scenario 1:
		//capture names of laptops , search for HP laptop and open the first link	
		List<WebElement> elements=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		System.out.println(elements.isEmpty());
						
		for(WebElement ele:elements)
		{
			laptopName=ele.getText();
			isHP=laptopName.contains("HP");
			if(isHP==true)
			{
				System.out.println("HP laptop found and opening the link");
				ele.click();
				break;
			}
			else
			{
				System.out.println(laptopName);
			}
			
		}
		
		//Scenario 2:
		//search for laptops with rating 4 and more
		//List<WebElement> elements=driver.findElements(By.xpath("//span[@class='a-icon-alt' and contains(text(), '4')]"));
		
	}

}
