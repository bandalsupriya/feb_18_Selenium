package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		// before performing action on element present in frame
		// we need to switch selenium focus from main page to frame
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		WebElement Button = driver.findElement(By.xpath("//button[contains(text(),'Click me')]"));
		Button.click();
		Button.getText();
		System.out.println(Button.getText());
		
		
		//button[contains(text(),'Click me')]
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
		
		//(//a[@title='Change Theme'])[1]
		
	}

}
