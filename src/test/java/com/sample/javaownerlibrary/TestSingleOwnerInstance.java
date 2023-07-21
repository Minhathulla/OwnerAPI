package com.sample.javaownerlibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSingleOwnerInstance {
	//ConfigManager class return instance of general config class
	
	private WebDriver driver;
	
	@BeforeMethod
	@Test(alwaysRun=true)
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@Test
	public void login() {
		//login to demo sauce labs website
		driver.get(ConfigManager.config().baseUrl());
		driver.findElement(By.id("user-name")).sendKeys(ConfigManager.config().username());
		driver.findElement(By.id("password")).sendKeys(ConfigManager.config().password());
		driver.findElement(By.id("login-button")).click();
	}
	
	

}
