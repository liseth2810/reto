package co.com.opencart.automation.reto.userinteface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrderDetailsPage extends PageObject {

    public static final Target BTN_PRINT_INVOICE = Target.the("button print invoice")
            .located(By.xpath("//a[@class='btn btn-info'][1]"));

}
