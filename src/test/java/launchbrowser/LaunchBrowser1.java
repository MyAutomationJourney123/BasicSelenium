package launchbrowser;

	import org.openqa.selenium.chrome.*;
	import org.openqa.selenium.firefox.*;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.openqa.selenium.remote.SessionId;
	import java.net.SocketException;
	import org.openqa.selenium.WebDriver;
	import java.lang.Thread;


	public class LaunchBrowser1 
	{
		public static void main(String[] args) 
		{
				WebDriver wdriver = new ChromeDriver();
				System.out.println("Chrome browser launched thru web driver");
				
									
				wdriver.get("http://gmail.com");	
				System.out.println("Gmail loaded");
				
				wdriver.manage().window().maximize();
						
				String title=wdriver.getTitle();
				System.out.println("Title of the page: "+title);
				
				String url=wdriver.getCurrentUrl();
				System.out.println("URL of the page: "+url);
				
		//		String pagesrc= wdriver.getPageSource();
			//	System.out.println("Page Source is : "+pagesrc);
				
				// To capture the session ID
				String sesid = wdriver.getWindowHandle();
				System.out.println("Window Handle of gmail is : "+ sesid);
				
				SessionId id1=((RemoteWebDriver)wdriver).getSessionId();
				System.out.println("Session ID of remote web driver: "+ id1);
						
				wdriver.navigate().refresh();
				
				wdriver.navigate().to("http://flipkart.com");
				//sesid = wdriver.getWindowHandle();
				System.out.println("Window Handle after navigating to flipkart is : "+  wdriver.getWindowHandle());
				
			//	id1=((RemoteWebDriver)wdriver).getSessionId();
				System.out.println("Session ID of remote web driver after navigating to flipkart: "+ ((RemoteWebDriver)wdriver).getSessionId());
				
				wdriver.navigate().back();
				
			//	sesid = wdriver.getWindowHandle();
				System.out.println("Window Handle after navigating back to gmail is : "+  wdriver.getWindowHandle());
				
			//	id1=((RemoteWebDriver)wdriver).getSessionId();
				System.out.println("Session ID of remote web driver after navigating back to gmail: "+ ((RemoteWebDriver)wdriver).getSessionId());
							
				wdriver.navigate().forward();
				
			//	sesid = wdriver.getWindowHandle();
				System.out.println("Window Handle after navigating to flipkart again is : "+  wdriver.getWindowHandle());
				
				//id1=((RemoteWebDriver)wdriver).getSessionId();
				System.out.println("Session ID of remote web driver after navigating flipkart again: "+ ((RemoteWebDriver)wdriver).getSessionId());
							
			//	wdriver.manage().window().minimize();
			//	wdriver.manage().window().fullscreen();
					
				
		}
	}


