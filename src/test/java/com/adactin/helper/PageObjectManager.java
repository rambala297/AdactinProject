package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Bookahotelpage;
import com.adactin.baseclass.Bookingconfirmation;
import com.adactin.baseclass.Homepage;
import com.adactin.baseclass.Searchhotel;
import com.adactin.baseclass.Selecthotelpage;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private Homepage hp;
	private Searchhotel sh;
	private Selecthotelpage shp ;
	private Bookahotelpage bak;
	private Bookingconfirmation bk;





	



	public PageObjectManager(WebDriver ldriver) {
		this .driver = ldriver;
	}
	
	
	
	public Homepage getHp() {
		hp=new Homepage(driver);
		return hp;
	}
	public Searchhotel getSh() {
		sh =new Searchhotel(driver);
		return sh;
	}
	public Selecthotelpage getShp() {
		shp = new Selecthotelpage(driver);
		return shp;
	}
	public Bookahotelpage getBak() {
		bak = new Bookahotelpage(driver);
		return bak;
	}
	
	public Bookingconfirmation getBk() {
		bk = new Bookingconfirmation(driver);
		return bk;
	}

	
	
}
