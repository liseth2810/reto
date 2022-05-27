package co.com.opencart.automation.reto.userinteface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ThemeEditorPage extends PageObject {

    public static final Target BTN_AFFILIATE_THEME = Target.the("button account")
            .located(By.xpath("//*[@href='affiliate']"));
    public static final Target BTN_AFFILIATE_TWIG = Target.the("button account twig")
            .located(By.xpath("//*[@href='affiliate/login.twig']"));
    public static final Target LOGIN_TWIG = Target.the("twig")
            .located(By.xpath(""));
}
