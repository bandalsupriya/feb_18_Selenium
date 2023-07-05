package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyPatymTitle_getTitle {

	public static void main(String[] args)
	{
		// To verify Paytm title we want Actual Title and Expected title
		// Actual title--> from webpage by getTitle method
        // Expected title--> in document (Product backlog)
		
		
		// 1)Expected title 
		String ExpectedTitle ="Paytm: Secure & Fast UPI Payments, Recharge Mobile & Pay Bills";
		
		
		// 2)Actual title
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		driver.getTitle();
		String ActualTitle = driver.getTitle();   // stored in reference variable for taking multiple actions
		System.out.println("Actual title is "+ActualTitle);
		System.out.println("Expected title is "+ExpectedTitle);
		
		//3) Use .equal method for compairing two strings and use If else statement to execute test case
		if(ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("Expected Title & Actual Title are matching and TC is passed");
		}
		else
		{
			System.out.println("Expected Title & Actual Title are matching and TC is passed");
		}
		
	}

}
