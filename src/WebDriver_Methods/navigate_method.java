package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_method {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		// 5)navigate method-->this method is use to open an application
		//    with extra features  ( move forward,backward & refresh the web page)
		
		driver.navigate().to("https://paytm.com/");
		driver.navigate().to("https://javagoal.com/");
		
		// extra features of navigate method
		
		driver.navigate().back();        // back to previous page
		driver.navigate().forward();     // move to next page
		driver.navigate().refresh();     // refresh the page
		

	}

}
