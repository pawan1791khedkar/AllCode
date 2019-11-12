Feature: All Parabank Test Cases
 
 
  Background: Parabank login Test scenario
  
    Given user allready on login page
    When user enters username and password
    Then user click on login button
    
    @Test1
   Scenario: Open bill payment
    Given user is on homepage
    When payee name is enter
    And address of payee is enter
    And city of payee is enter
    And state of payee is enter
    And zipcode of payee is enter
    And phone no of payee is enter
    And account no of payee is enter
    And verify account of payee is enter
    And amount of payee is enter
    And select From account
    Then user click on send payment
     
     @Test2
    Scenario: Transfer Fund 
    Given user click on TransFund page
    When user enter amount
    And user select from account
    And user select to account
    Then user click on Transfer
   
   @Test3
    Scenario: Find Transaction
    Given user click on find transaction
    When user select account Id
    And user is enter Transaction Id
    Then user click on Find Transaction Id
    And user is enter Find by date
    Then user click on Find Transaction date
    And user is enter Find by date range from date
    And user is enter Find by date range to date
    Then user click on Find Transaction date range
    And user is enter Find by amount
    Then user click on Find Transaction amount
  