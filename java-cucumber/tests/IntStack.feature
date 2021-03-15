Feature: Basic Integer Stack
  A simple stack for Integers

  Scenario: A new stack is empty
    Given a new stack
    When I check whether it is empty
    Then it should answer yes

  Scenario: A new stack is not full
    Given a new stack
    When I check whether it is full
    Then it should answer no

  Scenario: Push on a value on a new stack and pop should return the same value
    Given a new stack
    When I push 5
    And I pop
    Then it should return 5

  Scenario: Push the same value on a new stack ten times to fill the stack and pop
    Given a new stack
    When I push 5 10 times
    And I check whether it is full
    And I pop
    Then it should return 5

  Scenario: The size of an empty stack is 0
    Given a new stack
    And I check the size of the stack
    Then it should return 0

  Scenario: The size of an stack with one element is 1
    Given a new stack
    When I push 5
    And I check the size of the stack
    Then it should return 1
