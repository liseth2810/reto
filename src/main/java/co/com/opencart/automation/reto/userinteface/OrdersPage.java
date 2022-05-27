package co.com.opencart.automation.reto.userinteface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrdersPage {

    public static final Target INPUT_ID_ORDER = Target.the("where we write the id of the order")
            .located(By.id("input-order-id"));
    public static final Target INPUT_CUSTOMER = Target.the("where we write the name of the client")
            .located(By.id("input-customer"));
    public static final Target SELECT_STATUS = Target.the("where we select the status of the order")
            .located(By.id("input-order-status"));
    public static final Target INPUT_TOTAL = Target.the("where we write the total value")
            .located(By.id("input-total"));
    public static final Target BTN_DATE_ADD = Target.the("where we add the date of creation")
            .located(By.id("input-date-added"));
    public static final Target BTN_DATE_MODIFIED = Target.the("where we add the date of modified")
            .located(By.id("input-date-modified"));
    public static final Target BTN_FILTERS = Target.the("button filters")
            .located(By.id("button-filter"));
    public static final Target BTN_VIEW = Target.the("button view search")
            .located(By.xpath("//*[@class='btn-group']"));
}
