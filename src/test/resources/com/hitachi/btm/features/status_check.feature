
Feature: Verify the application healthcheck status

  Scenario: status check request
    Given the application status endpoint
    When the status request is sent
    Then an HTTP 200 response is returned








