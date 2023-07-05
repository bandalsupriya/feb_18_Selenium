package Dynamic_List_Handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderList_1 {

	public static void main(String[] args)
	{
		// How to handled UnOrderList
		
		// 1) 
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.google.com");
         
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
         
         // 2) loacator of 
         driver.findElement(By.id("APjFqb")).sendKeys("honda");
         
         // 3)store list in reference variable
         // use findElements
         
         // ul --> UnOrderList
         // li--> list Item
         List<WebElement> SerachResult = driver.findElements(By.xpath("(//ul[@role='listbox'])[1]/li"));
         
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
         
         // 4) for traversing through list
         for(WebElement SR:SerachResult)
         {
        	 System.out.println(SR.getText());
         }
         
         // 5) if we want to click on any perticuler option in dynamic list
         
         for(WebElement SR:SerachResult)
         {
        	  String ExpectedResult = "honda amaze";
        	 if(ExpectedResult.equals(SR.getText()))
        	 {
        		 SR.click();
        		 break;    // code terminate after evaluating if statment
        	 }
        	 
         }
		
		
	}

}
