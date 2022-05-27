package co.com.opencart.automation.reto.tasks;

import co.com.opencart.automation.reto.models.Orders;
import co.com.opencart.automation.reto.userinteface.MenuOrdersPage;
import co.com.opencart.automation.reto.userinteface.MenuPage;
import co.com.opencart.automation.reto.userinteface.OrdersPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FiltersOrders implements Task {

    private Orders orders;

    public FiltersOrders(Orders orders) {
        this.orders = orders;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuPage.BTN_SALES),
                WaitUntil.the(MenuOrdersPage.BTN_ORDERS, isVisible()),
                Click.on(MenuOrdersPage.BTN_ORDERS),
                Enter.theValue(orders.getOrder()).into(OrdersPage.INPUT_ID_ORDER),
                Enter.theValue(orders.getCustomer()).into(OrdersPage.INPUT_CUSTOMER),
                SelectFromOptions.byVisibleText(orders.getStatus()).from(OrdersPage.SELECT_STATUS),
                Enter.theValue(orders.getTotal()).into(OrdersPage.INPUT_TOTAL),
                Enter.theValue(orders.getDateadded()).into(OrdersPage.BTN_DATE_ADD),
                Enter.theValue(orders.getDatemodified()).into(OrdersPage.BTN_DATE_MODIFIED),
                Click.on(OrdersPage.BTN_FILTERS)
        );
    }

    public static FiltersOrders filter(Orders orders) {
        return Tasks.instrumented(FiltersOrders.class ,orders);
    }
}
