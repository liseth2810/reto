package co.com.opencart.automation.reto.userinteface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuPage extends PageObject {

    public static final Target BTN_SALES = Target.the("button sales")
            .located(By.id("menu-sale"));
    public static final Target BTN_DESIGN = Target.the("button design")
            .located(By.id("menu-design"));


}
