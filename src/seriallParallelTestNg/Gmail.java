package seriallParallelTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gmail {
  @Test
  public void g() 
  {
	  WebDriver diver=new ChromeDriver();
	  diver.get("https://mail.google.com/");
  }
}
