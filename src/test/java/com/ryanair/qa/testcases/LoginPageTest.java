package com.ryanair.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ryanair.qa.base.TestBase;
import com.ryanair.qa.pages.HomePage;
import com.ryanair.qa.pages.LoginPage;
import com.ryanair.qa.util.TestUtil;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {             // Browser login
		initialisation(); 
		loginPage = new LoginPage();
	}

@Test(priority = 1)                 // Testcase 1- Verfying Loginpage Title
	public void validateLoginpageTitleTest() throws InterruptedException {
		String title = loginPage.validateLoginpageTitle();
		Assert.assertEquals(title, "Official Ryanair website | Cheap flights from Ireland | Ryanair");
		Thread.sleep(2000);
	}

	@Test(priority = 2)               // Testcase 2- Login function
	public void loginPageTest() throws InterruptedException {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(2000);

	}

	
	@Test(priority = 3)              //Testcase 3- Flight Booking
	public void flightSearchingTest() throws InterruptedException {
	loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	
	loginPage.flightSearching();
	
	}

/*	@AfterMethod
	public void tearDown() {
		driver.quit(); // Quit the browser
	}
*/
}
