@AddClient
Feature: Add Client button functionality

  Background:
    Given user is on Cashwise main page, user will see sign in button
    When user clicks sign in button
    Then user enters correct credentials and presses sign in
    Then user is on dashboard page and clicks on "Sales" button
    And user clicks on "Add Client" button on top right corner

  @Add1
  Scenario: user adds Client with valid credentials
    When user fills out all the fields and clicks "Save" button
    Then user must see added Client on Client page. first

  @Add2
  Scenario: user adds Client with empty Client's tag input
    When user fills out all the fields except first field and clicks "Save" button
    Then user must not be able to see added Client on Client page. second

  @Add3
  Scenario: user adds Client by filling out all required fields and
  leaving empty all not required fields. All Required fields are marked with "*" sign.
    When user fills out all required fields and clicks "Save" button
    Then user must not see added Client on Client page. third

  @Add4
  Scenario: user adds Client by filling out all the fields except required fields
    When user fills out all not required fields and presses "Save" button
    Then user should not be able to add Client on Client page. fourth

  @Add5
  Scenario: user add Client with valid credentials but with wrong email
    When user fills out all the fields and presses "Save" button
    Then user should not be able to add Client on Client page. fifth