package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(1000);
		WebElement myTextElement = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		String myText = myTextElement.getText();
		System.out.println("My text is "+myText);
	}

}
