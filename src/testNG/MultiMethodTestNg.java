package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultiMethodTestNg {
  @Test
  public void method1() 
  {
	  Reporter.log("method runing1",true);  
  }
  @Test
  public void method2() 
  {
	  Reporter.log("method runing2",true);
  }
  @Test
  public void method3() 
  {
	  Reporter.log("method runing3",true);
  }
  @Test
  public void method4() 
  {
	  Reporter.log("method runing4",true);
  }
}
