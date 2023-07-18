package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	//Rule 1: Create a POM class for EVERY web page separately.
	//Rule 2: Identify the web elements using @FindBy, @ FindAll, @ FindBys annotaion.
	
	@FindBy(id="username")
	private WebElement userNameEdt; //Edt means textfield - editable field
	
	@FindBy(name="pwd")
	private WebElement passwordEdt;
	
	@FindBy(id="loginButton")
	private WebElement loginLnk;  // lnk means link, button or drop down.
	
	//Rule 3 :Create a constructor to initialise web elements
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);  // current driver interface
		
	}
	
	//Rule 4: Provide getters to access the webelements
	
	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginLnk() {
		return loginLnk;
	}
	
	//COMPLETELY OPTIONAL
	//RUle 5: Business Library - method created using elements releated to this web page only
	
	public void loginToApp(String user_name,String pass)
	{
		userNameEdt.sendKeys(user_name);
		passwordEdt.sendKeys(pass);
		loginLnk.click();
	}
	
	
	
	
}
