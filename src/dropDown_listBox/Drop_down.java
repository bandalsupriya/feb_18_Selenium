package dropDown_listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		Thread.sleep(1000);
		//1.Identify list box to be handled and store it in reference variable
		WebElement day = driver.findElement(By.id("day"));
		
		//2.Create an object of Select class which will accept WebElement as argument
		
		Select sdate=new Select(day);
		
		//3.By using one of the select class methods we can select values form list box like
		
		//--> 1. selectByVisibleText
		// lets select date-->30
		//sdate.selectByVisibleText("30");
		
		//-->2. selectByIndex
		//sdate.selectByIndex(29);
		
		//-->3. selectByValue

		sdate.selectByValue("30");
		
		
		// select month-->April
		WebElement month = driver.findElement(By.id("month"));  // 1 step
		Select smonth=new Select(month);   // 2 step
		smonth.selectByIndex(3);           // 3 step
		
		
		// select year--> 1997
		WebElement year = driver.findElement(By.name("birthday_year"));   // 1 step
		Select syear=new Select(year);          // 2 step
		syear.selectByVisibleText("1997");
		
		
		
		// check if any drop down is multiple selectable or not
		//  year.ismultiple----> this is not possible because isMultiple is select class method
		
		//syear.isMultiple()
		System.out.println("syear status is multiple selectable "+syear.isMultiple());

		// its gives false because we can select only one year 
 
	}

}
