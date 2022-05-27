package co.com.opencart.automation.reto.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/features/Design.feature",
        tags = "@SeeThemeSuccessful",
        glue = "co.com.opencart.automation.reto.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true
)

public class Design {
}
