package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import utilityPolicyBazaar.Utility;

public class Base 
{
	//driver and  browser setup
 
	static protected WebDriver driver;  // we can't asscess other package(base..)
    
    
    public void launchBrowser() throws IOException
	{
		 driver= new ChromeDriver();
		 driver.get("https://www.policybazaar.com/");
		 driver.manage().window().maximize(); 
		 Reporter.log("Lunching Browser Application",true);
		 
	}
    
 // --*******this code use for property file------*********
	public void launchBrowserUseingPropertyFile() throws IOException
	{
		 driver= new ChromeDriver();
		 driver.get(Utility.readDataFromPropertiyFile("url"));
		 driver.manage().window().maximize(); 
		 Reporter.log("Lunching Browser Application Useing Property File...",true);
		 
	}
	public void CloseBrowser()
	{
		 
		 driver.quit();
		 Reporter.log("Close Browser ",true);
		 
	}
	
	

}
