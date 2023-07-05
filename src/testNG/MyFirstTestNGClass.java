package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyFirstTestNGClass {
  @Test
  public void f() 
  {
	  //WebDriver diver=new ChromeDriver();
	  //diver.get("https://www.facebook.com/");
	  System.out.println("Method runing");
	  Reporter.log("method runing",true);
  }
  
}
