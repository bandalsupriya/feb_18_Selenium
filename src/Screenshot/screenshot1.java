package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot1 {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		
		// 1) convert driver object of Webdriver(Interface) to TakesScreenshot(interface)
		// -----> casting--> converting one type to another
		//   ((TakesScreenshot)driver)-----> casting is done
		
		// Use getScreenshotAs method of TakesScreenshot interface
		
		// store them in reference variable--> to take multiple action on it
		File Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// File--> class of java.io.File
		// FILE--> Static and Final method
		// OutputType.FILE--> take a screenshot and i want o/p in File type
		
		//System.out.println(Screenshot);
		
		// to store in destination--> create object of File class and gives parameter as path(address where to store)
		File dest=new File("C:\\Selenium Screenshot\\screenshot1.png");
		
		// use Filehandler class in which copy method is their 
		
		FileHandler.copy(Screenshot, dest);
		
		// Filehandler --> class 
		// copy( from , to )--> Filehandler class method 
		
	}

}
