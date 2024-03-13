package Testng_report;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentreport 
{
@Test
public void report1()
{
ExtentReports reports = new ExtentReports("./reports/r.html",false);	
ExtentTest test = reports.startTest("testcase1");
test.log(LogStatus.PASS,"tc passed");
test.log(LogStatus.FAIL,"tc failed");
test.log(LogStatus.SKIP,"tc skipped");
reports.endTest(test);
reports.flush();
}

}
