Feature: Edit Products and Services

  Scenario: Edit an existing product or service
    Given I am on the "Products and Services" page
    When I locate an existing product or service to edit
    And I click on the edit icon
    Then all editable fields should be displayed correctly
    When I modify the necessary fields
    And I save the changes
    Then the edited product or service should be updated in the database
    And the changes should be reflected accurately on the "Products and Services" page

