package co.com.opencart.automation.reto.userinteface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Invoice {

    public static final Target ORDER_DETAILS = Target.the("The details of invoice")
            .located(By.xpath("(//tbody/tr)[1]"));
}
