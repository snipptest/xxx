package com.snipp.Anrotts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.*;

import org.testng.asserts.Assertion;

//import org.testng.AssertJUnit;
import static com.codeborne.selenide.Selenide.*;

//import org.junit.Test;  
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
//import org.testng.AssertJUnit;
//import org.testng.annotations.Test;

public class Prod_Arnotts_LoginSearchLogout {

	WebDriver driver;

	// Pre conditions @Before
	@BeforeSuite // 1
	public void launchBrowser() {
		System.out.println("Setup your system for Chrome");
		System.out.println("@Before suite bit");
		System.setProperty("webdriver.chrome.driver", "C:\\01SelenideWorkSpace\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		WebDriverRunner.setWebDriver(driver);

		// Manage Window and cookies
		System.out.println("Maximize window, delete cookies");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	} 

	@BeforeTest // 2
	public void beforeTest() {
		System.out.println("@Before test bit");

	}

	@BeforeClass // 3
	public void enterURL() {
		System.out.println("Open URL");
		open("http://arncat.spsloyaltycatalyst.com/LoyaltyMembersarnloyalty/en/MemberSearch/Index");
		System.out.println("@Before Class bit");
	}

	@BeforeMethod // 4
	public void beforeMethod() {
		System.out.println("@Before method bit");

	}

	// test cases, starting with @Test
	@Test(priority = 1) // 5
	public void loginToSite() {
		System.out.println("Verify the title of the login page");
		String pageTitle = driver.getTitle();
		System.out.println("Title of the page is " + pageTitle);
		AssertJUnit.assertEquals(driver.getTitle().contentEquals("Log On"), true);
	}

	@Test(priority = 2) // 6
	public void enterDetails() {
		System.out.println("Login to site");
		$(By.xpath("//input[@id=\"UserName\"]")).setValue("snipptest");
		$(By.xpath("//input[@id=\"Password\"]")).setValue("testpass1");
		$(By.id("submit-logon")).click();
	}

	@Test(priority = 3) // 7
	public void catalystTitleTest() throws InterruptedException {
		System.out.println("");
		System.out.println("**************** Start of testing ****************");
		String title = $(By.xpath("/html/body/div[4]/h2")).getText();
		System.out.println("Title displayed is " + title);

		String pageTitle = driver.getTitle();
		System.out.println("Page title is " + pageTitle);
		Thread.sleep(3000);

		AssertJUnit.assertEquals(driver.getTitle().contentEquals("MemberSearch"), true);
		// Assert.assertEquals(pageTitle, "MemberSearch");
		System.out.println("Title is correct and this line is printed");
	}

	@Test(priority = 4) // 8
	public void searchForUser() {
		System.out.println("Search test");
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Dave");
		$(By.xpath("//input[@id='firstname']")).setValue("Dave");
		$(By.xpath("//button[@id='search-member-info']")).click();

		//String NameCheck = driver.findElement(By.xpath("//*[text()='Dave']")).toString();
		// driver.getPageSource().contains("Dave");
		// System.out.println("Name in Name Check is "+NameCheck);
		// driver.findElement(By.xpath("//*[contains(text(),'Dave')]")).isDisplayed();
		// Check for a Dave

		driver.getPageSource().contains("Dave");

	}

	@Test(priority = 5)
	public void nextButtonActive() {
		Boolean NextButtonActive = driver.findElement(By.partialLinkText("Next")).isDisplayed();
	}

	@Test(priority = 6) // 8
	public void logout() {
		System.out.println("Logout from Catalyst");
		$(By.xpath("//a[@modulegroup='logout']")).click();

	}

	@Test(priority = 7) // 9
	public void verifyLogout() {
		String pageTitle = driver.getTitle();
		System.out.println("Title of the page is " + pageTitle);
		AssertJUnit.assertEquals(driver.getTitle().contentEquals("Log On"), true);

	}

	// Post conditions starting with @After
	@AfterMethod // 10
	public void afterMethod() {
		System.out.println("After Method bit");
	}

	@AfterTest // 12
	public void afterTest() {
		System.out.println("After Test bit");
		System.out.println("Close browser");
		driver.close();

	}

	@AfterSuite // 13
	public void generateTestNG() {
		System.out.println("Generate report");
	}
//
//	@Test
//	public void assertEquals() {
//		Assert.assertEquals("This assertion will pass", "This assertion will pass");
//		System.out.println("This line is executed because assertEquals " + "passed since both the strings are same");
//
//	}
//
//	@Test 
//	private void anotherAssert() {
//		Assert.assertEquals("KKThis assertion will not pass", "KKThis assertion will not pass");
//		System.out.println("This line is executed because assertEquals " + "passed since both the strings are same");
//
//	}
//
//	@Test
//	public void assertNotEquals() {
//		Assert.assertNotEquals("This assertion will pass", "Since the " + "expected and actual result do not match");
//		System.out.println("This line is executed because assertNotEquals" + " assertion pass for the given situation");
//	}
//
//	@Test
//	public void assertTrue() {
//		Assert.assertTrue(3 < 5);
//		System.out.println(
//				"This line will be executed as assertTrue will" + " pass because the 3<5(which will return true)");
//	}
//
//	@Test
//	public void assertFalse() {
//		Assert.assertFalse(3 > 5);
//		System.out.println("This line is executed because assertFalse"
//				+ "assertion passes as the given condition will return false");
//	}
//
////	@Test
////	public void assertNull() {
////		Assert.assertNull(null);
////		System.out.println("Since we we set null in the condition, the assertion " + "assertNull will pass");
////	}
//
//	@Test
//	public void assertNotNull() {
//		Assert.assertNotNull("This assertion will pass because this " + "string don't returns a null value");
//		System.out.println("This line is executed because assertNotNull have have passed");
//	}

} // End LoginTestAssertions

