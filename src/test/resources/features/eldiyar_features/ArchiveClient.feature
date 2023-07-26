@Archive
Feature:All tasks related to archiving client
  Background:
    When User navigates to the CashWise webpage
    Then User is logged in on the CashWise webpage with valid "testng@tst.com" and valid "123456789"
    Then user navigates to Sales dropdown menu on the left side of menu bar
    Then user is on dashboard page and clicks on "Sales" button
    And user clicks on "Add Client" button on top right corner
    When user fills out all the fields and clicks "Save" button

@Archive1
  Scenario: User selects client and clicks to arhcive
    Then user selects client and press archive button
    And verify the archived folder

  @Archive2
  Scenario: user clicks to archive button
    When  user tries clicks archive button without selecting archived button

