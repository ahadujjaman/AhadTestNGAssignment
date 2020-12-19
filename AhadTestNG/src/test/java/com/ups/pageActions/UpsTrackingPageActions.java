package com.ups.pageActions;

import org.openqa.selenium.WebDriver;

import com.ups.PageElements.UpsTrackingPageElements;

public class UpsTrackingPageActions {

	UpsTrackingPageElements TrackingPage=null;
	
	
	public UpsTrackingPageActions(WebDriver driver) {
		this.TrackingPage=new UpsTrackingPageElements(driver);
	}
	
	public void closeCookieBanner() {
		TrackingPage.UpsPageCloseCookieBanner().click();
	}
	
	public void InsertTrackingNumber(String TrackID) {
		TrackingPage.TrackingNumber().sendKeys(TrackID);
	}
	
	public void ClickTrackingButton() {
		TrackingPage.TrackingButtonClick().click();
	}
	
}
