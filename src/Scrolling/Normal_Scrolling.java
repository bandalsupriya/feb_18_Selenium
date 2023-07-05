package Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Normal_Scrolling {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions CO= new ChromeOptions();
		CO.addArguments("disable-notifications");
		WebDriver driver= new ChromeDriver(CO);
		//driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");
		Thread.sleep(1000);
		//Here we type cast driver object into JavaScriptExecutor interface 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//then we use executeScript() method and pass the argument of windows x and y dimensions
		js.executeScript("window.scrollBy(700,600)");
		Thread.sleep(1000);
		  
		js.executeScript("window.scrollBy(100,200)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(100,-700)");

	}

}
