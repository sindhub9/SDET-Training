Feature: Creating smoke tests for reqres.in

  @smokeAPI
    @TC001
  Scenario: Creating GET Call for single user
    Given I am baseURI of the reqres application
    When I passing endpoints for  single user
    Then I validate the status code as 200
    And I validate email as janet.weaver@reqres.in

  @smokeAPI
  @TC002
  Scenario: Creating GET Call for LIST users
    Given I am baseURI of the reqres application
    When I passing endpoints for  list user
    Then I validate the status code as 200

  @smokeAPI
  @TC003
  Scenario: Creating POST Call to create
    Given I am baseURI of the reqres application
    When I passing endpoints to create
    Then I validate the status code as 200

  @smokeAPI
  @TC004
  Scenario: Creating POST Call for LOGIN user
    Given I am baseURI of the reqres application
    When I passing endpoints for  login user
    Then I validate the status code as 200

  @smokeAPI
  @TC005
  Scenario: Creating PUT Call to update
    Given I am baseURI of the reqres application
    When I passing endpoints to update
    Then I validate the status code as 200
    And I validate job as zion resident

  @smokeAPI
  @TC006
  Scenario: Creating DELETE Call to delete
    Given I am baseURI of the reqres application
    When I passing endpoints to delete
    Then I validate the status code as 204