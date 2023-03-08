Feature: Manage filters functionality verifications
  Agile story: As a user, I want to manage filters on the Marketing page.

  Scenario:Checked filter options
    Given Users are on the homepage
    And User hover over the "Marketing" option
    When User clicks "Campaings" option
    And User clicks the Manage filters button
    Then Verify five options are checked by default
    Then Verify one or more options are unchecked



