package com.choucair.retoSaucedemo.runners;
//import cucumber.api.CucumberOptions;
//import cucumber.api.SnippetType;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/demo.feature",
        tags = "@tag1",
        glue = " co.com.choucair.certificacion.proyectobase.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE )

public class RunnerTags {
}
