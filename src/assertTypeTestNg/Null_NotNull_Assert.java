package assertTypeTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Null_NotNull_Assert {
  @Test
  public void f() 
  {
	  String a=null;
	  String b="abc";
	 // Assert.assertNull(a);//assert null
	 // Assert.assertNotNull(a,"string is not null");//assert not null
	  Assert.fail();
	  
  }
}
