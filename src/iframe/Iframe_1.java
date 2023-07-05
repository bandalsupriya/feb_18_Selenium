package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		// before performing action on element present in frame
		// we need to switch selenium focus from main page to frame
		Thread.sleep(4000);
		driver.switchTo().frame("iframeResult");
		
		// click on  click me to display date and time
		
		//button[contains(text(),'Click me')]
		//driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
		WebElement clickMeButton = driver.findElement(By.xpath("//button[contains(text(),'Click me')]"));
		clickMeButton.click();
		
		clickMeButton.getText();
		System.out.println(clickMeButton.getText());
		
		
		//Thread.sleep(2000);
		// i want text
		//p[text()='Wed May 17 2023 11:26:48 GMT+0530 (India Standard Time)']
		//WebElement text = driver.findElement(By.xpath("//p[text()='Wed May 17 2023 11:26:48 GMT+0530 (India Standard Time)']"));
		//System.out.println(text.getText());
		
		
		// to perform action on main page-->switch focus from Iframe to Main page
		
		driver.switchTo().defaultContent();
		
		//a[@title='Change Theme']
		driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
		
		

	}

}
