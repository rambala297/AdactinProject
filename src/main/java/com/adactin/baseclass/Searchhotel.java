package com.adactin.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel {
	
	public static WebDriver driver;
	
	@FindBy(xpath ="//select[@id='location']")
	private WebElement location;
	@FindBy(xpath ="//select[@id='hotels']" )
	private WebElement hotels;
	@FindBy(xpath ="//select[@id='room_type']")
	private WebElement roomtype;
	@FindBy(xpath ="//select[@id='room_nos']")
	private WebElement numrooms;
	@FindBy(xpath ="//input[@id='datepick_in']")
	private WebElement Cid;
	@FindBy(xpath ="//input[@id='datepick_out']")
	private WebElement Cod;
	@FindBy(xpath ="//select[@id='adult_room']")
	private WebElement adultroom;
	@FindBy(xpath ="//select[@id='child_room']")
	private WebElement childroom;
	@FindBy(xpath ="//input[@id='Submit']" )
	private WebElement search;
	

	public Searchhotel(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}	
	
	
	public WebElement getSearch() {
		return search;
	}
	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getCod() {
		return Cod;
	}
	public WebElement getCid() {
		return Cid;
	}
	public WebElement getNumrooms() {
		return numrooms;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getHotels() {
		return hotels;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

}
