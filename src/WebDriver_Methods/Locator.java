package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(1000);
		
		// 3) locator--> name
		//no need to findout x-path directly take name value
		driver.findElement(By.name("email")).sendKeys("rupeshwathore@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("rupesh123");
		
		
		// 1) locator--> id
		//  id is always unique,no need to findout x-path directly take name value.
		driver.findElement(By.id("pass")).sendKeys("rupesh123");
		
		
		// 2) locator--> class
	    // always try to avoid using class name locator
		// if you want to take then--take only starting value avoid space
		// _42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy-->  _42ft
		
		Thread.sleep(1000);
		driver.findElement(By.className("_42ft")).click();
	     
	}

}
