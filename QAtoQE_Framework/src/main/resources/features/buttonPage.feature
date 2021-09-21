
Feature: Button page Options tests

  @sanityTest
  Scenario: Testing button elements
    Given I am navigating into button page application
    When I click on button option
    And I click all the buttons
    Then I quit the button  page application
