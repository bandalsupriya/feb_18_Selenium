package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeOutMethodUse 
{
	
  @Test(timeOut = 3000)
  public void login() throws InterruptedException 
  {
	  Thread.sleep(5000);
	  Reporter.log("You Login in 3000ms", true);
  }
  @Test
  public void login2() 
  {
	  Reporter.log("You Login in 3000ms", true);
  }
}
