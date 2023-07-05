package pompolicyTestNG;

import java.time.Duration; 
import java.util.ArrayList; 
import java.util.List; 
import java.util.Set; 

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.Assert; 
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod; 
import org.testng.annotations.BeforeClass; 
import org.testng.annotations.BeforeMethod; 
import org.testng.annotations.Test; 
 
public class validatePolicyUserName { 
   
 	WebDriver driver; 
 	LoginPage login; 
 	MyAccountPage myacc; 
 	 
 	@BeforeClass 
 	public void launchPolicyBazaar() 
 	{ 
 	 	 
 	 	driver=new ChromeDriver();  	
 	 	driver.get("https://www.policybazaar.com/");  	 
 	 	driver.manage().window().maximize();  	 	
 	 	login=new LoginPage(driver);  	 
 	 	myacc= new MyAccountPage(driver); 
 	} 
 	  	 
 	@BeforeMethod 
 	public void loginToPolicyBazaar() 
 	{ 
 		
 	 	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));  	 	
 	 	login.clickOnHomePageSignInButton(); 
 	 	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));  	 	
 	 	login.enterMobileNum(); 
 	 	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));  	 	
 	 	login.clickOnSignInWithPassword(); 
 	 	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); 
 	 	login.enterPassword(); 
 	 	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));  	 	
 	 	login.clickOnSignInButton(); 
 	 	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));  	 	
 	 	login.clickOnMyAccountButton(); 
 	 	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));  	 	
 	 	login.clickOnMyProfileButton(); 
 	 	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); 
 	 	Set<String> allWindowID = driver.getWindowHandles(); 
 	 	List<String>id= new ArrayList<>(allWindowID); 
 	 	 
 	 	//switching focus to child page 
 	 	 
 	 	driver.switchTo().window(id.get(1)); 
 	 	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); 
 	 
 	} 
 	 
 	@Test 
  public void verifyUserName()  
 	{ 
 	 
 	String expUN="Priya Bandal"; 
 	String actualUN = myacc.getActualUserName();  
 	Assert.assertEquals(actualUN, expUN,"TC failed, actual and expected UN not matching"); 
 	 
 	} 
 	 
 	@AfterMethod 
 	public void logOutFromPolicyBazaar() 
 	{ 
 	 	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));  
 	 	myacc.clickOnLogOutButton(); 
 	} 
 	 
 	@AfterClass 
 	public void closeBrowser() 
 	{ 
 	 	driver.quit(); 
 	} 
} 

