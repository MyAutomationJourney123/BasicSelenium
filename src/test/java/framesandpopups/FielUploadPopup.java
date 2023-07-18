package framesandpopups;

import java.io.IOException;
import java.time.Duration;
import java.lang.Runtime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FielUploadPopup
{
	
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*
		driver.get("https://www.foundit.in/seeker/registration");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Sankhyaa\\Downloads\\Preassessment -Sahana.pdf");
		*/
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		driver.findElement(By.xpath("//button[.='Upload Resume']")).click();
		Runtime.getRuntime().exec("C:\\Sahana\\Selenium Notes from QSpider - Chaitra\\upload.exe");
		
		System.out.println("File uploaded successfully");
	
	
		
	
	}

}
