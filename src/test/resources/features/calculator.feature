@tag
Feature: Calculator

  Scenario: calculate operation of two numbers
    Given Two input values, 3 and 8, one operator *
    When I operate on the two values
    Then I expect the result 24

  Scenario Outline: calculate operation of two numbers
    Given Two input values, <first> and <second>, one operator <operator>
    When I operate on the two values
    Then I expect the result <result>
    Examples:
      | first | second | operator | result |
      | 4     | -7     | *        | -28    |
      | 36    | 4      | /        | 9      |
      | 5     | 3      | ^        | 125    |
      | 74    | 0      | ^        | 1      |
      | 3     | 0      | /        | 0      |
