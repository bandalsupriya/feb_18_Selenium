package Synchronization_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait_2_Dynamic 
{

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://discoveryplus.in/");
		//Explicit wait
		//Applicable: single element
		WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(3000));
  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h6[text()='Sign In'])[2]")));
		
		WebElement signInButton = 
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		signInButton.click();
		//   (//h6[text()='Sign In'])[2]\
	}

}
