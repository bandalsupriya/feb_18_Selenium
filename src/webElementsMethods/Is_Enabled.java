package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Enabled 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// 5)isEnabled-->This method is use to verify element is enabled or disabled.
		//            -->Return type of isenabled function boolean if element is enabled 
		//              then it returns true otherwise it returns false

		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?");
		Thread.sleep(2000);
		WebElement buttonRegisterNow = driver.findElement(By.xpath("//button[text()='Register Now']"));
		boolean result = buttonRegisterNow.isEnabled();
		System.out.println(result);
		
		// validate button is enabled or not
		// use if else--> to check button is enabled or not by using isEnabled method as condition
		
		if(buttonRegisterNow.isEnabled())             // if statement is false-- button is disabled
		{
			System.out.println("button is enabled");
		}
		else                                          // else statement is executed
		{
			System.out.println("button is not enabled");
		}
 
	}

	
}
