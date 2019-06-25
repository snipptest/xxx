package testng;

import org.testng.annotations.Test;

public class TestNgFeatures {

	@Test
	public void loginTest() {
		System.out.println("login test");
		// int i = 9/0;

	}

	@Test(priority = 3, dependsOnMethods = "loginTest")
	public void HomePageTest() {

		System.out.println("Home Page test");
	}

	@Test(priority = 1, dependsOnMethods = "loginTest")
	public void SearchPageTest() {
		System.out.println("SearchPageTest");
	}

	@Test(priority = 3, dependsOnMethods = "loginTest")
	public void RegPageTest() {
		System.out.println("RegPageTest");
	}

}