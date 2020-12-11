package com.adcatin.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@Report/FailedScenario.txt",
                            glue ="com\\adactin\\stepdefinition",
                            plugin= {/*"pretty","html:Report/CucumberReport",
                            	"json:Report/Cucumber.json",*/
							"com.cucumber.listener.ExtentCucumberFormatter:Report2/CucuberExtentReport2.html" ,
							"rerun:Report/FailedScenario.txt"},
                            tags = {"@SmokeTest"},
                            monochrome =  true,
							dryRun = false,
							strict = true)


public class TestRunnerRerun {

}
