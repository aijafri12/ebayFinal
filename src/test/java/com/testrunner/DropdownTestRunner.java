package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features="Feature",
		glue="DropdownStepdef",
		
		
		tags="@Dropdown"
		
		
		
		
		
		)


public class DropdownTestRunner extends AbstractTestNGCucumberTests{

}
