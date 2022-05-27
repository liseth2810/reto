package co.com.opencart.automation.reto.exceptions;

public class TheOrderIsNotDisplayedSatisfactorily extends AssertionError{

    @SuppressWarnings("IdOrder")
    public TheOrderIsNotDisplayedSatisfactorily(){

        super("The actor could not confirm the order id");
    }
}
