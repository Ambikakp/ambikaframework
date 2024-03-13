package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GenricScript_Util 
{
public static String fetchprop1(String path,String key) throws FileNotFoundException, IOException
{
Properties p= new Properties();
p.load(new FileInputStream(path));
String value = p.getProperty(key);
return value;
}
}