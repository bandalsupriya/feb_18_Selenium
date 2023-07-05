package pomPolicyBazaarnew;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter; 

public class LoginPage  
{ 
	//variable  
	
	    @FindBy(xpath = "//a[text()='Sign in']") private WebElement signInButtonHomePage; 
	 	 
	 	@FindBy(xpath = "(//input[@type='number'])[2]")private WebElement  mobileNumberFiled; 
	 	 
	 	@FindBy(xpath = "(//span[text()='Sign in with Password'])[2]") private WebElement signInWithPassword; 
	 	 
	 	@FindBy(name = "password") private WebElement passwordField; 
	 	 
	 	@FindBy(xpath = "//span[text()='Sign in']") private WebElement signInButton; 
	 	 
	 	@FindBy(xpath = "//div[text()='My Account']") private WebElement myAccountButton; 
	 	 
	 	@FindBy(xpath = "//span[text()=' My profile ']")private WebElement myProfile; 
	 	 
	 	//constructor 
	 	 
	 	public LoginPage(WebDriver driver) 
	{ 
	 		Reporter.log("Click on Login Page",true);
		 	PageFactory.initElements(driver, this); 
	} 
	 
	//methods 
	 	 
	 	public void clickOnHomePageSignInButton() 
	 	{ 
	 		Reporter.log("clicking on home page singInButton",true);
	 	 	signInButtonHomePage.click(); 
	 	} 
	 	 
	 	public void enterMobileNum(String mobNum) 
	 	{ 
	 		Reporter.log("Entering mobile number",true);
	 	 	mobileNumberFiled.sendKeys(mobNum); 
	 	} 
	 	 
	 	public void clickOnSignInWithPassword() 
	 	{ 
	 		Reporter.log("Entering sign in with password...",true);
	 	 	signInWithPassword.click(); 
	 	} 
	 
	 	public void enterPassword(String pwd) 
	 	{  
	 		Reporter.log("Entering pasword...",true);
	 	 	passwordField.sendKeys(pwd); 
	 	} 
	 	 
	 	public void clickOnSignInButton() 
	 	{ 
	 		Reporter.log("clicking on singin button",true);
	 	 	signInButton.click(); 
	 	} 
	 
	public void clickOnMyAccountButton() 
	{ 
		    Reporter.log("clicking on myaccount button",true);
		 	myAccountButton.click(); 
	} 
	 	 
	 	public void clickOnMyProfileButton() 
	 	{ 
	 		Reporter.log("clicking on myprofile button",true);
	 	 	myProfile.click(); 
	 	} 

}