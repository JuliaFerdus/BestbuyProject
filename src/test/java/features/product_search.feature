Feature: ProductSearch

  Background:
  Given i am on best buy home page searching for product

    @E2ETest
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
    Then i should land on payment information page
    And i enter valid credit card number
    And i enter valid first name
    And i enter valid last name
    And i enter valid email in email field
    And i enter city  name
    And i enter state  name
    And i enter zipcode
    When i click place your order button
