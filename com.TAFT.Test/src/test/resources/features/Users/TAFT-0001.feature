@Regression @Smoke @ModuleUsers @PriorityHigh @WIP
Feature: 0001: Login Validation

  Scenario: 01: Login with User
    Given the web browser is on the Demo Store page
    When the user logs in with "User" credentials
    Then "User" related controls are shown on the landing page

  Scenario: 04: Logout
    Given the web browser is not on "Login" page
    When the user logs out
    Then the web browser is on "Login" page

  Scenario: 05: Invalid Credentials
    Given the web browser is on the Demo Store page
    When the user logs in with "Invalid Password" credentials
    Then the web browser is on "Login" page
    And a message stating that the login credentials provided is invalid

  Scenario: 06: Invalid Email
    Given the web browser is on the Demo Store page
    When the user logs in with "Invalid Email" credentials
    Then a message stating that a string in email format is expected

  @End
  Scenario: Close Web Browser
