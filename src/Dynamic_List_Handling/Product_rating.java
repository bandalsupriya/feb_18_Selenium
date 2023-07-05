package Dynamic_List_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product_rating {

	public static void main(String[] args) throws InterruptedException 
	{
	// flipkart product rating
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	//handle popup--> hidden div directly by inspecting
	//closing popup
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	// send keys of product
		driver.findElement(By.name("q")).sendKeys("i phone 14 pro");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(100);
		WebElement ratings = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[4]"));
	// use get text method to get rating
		
		System.out.println("Rating for product is "+ratings.getText());
		
   }
}
