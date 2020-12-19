package com.ups.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpsTrackingPageElements {

	WebDriver driver=null;
	
	public UpsTrackingPageElements(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement UpsPageCloseCookieBanner() {
		WebElement CloseCookieBanner=driver.findElement(By.xpath("//*[@id=\"__tealiumImplicitmodal\"]/div/button/span[1]"));
		return CloseCookieBanner;
	}
	
	public WebElement TrackingNumber() {
		WebElement TrackingID = driver.findElement(By.xpath("//*[@id=\"stApp_trackingNumber\"]"));
		return TrackingID;
		
	}
	
	public WebElement TrackingButtonClick() {
		WebElement TrackingButton = driver.findElement(By.xpath("//*[@id=\"stApp_btnTrack\"]"));
		return TrackingButton;
		
	}
}
