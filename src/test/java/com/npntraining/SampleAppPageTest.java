package com.npntraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class SampleAppPageTest {
	WebDriver driver;

	@BeforeClass
	public void setUpBeforeClass() {
		driver = new FirefoxDriver();
	}

	@Test
	public void testHomePage() {
		driver.get("http://localhost:8000/SampleApp.html");
		
		WebElement btn = driver.findElement(By.id("btn"));
		WebElement chckEmnt = driver.findElement(By.id("agree"));
		
		Assert.assertFalse(btn.isEnabled());
		chckEmnt.click();
		Assert.assertTrue(btn.isEnabled());
		chckEmnt.click();
		Assert.assertFalse(btn.isEnabled());
	}

	@AfterClass
	public void tearDownAfterClass() {
		driver.quit();
	}
}
