package org.cashdash.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
//import java.util.UUID;

public class Transaction {
    private String id;
    private User user;
    private Customer customer;
    private Invoice invoice;
    private ArrayList<Order> orders;
    private LocalDate date;
    private boolean status;


//    Transaction(User user ,Customer customer){
//        this.customer = customer;
//        this.user = user;
//        this.id = UUID.randomUUID().toString().replace("-", "");
//        this.invoice = new Invoice();
//        this.date = LocalDateTime.now();
//        this.status = false;
//        this.orders = new Order[];
//    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
