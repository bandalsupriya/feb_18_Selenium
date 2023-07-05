package Dynamic_List_Handling;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderlist {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.id("APjFqb")).sendKeys("honda");
		
		
		// store list by using findElemnts method
		List<WebElement> SearchResult = driver.findElements(By.xpath("(//ul[@role='listbox'])[1]/li"));
		
		// traversing through list and use get text method
		for(WebElement Sr:SearchResult)
		{
			System.out.println(Sr.getText());
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		// click on honda bikes
		
		for(WebElement Sr:SearchResult)
		{ 
			String expectedresult="honda bikes";
			if(expectedresult.equals(Sr.getText()))
			{
				Sr.click();
				break;
			}
			
		}
		
		// click on images 
		driver.findElement(By.linkText("Images")).click();
	}

}
