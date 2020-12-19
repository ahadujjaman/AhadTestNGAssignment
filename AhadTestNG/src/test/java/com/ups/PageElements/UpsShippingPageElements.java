package com.ups.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpsShippingPageElements {


	WebDriver driver=null;
	
	public UpsShippingPageElements(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement UpsPageCloseCookieBanner() {
		WebElement CloseCookieBanner=driver.findElement(By.xpath("//*[@id=\"__tealiumImplicitmodal\"]/div/button/span[1]"));
		return CloseCookieBanner;
	}
	
	public String GetPageTitle() {
		String title=driver.getTitle();
		return title;
	}
	
	public WebElement ShippingCreate() {
		WebElement CreateShipment=driver.findElement(By.linkText("Create a Shipment"));
		return CreateShipment;
	}
	
	
}
