package com.ups.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UPSDrivers {

	public WebDriver getChromeDriver() {
		WebDriverManager.chromedriver().browserVersion("87.0.4280.101").setup();
		WebDriver driver=new ChromeDriver();
		return driver;
}

public WebDriver getFirefoxDriver() {
	WebDriverManager.firefoxdriver().browserVersion("84.0").setup();
	WebDriver driver=new FirefoxDriver();
	return driver;
	
}
}
