package testNGKeyword;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class DependsonMethodStudy 
{
	
	//login methoddepends on enterpasword method that's whyenterPassword executefirst
	@Test(dependsOnMethods = "enterPassword")
	public void login() 
	  {
		  
		  Reporter.log("You Login Sucessfully...", true);
	  }
	  @Test
	public void enterPassword() 
	  {
		  //org.testng.Assert.fail();//if main method is fail then depends methos will be skip
		  Reporter.log("Enter Password", true);
	  }
}
