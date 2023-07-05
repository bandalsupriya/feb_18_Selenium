package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());
	    Thread.sleep(1000);
	    driver.quit();

	 
	    
	    
	    
	    
	}

}
