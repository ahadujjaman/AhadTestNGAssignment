package com.ups.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpsLoginPageElements {

		WebDriver driver=null;
		
		public UpsLoginPageElements(WebDriver driver) {
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
		
		public WebElement LoginUserId() {
			WebElement userId=driver.findElement(By.xpath("//*[@id=\"email\"]"));
			return userId;
		}
		
		public WebElement LoginPassword() {
			WebElement password=driver.findElement(By.xpath("//*[@id=\"pwd\"]"));
			return password;
		}
		
		public WebElement LoginButton() {
			WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"submitBtn\"]"));
			return loginBtn;
		}
		
		public WebElement upsLoginErrorTest() {
			WebElement errorMsg= driver.findElement(By.xpath("//*[@id=\"errorMessages\"]"));
			return errorMsg;
		}
		
}
