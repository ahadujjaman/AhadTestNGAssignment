package com.ups.testRunner;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.ups.drivers.UPSDrivers;
import com.ups.pageActions.UpsTrackingPageActions;

public class UpsTrackingTestRunner extends UPSDrivers {

	
	WebDriver chromeDriver;
	WebDriver firefoxDriver;
	UpsTrackingPageActions trackingTest;
	
	@BeforeMethod(alwaysRun=true)
	void chromeDriverMethod() {
		 this.chromeDriver=getChromeDriver();
		 this.trackingTest=new UpsTrackingPageActions(chromeDriver);
		chromeDriver.get("https://www.ups.com/track?loc=en_US&requester=ST/");
		chromeDriver.manage().window().maximize();
		chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	
	@Test
	void TrackingPage() {
		trackingTest.closeCookieBanner();
		trackingTest.InsertTrackingNumber("4622458766551");
		trackingTest.ClickTrackingButton();
	}
	
	@AfterMethod
	void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		chromeDriver.close();
	}
}
