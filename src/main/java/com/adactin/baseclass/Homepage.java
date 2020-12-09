package com.adactin.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public static WebDriver driver;
	
	@FindBy(xpath ="//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath ="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath ="//input[@id='login']")
	private WebElement login;
	
	
	public WebElement getLogin() {
		return login;
	}

	public WebElement getPassword() {
		return password;
	}

	public Homepage(WebDriver ldriver) {
		this . driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

}
