package com.quantum.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.quantum.pages.GooglePage;
import com.quantum.utils.ReportUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@QAFTestStepProvider
public class openBrowser {
WebDriver driver= new WebDriverTestBase().getDriver();

//@QAFTestStep(description="I open browser to webpage {0}")
	@Given("^I am on Google Search Page$")
	public void I_am_on_Google_Search_Page(String Url) throws Throwable {
		driver.get(Url);
		
	}

	
}
