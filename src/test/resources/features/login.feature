Feature: Login
  Scenario: Successful login

    Given user is on HomePage
    When user clicks on Login icon
    Then user verifies Login form is displayed
    And user enters valid data
    And user clicks on Anmelden button
    And user clicks on User icon
    Then user verifies his name