package crossBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class validatedURL {
  @Test
  public void validateurlName() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.naukri.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 String actualURl=driver.getCurrentUrl();
	 String expectedURL="https://www.naukri.com";
	 if(actualURl.equals(expectedURL))
			 {	
		 Reporter.log("actual result and expected result are match tc is pass");		
		 }			
	 
	 else {
		 Reporter.log("tc is fail");
	 }
	 
	  
  }
}
