Feature: LogIn
  Background:
    Given i am on best buy Home page

  @Test1
  Scenario: login with valid credentials
    And i click on Account button
    And i click on signin button
    And i enter valid username
    And i enter valid password
    When i click on login button
    Then i should be able to login successfully

  @Test2
  Scenario: login with valid username and invalid password
    And i click on Account button
    And i click on signin button
    And i enter valid username
    And i enter invalid password
    When i click on login button
    Then i should not be able to login successfully


  @Test2
  Scenario: login with invalid username credentials
    And i click on Account button
    And i click on signin button
    And i enter invalid username
    And i enter valid password
    When i click on login button
    Then i should not be able to login successfully