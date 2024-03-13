package Genric_Framework;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utils.Fetchproperties_class;

public class Baseclass implements Framework_constant
{
public WebDriver driver;
@BeforeMethod
public void openappln() throws FileNotFoundException, IOException
{
System.setProperty(c_key,c_value);
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get(Fetchproperties_class.fetchprop());
}

@AfterMethod
public void closeappln()
{
	driver.close();
}
}