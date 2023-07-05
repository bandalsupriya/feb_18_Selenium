package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException 
	{
	//6)isSelected=This method is use to verify radio button/checkbox 
	//  is selected or not. Return type of isSelected function is boolean. 
	//	If radio button/checkbox is selected then it returns true otherwise it returns false.
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		WebElement redioButton = driver.findElement(By.xpath("//input[@value='radio1']"));
		
		
		redioButton.click();         // if we click here then if statement executed
		if(redioButton.isSelected())                // false
		{
		System.out.println("radio Button is already selected");
		}
		else                                        // else statement executed
		{
		System.out.println("Selecting radio button");
		//redioButton.click();          // if we click here then else statement executed
		}


	}

}
