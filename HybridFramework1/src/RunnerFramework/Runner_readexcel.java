package RunnerFramework;

import org.testng.annotations.Test;

import Genric_Framework.Baseclass;
import Genric_Framework.GenricReadExcel;
import POMFramework.POMclass;

public class Runner_readexcel extends Baseclass
{
	@Test
	public void login() throws InterruptedException
	{
		
	POMclass p =new POMclass(driver);
	p.passdata1(GenricReadExcel.getdata("Sheet2",0,1));
	Thread.sleep(3000);
	p.passdata2(GenricReadExcel.getdata("Sheet2",1,1));
	Thread.sleep(3000);
	p.passdata3();
	Thread.sleep(3000);
	asser
	}
}
