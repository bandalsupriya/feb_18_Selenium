package Chrome_Option_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_1 {
 
	public static void main(String[] args) 
	{
		// 1) Create an object of Chrome option Class
		ChromeOptions CO=new ChromeOptions();
		
		// 2)  using ChromeOptions object select desired option by using addArgument method 
		//CO.addArguments("incognito");      // incognito mode --(Private Browsing)
		//CO.addArguments("start-maximized");   // maximized the window
		CO.addArguments("headless");           // without launching browser we can performed certain action
		
		// 3) pass the object of ChromeOption as argument of Chromedriver
		WebDriver driver= new ChromeDriver(CO);
		
		driver.get("https://www.google.com/");
		WebElement gmailLink = driver.findElement(By.xpath("//a[text()='Gmail']"));
		System.out.println(gmailLink.getText());
	}

}
