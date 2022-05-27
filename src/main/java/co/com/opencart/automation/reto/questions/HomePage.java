package co.com.opencart.automation.reto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.opencart.automation.reto.userinteface.LoginPage.IMG_USER_PROFILE;

public class HomePage implements Question<Boolean> {

    public Boolean answeredBy(Actor actor) {

        return IMG_USER_PROFILE.resolveFor(actor).isVisible();
    }
    public static HomePage isVisible()  {
        return new HomePage();
    }
}
