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
  @Test1
  Scenario: login with valid credentials
    And i enter valid username
    And i enter valid password
    When i click on login button
    Then i should be able to login successfully

  @Test2
  Scenario: login with valid username and invalid password
    And i enter valid username
    And i enter invalid password
    When i click on login button
    Then i should not be able to login successfully


  @Test3
  Scenario: login with invalid username credentials
    And i enter invalid username
    And i enter valid password
    When i click on login button
    Then i should not be able to login successfully










