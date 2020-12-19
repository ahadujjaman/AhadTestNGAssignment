package com.ups.testRunner;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.ups.drivers.UPSDrivers;
import com.ups.pageActions.UpsLoginPageActions;

public class UpsLoginTestRunner extends UPSDrivers{

	WebDriver driver;
	UpsLoginPageActions loginTest;
		
		@BeforeMethod(alwaysRun = true)
		@Parameters(value = { "browser" })
		void beforeMethod(String browser) {
			if (browser.equalsIgnoreCase("ChromeBrowser")) {

				this.driver = getChromeDriver();
				this.loginTest = new UpsLoginPageActions(driver);
			} else if (browser.equalsIgnoreCase("FirefoxBrowser")) {

				this.driver = getFirefoxDriver();
				this.loginTest = new UpsLoginPageActions(driver);
			}
		 
		 
		driver.get("https://www.ups.com/lasso/login?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test (groups= {"SanityTest"}, priority=1)
	void LoginErrorMsgTest() {
		loginTest.closeCookieBanner();
		loginTest.setUserId("talentek");
		loginTest.password("1235478541");
		loginTest.clickSubmitBtn();
		String errorMsg=loginTest.loginErrorMsg();
		if(errorMsg.contains("The information")) {
			System.out.println("PASSED");
		}else {
			fail();
		}
	}
	
	@Test (groups= {"RegressionTest"}, priority=2)
	void PageTitle() {
		loginTest.closeCookieBanner();
		loginTest.TitlePrint();
		System.out.println("Test Done");
	}
	
	@AfterMethod(alwaysRun=true)
	void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
}
