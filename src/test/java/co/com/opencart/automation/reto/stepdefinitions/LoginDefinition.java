package co.com.opencart.automation.reto.stepdefinitions;

import co.com.opencart.automation.reto.models.User;
import co.com.opencart.automation.reto.questions.HomePage;
import co.com.opencart.automation.reto.tasks.LoginOpencart;
import co.com.opencart.automation.reto.tasks.OpenUp;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginDefinition {

    @Before
    public void setStage () {

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Liseth");
    }

    @Given("Liseth open the page Opencart")
    public void lisethOpenThePageOpencart() {
        theActorInTheSpotlight().wasAbleTo(OpenUp.thePage());
    }

    @When("she log in with the credentials")
    public void sheLogInWithTheCredentials(List<User> data) throws Throwable {
        theActorInTheSpotlight().attemptsTo(LoginOpencart.with(data.get(0)));
    }
    @Then("she can browse the page")
    public void sheCanBrowseThePage() {

        theActorInTheSpotlight().should(GivenWhenThen.seeThat(HomePage.isVisible()));
    }

}
