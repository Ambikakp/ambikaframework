package Dataprovider;

import org.testng.annotations.Test;

public class RunnerclassDataprovider 
{
@Test(dataProvider="LoginCredential", dataProviderClass =  CustomDataprov.class)
public void LoginTest(String un,String pwd)
{
System.out.println(un+" "+pwd);
}
}
