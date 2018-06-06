$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/hitachi/btm/features/status_check.feature");
formatter.feature({
  "line": 2,
  "name": "Verify the application healthcheck status",
  "description": "",
  "id": "verify-the-application-healthcheck-status",
  "keyword": "Feature"
});
formatter.before({
  "duration": 239103234,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "status check request",
  "description": "",
  "id": "verify-the-application-healthcheck-status;status-check-request",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the application status endpoint",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the status request is sent",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "an HTTP 200 response is returned",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonStepDefs.theApplicationStatusEndpoint()"
});
formatter.result({
  "duration": 132284829,
  "status": "passed"
});
formatter.match({
  "location": "CommonStepDefs.theStatusRequestIsSent()"
});
formatter.result({
  "duration": 1453879870,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 8
    }
  ],
  "location": "CommonStepDefs.anHTTPResponseIsReturned(int)"
});
formatter.result({
  "duration": 58598432,
  "status": "passed"
});
formatter.after({
  "duration": 124935,
  "status": "passed"
});
});