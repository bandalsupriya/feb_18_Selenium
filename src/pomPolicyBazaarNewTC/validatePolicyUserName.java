package pomPolicyBazaarNewTC;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pomPolicyBazaarnew.LoginPage;
import pomPolicyBazaarnew.MyAccountPage;
import utilityPolicyBazaar.Utility;
 


public class validatePolicyUserName extends Base{
	//WebDriver driver;
    LoginPage login; 
    MyAccountPage myacc;
    String TCID="PB_TC1234";

    @BeforeClass 
    public void LaunchPolicyBazaar() throws InterruptedException, IOException
    {
  	 launchBrowser();
  	 login=new LoginPage(driver);
  	 myacc=new MyAccountPage(driver);
  	 Utility.imlicitWait(driver, 1000);
  	  
    }
  @BeforeMethod
  public void signInPolicyBazaar() throws InterruptedException, EncryptedDocumentException, IOException
  {
  	  
  	login.clickOnHomePageSignInButton();
  	 Utility.imlicitWait(driver, 1000);
  	login.enterMobileNum(Utility.readDataFromExcel(0, 0));
  	 Utility.imlicitWait(driver, 1000);
  	login.clickOnSignInWithPassword();
  	 Utility.imlicitWait(driver, 1000);
  	login.enterPassword(Utility.readDataFromExcel(0, 1));
  	 Utility.imlicitWait(driver, 1000);
  	login.clickOnSignInButton();
  	 Utility.imlicitWait(driver, 1000);
  	login.clickOnMyAccountButton();
  	 Utility.imlicitWait(driver, 1000);
  	login.clickOnMyProfileButton();
  	 Utility.imlicitWait(driver, 1000);
  	
  	Set<String> allPageID = driver.getWindowHandles();
  	List<String> l= new ArrayList<>(allPageID);
  	String mainPageID=l.get(0);
  	String childPageId=l.get(1);
  	
  	driver.switchTo().window(childPageId);
  	Reporter.log("swiching to child page",true);
  	 Utility.imlicitWait(driver, 1000);	
  }

 @Test
 public void validateUserName() throws EncryptedDocumentException, IOException
 {
	 
	   String actualUN=myacc.getActualUserName();
	   String expUN=Utility.readDataFromExcel(0, 2);
	   
	   Assert.assertEquals(actualUN, expUN,"Tc is failed actual and expected are not matching");
       Utility.takeScreenShoot(driver, actualUN+" "+TCID);
	   
 }
 @AfterMethod
 public void logoutFromPolicyBazaar()
 {
	  
	   
	   myacc.clickOnLogOutButton();
	   Reporter.log("Log out from Policy Bazaar Application", true);
	   
	   
 }
@AfterClass
public void closePolicyBrowser()
{
	  Utility.imlicitWait(driver, 1000);  
	  Reporter.log("Close Policy Bazaar Application", true);
	  CloseBrowser(); 
	  
}
 

}
