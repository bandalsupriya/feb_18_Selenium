package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_CSS_selector {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(1000);
		
		// 1) CSS-->using Tag and ID-->tag#id
		driver.findElement(By.cssSelector("input#email")).sendKeys("rupeshwathore@gmail.com");
		Thread.sleep(1000);
		// 2) CSS--> using Tag and Class-->tag.class
		// driver.findElement(By.cssSelector("div._6ltj")).click();
		
		// 3)//CSS-->Tag and Attribute-->tag[attribute=value]
		//driver.findElement(By.cssSelector("input[id=pass]")).sendKeys("rupesh123");
		
		// 4) CSS-->Tag, Class, and Attribute-->tag.class[attribute=value]
		
		//driver.findElement(By.cssSelector("button._42ft[id=u_0_5")).click();
		
		// you can take partial value of large linked text
		
		driver.findElement(By.cssSelector("input.inputtext[id=pass]")).sendKeys("rupesh123");
	
 
		
	}

}
