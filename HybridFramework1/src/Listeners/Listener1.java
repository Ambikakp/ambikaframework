package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
	System.out.println("Exec Started");	
		
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Tc passed");	
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Tc failed");	
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
		System.out.println("Tc skipped");	
	}



}
