package dropdownpractice;

import org.openqa.selenium.chrome.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;



public class MultiSelectDropdown
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		
		WebElement multiselect=driver.findElement(By.id("cars"));
		
		Select sel=new Select(multiselect);
		
		if(sel.isMultiple())
		{
			System.out.println("This is a multi selected dropdown");
		}
		
		sel.selectByIndex(0);
		System.out.println("Volvo is selected");
		Thread.sleep(2000);
		
		sel.selectByValue("saab");
		System.out.println("Saab is selected");
		Thread.sleep(2000);
		
		sel.selectByVisibleText("Audi");
		System.out.println("Audi is selected");
		Thread.sleep(2000);
		
		// NOTE THAT I HAVE NOT SELECTED OPEL BUT TRIED TO DESELECT IT
		//AND IT WORKED WITHOUT THROWING ANY EXCEPTION OR ERROR MESSAGE.
		//IT LOOKS LIKE NO OPERATION WAS PERFORMED AS IT WAS NOT SELECTED EARLIER.
		
		sel.deselectByIndex(2);
		System.out.println("Opel deselected though it was not selected without any exception");
		Thread.sleep(2000);
		
		sel.deselectByIndex(1);
		System.out.println("Saab was deselected");
		Thread.sleep(2000);
		
		//GETOPTIONS DISPLAYS ALL ELEMENTS OF THE LIST BUT NEED TO
		//USE FOR LOOP UNLIKE GETWRAPPED ELEMENT WHICH DISPLAYS ALL
		//ELEMENTS OF LIST WITHOUT FOR LOOP.
		List<WebElement> alloptions=sel.getOptions();
		System.out.println("All options the list contains:");
		for(WebElement ele:alloptions)
		{
			System.out.println(ele.getText());
		}
		
		
		List<WebElement> allsel= sel.getAllSelectedOptions();
		System.out.println("Selected options are:");
		for(WebElement ele:allsel)
		{
			System.out.println(ele.getText());
		}
		
		sel.deselectAll();
		System.out.println("All options deselected");
		
		sel.selectByValue("audi");
		Thread.sleep(2000);
		
		sel.selectByIndex(1);
		
		//THOUGH PREGRAMATICALLY AUDI WAS SELECTED FIRST BUT IN THE LIST STORES IN DOM
		//SAAB COMES BEFORE AUDI - SO, FIRST ELEMENT SELECTED RETURNS SAAB
		WebElement first=sel.getFirstSelectedOption();
		System.out.println("First Element Selected is: "+first.getText());
	
		//GETWRAPPED ELEMENTS RETURNS ALL THE ELEMENTS IN THE LIST 
		//AND CAN BE DISPLAYED WITHOUT FOR LOOP UNLIKE GETOPTIONS
		
		WebElement wrap=sel.getWrappedElement();
		System.out.println("Wrapped elements:");
		System.out.println(wrap.getText());
	
	
	
	}

}
