package com.qa.TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		 features="src/test/resources/Features",
		 glue= {"com.qa.StepDef"},
		 plugin = {"pretty","html:target/cucumber","json:target/jsonReports/CucumberDemo.json"},
		 monochrome=true,
		 tags = "@sanity"
		)

public class TestRunner extends AbstractTestNGCucumberTests
{

}
