package co.com.opencart.automation.reto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SeeTwig implements Question<Boolean> {

    private String affiliateId;

    public SeeTwig(String affiliateId) {
        this.affiliateId = affiliateId;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
