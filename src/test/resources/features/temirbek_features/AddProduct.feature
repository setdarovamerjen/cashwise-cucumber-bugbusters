@addProduct
Feature: User should be able to add new products or services in one place by filling out all required fields on that page.

  Background:
    Given User will log in to CashWise website with the correct "temke@gmail.com" and "123456"
    Then User will navigate to Sales page from left side menu
    And “Sales” should show additional options as dropdown menu
    When user clicks Products and services option on the dropdown menu
    Then Verify that user will see “Add Products or Services +” button

  @isPopupWindowDisplayed
  Scenario: Validate that the "Add Product or Services" popup window is displayed
    Given User will click on Add Products or Services + button
    Then verify that add products or services popup window is displayed

  @isPopupWindowHasFields
  Scenario: Verify that in add products or services popup window several following fields
    Given User will click on Add Products or Services + button
    Then verify that add products or services popup window contains following fields:


  @validatePopupWindowWithSaveButton @regression
  Scenario Outline: Test add products and services popup window with cancel button
    Given User will click on Add Products or Services + button
    Then User fills out "<name>" and "<price>" and "<description>"
    Then User chooses from the Service type dropdown and category dropdown
    And User clicks on save button
    Then Validate that new product or service were added on the list of Sales and Product page
    Examples:
      | name | price | description |
      | beer | 9     | whatever    |


  @addProductWithTheSameNameTwice @regression
  Scenario Outline: Test add product with the same name twice
    Given User will click on Add Products or Services + button
    Then User fills out "<name>" and "<price>" and "<description>"
    Then User chooses from the Service type dropdown and category dropdown
    And User clicks on save button
    Then User will click on Add Products or Services + button
    Then User fills out "<name>" and "<price>" and "<description>"
    Then User chooses from the Service type dropdown and category dropdown
    And User clicks on save button
    Then Validate that user should be able to see 'This name already exists' text
    Examples:
      | name     | price | description |
      | glassCup | 0     | whatever    |









