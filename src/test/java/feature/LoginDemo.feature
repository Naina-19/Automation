Feature: Test Login Functionality

  Scenario Outline: Check login is successful with valid credentials

    Given Browser is open
    And user is on login page
    When User enters "<username>" and "<password>"
    And user clicks on login
    Then user is navigated to the home page
    Examples:
      | username | password    |
      | student  | Password123 |
