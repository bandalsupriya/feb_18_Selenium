package utilityPolicyBazaar;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility 
{
	//commnly method
	  //1.screenshot 2.scrolling 3.data reading 4.wait
	
	public static void takeScreenShoot(WebDriver driver,String fileName ) throws IOException
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("E:\\AllTestingNotes\\Java +Manual class notes\\Selenium Notes\\Screenshoot\\"+fileName+".png");
	FileHandler.copy(src, dest);
	//Reporter.log("Taking screenshot and store at- "+dest, true); 
	}
	
	public static void scrollingUse(WebDriver driver,WebElement element)
	{
	       ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",element);	
	       Reporter.log("Scrolling view",true);
	}
	
	
	//---****this code is normal read data from in excel file----***
	public static String readDataFromExcel(int row ,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile= new FileInputStream("E:\\AllTestingNotes\\Java +Manual class notes\\Selenium Notes\\Feb18ExcelTest.xlsx");
		String value = WorkbookFactory.create(myfile).getSheet("Sheet2").getRow(row).getCell(cell).getStringCellValue();
		Reporter.log("reading data from excel row num "+row+" cell num is "+cell+"..",true);
		return value;

	}
	
	//----***this code use read data from excel another way thought for Property file------> 
	public static String readDataFromPropertiyFile(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myfile= new FileInputStream("C:\\Users\\hp1\\eclipse-workspace\\feb_18_Selenium\\PB_TCPropertiyFile.properties");
		prop.load(myfile);
		String value=prop.getProperty(key);
		Reporter.log("Reading data "+key+" From Propety File",true);
		return value;
	}
	
	
	
	
	
	public static void wait(int waittime) throws InterruptedException
	{
	Reporter.log("waiting for "+waittime+" mile sec",true);
	Thread.sleep(waittime);	
	}
	
	
	
	public static void imlicitWait(WebDriver driver, long waitTime) 
	{ 
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis( waitTime)); 
	Reporter.log("Waiting for complete load page, wait time"+waitTime, true); 
	} 

	
	
}
