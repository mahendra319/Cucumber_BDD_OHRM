package com.qa.ohrm.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "K:\\example\\Cucumber_BDD_OHRM\\src\\main\\java\\com\\qa\\ohrm\\features\\Login.feature",
		glue = {"com.qa.ohrm.stepdefinition"},
		format = {"pretty", "html:test-output","json:json-output"},
		dryRun = false,
		monochrome = true,
		strict = true
		
		
		
		
		
		
		)




public class TestRunner {

	
	
}
