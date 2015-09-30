Feature: calculator

  Scenario: add 2 and 2 with calculator
    Given I have a calculator
    When I add 2 and 2
    Then My the result is 4