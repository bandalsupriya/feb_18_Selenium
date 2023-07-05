package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basicStudy {

	public static void main(String[] args) 
	{
		
		// Webdriver - superclass 
		// Chromedriver-subclass
		
		
		
		
		WebDriver driver= new ChromeDriver();    // up casting
		//driver.get("https://javagoal.com/");
		//driver.get("https://www.amazon.com/");
		//driver.get("https://www.youtube.com/");
		
		//driver.findElement(By.xpath("//input[@id='search']")).sendKeys("selenium installation");
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("rupeshwathore@gmail.com");
		
		
		//ChromeDriver driver1=new ChromeDriver();
		//driver1.get("https://www.amazon.com/");
		
		
		
	}

}
