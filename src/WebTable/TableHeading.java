package WebTable;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHeading {

	public static void main(String[] args) 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		// how to read header row only
		List<WebElement> header = driver.findElements(By.tagName("th"));
		
		Iterator<WebElement> it = header.iterator();
		while(it.hasNext())
		{
		System.out.print(it.next().getText()+" ");
		}
		System.out.println();
		
		//how to read single row
		List<WebElement> row1 = 
		driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]/td"));
		Iterator<WebElement> it1 = row1.iterator();
		while(it1.hasNext())
		{
		System.out.print(it1.next().getText()+" ");
		}
		
	}

}
