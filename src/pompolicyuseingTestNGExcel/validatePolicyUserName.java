/*
 * package pompolicyuseingTestNGExcel;
 * 
 * import java.io.IOException; import java.time.Duration; import
 * java.util.ArrayList; import java.util.List; import java.util.Set;
 * 
 * import org.apache.poi.EncryptedDocumentException; import
 * org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import org.testng.Assert; import
 * org.testng.annotations.AfterClass; import org.testng.annotations.AfterMethod;
 * import org.testng.annotations.BeforeClass; import
 * org.testng.annotations.BeforeMethod; import org.testng.annotations.Test;
 * 
 * public class validatePolicyUserName {
 * 
 * WebDriver driver; LoginPage login; MyAccountPage myacc;
 * 
 * @BeforeClass public void launchPolicyBazaar() {
 * 
 * driver=new ChromeDriver(); driver.get("https://www.policybazaar.com/");
 * driver.manage().window().maximize(); login=new LoginPage(driver); myacc= new
 * MyAccountPage(driver); }
 * 
 * @BeforeMethod public void loginToPolicyBazaar() throws
 * EncryptedDocumentException, IOException { CommonMethods.implicitWait(driver,
 * 1000); login.clickOnHomePageSignInButton();
 * CommonMethods.implicitWait(driver, 1000);
 * login.enterMobileNum(CommonMethods.readDataFromExcel(0, 0));
 * CommonMethods.implicitWait(driver, 1000); login.clickOnSignInWithPassword();
 * CommonMethods.implicitWait(driver, 1000);
 * login.enterPassword(CommonMethods.readDataFromExcel(0, 1));
 * CommonMethods.implicitWait(driver, 1000); login.clickOnSignInButton();
 * CommonMethods.implicitWait(driver, 1000); login.clickOnMyAccountButton();
 * CommonMethods.implicitWait(driver, 1000); login.clickOnMyProfileButton();
 * CommonMethods.implicitWait(driver, 1000); Set<String> allWindowID =
 * driver.getWindowHandles(); List<String>id= new ArrayList<>(allWindowID);
 * 
 * //switching focus to child page
 * 
 * 
 * driver.switchTo().window(id.get(1)); CommonMethods.implicitWait(driver,
 * 1000);
 * 
 * }
 * 
 * @Test public void verifyUserName() throws EncryptedDocumentException,
 * IOException {
 * 
 * String expUN=CommonMethods.readDataFromExcel(0, 2); String actualUN =
 * myacc.getActualUserName();
 * 
 * Assert.assertEquals(actualUN,
 * expUN,"TC failed, actual and expected UN not matching");
 * 
 * }
 * 
 * @AfterMethod public void logOutFromPolicyBazaar() {
 * 
 * CommonMethods.implicitWait(driver, 1000); myacc.clickOnLogOutButton(); }
 * 
 * @AfterClass public void closeBrowser() { driver.quit(); }
 * 
 * }
 * 
 */