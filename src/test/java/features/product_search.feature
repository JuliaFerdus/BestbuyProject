Feature: ProductSearch

  Background:
  Given i am on best buy home page searching for product

    @E2ETest
        #System dosen't allow me to automate the next page for End-to-End test
  Scenario: User can search a mac laptop and order or purchase
    And i enter mac laptop on search box
    And i click on search icon
    And i click on the first mac laptop link
    And i click on add to cart button
    And from the pop up window i click go to cart button
    And cancel the next pop up window
    And i click on checkout button
    And i click on continue as guest
    And i enter valid email address
    And i enter valid phone number for order
    When i click on continue to payment information button
