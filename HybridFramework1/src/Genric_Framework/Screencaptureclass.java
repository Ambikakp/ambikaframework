package Genric_Framework;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screencaptureclass
{
	public static void get_photo(WebDriver driver)

	{
		Date d = new Date(0);
	String d1=d.toString();
	String da=d1.replaceAll(":", "-");
	TakesScreenshot tss=(TakesScreenshot)driver;
	File tmp = tss.getScreenshotAs(OutputType.FILE);
	File pmt = new File("./photo/"+da+".jpg");
	try
	{
	org.openqa.selenium.io.FileHandler.copy(tmp, pmt);
	
	}
	catch(IOException e)
	{
	System.out.println("photo is not captured");
	e.printStackTrace();
	}
	}
}
