Feature: Contacts Page Features

  Scenario: Bypass pop-up button
    Given the user is on the login page
    And cookie pop-up disappears


  Scenario: Login as a fund manager
    When the user enter the login information
    Then the user should be able to login to crm page


  Scenario: Export all contacts as Excel File
    Given the user is logged in successfully
    And the user clicks on contacts menu
    And the user lands on contacts page and click export button
    Then excel file is downloaded on the local machine
