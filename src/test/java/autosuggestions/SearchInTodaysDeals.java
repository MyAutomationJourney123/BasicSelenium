package autosuggestions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.util.*;

public class SearchInTodaysDeals 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");

		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']")).click();
		driver.findElement(By.xpath("//a[@data-id=\'46D1B0D1F5B0A9C0FA93E8A7CDA9F06D\']")).click();
		
		List<WebElement> elements=driver.findElements(By.xpath("//div[@class='BadgeAutomatedLabel-module__badgeAutomatedLabel_2Teem9LTaUlj6gBh5R45wd' and contains(text(),'Up to 50')]"));
		System.out.println(elements.isEmpty());
		
	}

}
