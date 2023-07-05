package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validate_redioButton_isEnabled {

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button");
		Thread.sleep(1000);
	    WebElement redioButton= driver.findElement(By.xpath("//input[@id='yesRadio']"));
	    Thread.sleep(1000);
	    redioButton.click();
	    Thread.sleep(1000);
	    boolean result = redioButton.isEnabled();
	    
		System.out.println("Button status is "+result);
	}

}
