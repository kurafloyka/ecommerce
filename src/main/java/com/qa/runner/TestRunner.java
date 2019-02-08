package com.qa.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "\\Users\\FARUK\\IdeaProjects\\ecommerce\\src\\main\\java\\com\\qa\\features\\login.feature"
        ,glue = {"com\\qa\\stepDefinitions"},
        format = {"pretty","html:test-output"},
        strict = true,
        dryRun = false,
        monochrome = true
)

public class TestRunner {
}
