package com.snipp.Anrotts;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import org.apache.commons.logging.Log;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.codeborne.selenide.WebDriverRunner;

public class LoginTest {

	// Loyalty Catalyst:
	@Test
	public void userCanLoginToArnotts() {
		System.setProperty("webdriver.chrome.driver", "C:\\04AutomatedScripts\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverRunner.setWebDriver(driver);

		open("http://arncat.spsloyaltycatalyst.com/LoyaltyMembersarnloyalty/en/MemberSearch/Index");
		System.out.println("Page is launched");

		//Check text on screen
		//$("#notloggedin").shouldHave(text("Welcome to the Catalyst System."));
		//$("#span_footer").shouldHave(text("Powered By Catalyst Loyalty"));
		
		System.out.println("Login to Arnotts");
		$(By.name("UserName")).val("snipptest");
		$(By.name("Password")).val("testpass1").pressEnter();
		
		 
	  
		// $(".page-header").shouldHave(text("Overview"));
		whereIsDave();
	}

	@Test
	public void whereIsDave() {
		$(By.name("firstname")).val("Dave").pressEnter();
		
		
	}
}
