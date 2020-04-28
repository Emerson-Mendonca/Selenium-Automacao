package br.Teste.Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features", glue = {
        "br.Teste.Steps" }, monochrome = false, snippets = SnippetType.CAMELCASE, dryRun = false, strict = false, plugin = {
                "json:target/RunCuke/cucumber.json",
                "pretty", "html:target/RunCuke/cucumber" }, tags = { "@Trello" })

public class Runner {

}
