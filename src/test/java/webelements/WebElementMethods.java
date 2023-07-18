package webelements;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class WebElementMethods 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		
		//WebElement method - sendKeys()
		driver.findElement(By.className("textField")).sendKeys("admin");
		
		Thread.sleep(2000);
		
		//WebElement method - Clear()
		driver.findElement(By.className("textField")).clear();
		
		driver.findElement(By.className("textField")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//WebElement method - Click()
	//	driver.findElement(By.cssSelector("#loginButton")).click();
		
		//WebElement method - getAttribute(String attributeName)
		String attribute=driver.findElement(By.id("loginButton")).getAttribute("id");
		System.out.println("attribute associated with loginButton - "+attribute);
		
		String attribute1=driver.findElement(By.id("loginButton")).getAttribute("align");
		System.out.println("attribute NOT associated with loginButton - "+attribute1);
		
		//WebElement method - getTagname()
		String tag=driver.findElement(By.id("loginButton")).getTagName();
		System.out.println("Tagname - "+tag);
		
		//WebElement method - getText()
		String text=driver.findElement(By.id("loginButton")).getText();
		System.out.println("Visible text of web element is: - "+text);
		
		//WebElement method - getLocation() - position of the element
		Point position = driver.findElement(By.id("loginButton")).getLocation();
		int posX=position.getX();
		int posY=position.getY();
		
		System.out.println("X co-ordinate is: "+posX +" \n and Y co-ordinate is: "+ posY);
			
		//WebElement method - getSize() - Dimension of the element
		Dimension size=driver.findElement(By.id("loginButton")).getSize();
		int height=size.getHeight();
		int width=size.getWidth();
		
		System.out.println("Height of the login button is: "+height +" \n and width is: "+ width);
		
		//In Selenium 4- getLocation and getSize methods has been replaced with SINGLE method getRect()
		Rectangle rect=driver.findElement(By.id("loginButton")).getRect();
		posX=rect.getX();
		posY=rect.getY();
		height=rect.getHeight();
		width=rect.getWidth();
		
		System.out.println("Using rectangle - X co-ordinate is: "+posX +" \n and Y co-ordinate is: "+ posY);
		System.out.println("Using rectangle - Height of the login button is: "+height +" \n and width is: "+ width);
		
		//WebELement Method - getCSSValue() - to get the CSS value for CSS properties
		String css= driver.findElement(By.id("loginButton")).getCssValue("display");
		System.out.println("CSS value for display is: "+css);
		
		css= driver.findElement(By.id("loginButton")).getCssValue("color");
		System.out.println("CSS value for color is: "+css);
		
		//WebELement Method - getAriaRole() - to get the element design type
		String role=driver.findElement(By.id("loginButton")).getAriaRole();
		System.out.println("Role of login Button:"+ role);
		
		role=driver.findElement(By.className("textField")).getAriaRole();
		System.out.println("Role of User Name:"+ role);
		
		role=driver.findElement(By.name("pwd")).getAriaRole();
		System.out.println("Role of Password field:"+ role);
		
		//WebELement Method - getAccessibleName() - to get the element accessibility name
		String accessname=driver.findElement(By.id("loginButton")).getAccessibleName();
		System.out.println("Accessibility name of login button:" + accessname);
		
		accessname=driver.findElement(By.name("username")).getAccessibleName();
		System.out.println("Accessibility name of user name field:" + accessname);
		
		accessname=driver.findElement(By.name("pwd")).getAccessibleName();
		System.out.println("Accessibility name of password field:" + accessname);
		
		//WebELement Method - isDisplayed() - to check if the element is displayed/present in the current DoM.
		boolean eledisplay=driver.findElement(By.id("username")).isDisplayed();
		if(eledisplay==true)
		{
			driver.findElement(By.id("username")).clear();
			System.out.println("User name is displayed");
		}
		else
		{
			System.out.println("User name is NOT displayed");
		}
		
		//WebELement Method - isenabled() - to check if the element is enabled or not in teh web page
		boolean enabled=driver.findElement(By.id("username")).isEnabled();
		if(enabled==true)
		{
			driver.findElement(By.id("username")).sendKeys("admin");
			System.out.println("User name is enabled");
		}
		else
		{
			System.out.println("User name is NOT enabled");
		}
		
		//WebELement Method - isSelected() - to check if the element is selected
		boolean selected=driver.findElement(By.id("username")).isSelected();
		if(selected==true)
		{
			driver.findElement(By.id("username")).sendKeys("Selected");
			System.out.println("User name is selected");
		}
		else
		{
			System.out.println("User name is NOT selected");
		}
				
		//WebElement method - getDOMAttribute() - To get the DOM Attribute value
		String domAttributeValue=driver.findElement(By.id("loginButton")).getDomAttribute("id");
		System.out.println("Value of DoM attribute is: " + domAttributeValue);
		
		//WebElement method - getDOMProperty() - To get the DOM proprty value for a property name
		String domPropertyValue = driver.findElement(By.id("loginButton")).getDomProperty("tagName");
		System.out.println("Value of DoM property is: " +domPropertyValue);
		
		domPropertyValue = driver.findElement(By.id("loginButton")).getDomProperty("type");
		System.out.println("Value of DoM property is: " +domPropertyValue);
		
		domPropertyValue = driver.findElement(By.id("loginButton")).getDomProperty("value");
		System.out.println("Value of DoM property is: " +domPropertyValue);
		
	//	domPropertyValue = driver.findElement(By.id("submitButton")).getDomProperty("nodeName");
		//System.out.println("Value of DoM property is: " +domPropertyValue);
		
		//WebElement method - submit() - its an alternative for click()
		//driver.findElement(By.id("loginButton")).submit();
		// In above statement - the loginButton in the website is NOT defined as submit ..so, the exception 
		//UnsupportedOperationException is thrown
		
		
		//webelement method - getShadowRoot() - to get the access of shadowDOM
		SearchContext shadow = driver.findElement(By.name("user_password")).getShadowRoot();
		System.out.println(shadow.toString());
		
		
		
		
	}

}
