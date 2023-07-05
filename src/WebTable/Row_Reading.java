package WebTable;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Row_Reading {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//how to read single header data
		WebElement headerData = 
		driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/th[3]"));
		System.out.println(headerData.getText());
		System.out.println("======================================");
		//how to read header row
		// header contains 5 data, so vary th from 1to 5
		for(int i=1;i<=5;i++)
		{
		WebElement headerDataNew = 
		driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]//th["+i+"]"));
		System.out.print(headerDataNew.getText()+" ");
		}
		System.out.println();
		System.out.println("============================");
		
		//how to read single data from table
		WebElement data = 
		driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/td[1]"));
		System.out.println(data.getText());
		System.out.println("============================");
		
		//how to read single row data from table
		for(int i=1;i<=5;i++)
		{
		WebElement data1 = 
		driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/td["+i+"]"));
		System.out.print(data1.getText()+" ");
		}
		System.out.println();
		System.out.println("==========================");
		
		//how to read all rows data from table
		// we need to vary tr from 1-26 and td from 1-5
		//outer for loop--> for tr varying 1-26
		for(int i=1;i<=26;i++)
		{
		
			//inner for loop to vary column td-->1-5
		for(int j=1;j<=5;j++)
		{
		WebElement datanew = 
		driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]/td["+j+"]"));
		System.out.print(datanew.getText()+" || ");
		}
		System.out.println();
		}

	}

}
