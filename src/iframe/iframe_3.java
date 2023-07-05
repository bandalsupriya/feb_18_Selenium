package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframe_3 {

	public static void main(String[] args) throws InterruptedException 
	{
		// Nested iframe-->
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(2000);
		
		// before performing action on element present in frame
		// we need to switch selenium focus from main page to frame
		driver.switchTo().frame("frame1");//here we are switching selenium focus from main page to Iframe1 
		
		String Tx=driver.findElement(By.xpath("//b[@id='topic']")).getText();
		Thread.sleep(1000);
		System.out.println("text of Frame1 is "+Tx);
		driver.findElement(By.tagName("input")).sendKeys("Selenium");
		Thread.sleep(1000);
		
		//switching selenium focus from Iframe1 to Iframe3
		driver.switchTo().frame("frame3");
		// To get text
		String Tx1=driver.findElement(By.xpath("//b[text()='Inner Frame Check box :']")).getText();
		System.out.println("text of Frame3  is "+Tx1);
		driver.findElement(By.xpath("//input[@id='a']")).click();
		Thread.sleep(2000);
		
		//switching selenium focus from Iframe3 to main page
		//driver.switchTo().defaultContent();
		driver.switchTo().defaultContent();
		String MpgTx = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println(MpgTx);
		// To get text
		String Mp=driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
		System.out.println(Mp);
		
		//Switching focus from main page to Iframe2
		driver.switchTo().frame("frame2");
		String Fr2=driver.findElement(By.xpath("//b[contains(text(),'Animals :')]")).getText();
		System.out.println("text of Frame2 is "+Fr2);
		Thread.sleep(1000);
		
		WebElement animal=driver.findElement(By.id("animals"));
		Select s=new Select(animal);
		s.selectByVisibleText("Baby Cat");
		//Thread.sleep(1000);
		
		//switching selenium focus from Iframe2 to main page
		driver.switchTo().defaultContent();
		
		
	}

}
