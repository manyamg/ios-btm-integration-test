package com.hitachi.btm.stepdefs;

import com.hitachi.btm.client.BtmService;
import com.hitachi.btm.config.ConfigurationLoader;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.slf4j.Logger;

public class Hooks {
    private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(Hooks.class);

    @Before
    public void printEnvironment() throws Exception {
     LOGGER.info("test running in the environment: " + ConfigurationLoader.config().getEnvironment());
    }

    @After
    public void printTestStatus(Scenario scenario) {
        LOGGER.info("test scenario execution is completed: " + scenario.getName());
    }


}
