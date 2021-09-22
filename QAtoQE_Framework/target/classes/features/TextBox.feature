Feature: TextBox Options tests

  @smokeTest
  Scenario Outline: Testing textbox elements
    Given I opened the  browser
And I am navigating into the textbox application
    When I click on the textbox option
    And I enter all  the text box details with <email> and  take the screenshot as <screenShotName>
    Then I quit the textbox application

    Examples:
     |screenShotName  | email          |
      |textBoxDetails1 | abc1@gmail.com |
     # | https://demoqa.com/elements | textBoxDetails2 | abc2@gmail.com |

  @dataTableWithoutHeaders
Scenario: Testing textbox elements using datatable without  headers

  Given I opened the  browser
  And I am navigating to the application
  |https://demoqa.com/elements|
  When I click on the textbox option
  And I enter all  the text box details with  and  take the screenshot as datatable_without_header
  Then I quit the textbox application

  @dataTableWithHeaders
  Scenario: Testing textbox elements using datatable with  headers

    Given I opened the  browser
    And I am navigating to the application with headers
    |URL|
      |https://demoqa.com/elements|
    When I click on the textbox option
    And I enter all  the text box details with  and  take the screenshot as datatable_without_header
    Then I quit the textbox application