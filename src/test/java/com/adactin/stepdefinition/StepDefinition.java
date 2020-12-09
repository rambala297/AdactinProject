package com.adactin.stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import com.adactin.baseclass.BaseClass;
import com.adactin.baseclass.Bookahotelpage;
import com.adactin.baseclass.Bookingconfirmation;
import com.adactin.baseclass.Homepage;
import com.adactin.baseclass.Searchhotel;
import com.adactin.baseclass.Selecthotelpage;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adcatin.runner.TestRunner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = TestRunner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	
	
	@Before
	public  void beforeHooks(Scenario scenario) {
		String name = scenario.getName();
		System.out.println("ScenarioName: "+name);
		

	}
	@After
	public  void afterHooks(Scenario scenario) throws IOException {
		 String status = scenario.getStatus();
		 System.out.println("            ScenarioStatus:"+status);
		 if (scenario.isFailed()) {
			 getScreenshot(scenario.getName());
			
		}

	}
	@Given("^User launches on  the application$")
	public void user_launches_on_the_application() throws Throwable {
	    System.out.println("user launches the application ");
	}
	@When("^User log into the application$")
	public void user_log_into_the_application() throws Throwable {
		System.out.println("user login to application ");
	    
	}
	@Given("^User launches the application$")
	public void user_launches_the_application() throws Throwable {
		//driver = getBrowser("chrome");
	    // getUrl("http://adactinhotelapp.com/");
		String url = FileReaderManager.getInstance().getCrInstance().getUrl();
		getUrl(url);

	}


	/*@When("^: User  enters the valid username in username field$")
	public  void user_enters_the_valid_username_in_username_field() throws Throwable {
		Homepage hp = new Homepage(driver);
		inputToElement(hp.getUsername(), "balajiramalingam");

	}*/
	
	@When("^User  enters the valid \"([^\"]*)\" username  in username field$")
	public void user_enters_the_valid_username_in_username_field( String username) throws Throwable {
		inputToElement(pom.getHp().getUsername(),username );
	}

	
	/*@When("^: User  enters the valid \"([^\"]*)\" username in username field$")
	public void user_enters_the_valid_username_in_username_field( String username) throws Throwable {
	    inputToElement(pom.getHp().getUsername(),username );
	   
	}*/


	/*@When("^: User enters the valid password in password field$")
	public void user_enters_the_valid_password_in_password_field() throws Throwable {
		Homepage hp = new Homepage(driver);
		inputToElement(hp.getPassword(), "Viratkohli@18");

	}*/
	@When("^User enters the valid \"([^\"]*)\" password  in password field$")
	public void user_enters_the_valid_password_in_password_field( String password) throws Throwable {
		inputToElement(pom.getHp().getPassword(),password);
	    
	}
	/*@When("^: User enters the valid \"([^\"]*)\"password in password field$")
	public void user_enters_the_valid_password_in_password_field(String password) throws Throwable {
	    inputToElement(pom.getHp().getPassword(),password);
	   
	}*/


	/*@When("^: User click the login button$")
	public void user_click_the_login_button() throws Throwable {
		Homepage hp = new Homepage(driver);
		clickonewebelement(hp.getLogin());

	}*/
	@When("^User click the login button$")
	public void user_click_the_login_button() throws Throwable {
		Homepage hp = new Homepage(driver);
		clickonewebelement(hp.getLogin());
	    
	}

	/*@Then("^: User the verify wheather the Homepage navigates to search Hotelpage$")
	public void user_the_verify_wheather_the_Homepage_navigates_to_search_Hotelpage() throws Throwable {
     Assert.assertEquals("A", "a");
	}*/

	@Then("^User the verify wheather the Homepage navigates to search Hotelpage$")
	public void user_the_verify_wheather_the_Homepage_navigates_to_search_Hotelpage() throws Throwable {
		Assert.assertEquals("A", "a");
	}

	/*@When("^: User select the location on location field$")
	public void user_select_the_location_on_location_field() throws Throwable {
		Searchhotel sh = new Searchhotel(driver);
		Selectdropdown(sh.getLocation(), "Sydney", "value");
	}*/
	@When("^: User select the location \"([^\"]*)\" as \"([^\"]*)\"on location field$")
	public void user_select_the_location_as_on_location_field( String hotel, String option) throws Throwable {
	    Selectdropdown(pom.getSh().getLocation(), hotel, option);
	    
	}
	

	/*@When("^: User select the hotel on hotel field$")
	public void user_select_the_hotel_on_hotel_field() throws Throwable {
		Searchhotel sh = new Searchhotel(driver);
		Selectdropdown(sh.getHotels(), "Hotel Creek", "text");
	}*/
	
	@When("^: User select the hotel \"([^\"]*)\" as \"([^\"]*)\" on hotel field$")
	public void user_select_the_hotel_as_on_hotel_field( String noh, String option) throws Throwable {
	    Selectdropdown(pom.getSh().getHotels(), noh, option);
	 
	}


	/*@When("^: User select the room type in room type field$")
	public void user_select_the_room_type_in_room_type_field() throws Throwable {
		Searchhotel sh = new Searchhotel(driver);
		Selectdropdown(sh.getRoomtype(), "Double", "text");

	}*/
	
	@When("^: User select the room type \"([^\"]*)\" as \"([^\"]*)\" in room type field$")
	public void user_select_the_room_type_as_in_room_type_field( String rtype, String option) throws Throwable {
	    Selectdropdown(pom.getSh().getRoomtype(), rtype, option);
	 
	}  

	/*@When("^:  User selcet number of rooms in rooms field$")
	public void user_selcet_number_of_rooms_in_rooms_field() throws Throwable {
		Searchhotel sh = new Searchhotel(driver);
	    Selectdropdown(sh.getNumrooms(), "2 - Two", "text");

	}*/
	@When("^:  User selcet number of rooms \"([^\"]*)\" as \"([^\"]*)\" in rooms field$")
	public void user_selcet_number_of_rooms_as_in_rooms_field(String nor, String option) throws Throwable {
	    Selectdropdown(pom.getSh().getNumrooms(), nor, option);
	   
	}

	/*@When("^: User enter the check in date in date field$")
	public void user_enter_the_check_in_date_in_date_field() throws Throwable {
		Searchhotel sh = new Searchhotel(driver);
		inputToElement(sh.getCid(), "29/11/2020");

	}*/
	@When("^: User enter the check in date \"([^\"]*)\" in date field$")
	public void user_enter_the_check_in_date_in_date_field( String cid) throws Throwable {
	   inputToElement(pom.getSh().getCid(), cid);
	  
	}

	/*@When("^: User enter the check out date in out date field$")
	public void user_enter_the_check_out_date_in_out_date_field() throws Throwable {
		Searchhotel sh = new Searchhotel(driver);
		inputToElement(sh.getCod(), "01/12/2020");

	}*/
	@When("^: User enter the check out date  \"([^\"]*)\" in out date field$")
	public void user_enter_the_check_out_date_in_out_date_field( String cod) throws Throwable {
	    inputToElement(pom.getSh().getCod(), cod);
	  
	}

	/*@When("^: User  select  the number of adults in adult field$")
	public void user_select_the_number_of_adults_in_adult_field() throws Throwable {
		Searchhotel sh = new Searchhotel(driver);
		Selectdropdown(sh.getAdultroom(), "3 - Three", "text");

	}*/
	@When("^: User  select  the number of adults \"([^\"]*)\" as \"([^\"]*)\" in adult field$")
	public void user_select_the_number_of_adults_as_in_adult_field(String adr, String option) throws Throwable {
	    Selectdropdown(pom.getSh().getAdultroom(), adr, option);
	   
	}

	/*@When("^: User select number of children per room in children field$")
	public void user_select_number_of_children_per_room_in_children_field() throws Throwable {
		Searchhotel sh = new Searchhotel(driver);
		Selectdropdown(sh.getChildroom(), "2 - Two", "text");

	}*/
	@When("^: User select number of children per room \"([^\"]*)\" as \"([^\"]*)\" in children field$")
	public void user_select_number_of_children_per_room_as_in_children_field(String chr, String option) throws Throwable {
	    Selectdropdown(pom.getSh().getChildroom(), chr, option);
	  
	}

	@When("^: User click the search button$")
	public void user_click_the_search_button() throws Throwable {
		Searchhotel sh = new Searchhotel(driver);
		clickonewebelement(sh.getSearch());

	}

	@Then("^: User verify wheather the Searchhotel page navigates to Selecthotel page$")
	public void user_verify_wheather_the_Searchhotel_page_navigates_to_Selecthotel_page() throws Throwable {

	}

	@When("^: user select and confirm the rooms in room select field$")
	public void user_select_and_confirm_the_rooms_in_room_select_field() throws Throwable {
		Selecthotelpage shp = new Selecthotelpage(driver);
		clickonewebelement(shp.getSelecthotel());

	}

	@When("^: user select the room and continue booking by clicking continue button$")
	public void user_select_the_room_and_continue_booking_by_clicking_continue_button() throws Throwable {
		Selecthotelpage shp = new Selecthotelpage(driver);
		clickonewebelement(shp.getContinueclick());

	}

	@Then("^: User verify wheather Selecthotel page navigates to Bookahotelpage$")
	public void user_verify_wheather_Selecthotel_page_navigates_to_Bookahotelpage() throws Throwable {

	}

	@When("^: User enters the user Firstname in firstname field$")
	public void user_enters_the_user_Firstname_in_firstname_field() throws Throwable {
		Bookahotelpage bak = new Bookahotelpage(driver);
		inputToElement(bak.getFirstname(), "Ram");

	}
	
	@When("^: User enters the user Firstname as \"([^\"]*)\"in firstname field$")
	public void user_enters_the_user_Firstname_as_in_firstname_field( String fname) throws Throwable {
	    inputToElement(pom.getBak().getFirstname(), fname);
	   
	}

	/*@When("^: User enter the user lastname in last name field$")
	public void user_enter_the_user_lastname_in_last_name_field() throws Throwable {
		Bookahotelpage bak = new Bookahotelpage(driver);
		inputToElement(bak.getLastname(), "bala");
	}*/
	
	@When("^: User enter the user lastname as \"([^\"]*)\" in last name field$")
	public void user_enter_the_user_lastname_as_in_last_name_field( String lname) throws Throwable {
	    inputToElement(pom.getBak().getLastname(), lname);
	   
	}

	/*@When("^: User enter the user billing address in address feild$")
	public void user_enter_the_user_billing_address_in_address_feild() throws Throwable {
		Bookahotelpage bak = new Bookahotelpage(driver);
		inputToElement(bak.getBillingaddress(), "No 32 wall street newyork");

	}*/
	@When("^: User enter the user billing address \"([^\"]*)\" in address feild$")
	public void user_enter_the_user_billing_address_in_address_feild( String address) throws Throwable {
	    inputToElement(pom.getBak().getBillingaddress(), address);
	    
	}


	/*@When("^: User enter the user credict card details in card feild$")
	public void user_enter_the_user_credict_card_details_in_card_feild() throws Throwable {
		Bookahotelpage bak = new Bookahotelpage(driver);
		inputToElement(bak.getCredict(), "6596896598656598");

	}*/
	@When("^: User enter the user credict card details  \"([^\"]*)\" in card feild$")
	public void user_enter_the_user_credict_card_details_in_card_feild( String credict) throws Throwable {
	    inputToElement(pom.getBak().getCredict(), credict);
	    
	}

	/*@When("^: User select the user card type in card field$")
	public void user_select_the_user_card_type_in_card_field() throws Throwable {
		Bookahotelpage bak = new Bookahotelpage(driver);
		Selectdropdown(bak.getCardtype(), "Master Card", "text");

	}*/

	/*@When("^: User select the card expiry month in month field$")
	public void user_select_the_card_expiry_month_in_month_field() throws Throwable {
		Bookahotelpage bak = new Bookahotelpage(driver);
		Selectdropdown(bak.getSelectmonth(), "March", "text");

	}*/
	@When("^: User select the user card type  \"([^\"]*)\" as \"([^\"]*)\"in card field$")
	public void user_select_the_user_card_type_as_in_card_field(String cardtype, String option) throws Throwable {
	    Selectdropdown(pom.getBak().getCardtype(), cardtype, option);
	  
	}
	

	/*@When("^: User select the card expiry year in year field$")
	public void user_select_the_card_expiry_year_in_year_field() throws Throwable {
		Bookahotelpage bak = new Bookahotelpage(driver);
		Selectdropdown(bak.getSelectyear(), "2021", "text");

	}*/
	@When("^: User select the card expiry month \"([^\"]*)\" as \"([^\"]*)\" in month field$")
	public void user_select_the_card_expiry_month_as_in_month_field(String month, String option) throws Throwable {
	    Selectdropdown(pom.getBak().getSelectmonth(), month, option);
	   
	}
	
	@When("^: User select the card expiry year \"([^\"]*)\" as \"([^\"]*)\"in year field$")
	public void user_select_the_card_expiry_year_as_in_year_field(String year, String option) throws Throwable {
	   Selectdropdown(pom.getBak().getSelectyear(), year, option); 
	}

	/*@When("^: User enters the cvv in cvv field$")
	public void user_enters_the_cvv_in_cvv_field() throws Throwable {
		Bookahotelpage bak = new Bookahotelpage(driver);
		inputToElement(bak.getCvv(), "565");

	}*/
	@When("^: User enters the cvv \"([^\"]*)\"in cvv field$")
	public void user_enters_the_cvv_in_cvv_field( String cvv) throws Throwable {
	    inputToElement(pom.getBak().getCvv(), cvv);
	}

	
	

	@When("^: User click the search button in  book a hotel page$")
	public void user_click_the_search_button_in_book_a_hotel_page() throws Throwable {
		Bookahotelpage bak = new Bookahotelpage(driver);
		clickonewebelement(bak.getBooknow());

	}

	@Then("^: User verify wheather the Bookahotel room page to Bookingconfirmation page$")
	public void user_verify_wheather_the_Bookahotel_room_page_to_Bookingconfirmation_page() throws Throwable {

	}

	@When("^: user click the logout button and exit the app$")
	public void user_click_the_logout_button_and_exit_the_app() throws Throwable {
		Bookingconfirmation bk = new Bookingconfirmation(driver);
		clickonewebelement(bk.getLogout());

	}

}
