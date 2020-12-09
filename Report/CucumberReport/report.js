$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Booking functionality in adcatin Application",
  "description": "",
  "id": "booking-functionality-in-adcatin-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1257600,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the user able to login application",
  "description": "",
  "id": "booking-functionality-in-adcatin-application;verify-the-user-able-to-login-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": ": User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": ": User  enters the valid \"balajiramalingam\" username in username field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": ": User enters the valid \"Viratkohli@18\"password in password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": ": User click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": ": User the verify wheather the Homepage navigates to search Hotelpage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launches_the_application()"
});
formatter.result({
  "duration": 6485707700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "balajiramalingam",
      "offset": 26
    }
  ],
  "location": "StepDefinition.user_enters_the_valid_username_in_username_field(String)"
});
formatter.result({
  "duration": 1453408400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Viratkohli@18",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_enters_the_valid_password_in_password_field(String)"
});
formatter.result({
  "duration": 298208900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "duration": 3188179500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_the_verify_wheather_the_Homepage_navigates_to_search_Hotelpage()"
});
formatter.result({
  "duration": 222101,
  "status": "passed"
});
formatter.after({
  "duration": 281900,
  "status": "passed"
});
formatter.before({
  "duration": 114100,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify the user able to search hotel room",
  "description": "",
  "id": "booking-functionality-in-adcatin-application;verify-the-user-able-to-search-hotel-room",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": ": User select the location \"Sydney\" as \"value\"on location field",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": ": User select the hotel \"Hotel Creek\" as \"text\" on hotel field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": ": User select the room type \"Double\" as \"text\" in room type field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": ":  User selcet number of rooms \"2 - Two\" as \"text\" in rooms field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": ": User enter the check in date \"29/11/2020\" in date field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": ": User enter the check out date  \"01/12/2020\" in out date field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": ": User  select  the number of adults \"3 - Three\" as \"text\" in adult field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": ": User select number of children per room \"2 - Two\" as \"text\" in children field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": ": User click the search button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": ": User verify wheather the Searchhotel page navigates to Selecthotel page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sydney",
      "offset": 28
    },
    {
      "val": "value",
      "offset": 40
    }
  ],
  "location": "StepDefinition.user_select_the_location_as_on_location_field(String,String)"
});
formatter.result({
  "duration": 298281300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Creek",
      "offset": 25
    },
    {
      "val": "text",
      "offset": 42
    }
  ],
  "location": "StepDefinition.user_select_the_hotel_as_on_hotel_field(String,String)"
});
formatter.result({
  "duration": 141122400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Double",
      "offset": 29
    },
    {
      "val": "text",
      "offset": 41
    }
  ],
  "location": "StepDefinition.user_select_the_room_type_as_in_room_type_field(String,String)"
});
formatter.result({
  "duration": 131020100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2 - Two",
      "offset": 32
    },
    {
      "val": "text",
      "offset": 45
    }
  ],
  "location": "StepDefinition.user_selcet_number_of_rooms_as_in_rooms_field(String,String)"
});
formatter.result({
  "duration": 121813501,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "29/11/2020",
      "offset": 32
    }
  ],
  "location": "StepDefinition.user_enter_the_check_in_date_in_date_field(String)"
});
formatter.result({
  "duration": 99909500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01/12/2020",
      "offset": 34
    }
  ],
  "location": "StepDefinition.user_enter_the_check_out_date_in_out_date_field(String)"
});
formatter.result({
  "duration": 90456400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3 - Three",
      "offset": 38
    },
    {
      "val": "text",
      "offset": 53
    }
  ],
  "location": "StepDefinition.user_select_the_number_of_adults_as_in_adult_field(String,String)"
});
formatter.result({
  "duration": 115234101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2 - Two",
      "offset": 43
    },
    {
      "val": "text",
      "offset": 56
    }
  ],
  "location": "StepDefinition.user_select_number_of_children_per_room_as_in_children_field(String,String)"
});
formatter.result({
  "duration": 112321300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_the_search_button()"
});
formatter.result({
  "duration": 793575201,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verify_wheather_the_Searchhotel_page_navigates_to_Selecthotel_page()"
});
formatter.result({
  "duration": 46700,
  "status": "passed"
});
formatter.after({
  "duration": 82100,
  "status": "passed"
});
formatter.before({
  "duration": 101400,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Verify the user able to selcet hotel room",
  "description": "",
  "id": "booking-functionality-in-adcatin-application;verify-the-user-able-to-selcet-hotel-room",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": ": user select and confirm the rooms in room select field",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": ": user select the room and continue booking by clicking continue button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": ": User verify wheather Selecthotel page navigates to Bookahotelpage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_select_and_confirm_the_rooms_in_room_select_field()"
});
formatter.result({
  "duration": 85825900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_room_and_continue_booking_by_clicking_continue_button()"
});
formatter.result({
  "duration": 762747500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verify_wheather_Selecthotel_page_navigates_to_Bookahotelpage()"
});
formatter.result({
  "duration": 68500,
  "status": "passed"
});
formatter.after({
  "duration": 769100,
  "status": "passed"
});
formatter.before({
  "duration": 189000,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Verify the user able to  book A hotel room",
  "description": "",
  "id": "booking-functionality-in-adcatin-application;verify-the-user-able-to--book-a-hotel-room",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": ": User enters the user Firstname as \"Ram\"in firstname field",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": ": User enter the user lastname as \"bala\" in last name field",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": ": User enter the user billing address \"No 32 wall street newyork\" in address feild",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": ": User enter the user credict card details  \"6596896598656598\" in card feild",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": ": User select the user card type  \"Master Card\" as \"text\"in card field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": ": User select the card expiry month \"March\" as \"text\" in month field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": ": User select the card expiry year \"2021\" as \"text\"in year field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": ": User enters the cvv \"565\"in cvv field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": ": User click the search button in  book a hotel page",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": ": User verify wheather the Bookahotel room page to Bookingconfirmation page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Ram",
      "offset": 37
    }
  ],
  "location": "StepDefinition.user_enters_the_user_Firstname_as_in_firstname_field(String)"
});
formatter.result({
  "duration": 265184700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bala",
      "offset": 35
    }
  ],
  "location": "StepDefinition.user_enter_the_user_lastname_as_in_last_name_field(String)"
});
formatter.result({
  "duration": 86931400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "No 32 wall street newyork",
      "offset": 39
    }
  ],
  "location": "StepDefinition.user_enter_the_user_billing_address_in_address_feild(String)"
});
formatter.result({
  "duration": 172325099,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6596896598656598",
      "offset": 45
    }
  ],
  "location": "StepDefinition.user_enter_the_user_credict_card_details_in_card_feild(String)"
});
formatter.result({
  "duration": 131859200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Master Card",
      "offset": 35
    },
    {
      "val": "text",
      "offset": 52
    }
  ],
  "location": "StepDefinition.user_select_the_user_card_type_as_in_card_field(String,String)"
});
formatter.result({
  "duration": 122354200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "March",
      "offset": 37
    },
    {
      "val": "text",
      "offset": 48
    }
  ],
  "location": "StepDefinition.user_select_the_card_expiry_month_as_in_month_field(String,String)"
});
formatter.result({
  "duration": 112971199,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2021",
      "offset": 36
    },
    {
      "val": "text",
      "offset": 46
    }
  ],
  "location": "StepDefinition.user_select_the_card_expiry_year_as_in_year_field(String,String)"
});
formatter.result({
  "duration": 127198000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "565",
      "offset": 23
    }
  ],
  "location": "StepDefinition.user_enters_the_cvv_in_cvv_field(String)"
});
formatter.result({
  "duration": 79846600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_the_search_button_in_book_a_hotel_page()"
});
formatter.result({
  "duration": 138301000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verify_wheather_the_Bookahotel_room_page_to_Bookingconfirmation_page()"
});
formatter.result({
  "duration": 30199,
  "status": "passed"
});
formatter.after({
  "duration": 67000,
  "status": "passed"
});
formatter.before({
  "duration": 101799,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Verify the user able to get booking confirmation",
  "description": "",
  "id": "booking-functionality-in-adcatin-application;verify-the-user-able-to-get-booking-confirmation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 41,
  "name": ": user click the logout button and exit the app",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_click_the_logout_button_and_exit_the_app()"
});
formatter.result({
  "duration": 6152899000,
  "status": "passed"
});
formatter.after({
  "duration": 86700,
  "status": "passed"
});
});