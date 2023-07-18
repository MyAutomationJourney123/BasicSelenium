package pomClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin
{

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	//	driver.get("https://demo.actitime.com/login.do");
		
		
		//METHOD 1 - //hardcoded values are as shown below:
		/*
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		*/
		
		
		//Read data from properties file
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		// NOTE THAT PROPERTIES IS REQD TO LOAD THE FILE
		Properties p=new Properties();
		p.load(fis);
		String uname=p.getProperty("username");
		String passwd=p.getProperty("password");
		String url=p.getProperty("url");
		
		driver.get(url);
		
		System.out.println(uname);
		System.out.println(passwd);
		
		//METHOD 2 - Read from properties file and use getter to fetch and send login details
		//Login to App using POM Class
		/*
		LoginPage lp=new LoginPage(driver);
		lp.getUserNameEdt().sendKeys(uname); 
		lp.getPasswordEdt().sendKeys(passwd);
		lp.getLoginLnk().click();
		*/
		
		//METHOD 3 - Use the business library - optimised code. 
		
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp(uname, passwd);
		
		
		System.out.println("Login Successful");
		
		
	}

}
