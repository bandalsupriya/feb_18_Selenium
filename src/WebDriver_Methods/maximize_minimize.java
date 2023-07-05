package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize_minimize {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
        driver.get("https://paytm.com/");// by default minimize
        
        // how to change size and location--> we can change by  maximize and  minimize
        // 4.1) maximize--> used to maximize the opened browser
        driver.manage().window().maximize();   // this is called as method chaining
        
        // method chaining = combining multiple methods by methods 
        
     // 4.2) minimize--> used to minimize the opened browser
        driver.manage().window().minimize();   // this is called as method chaining
        
	}

}
