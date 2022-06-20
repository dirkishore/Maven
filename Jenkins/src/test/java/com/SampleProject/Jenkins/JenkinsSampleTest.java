package com.SampleProject.Jenkins;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsSampleTest {
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/root/Downloads/geckodriver");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);

		driver.findElement(By.id("email")).sendKeys("kishorekishore2610@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("kishore");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();

	}
}
