package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class buyMobileFlipcart {
  @Test
  public void byproduct() 
  {
	  System.out.println("We Buy a ONE+ Mobile..  ");
  }
  @Test
  public void addtocart() 
  {
	  System.out.println("Your cart product list....  ");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Login to Page....");
  }
  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("Logout to Page....");
  }
  

  @BeforeClass
  public void beforeClass() 
  {
	System.out.println("Launch Browser and open URL....");  
  }
  @AfterClass
  public void afterClass() 
  {
	 System.out.println("Close the Browser....."); 
  }

}
