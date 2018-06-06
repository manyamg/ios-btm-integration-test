package com.hitachi.btm.stepdefs;

import com.hitachi.btm.client.BtmService;
import com.hitachi.btm.config.models.Configuration;
import com.hitachi.btm.config.ConfigurationLoader;
import com.jayway.restassured.response.Response;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class CommonStepDefs {

    private String statusEndpointUrl;
    private Response statusAppResponse;

    private static Configuration config =  ConfigurationLoader.config();


    @Given("^the application status endpoint$")
    public void theApplicationStatusEndpoint() throws Throwable {
        statusEndpointUrl  = config.getEndpointUrl("btm", "status");
    }

    @When("^the status request is sent$")
    public void theStatusRequestIsSent() throws Throwable {
        statusAppResponse  = BtmService.getAppStatus(statusEndpointUrl);
    }

    @Then("^an HTTP (\\d+) response is returned$")
    public void anHTTPResponseIsReturned(int statusCode) throws Throwable {
        assertThat(statusAppResponse.getStatusCode()).as("Http status code").isEqualTo(statusCode);
    }

}
