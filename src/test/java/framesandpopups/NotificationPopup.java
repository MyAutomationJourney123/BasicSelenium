package framesandpopups;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
public class NotificationPopup 
{
	public static void main(String[] args) 
	{
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		//Important that op shud be sent as an argument to ChromeDriver.
		WebDriver driver=new ChromeDriver(op); 
		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.thomascook.in/");
	}

}
