package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Runner_class1 
{
@Test
public void compose()
{
System.out.println("Message Composed");
}
@Test
public void sentItems()
{
System.out.println("Message sent");
Assert.fail();

}

@Test(dependsOnMethods ="sentItems" )

public void trash()
{
System.out.println("Message deleted");
}
}
