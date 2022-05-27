package co.com.opencart.automation.reto.stepdefinitions;

import co.com.opencart.automation.reto.tasks.ThemeEditor;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DesingDefinition {

    @When("search for the subject of the affiliate field")
    public void searchForTheSubjectOfTheAffiliateField() {
            theActorInTheSpotlight().attemptsTo(ThemeEditor.searchTwig());
        }

    @Then("she can see the Twig template")
    public void sheCanSeeTheTwigTemplate() {

    }
}
