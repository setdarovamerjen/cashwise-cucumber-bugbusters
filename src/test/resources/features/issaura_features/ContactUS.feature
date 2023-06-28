@regression @contact1

Feature:Contact Us Form

  Background:

    Given I am on the contact Us page

  Scenario:User submitting the Contact Us form

    When User enter "John Doe" in the Your Name field
    And User enter "872918745" in the phone field
    And user enter "kut.zhak@gmail.com" in the email  field
    And Click the send button
    Then verify user should see a pop-up message

  Scenario: Submitting the Contact Us form with missing required fields

    When I leave the name "" field empty
    And I enter "1234567890" in the Phone field
    And I enter "jane.smith@example.com" in the Email field
    And I click the Send button
    Then verify user should not be able to send the message