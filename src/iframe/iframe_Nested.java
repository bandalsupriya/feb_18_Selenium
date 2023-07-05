package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframe_Nested {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(2000);
		// switch focus from main page to frame 1
		// frame 1
		// 1--> send keys of Selenium iFrame
		driver.switchTo().frame("frame1");
		driver.findElement(By.tagName("input")).sendKeys("Selenium iFrame");
		Thread.sleep(1000);
		
		// switch focus from frame 1 to frame3
		// 2--> click on checkbox
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
		// switch focus from frame 3 to frame2
		// 3--> locate drop down and select animal
		// create object of Select by passing arg. as webelent of Dropdown
		Thread.sleep(1000);
		
		//switching selenium focus from Iframe3 to main page
		//driver.switchTo().defaultContent();
	    driver.switchTo().defaultContent();
		String MpgTx = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println(MpgTx);
		// To get text
		String Mp=driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
		System.out.println(Mp);
		
		
		// switching from frame 3 to frame 2 not possible exception NoSuchFrame
        // switch main page to frame 2
		driver.switchTo().frame("frame2");
		WebElement DropDown = driver.findElement(By.id("animals"));
		Select s=new Select(DropDown);
		//s.selectByVisibleText("Big Baby Cat");
		s.selectByIndex(2);
		
	}

}
