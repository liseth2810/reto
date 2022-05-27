package co.com.opencart.automation.reto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.opencart.automation.reto.userinteface.Invoice.ORDER_DETAILS;

public class OrderAnswer implements Question<Boolean> {

    private String orderId;

    public OrderAnswer(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return ORDER_DETAILS.resolveFor(actor).containsText(orderId);
    }

    public static OrderAnswer ifItExists(String orderId)  {
        return new OrderAnswer(orderId);
    }
}
