package com.ups.pageActions;

import org.openqa.selenium.WebDriver;
import com.ups.PageElements.UpsLoginPageElements;

public class UpsLoginPageActions {

	UpsLoginPageElements loginPage=null;
	
	
	
	public UpsLoginPageActions(WebDriver driver) {
		this.loginPage=new UpsLoginPageElements(driver);
	}
	
	public void closeCookieBanner() {
		loginPage.UpsPageCloseCookieBanner().click();
	}
	
	public void TitlePrint() {
		loginPage.GetPageTitle();
	}
	public void setUserId(String UserId) {
		loginPage.LoginUserId().sendKeys(UserId);
	}
	
	public void password(String passsword) {
		loginPage.LoginPassword().sendKeys(passsword);
	}
	
	public void clickSubmitBtn() {
		loginPage.LoginButton().click();
	}
	
	public String loginErrorMsg() {
		String msg=null;
		try {
			msg=loginPage.upsLoginErrorTest().getText();
			
		}catch(Exception e) {
			System.out.println("Error Message Not Displayed");
		}
		return msg;
	}

}
