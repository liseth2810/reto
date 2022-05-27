package co.com.opencart.automation.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private co.com.opencart.automation.reto.models.OpencartPage opencartPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(opencartPage));
    }

    public static OpenUp thePage() {

        return Tasks.instrumented(OpenUp.class);
    }
}
