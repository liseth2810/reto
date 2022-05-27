package co.com.opencart.automation.reto.userinteface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuOrdersPage extends PageObject {

    public static final Target BTN_ORDERS = Target.the("button orders")
            .located(By.xpath("//*[@id='collapse26']//following::a[1]"));
}
