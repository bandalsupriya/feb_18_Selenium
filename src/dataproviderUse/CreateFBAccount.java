package dataproviderUse;

import org.testng.annotations.Test;
import java.time.Duration; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
	 
	public class CreateFBAccount
	{ 
	  @Test(dataProvider = "myFBdata", dataProviderClass = DataProviderTest.class) 
	  
	  public void fbAcc(String firstName,String lastName,String MobNum) throws InterruptedException  
	  { 
	 	  WebDriver driver= new ChromeDriver();  	 
	 	  driver.manage().window().maximize(); 
	 	  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");  	  
	 	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); 
	 	   
	 	  driver.findElement(By.name("firstname")).sendKeys(firstName);  	
	 	  Thread.sleep(1000); 
	 	  driver.findElement(By.name("lastname")).sendKeys(lastName);  
	 	  Thread.sleep(1000);  	 
	 	  driver.findElement(By.name("reg_email__")).sendKeys(MobNum); 
	  } 

}
