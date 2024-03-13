package RunnerFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Genric_Framework.Baseclass;
import POMFramework.POMclass;
import PomScript.pomscript1;

public class Runnerclass extends Baseclass 

{
@Test(dataProvider = "test1")
public void login(String un,String pwd) throws InterruptedException
{
	
POMclass p =new POMclass(driver);
p.passdata1(un);
Thread.sleep(3000);
p.passdata2(pwd);
Thread.sleep(3000);
p.passdata3();
Thread.sleep(3000);
}

@DataProvider(name = "test1")
public Object[][] createData1() {
 return new Object[][] {
   { "ambika", "abc123" },
   { "Anne", "anne123"},
 };
}
}

