Feature: Manage filters functionality verifications

  Scenario: Default checked filter options
    Given Users are on the homepage
    And Click the Campaingns under the Marketing
    When Click the Manage filters button
    Then Verify 5 options are checked by default

  Scenario: Unchecked boxes options verification
    Given Users are on the homepage
    And Click the Campaingns under the Marketing
    When Click the Manage filters button
    And Unchecked one or more filter options
    Then Verify one or more options are unchecked
