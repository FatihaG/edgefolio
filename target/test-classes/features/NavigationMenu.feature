@navigate
Feature:
  Scenario:
    Given the user is on the login page
    And the user enter the sales manager information
    And the user should be able to login
    When User should be able to navigate from Fleet to Vehicles
    Then User should see fleet url

    Scenario:
      Given the user is on the login page
      And the user enter the sales manager information
      And the user should be able to login
      When User should be able to navigate from Marketing to Campaigns
      Then User should see campaign url

  Scenario:
    Given the user is on the login page
    And the user enter the sales manager information
    And the user should be able to login
    When User should be able to navigate from Activities to Calendar Events
    Then User should see calender events url


