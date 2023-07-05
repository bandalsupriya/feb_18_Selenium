package Synchronization_wait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_wait_3_Dynamic {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://discoveryplus.in/");
		Wait<WebDriver>w=new 
FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(3000)).pollingEvery(Duration.ofMillis(5)).ignoring(NoSuchElementException.class);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h6[text()='Sign In'])[2]")));
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();


	}

}
