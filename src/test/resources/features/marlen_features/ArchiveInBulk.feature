@Archive
Feature: Select multiple clients and archive in bulk

  Background:
    Given user is on Cashwise main page, user will see sign in button
    When user clicks sign in button
    Then user enters correct credentials and presses sign in
    Then user is on dashboard page and clicks on "Sales" button

    Scenario: user clicks to choose all and archives all clients
      When user clicks on choose all and archives all
      Then user should not see any clients on Active clients page