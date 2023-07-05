package seriallParallelTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Instaopen {
  @Test
  public void i() 
  {
	  WebDriver diver=new ChromeDriver();
	  diver.get("https://www.instagram.com/");
  }
}
