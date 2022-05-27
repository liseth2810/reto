package co.com.opencart.automation.reto.models;

import java.util.Date;

public class Orders {

    private String order;
    private String customer;
    private String status;
    private String total;
    private String dateadded;
    private String datemodified;


    public Orders(String order, String customer, String status, String total, String dateadded, String datemodified) {
        this.order = order;
        this.customer = customer;
        this.status = status;
        this.total = total;
        this.dateadded = dateadded;
        this.datemodified =datemodified;

    }

    public String getOrder() {
        return order;
    }

    public String getCustomer() {
        return customer;
    }

    public String getStatus() {
        return status;
    }

    public String getTotal() {
        return total;
    }

    public String getDateadded() {
        return dateadded;
    }

    public String getDatemodified() {
        return datemodified;
    }
}
