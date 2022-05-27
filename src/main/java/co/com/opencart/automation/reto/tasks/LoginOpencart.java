package co.com.opencart.automation.reto.tasks;

import co.com.opencart.automation.reto.models.User;
import co.com.opencart.automation.reto.userinteface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

public class LoginOpencart implements Task {

    private User username;

    public LoginOpencart(User username) {
        this.username = username;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Clear.field(LoginPage.INPUT_USER),
                Enter.theValue(username.getUsername()).into(LoginPage.INPUT_USER),
                Clear.field(LoginPage.INPUT_PASSWORD),
                Enter.theValue(username.getPassword()).into(LoginPage.INPUT_PASSWORD),
                Click.on(LoginPage.ENTER_BUTTON)
        );
    }

    public static LoginOpencart with(User username) {

        return Tasks.instrumented(LoginOpencart.class ,username);
    }
}
