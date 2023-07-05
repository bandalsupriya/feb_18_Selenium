package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationCountStudy 
{
  //Sometimes same test method/
  //TC need to be executed multiple times which can be possible by using TestNG keyword "invocationCount"
  //it can't be negative... it show error
	@Test(invocationCount = 3)
  public void busBooking() 
  {
	  Reporter.log("Booking is runing...",true);
  }
  
  
}
