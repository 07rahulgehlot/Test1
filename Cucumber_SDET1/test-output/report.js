$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/test.feature");
formatter.feature({
  "name": "MyAccount Login Feature",
  "description": "Description: this Feature will test a login functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Open Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "MyAccountLogninStepDefinitions.open_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the URL",
  "keyword": "When "
});
formatter.match({
  "location": "MyAccountLogninStepDefinitions.enter_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on MyAccount menu iteam",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});