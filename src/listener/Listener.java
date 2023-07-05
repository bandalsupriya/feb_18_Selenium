package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result)
	{
	String TCname = result.getName();
	Reporter.log("This "+TCname+" method completed successfully", true);
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
	Reporter.log("This "+result.getName()+" method is Failed, pl try again", true);
	}
	
	@Override

	public void onTestStart(ITestResult result)
	{
	Reporter.log("Test "+result.getName()+" execution started..", true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result)
	{
	Reporter.log("This TC "+result.getName()+" is skipped..pl check dependent method",
	true);
	}
}
