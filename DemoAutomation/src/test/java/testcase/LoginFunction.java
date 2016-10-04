package testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.LoginPage;
import page.HomePage;
import page.PageFactory;
import test.AbstractTest;

public class LoginFunction extends AbstractTest {

	@BeforeClass(alwaysRun = true)
	public void setup() {
		navigateToTestSite();
	}
	
	@Test
	public void LoginToHomePage(){
		
		log.info("Login to Home Page");
		loginPage = PageFactory.getLoginPage();
		loginPage.login(userName, password);
		
		log.info("VP01: Verify that Login to Home page successfully with valid account");
		homePage = PageFactory.getHomePage();
		verifyTrue(homePage.loginToHomePageSuccessfully(userName));
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		closeBrowser();
	}
	
	private LoginPage loginPage;
	private HomePage homePage;
	
	private String userName = "demo";
	private String password = "demo123";
	
}
