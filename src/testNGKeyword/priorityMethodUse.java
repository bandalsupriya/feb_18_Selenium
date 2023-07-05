package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class priorityMethodUse 
{
	//testNG by default execute test case in alphabetical order
	//it can be +,-,bydefault=0,duplicate
  @Test(priority = 2)
  public void a() 
  {
	  Reporter.log("Method a running", true);
  }
  @Test
  public void c() 
  {
	  Reporter.log("Method c running", true);
  }
  @Test(priority = -3)
  public void d() 
  {
	  Reporter.log("Method d running", true);
  }
  @Test(priority = -4)
  public void b()
  {
  
	  Reporter.log("Method b running", true);
  }
}
