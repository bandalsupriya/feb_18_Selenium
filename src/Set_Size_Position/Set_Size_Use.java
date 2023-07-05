package Set_Size_Position;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Size_Use {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(2000);
		 Dimension d = driver.manage().window().getSize();
		 
		//1552, 832--> default size
		//1. create an object of Dimension class and pass two parameters
		//1st width and 2nd height
		 
		 Dimension d1= new Dimension(500, 400);
		 
		//2.by using setSize method we can set browser size.
		 driver.manage().window().setSize(d1);
		 driver.get("https://www.naukri.com/");


	}

}
