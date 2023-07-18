package dropdownpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class vTigerSingleSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).submit();
		
		driver.findElement(By.partialLinkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("accountname")).sendKeys("dropdownExample");
		
		WebElement industry=driver.findElement(By.name("industry"));
		Select sel=new Select(industry);
		sel.selectByValue("Electronics");
		
		WebElement Type=driver.findElement(By.name("accounttype"));
		Select sel1=new Select(Type);
		sel1.selectByValue("Customer");
		
		//NOTE THAT FOR EVERY WEBELEMENT I HAVE TO CREATE AN NEW OBJECT OF SELECT TYPE
		//BECAUSE IT IS ASSOCIATED WITH INDIVIDUAL WEBELEMENT
		
		WebElement rating=driver.findElement(By.name("rating"));
		Select sel2=new Select(rating);
		sel2.selectByValue("Active");
		
		driver.findElement(By.xpath("(  //input[@value='  Save  '])[1]")).click();
		
		
		
		
		
		

	}

}
