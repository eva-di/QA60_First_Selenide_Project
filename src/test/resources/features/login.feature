Feature: Login

  @loginSuccess
  Scenario: Successful login

    Given user is on HomePage
    When user clicks on Login icon
    Then user verifies Login form is displayed
    And user enters valid data
    And user clicks on Anmelden button
    And user clicks on User icon
    Then user verifies his name

  @wrongPassword
  Scenario Outline: Login with wrong password

    Given user is on HomePage
    When user clicks on Login icon
    Then user verifies Login form is displayed
    And user enters valid email and wrong password
      | email   | password   |
      | <email> | <password> |
    And user clicks on Anmelden button
    Then user verifies error message
    Examples:
      | email                      | password |
      | testcase23012025@gmail.com | Qa123451 |
      | testcase23012025@gmail.com | qa12345! |
      | testcase23012025@gmail.com | Qa1234!  |
