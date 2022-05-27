package co.com.opencart.automation.reto.stepdefinitions;

import co.com.opencart.automation.reto.exceptions.TheOrderIsNotDisplayedSatisfactorily;
import co.com.opencart.automation.reto.models.Orders;
import co.com.opencart.automation.reto.questions.OrderAnswer;
import co.com.opencart.automation.reto.tasks.FiltersOrders;
import co.com.opencart.automation.reto.tasks.SeeInvoice;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;


import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OrderDefinitions {

    @When("she looks for an order")
    public void sheLooksForAnOrder(List<Orders> orders) throws Throwable {
        theActorInTheSpotlight().attemptsTo(
                FiltersOrders.filter(orders.get(0)),
                SeeInvoice.view()
        );

    }

    @Then("she can see the {word} in the invoice")
    public void sheCanSeeTheOrderInTheInvoice(String idOrder) {
        theActorInTheSpotlight().should(
                seeThat(OrderAnswer.ifItExists(idOrder), Matchers.equalTo(true)).orComplainWith(TheOrderIsNotDisplayedSatisfactorily.class)
        );
    }
}
