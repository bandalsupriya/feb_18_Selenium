package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validate_Naukari_Com_BY_getText {

	public static void main(String[] args) throws InterruptedException 
	{
		// 1)expected text--> from requirement document
		     String expectedText = "Find a job & grow your career";
		// 2)I want actual text
		// to get actual text from webPage--> use getText() method
		// 3)use if else--> to compare text and print result
		
		
		     
		//2) step     
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?");
		Thread.sleep(1000);
		String actualText = driver.findElement(By.xpath("//h1[text()='Find a job & grow your career']")).getText();
		System.out.println("Actual Text is "+actualText);
		System.out.println("Expected Text is "+expectedText);
		
		//3) step
		System.out.println("=====test case Execution result=====");
		
		if(expectedText.equals(actualText))
		{
			System.out.println("Expected text and Actual text are matching and TC is Passed");
		}
		else
		{
			System.out.println("Expected text and Actual text are not matching and TC is Failed");
		}
		
		
	}

}
