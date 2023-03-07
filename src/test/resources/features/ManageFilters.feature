Feature:manage filters functionality verifications

  Scenario: Filter options checked by default verification
    Given Users are on the homepage
    And Click the Campaingns under the Marketing
    When Click the Manage filters button
    Then Verify 5 options are checked by default

  Scenario: Unchecked any filter options verification
    Given Users are on the homepage
    And Click the Campaingns under the Marketing
    When Click the Manage filters button
    And Unchecked one or more filter options
    Then Verify one or more options are unchecked
