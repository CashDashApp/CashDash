package org.cashdash.models;

public class Invoice {
    String id;
    String method;
    double amount;
    boolean status;
    
    public Invoice(String method, double amount){
        this.method = method;
        this.amount = amount;
    
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    
}
