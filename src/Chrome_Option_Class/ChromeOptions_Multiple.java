package Chrome_Option_Class;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_Multiple 
{

	public static void main(String[] args) 
	{
		// 1) Create an object of Chrome option Class
		ChromeOptions CO=new ChromeOptions();
     
		// Create an object of Arraylist to add multiple String Arguments
		ArrayList<String> al=new ArrayList<>();
		al.add("start-maximized");
		al.add("incognito");
		al.add("disable-notifications");

		
		// 2) by using addArgument method pass the object of arraylist as argument 
		CO.addArguments(al);
		
		
		// 3) pass the object of ChromeOption as argument of Chromedriver
		WebDriver driver= new ChromeDriver(CO);
		driver.get("https://www.ajio.com/");
	   
		
	}

}
