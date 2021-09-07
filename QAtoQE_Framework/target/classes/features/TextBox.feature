Feature: TextBox option tests

  @SmokeTest
  Scenario Outline: Testing textbox elements
    Given I am navigating to the <URI>
    When I click on textbox option
    And I enter all the textbox details with <email> and take screenshot as <screenShotName>
    Then I quit the application

    Examples:
      | URI                             | screenShotName  | email           |
      | https://www.demoqa.com/elements | textBoxDetails1 | test@gmail.com  |
      | https://www.demoqa.com/elements | textBoxDetails2 | test1@gmail.com |


