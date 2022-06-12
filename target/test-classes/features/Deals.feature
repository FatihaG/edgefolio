Feature: Deals Page Features


  Scenario: Bypass pop-up button
    Given the user is on the login page
    And cookie pop-up disappears


  Scenario: Login as a fund manager
    When the user enter the login information
    Then the user should be able to login to crm page


  Scenario: Landing on Deals Page
    Given the user is logged in successfully
    When the user clicks on deals menu
    Then the user is on deals page

