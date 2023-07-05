package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxTestNGStudy {
  @Test
  public void f() 
  {
	  WebDriver diver=new FirefoxDriver();
	  diver.get("https://www.facebook.com/");
  }
}
