@cs_cart
Feature: Add to cart
  To validate that I am able to login in to the application

  Background: Launch
    Given as a user I launch application in "chrome"
    And navigate to url as "https://demo.cs-cart.com"
    When I click on My account link at the top right
    And click on Sign in button
    When Enter username "customer@example.com"
    And Enter password "customer"
    When I click on sign in button
    Then I am logged in to the application
    
	@Addtocart
	Scenario: Add to cart single product
	   When I enter "<computer>" in top search box
	   And click on search submit button 
	   Then page navigates to product search results
	   And product results are displayed
	   When I click on list view button
	   Then products are displayed in list view
	   When I click add to cart for product code H0217E3OE9
	  #	Then my cart is updated with product quantity as 1 and correct total price
	   And close the browser
	