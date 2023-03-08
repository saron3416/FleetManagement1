Feature: Filter customer info functionality

  @Test1
  Scenario: login with valid credentials
    Given  user logs in with valid credentials
    When user lands on Dashboard page
    Then user hovers over Customers module
    Then user clicks on Account dropdown
    Then user must see filter options