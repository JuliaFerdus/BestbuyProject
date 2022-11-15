Feature: Create new account
  Background:
    Given i am in best buy Home page
  @Test
  Scenario: Signup with valid data

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
    Then i should be able to signup successfully

    @links
    Scenario: Verify all links from footer of home page
      And verify all the links are available at footer











