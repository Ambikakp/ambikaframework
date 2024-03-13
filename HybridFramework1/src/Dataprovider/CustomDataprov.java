package Dataprovider;

import org.testng.annotations.DataProvider;

public class CustomDataprov 
{
	@DataProvider(name="LoginCredential")
public Object[][] getData()
{
	Object[][]	data= {{"santhosh@gmail.com","123"},{"pradeep@gmail.com","456"},{"Rahul@gmail.com","789"}};
return data;
	}


}
