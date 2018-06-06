package com.hitachi.btm;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(tags = {"~@wip"},
    format = {"pretty", "json:target/cucumber-report.json", "html:target/test-report"})
public class RunCuckesTest {


}
