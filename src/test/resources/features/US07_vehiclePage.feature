Feature: Verifying checkbox functionality
  Agile story: As a user, I should be able to select any vehicle from the Vehicle page(web table)



  Scenario: All checkboxes should be unchecked
    Given user is on the homepage
    When user navigates on the "Fleet" option
    And user choose "Vehicle" option from dropdown menu
    Then user should see all unchecked boxes