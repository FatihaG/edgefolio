Feature: Users should list the companies

  @wip
  Scenario: Bypass pop-up button
    Given the user is on the login page
    And cookie pop-up disappears

  @wip
  Scenario: Login as a fund manager
    When the user enter the login information
    Then the user should be able to login to crm page

  @wip
  Scenario: Company page lists first 20 companies
    Given the user is logged in successfully
    And the user clicks on companies menu
    Then the list shows only first 20 companies

  @wip
  Scenario Outline: Search with any keyword and check the results
    When with given keyword number of companies should be as below
      | keyword         | <keyword>  |
      | count           |  <count>   |

    Examples:
      | keyword         | count      |
      | securities      | 2          |
      | banque          | 2          |
      | investments     | 1          |

  @wip
  Scenario Outline: Filter through company type and country
    When number of companies should be as below with given company type and country
      | companySubType         | <companySubType>  |
      | country                |  <country>     |
      | count                  |  <count>       |

    Examples:
      | companySubType           | country              |    count   |
      | Bank                     | France               |      2     |
      | Corporate Investor       | United Kingdom       |      4     |
      | Family Office            | South Africa         |      1     |

  @wip
  Scenario: Delete companies
    Given the user is on companies page and search for "Banque"
    And the user selects all in the results
    Then the user clicks delete button and deletes all the companies in one

  @wip
  Scenario: Merge companies
    Given the user is on companies page and search for "Banque"
    And the user selects all in the results
    Then the user clicks merge button and merges all the companies in one





