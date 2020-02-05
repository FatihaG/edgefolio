Feature: Contacts Page

  Scenario: Default page number is 1
    Given the user is on the login page
    And the user enter the sales manager information
    When the user navigates to "Customers" "Contacts"
    Then default page number should be 1


  Scenario: Menu options
    Given the user logged in as a "driver"
    Then the user should see following menu options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |


   Scenario Outline: login as a a given user DDF
     Given the user is on the login page
     Then the user logs in using following credentials
     | username  |  <username>  |
     | password  |  UserUser123 |
     Then the users name should be displayed as such
     | firstname |  <firstname> |
     | lastname  |  <lastname>  |

    Examples:
     |username       | firstname          | lastname|
     | user1         | John               | Doe     |
     |salesmanager101| Peyton             | Harber  |
     |storemanager85 | Marcella bnmbnmbmn | Huels   |

   @wip
   Scenario: contacts test with email
     Given the user logged in as a "store manager"
     And the user navigates to "Customers" "Contacts"
     When the user clicks the "mbrackstone9@example.com" from contacts
     Then the information should be same with the database
