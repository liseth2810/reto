package co.com.opencart.automation.reto.userinteface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuDesignPage extends PageObject {

    public static final Target BTN_THEME_EDITOR = Target.the("button theme editor")
            .located(By.xpath("//*[@id='collapse20']//following::a[2]"));
}
