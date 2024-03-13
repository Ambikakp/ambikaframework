package POMFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genric_Framework.Basepage;

public class POMclass extends Basepage
{
	@FindBy (id="email")
	private WebElement uName;
	@FindBy (id="pass")
	private WebElement password;
	@FindBy (name="Login")
	private WebElement login;

	public POMclass(WebDriver driver)
	{
	super(driver); 
	}
	public void passdata1(String un )
	{
	uName.sendKeys(un);	
	}

	public void passdata2(String pwd )
	{
	password.sendKeys(pwd);	
	}
	public void passdata3( )
	{
	login.click();	
	}
}
