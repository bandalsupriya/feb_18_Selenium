package testNGXML;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedTestNgStudy {
	@Test
	  public void method1() 
	  {
		  Reporter.log("method1 is running",true);
	  }
	  @Test
	  public void method2() 
	  {
		  Reporter.log("method2 is running",true);
	  }
	  @Test
	  public void method3() 
	  {
		  //Assert.fail();
		  Reporter.log("method3 is running",true);
	  }
	  @Test
	  public void method4() 
	  {
		  Assert.fail();
		  Reporter.log("method4 is running",true);
	  }
	  @Test
	  public void method5() 
	  {
		  Reporter.log("method5 is running",true);
	  }
	  @Test
	  public void method6() 
	  {
		  Reporter.log("method6 is running",true);
	  }
}
