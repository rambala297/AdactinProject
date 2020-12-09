package com.adactin.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookingconfirmation {
	public static WebDriver driver;
	
	@FindBy(xpath ="//input[@id='logout']")
	private WebElement Logout;

	public static WebDriver getDriver() {
		return driver;
	}
	
	public Bookingconfirmation(WebDriver ldriver) {
		this .driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		return Logout;
	}

}
