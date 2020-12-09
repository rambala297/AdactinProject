package com.adactin.baseclass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookahotelpage {
	public static WebDriver driver;
	
	@FindBy(xpath ="//input[@id='first_name']")
	private WebElement Firstname;
	@FindBy(xpath ="//input[@id='last_name']")
	private WebElement Lastname;
	@FindBy(xpath ="//textarea[@id='address']")
	private WebElement Billingaddress;
	@FindBy(xpath ="//input[@id='cc_num']")
	private WebElement Credict;
	@FindBy(xpath ="//select[@id='cc_type']")
	private WebElement Cardtype;
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement Selectmonth;
	
	@FindBy(xpath ="//select[@id='cc_exp_year']")
	private WebElement Selectyear;
	
	@FindBy(xpath ="//input[@id='cc_cvv']")
	private WebElement Cvv;
	
	@FindBy(xpath ="//input[@id='book_now']")
	private WebElement Booknow;
	

	public WebElement getCvv() {
		return Cvv;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}
	public WebElement getBillingaddress() {
		return Billingaddress;
	}
	public WebElement getCredict() {
		return Credict;
	}
	public WebElement getCardtype() {
		return Cardtype;
		
	}
	public WebElement getSelectmonth() {
		return Selectmonth;
	}
	public WebElement getSelectyear() {
		return Selectyear;
		
	}
	public WebElement getBooknow() {
		return Booknow;
	}
	public Bookahotelpage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	

}
