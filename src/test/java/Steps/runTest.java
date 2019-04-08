package Steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/cucumber"},
        features = {"src/test/features"},
        glue = {"cucumberJavaStepDef"},
        snippets = SnippetType.CAMELCASE
        )

        public class runTest { }
