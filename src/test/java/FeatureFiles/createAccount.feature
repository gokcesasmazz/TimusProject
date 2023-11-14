Feature: Timus Account

  Scenario: Create a New Account

    Given Navigate to Website
    When Admin Click on the Create Account button
    And Fill the mandatory fields and check the check box
    When Click the Continue button
    Then Admin see the unsuccess message