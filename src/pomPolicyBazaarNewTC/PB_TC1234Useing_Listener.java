package pomPolicyBazaarNewTC;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import base.Base;
import utilityPolicyBazaar.Utility;

public class PB_TC1234Useing_Listener extends Base implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result)
	{
		try 
		{
			Utility.takeScreenShoot(driver, result.getName());
		} 
		catch (IOException e) 
		{
		   e.printStackTrace();
		}
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("Tc "+result.getName()+" Passed successfully",true);
		
	}
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("TC Execution Started for  "+result.getName(),true);

	}
}
