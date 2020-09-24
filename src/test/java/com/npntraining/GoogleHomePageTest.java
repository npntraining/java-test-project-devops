package com.npntraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleHomePageTest {
	WebDriver driver;

	@BeforeClass
	public void setUpBeforeClass() {
		System.setProperty("webdriver.gecko.driver", "e:\\selenium-jars\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void testHomePage() {
		driver.get("http://www.google.co.in");
		Assert.assertEquals(driver.getTitle(), "Google1");
	}

	@AfterClass
	public void tearDownAfterClass() {
		driver.quit();
	}
}
