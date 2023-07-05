package assertTypeTestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
	public class HardAssertStudy {
		  @Test
		  public void userName() 
		  {
			  String actualUN=null;  //user input
			  String expectUN="ABC"; //fix input
			  
			  SoftAssert sa=new SoftAssert();
			  sa.assertNotNull(actualUN,"User name will be null,TC is fail");
			  sa.assertEquals(actualUN, expectUN,"Actual and expectUN are not equal");
			  sa.assertAll();
		  }
}
}
