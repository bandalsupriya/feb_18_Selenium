package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabledMethodUse 
{
	//if we want only 1 or 2 test case then we can do another test case is enabled=false
	@Test
	  public void a() 
	  {
		  Reporter.log("Method a running", true);
	  }
	  @Test(enabled = false)
	  public void c() 
	  {
		  Reporter.log("Method c running", true);
	  }
	  @Test
	  public void d() 
	  {
		  Reporter.log("Method d running", true);
	  }
	  @Test(enabled = false)
	  public void b()
	  {
	  
		  Reporter.log("Method b running", true);
	  }
}
