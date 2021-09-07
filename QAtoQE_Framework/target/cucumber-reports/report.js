$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/TextBox.feature");
formatter.feature({
  "name": "TextBox option tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Testing textbox elements",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "I am navigating to the \u003cURI\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on textbox option",
  "keyword": "When "
});
formatter.step({
  "name": "I enter all the textbox details with \u003cemail\u003e and take screenshot as \u003cscreenShotName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I quit the application",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "URI",
        "screenShotName",
        "email"
      ]
    },
    {
      "cells": [
        "https://www.demoqa.com/elements",
        "textBoxDetails1",
        "test@gmail.com"
      ]
    },
    {
      "cells": [
        "https://www.demoqa.com/elements",
        "textBoxDetails2",
        "test1@gmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Testing textbox elements",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "I am navigating to the https://www.demoqa.com/elements",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click on textbox option",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I enter all the textbox details with test@gmail.com and take screenshot as textBoxDetails1",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I quit the application",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Testing textbox elements",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "I am navigating to the https://www.demoqa.com/elements",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click on textbox option",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I enter all the textbox details with test1@gmail.com and take screenshot as textBoxDetails2",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I quit the application",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});