Feature: Users should be able to login

  @san1
   Scenario: Bypass pop-up button
    Given the user is on the login page
    And cookie pop-up disappears
  
  @wip2
  Scenario: Login as a fund manager
    When the user enter the login information
    Then the user should be able to login to crm page



