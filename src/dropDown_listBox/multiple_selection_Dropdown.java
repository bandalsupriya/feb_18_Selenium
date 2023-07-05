package dropDown_listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiple_selection_Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.uitestpractice.com/Students/Select");
		Thread.sleep(1000);
		WebElement countries = driver.findElement(By.id("countriesMultiple"));
		
		Select C1=new Select(countries);  // to access select class methods we create object of select class
		                                  // giving argu. of webelement object
		
		//if drop down is multiple selectable or not
		//C1.isMultiple();
		System.out.println("multiple selectable status for Countries Multiple is "+C1.isMultiple());
		
		C1.selectByVisibleText("India");
		C1.selectByIndex(3);
		C1.selectByValue("usa");
		
		//how to deselect ??--> for multiple selectabale
		
		// If you have selected any countries in dropdown with any select method such as by text,index or value
		// then you can deselct any selected dropdown countries with any deselect such as by text,index or value
		C1.deselectByIndex(1);  
		
		// how to deselct all --> only for selected option 
		Thread.sleep(1000);
		C1.deselectAll();
	}

}


