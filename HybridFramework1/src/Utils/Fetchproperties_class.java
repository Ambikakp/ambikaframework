package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Fetchproperties_class
{
@Test
public static String fetchprop() throws FileNotFoundException, IOException
{
Properties p = new Properties();
p.load(new FileInputStream("./facebook.properties"));
String value = p.getProperty("baseURL");
return value;

}


}
