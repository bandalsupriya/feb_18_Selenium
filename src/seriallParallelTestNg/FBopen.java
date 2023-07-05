package seriallParallelTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FBopen {
  @Test
  public void f() 
  {
	  WebDriver diver=new ChromeDriver();
	  diver.get("https://www.facebook.com/");

  }
}
