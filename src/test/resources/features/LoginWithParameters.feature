Feature: Login with parameteres

  Scenario: Login as a driver
    Given the user is on the login page
    When The user logs in using "user11" and "UserUser123"
    Then the user should be able to login
    And the title should contain "Dashboard"

  Scenario: Login as a salesmanager
    Given the user is on the login page
    When The user logs in using "salesmanager123" and "UserUser123"
    Then the user should be able to login

  Scenario: Login as a storemanager
    Given the user is on the login page
    When The user logs in using "storemanager85" and "UserUser123"
    Then the user should be able to login
