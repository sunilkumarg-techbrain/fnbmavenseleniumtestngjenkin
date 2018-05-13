package com.googleyahoo.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.fnb.pages.GoogleLoginPage;
import com.fnb.pages.YahooLoginPage;
import com.fnb.utils.SeleneseActionMethods;

public class YahooHomePageTest {
	
	private WebDriver driver; 
	String appURL = "http://yahoo.com";

	@BeforeClass
	public void testSetUp() {
		
		driver = new FirefoxDriver();
	}
	
	@Test
	public void verifyYahooPageTittle() {
		SeleneseActionMethods.launchUrl(driver,appURL);
		Assert.assertEquals(YahooLoginPage.getTitle(driver), "Yahoo");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}