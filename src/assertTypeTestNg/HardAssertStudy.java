package assertTypeTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertStudy {
  @Test(priority = -1)
  public void userName() 
  {
	  String actualUN=null;  //user input
	  String expectUN="ABC"; //fix input
	  Assert.assertNotNull(actualUN,"User name will be null");
	  Assert.assertEquals(actualUN, expectUN,"Actual and expectUN are not equal");
  }
  @Test
  public void passWord() 
  {
	  String actualpass="123";  //user input
	  String expectpass="123"; //fix input
	  Assert.assertNotNull(actualpass,"User name will be null");
	  Assert.assertEquals(actualpass, expectpass,"Actual and expectUN are not equal");
  }
}
