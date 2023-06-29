@regression @SignUP @first_sprint
Feature:Sign Up Functionality for CashWise

  Background:

    Given user is on cashWise Website

  Scenario Outline:User enters valid information and complete the sign In process

    When the user enters a valid email
    And user enters password
    And users confirm password
    And the user click on continue button
    Then verify the second steps "<Name>","<surname>","<name_of_business>","<area_of_business>","<address>"
    Examples:
      | Name       | surname     | name_of_business    | area_of_business | address |
      | merjenblek | Blerojhankj | ContactCreatorPhoto | consulting       | chicago |
