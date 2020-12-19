package com.ups.testRunner;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.ups.drivers.UPSDrivers;
import com.ups.pageActions.UpsShippingPageActions;

public class UpsShippingTestRunner extends UPSDrivers {

	WebDriver chromeDriver;
	WebDriver firefoxDriver;
	UpsShippingPageActions shippingTest;
	
	@BeforeMethod (alwaysRun=true)
	void chromeDriverMethod() {
		 this.chromeDriver=getChromeDriver();
		 this.shippingTest=new UpsShippingPageActions(chromeDriver);
		chromeDriver.get("https://www.ups.com/us/en/shipping.page?");
		chromeDriver.manage().window().maximize();
		chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	
	@Test (groups= {"Sanity Test"}, priority=2)
	void ShippingPage() {
		shippingTest.closeCookieBanner();
		shippingTest.ClickCreateShipment();
	}
	
	@Test (groups= {"Regression Test"}, priority=2)
	void PageTitle() {
		shippingTest.closeCookieBanner();
		shippingTest.TitlePrint();
	}
	
	
	@AfterMethod
	void afterMethod() throws InterruptedException {
		Thread.sleep(5000);
		chromeDriver.close();
	}
}
