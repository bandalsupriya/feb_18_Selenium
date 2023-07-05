package assertTypeTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class True_False_Assert {
  @Test
  public void f() 
  {
	  boolean a=true;
	  boolean b=false;
	  
	 //Assert true
	  Assert.assertTrue(a);
	  
	  //Assert false
	  Assert.assertFalse(a,"Tc is fail");
  }
}
