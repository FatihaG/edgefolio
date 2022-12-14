package com.crm.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:de.monochromata.cucumber.report.PrettyReports:target/cucumber.html",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features/",
        glue="com.crm.step_definitions",
        dryRun = false,
        tags="@e2e"
)

public class CukesRunner {

}
