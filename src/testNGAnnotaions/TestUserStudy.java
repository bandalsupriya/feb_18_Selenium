package testNGAnnotaions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestUserStudy 
{
	
	@BeforeMethod
	public void logintoPolicyBazaar()
	{
		System.out.println("Login to page");
	}
  @Test
  public void validateUserName()
  {
	  System.out.println("validatename");
  }
  @Test
  public void validateUserName2()
  {
	  System.out.println("validatename2");
  }
  @AfterMethod
  public void logoutmethod()
  {
	  System.out.println("Logout.......");
  }
  @BeforeClass
  public void lunchaBrowser()
  {
	  System.out.println("Lanch Browser and opne url....");
  }
  @AfterClass
  public void closeBrowser()
  {
	  System.out.println("Close Browser....");
  }
  
}
