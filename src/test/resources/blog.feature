@All
Feature: Chickin Blog

  @Positive @Login
  Scenario: Access blog
    Given User is on chickin dashboard page
    When User selects the news
    Then User redirected in the news page selected
