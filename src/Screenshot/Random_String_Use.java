package Screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class Random_String_Use {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		RandomString.make(3);  //----> gives r1A,55R,gGy...etc random string of 3 digit value
		//RandomString is a class
		// make is methods of Randomstring class and gives return as a String
		String name = RandomString.make(3);
		System.out.println(name);

	}

}
