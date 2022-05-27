package co.com.opencart.automation.reto.stepdefinitions;

import co.com.opencart.automation.reto.models.Orders;
import co.com.opencart.automation.reto.models.User;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTableTypeDefinitions {

    @DataTableType
    public User username(Map<String ,String> username){
        return new User(
                username.get("username"),
                username.get("password")
        );
    }

    @DataTableType
    public Orders orders(Map<String ,String> orders){
        return new Orders(
                orders.get("Order"),
                orders.get("Customer"),
                orders.get("Status"),
                orders.get("Total"),
                orders.get("Date Added"),
                orders.get("Date Modified")
        );
    }
}
