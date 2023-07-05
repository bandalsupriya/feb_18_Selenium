package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentURL 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		String myUrl = driver.getCurrentUrl();
		System.out.println("My Url is "+myUrl);
		
		//String mySource = driver.getPageSource();
		//System.out.println("My Source is "+mySource);

	}

}
