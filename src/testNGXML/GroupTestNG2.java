package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupTestNG2 {
	@Test
	  public void method7() 
	  {
		  Reporter.log("method7 is running",true);
	  }
	  @Test	
	  public void method8() 
	  {
		  Reporter.log("method8 is running",true);
	  }
	  @Test(groups = "Sanity")
	  public void method9() 
	  {
		  Reporter.log("method9 is running",true);
	  }
	  @Test	
	  public void method10() 
	  {
		  Reporter.log("method10 is running",true);
	  }
	  @Test(groups = "Sanity")
	  public void method11() 
	  {
		  Reporter.log("method11 is running",true);
	  }
	  @Test(groups = "Regression ")	
	  public void method12() 
	  {
		  Reporter.log("method12 is running",true);
	  }
}
