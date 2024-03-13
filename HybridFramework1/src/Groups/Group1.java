package Groups;

import org.testng.annotations.Test;

public class Group1 

{
@Test(groups = {"Sanity"})
public void test1()
{
	System.out.println("Hello India");
}
@Test(groups = {"Sanity","Regression"})

public void test2()
{
	System.out.println("Hello Asia");
}
@Test(groups = {"Regression"})
public void test3()
{
	System.out.println("Hello World");
}


}
