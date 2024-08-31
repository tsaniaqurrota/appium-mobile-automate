@All
Feature: User Login

  @Positive @Login
  Scenario: Successful login with valid credentials
    Given User is on chickin page
    When User inputs valid credentials
    And User click login button
    Then User logins successfully
