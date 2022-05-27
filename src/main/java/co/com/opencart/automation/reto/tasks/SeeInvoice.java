package co.com.opencart.automation.reto.tasks;

import co.com.opencart.automation.reto.userinteface.OrderDetailsPage;
import co.com.opencart.automation.reto.userinteface.OrdersPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeeInvoice implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(OrdersPage.BTN_VIEW, isVisible()),
                Click.on(OrdersPage.BTN_VIEW),
                WaitUntil.the(OrderDetailsPage.BTN_PRINT_INVOICE, isVisible()),
                Click.on(OrderDetailsPage.BTN_PRINT_INVOICE),
                Switch.toNewWindow(),
                Switch.toDefaultContext()
        );
    }

    public static SeeInvoice view() {
        return Tasks.instrumented(SeeInvoice.class);
    }
}
