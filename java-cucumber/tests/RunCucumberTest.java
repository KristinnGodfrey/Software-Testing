package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"intStackCucumberTests"}, // Java package containing glue code (=step defs)
        features = "src/intStackCucumberTests", // Directory containing feature files
        plugin = {"summary"}, // Create console output with summary and print step definition skeletons
        snippets = CAMELCASE, // Generate camelCaseIdentifiers in skeletons for missing step definitions
        monochrome = true) // Do not use coloured console output (confuses Eclipse)
public class RunCucumberTest {
}
