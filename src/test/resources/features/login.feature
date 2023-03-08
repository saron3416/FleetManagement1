Feature: Login functionality tests


  Scenario: Login with valid credential
    Given the user is on the log in page
    When the user enter valid username
    And the user enter valid password
    And the user clicks the log in button
    Then the user should be able to log in

  @wip
  Scenario: Login with valid credential
    Given the user is on the log in page
    When the user enters username "storemanager51"
    And the user enters password "UserUser123"
    And the user clicks the log in button
    Then the user should be able to log in