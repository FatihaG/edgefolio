Feature: Companies Page Features

  @e2e
  Scenario: Bypass pop-up button
    Given the user is on the login page
    And cookie pop-up disappears

  @e2e
  Scenario: Login as a fund manager
    When the user enter the login information
    Then the user should be able to login to crm page


  Scenario: List first 20 on Companies Page
    Given the user is logged in successfully
    And the user clicks on companies menu
    Then the list shows only first 20 companies


  Scenario Outline: Search with any keyword and check the results
    When with given keyword number of companies should be as below
      | keyword         | <keyword>  |
      | count           |  <count>   |

    Examples:
      | keyword         | count      |
      | securities      | 6          |
      | banque          | 2          |
      | investments     | 1          |


  Scenario Outline: Filter through company type and country
    When number of companies should be as below with given company type and country
      | companySubType         | <companySubType>  |
      | country                |  <country>     |
      | count                  |  <count>       |

    Examples:
      | companySubType           | country              |    count   |
      | Bank                     | Germany              |      6     |
      | Corporate Investor       | United Kingdom       |      4     |
      | Family Office            | South Africa         |      1     |

  @e2e
  Scenario: Delete companies
    Given the user is on companies page and search for "Egret Consultants"
    And the user selects all in the results
    Then the user clicks delete button and deletes all the companies in one


  Scenario: Merge companies
    Given the user is on companies page and search for "Anatolia Capital"
    And the user selects all in the results
    Then the user clicks merge button and merges all the companies in one





