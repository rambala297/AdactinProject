package com.adactin.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotelpage {
	public static WebDriver driver;
	
	@FindBy(xpath ="//input[@id='radiobutton_0']")
	private WebElement Selecthotel;
	
	@FindBy(xpath ="//input[@id='continue']")
	private WebElement Continueclick;

	public WebElement getContinueclick() {
		return Continueclick;
	}

	public static WebDriver getDriver() {
		return driver;
	}
	
	public Selecthotelpage(WebDriver ldriver) {
		this .driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelecthotel() {
		return Selecthotel;
	}

}
