Feature: Booking functionality in adcatin Application 
Background:
   Given User launches on  the application 
   When User log into the application 

@SmokeTest 
Scenario Outline:  Verify the user able to login application 
Given  User launches the application 
When  User  enters the valid "<username>" username  in username field 
And  User enters the valid "<password>" password  in password field 
And  User click the login button 
Then  User the verify wheather the Homepage navigates to search Hotelpage 

Examples:
      |username|password|
      |mic|w11|
      |vik|r21|
      |balajiramalingam|Viratkohli@18|
      

Scenario: Verify the user able to search hotel room
When  User select the location "Sydney" as "value"on location field 
And  User select the hotel "Hotel Creek" as "text" on hotel field 
And   User select the room type "Double" as "text" in room type field 
And   User selcet number of rooms "2 - Two" as "text" in rooms field 
And  User enter the check in date "29/11/2020" in date field 
And  User enter the check out date  "01/12/2020" in out date field 
And  User  select  the number of adults "3 - Three" as "text" in adult field
And  User select number of children per room "2 - Two" as "text" in children field 
And  User click the search button 
Then  User verify wheather the Searchhotel page navigates to Selecthotel page

Scenario: Verify the user able to selcet hotel room 
When  user select and confirm the rooms in room select field 
And  user select the room and continue booking by clicking continue button 
Then  User verify wheather Selecthotel page navigates to Bookahotelpage

Scenario: Verify the user able to  book A hotel room 
When  User enters the user Firstname as "Ram"in firstname field 
And  User enter the user lastname as "bala" in last name field 
And  User enter the user billing address "No 32 wall street newyork" in address feild 
And  User enter the user credict card details  "6596896598656598" in card feild 
And  User select the user card type  "Master Card" as "text"in card field 
And  User select the card expiry month "March" as "text" in month field 
And  User select the card expiry year "2021" as "text"in year field
And  User enters the cvv "565"in cvv field 
And User click the search button in  book a hotel page 
Then  User verify wheather the Bookahotel room page to Bookingconfirmation page 

Scenario: Verify the user able to get booking confirmation 

When  user click the logout button and exit the app 






 



