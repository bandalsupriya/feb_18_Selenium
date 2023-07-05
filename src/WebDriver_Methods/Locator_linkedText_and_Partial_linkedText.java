package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_linkedText_and_Partial_linkedText {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(1000);
		
		// 5. Locator--> linked text
		//only work for linked-->clickable/Underline/start tagname-a-(anchor)
		// Action--> you can click on the link
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//6. Locator-->Partial Linked Text
		// you can take partial value of large linked text
		// if linked text value is larger then use this
		
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		

	}

}
