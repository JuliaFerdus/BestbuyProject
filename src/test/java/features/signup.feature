Feature: Create new account
  Background:
    Given i am in best buy Home page
    And i click on Account
    And i click on create account
    When i click on create on account button

  @signup
  Scenario: Signup with valid data
    And i enter first name
    And i enter last name
    And i enter valid email
    And i enter password
    And i enter confirm password
    And i enter valid phone number
    And i click on check box
    When i click on create on account button
    Then i should be able to signup successfully

    @signup1
    Scenario Outline: Create a new account without last name using scenario outline to Best buy
      And i enter valid firstname "<firstName>" during signup
      And i enter lastname "<lastName>" during signup
      And i enter valid emai "<email>" during signup
      And i enter valid password "<password>" during signup
      And i enter confirmpassword "<confirmpassword>" during signup
      And i enter valid "<phone>" number
      Then i should see the following "<error>" message

      Examples:
      |firstName|lastName|email|password|confirmpassword|phone|error|
      |  jeny   |        |tom@gmail.com|Jen1234@12tom |Jen1234@12tom |9296657662|Please enter your last name.|
















