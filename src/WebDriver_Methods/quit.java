package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quit {

	public static void main(String[] args) throws InterruptedException 
	{
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 //driver.navigate().to("https://javagoal.com/");
	 //driver.navigate().to("https://www.javatpoint.com/java-architecture");
	 // https://demoqa.com/browser-windows
	 driver.navigate().to("https://demoqa.com/browser-windows");
	 
	driver.findElement(By.xpath("//button[@id='tabButton']")).click();
	 Thread.sleep(1000);
	 driver.quit();
	 //Thread.sleep(10000);
	 //Object river = driver.findElements(By.xpath("//button[@id='tabButton']"));
     //System.out.println(river);
	}

}
