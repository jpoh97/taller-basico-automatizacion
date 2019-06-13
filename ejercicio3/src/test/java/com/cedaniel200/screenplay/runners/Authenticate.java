package com.cedaniel200.screenplay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/authenticate.feature",
        glue = "com.cedaniel200.screenplay.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class Authenticate {
}
