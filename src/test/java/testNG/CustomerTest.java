package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;



public class CustomerTest 
{

//	@Test(invocationCount=2,priority=3)
	
	@Test()
	public void createCustomer()
	{
		Assert.fail();
		System.out.println("Customer Created");
	}
	
	
//	@Test(enabled=false,priority=5)
	
	@Test(dependsOnMethods="createCustomer")
	public void modifyCustomer() {
		System.out.println("Customer Modified");
	}
	
	@Test(priority=0) //use depndsonmthods for 2 methods
	public void deleteCustomer()
	{
		System.out.println("Customer Deleted");
	}
	
	
	
}
