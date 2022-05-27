package co.com.opencart.automation.reto.tasks;

import co.com.opencart.automation.reto.userinteface.MenuDesignPage;
import co.com.opencart.automation.reto.userinteface.MenuPage;
import co.com.opencart.automation.reto.userinteface.ThemeEditorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ThemeEditor implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(MenuPage.BTN_DESIGN),
                WaitUntil.the(MenuDesignPage.BTN_THEME_EDITOR, isVisible()),
                Click.on(MenuDesignPage.BTN_THEME_EDITOR),
                WaitUntil.the(ThemeEditorPage.BTN_AFFILIATE_THEME, isVisible()),
                Click.on(ThemeEditorPage.BTN_AFFILIATE_THEME),
                Click.on(ThemeEditorPage.BTN_AFFILIATE_TWIG)
        );
    }
    public static ThemeEditor searchTwig() {
        return Tasks.instrumented(ThemeEditor.class);
    }
}
