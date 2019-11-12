@cs_cart
Feature: Login
  To validate that I am able to login in to the application

  Scenario: Launch
    Given as a user I launch application in "chrome"
    And navigate to url as "https://demo.cs-cart.com"
    When I click on My account link at the top right
    And click on Sign in button
    When Enter username "customer@example.com"
    And Enter password "customer"
    When I click on sign in button
    Then I am logged in to the application