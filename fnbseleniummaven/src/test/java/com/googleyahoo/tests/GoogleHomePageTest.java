package com.googleyahoo.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fnb.pages.GoogleLoginPage;

import com.fnb.utils.SeleneseActionMethods;

public class GoogleHomePageTest {

	
	private WebDriver driver; 
	String appURL = "http://google.com";

	@BeforeClass
	public void testSetUp() {
		
		driver = new FirefoxDriver();
	}
	
	@Test
	public void verifyGooglePageTittle() {
		SeleneseActionMethods.launchUrl(driver,appURL);
		Assert.assertEquals(GoogleLoginPage.getTitle(driver), "Google");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}