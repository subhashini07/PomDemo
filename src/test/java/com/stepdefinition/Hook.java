package com.stepdefinition;

import com.resources.FunctionalLibraries;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends FunctionalLibraries{
	@Before
public void beforeBackGround() {
		Launch("http://demo.guru99.com/telecom/");

	}
	//@After
	//public void afterScenario() {
		
		//driver.quit();

	//}
}
