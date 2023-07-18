package dropdownpractice;

import org.openqa.selenium.chrome.*;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;




public class SingleSelect 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement singleselect=driver.findElement(By.id("oldSelectMenu"));
		
		Select sel=new Select(singleselect);
		
		//Select element using selectByIndex
		sel.selectByIndex(7);
		System.out.println("Color selected based on index");
		Thread.sleep(2000);

		//Select element using selectByValue
		sel.selectByValue("3");
		System.out.println("Color selected based on value");
		Thread.sleep(2000);
		
		//Select element using selectByVisibleText		
		sel.selectByVisibleText("White");
		System.out.println("Color selected based on visible Text");
		
		System.out.println("Is dropdown Multiple Select?:"+sel.isMultiple());
		
		List<WebElement> select=sel.getOptions();
		int count=0;
		
		for(WebElement ele:select)
		{
			count++;
			System.out.println(ele.getText());
		}
		System.out.println("No.of elements: " +count);
	}
	

}
