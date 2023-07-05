package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_and_close {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		// 1) get method
		driver.get("https://javagoal.com/");     // use of get method to open url 
		
		// 2) close method
		
		driver.close(); // to close the url or browser--> open by selenium tool only
	}

}
