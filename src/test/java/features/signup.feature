Feature: Create new account
  @Test
  Scenario: Signup with valid data
    Given i am on best buy Home page
    And i click on Account
    And i click on create account
    And i enter first name
    And i enter last name
    And i enter valid email
    And i enter password
    And i enter confirm password
    And i enter valid phone number
    And i click on check box
    When i click on create on account button
    Then i should be albe to signup successfully


