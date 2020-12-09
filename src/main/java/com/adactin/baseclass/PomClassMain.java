package com.adactin.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class PomClassMain extends BaseClass{
	public static WebDriver driver;
	
	public static void main(String[] args) {
		 driver  = getBrowser("chrome");
		 
		 getUrl("http://adactinhotelapp.com/");
		 
		 Homepage hp = new Homepage(driver);
		 inputToElement(hp.getUsername(), "balajiramalingam");
		 inputToElement(hp.getPassword(), "Viratkohli@18");
		 clickonewebelement(hp.getLogin());
		 Searchhotel sh = new Searchhotel(driver);
		Select s = new Select(sh.getLocation());
		s.selectByVisibleText("Melbourne");
		Select s1 = new Select(sh.getHotels());
		s1.selectByVisibleText("Hotel Sunshine");
		Select s2 = new Select(sh.getRoomtype());
		s2.selectByVisibleText("Double");
		Select s3= new Select(sh.getNumrooms());
		s3.selectByVisibleText("2 - Two");
		inputToElement(sh.getCid(), "29/11/2020");
		inputToElement(sh.getCod(), "01/12/2020");
		Select s4 = new Select(sh.getAdultroom());
		s4.selectByVisibleText("3 - Three");
		Select s5 = new Select(sh.getChildroom());
		s5.selectByVisibleText("2 - Two");
		clickonewebelement(sh.getSearch());
		Selecthotelpage shp = new Selecthotelpage(driver);
		clickonewebelement(shp.getSelecthotel());
		clickonewebelement(shp.getContinueclick());
		Bookahotelpage bak = new Bookahotelpage(driver);
		inputToElement(bak.getFirstname(), "Ram");
		inputToElement(bak.getLastname(), "bala");
		inputToElement(bak.getBillingaddress(),"No 32 wall street newyork" );
		inputToElement(bak.getCredict(), "6596896598656598");
		Select s6= new Select(bak.getCardtype());
		s6.selectByVisibleText("Master Card");
		Select s7 = new Select(bak.getSelectmonth());
		s7.selectByVisibleText("March");
		Select s8 = new Select(bak.getSelectyear());
		s8.selectByVisibleText("2021");
		inputToElement(bak.getCvv(), "565");
		clickonewebelement(bak.getBooknow());
		Bookingconfirmation bk= new Bookingconfirmation(driver);
		clickonewebelement(bk.getLogout());
		
	}

} 

