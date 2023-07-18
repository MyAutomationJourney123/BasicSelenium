package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice
{

	@Test(dataProvider="getData")//test script takes data from getdata dataProvider - as there can be multiple dataproviders 
	public void DataProviderDemo(String name,int price) //capture the data from data provider
	{
		System.out.println("Phone :"+name);
		System.out.println("Price :"+price);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2]; //works on rows and columns
		
		data[0][0]="iPhone";
		data[0][1]=25000;
		
		data[1][0]="Samsung";
		data[1][1]=15000;
		
		data[2][0]="Vivo";
		data[2][1]=10000;
		
		
		return data;
		
		
	}
	
}
