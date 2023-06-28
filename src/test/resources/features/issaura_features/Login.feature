@regression  @login1
Feature: Sign in Functionality

  Background:
    Given user is on the login page

  Scenario:User with the right credentials must be able to login

    When user enters Email "issauramorales@hotmail.com"
    And  user enters Password "20deMarzo"
    Then user click Sign in button
    Then user must be Login

  Scenario:Empty the Password

    When user enter the valid email "issauramorales@hotmail.com"
    And user leave the password "" field empty
    And click on the Sign In button
    Then I should see an error message like "Please fill out this field"

  Scenario:invalid email address

    When I enter an invalid email "@gdgdgdgss.com"
    And User enters valid Password "20deMarzo"
    And click on the Sign In button
    Then I should see an error message stating "Please enter a valid email address."
