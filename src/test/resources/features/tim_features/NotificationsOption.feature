@loginTest
Feature: Verify Notification Options on CashWise Webpage

  Background:
    When User navigates to the CashWise webpage
    Then User is logged in on the CashWise webpage with valid "primkulov007@gmail.com" and valid "A060690zx"

  Scenario: Verify "Notifications" icon and Dropdown Menu Options

    Then User should see the "Notifications" icon on the right side of the Header
    When User clicks on the "Notifications" icon
    Then Verify User can see the following options in the "Notifications" icon:
      | Expired   |
      | Reminders |
      | Requests   |

