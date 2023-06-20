Feature: Verify Sales Options on CashWise Webpage

  Background:
    When User navigates to the CashWise webpage
    Then User is logged in on the CashWise webpage with valid "merjen@gmail.com" and valid "merjen123"

  Scenario: Verify Sales Tab and Dropdown Menu Options

    Then User should see the Sales tab on the left side Menu Bar
    When User clicks on the Sales tab
    Then Verify User can see the following options in the dropdown menu of Sales:
      | Clients              |
      | Products and services|
      | Invoice              |

  Scenario: Verify Client option's URL
    When User clicks on the Sales tab
    And User clicks on the Clients option
    Then Verify User should be redirected to the expected URL "https://cashwise.us/dashboard/sales/clients/active" for Clients

  Scenario: Verify Products and services option's URL
    When User clicks on the Sales tab
    And User clicks on the Products and services option
    Then Verify User should be redirected to the expected URL "https://cashwise.us/dashboard/sales/products-and-services" for Products and services

  Scenario: Verify Invoice option's URL
    When User clicks on the Sales tab
    And User clicks on the Invoice option
    Then Verify User should be redirected to the expected URL "https://cashwise.us/dashboard/sales/invoice/invoices" for Invoice
