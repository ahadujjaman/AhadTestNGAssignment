package com.ups.pageActions;

import org.openqa.selenium.WebDriver;
import com.ups.PageElements.UpsShippingPageElements;

public class UpsShippingPageActions {
	UpsShippingPageElements ShippingPage=null;

	public UpsShippingPageActions(WebDriver driver) {
		this.ShippingPage=new UpsShippingPageElements(driver);
	}
	
	public void closeCookieBanner() {
		ShippingPage.UpsPageCloseCookieBanner().click();
	}
	
	
	public void TitlePrint() {
		ShippingPage.GetPageTitle();
}
	
	public void ClickCreateShipment() {
		ShippingPage.ShippingCreate().click();
}
}