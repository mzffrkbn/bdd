package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" },
        features="./src/test/java/features", glue={"stepDefinition"})

//Specifying pretty as a format option ensure that HTML report will be generated.
//When we specify html:target/Destination - It will generate the HTML report

public class runner {
}
