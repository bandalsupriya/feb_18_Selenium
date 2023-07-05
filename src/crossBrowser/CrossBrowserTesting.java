package crossBrowser;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.testng.annotations.Parameters;
import org.testng.annotations.Test; 


public class CrossBrowserTesting 
{ 
 	@Parameters("browserName") // browserName is parameter from xml file 
 	@Test 

	  public void cbTest(String bname)   
	  { 
	 	  WebDriver driver = null; 
	 	  	 	 
	 	  if(bname.equals("chrome")) 
	 	  { 
	      
		  driver= new ChromeDriver(); 
	  } 
	 	   
	 	  else if (bname.equals("fireFox"))  
	 	  { 
	 	 	  driver= new FirefoxDriver(); 
	 	 	 
	 	} 

	 	 	 
	 	 	driver.manage().window().maximize();  	 	
	 	 	driver.get("https://www.policybazaar.com/"); 

  }
}
