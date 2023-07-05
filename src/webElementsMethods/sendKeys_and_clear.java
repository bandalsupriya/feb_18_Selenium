package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys_and_clear {

	public static void main(String[] args) throws InterruptedException 
	{
		//1)send keys-->methods is use enter value in the input /text field
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://paytm.com/recharge");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("1234567890");
	    Thread.sleep(1000);
       //2)clear-->this method is use to clear value in text field
	    driver.get("https://en-gb.facebook.com/");
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rupeshwathore@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='email']")).clear();
	 
	    
	}

}
