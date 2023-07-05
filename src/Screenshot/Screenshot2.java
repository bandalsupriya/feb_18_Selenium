package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot2 {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		
		// 1) convert driver object of Webdriver(Interface) to TakesScreenshot(interface)
		File Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Use of RandomString class for multiple ScreenShots
		String Random = RandomString.make(2);
		// 2) create object of File class to store in destination
		File dest=new File("C:\\Selenium Screenshot\\SS"+Random+".png");
		// 3)Use copy method of FileHandler class to copy from and store into destination
		FileHandler.copy(Screenshot, dest);
		

	}

}
