@invoice
Feature:All tasks related to creating invoice functionality

  Background:
       When User navigates to the CashWise webpage
       Then User is logged in on the CashWise webpage with valid "testng@tst.com" and valid "123456789"
       Then user navigates to Sales dropdown menu on the left side of menu bar
       And user clicks on Invoice
       And verify that user is on invoice page "https://cashwise.us/dashboard/sales/invoice/invoices"


  @invoice1
    Scenario:Create invoice functionality with all relevant credentials
      When user navigates and clicks to Create invoice
      And user verifies invoice creation link "https://cashwise.us/dashboard/sales/invoice/create"
      And user types in Invoice name "TestName"
      Then user types to Whom section "Test"
      And user types a date for section Pay until "06/26/2023"
      Then user clicks to Select product and types "koma" and press enter
      Then user lands on Invoice page and verifies created invoice

  @invoice2
  Scenario:Create invoice functionality without invoice name
    When user navigates and clicks to Create invoice
    And user verifies invoice creation link "https://cashwise.us/dashboard/sales/invoice/create"
    Then user types to Whom section "Test"
    And user types a date for section Pay until "06/26/2023"
    Then user clicks to Select product and types "koma" and press enter
    Then user tries to enter button save
  @invoice3
  Scenario:Create invoice functionality without filling the input Whom
    When user navigates and clicks to Create invoice
    And user verifies invoice creation link "https://cashwise.us/dashboard/sales/invoice/create"
    And user types in Invoice name "TestName"
    And user types a date for section Pay until "06/26/2023"
    Then user clicks to Select product and types "koma" and press enter
    Then user tries to enter button save
  @invoice4
  Scenario:Create invoice functionality without filling the date Pay until
    When user navigates and clicks to Create invoice
    And user verifies invoice creation link "https://cashwise.us/dashboard/sales/invoice/create"
    And user types in Invoice name "TestName"
    Then user types to Whom section "Test"
    Then user clicks to Select product and types "koma" and press enter
    Then user tries to enter button save
  @invoice5
  Scenario:Create invoice functionality without selecting the product or service
    When user navigates and clicks to Create invoice
    And user verifies invoice creation link "https://cashwise.us/dashboard/sales/invoice/create"
    And user types in Invoice name "TestName"
    Then user types to Whom section "Test"
    And user types a date for section Pay until "06/26/2023"
    Then user tries to enter button save
  @invoice6
  Scenario:Create invoice functionality without filing any credentials
    When user navigates and clicks to Create invoice
    And user verifies invoice creation link "https://cashwise.us/dashboard/sales/invoice/create"
    Then user tries to enter button save




