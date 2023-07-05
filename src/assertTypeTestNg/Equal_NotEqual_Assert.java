package assertTypeTestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Equal_NotEqual_Assert {
  @Test
  public void f()
  {
	  String s1="pune";
	  String s2="pune";
	  String s3="mumbai";
	  
		/*
		 * if (s1.equals(s3)) { Reporter.log("Tc is Pass",true); } else {
		 * Reporter.log("TC is Fail",true); }
		 */
	  
	  //we don't use if else in verification in testng becoz ts case is fail but result show as passes 
	  //to solve this problem we use assert's
	  
	  //Assert.assertEquals(s3, s1,"Both are not equal");  //assertEquals Assert
	  Assert.assertNotEquals(s2, s3,"both are equal"); //assertNotEquals Assert

  }
}
