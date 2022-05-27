package co.com.opencart.automation.reto.userinteface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public static final Target INPUT_USER = Target.the("where do we write the user")
            .located(By.id("input-username"));

    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("input-password"));

    public static final Target ENTER_BUTTON = Target.the("button to confirm login")
            .located(By.xpath("//button[@type=\"submit\"]"));

    public static final Target IMG_USER_PROFILE = Target.the("user profile picture")
            .located(By.id("user-profile"));
}
