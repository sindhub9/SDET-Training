$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/reqresAPI.feature");
formatter.feature({
  "name": "Creating smoke test for reqres.in",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Creating GET Call for single user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smokeAPI"
    },
    {
      "name": "@TC001"
    }
  ]
});
formatter.step({
  "name": "I am baseURI of the reqres application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.reqresAPISteps.iAmBaseURIOfTheApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I passing endpoints for  single user",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.reqresAPISteps.iPassingEndpointsForSingleUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the status code as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.reqresAPISteps.iValidateTheStatusCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate email as janet.weaver@reqres.in",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.reqresAPISteps.iValidateEmailAsJanetWeaverReqresIn(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating GET Call for LIST users",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smokeAPI"
    },
    {
      "name": "@TC002"
    }
  ]
});
formatter.step({
  "name": "I am baseURI of the reqres application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.reqresAPISteps.iAmBaseURIOfTheApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I passing endpoints for  list user",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.reqresAPISteps.iPassingEndpointsForListUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the status code as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.reqresAPISteps.iValidateTheStatusCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating POST Call to create",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smokeAPI"
    },
    {
      "name": "@TC003"
    }
  ]
});
formatter.step({
  "name": "I am baseURI of the reqres application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.reqresAPISteps.iAmBaseURIOfTheApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I passing endpoints to create",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.reqresAPISteps.iPassingEndpointsToCreate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the status code as 201",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.reqresAPISteps.iValidateTheStatusCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating POST Call for LOGIN user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smokeAPI"
    },
    {
      "name": "@TC004"
    }
  ]
});
formatter.step({
  "name": "I am baseURI of the reqres application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.reqresAPISteps.iAmBaseURIOfTheApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I passing endpoints for  login user",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.reqresAPISteps.iPassingEndpointsForLoginUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the status code as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.reqresAPISteps.iValidateTheStatusCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating PUT Call to update",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smokeAPI"
    },
    {
      "name": "@TC005"
    }
  ]
});
formatter.step({
  "name": "I am baseURI of the reqres application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.reqresAPISteps.iAmBaseURIOfTheApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I passing endpoints to update",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.reqresAPISteps.iPassingEndpointsToUpdate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the status code as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.reqresAPISteps.iValidateTheStatusCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate job as zion resident",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.reqresAPISteps.iValidateJobAsZionResident(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating DELETE Call to delete",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smokeAPI"
    },
    {
      "name": "@TC006"
    }
  ]
});
formatter.step({
  "name": "I am baseURI of the reqres application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.reqresAPISteps.iAmBaseURIOfTheApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I passing endpoints to delete",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.reqresAPISteps.iPassingEndpointsToDelete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the status code as 204",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.reqresAPISteps.iValidateTheStatusCode(int)"
});
formatter.result({
  "status": "passed"
});
});