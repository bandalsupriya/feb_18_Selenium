package assertTypeTestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Fail_Assert {
  @Test
  public void f() 
  {
	  Reporter.log("Tc is pass",true);
	  Assert.fail();
  }
}
