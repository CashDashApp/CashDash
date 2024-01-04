package org.cashdash.models;

import org.cashdash.services.OrderService;
import org.cashdash.services.TransactionService;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import org.cashdash.services.UserService;
//import java.util.UUID;

public class Transaction {
    private String id;
    private User user;
    private ArrayList<Order> orders;
    private Date date;

    public Transaction(User user){
        this.id = UUID.randomUUID().toString();
        this.user = user;
        this.date = new Date();
        this.orders = new ArrayList<Order>();
    }

    public Transaction(String id, int uid, Date date) throws Exception {
        this.id = id;
        this.user = UserService.findById(uid);
        this.orders = OrderService.getAll(id); //
        this.date = date;
    }
    
    
    
    public void addOrder(Product product, int count) {
        boolean productIsExistInOrders = false;

        for (Order order : this.orders) {
            if (order.getProduct().getId() == product.getId()) {
                order.addCount(count);
                productIsExistInOrders = true;
                break;
            }
        }

        if (!productIsExistInOrders) {
            Order newOrder = new Order(product, count);
            this.orders.add(newOrder);
        }

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public void save() throws Exception {
        int transactionCreated = TransactionService.create(this.id, this.user);
        if (transactionCreated <= 0)
            throw new Exception("Couldn't create transaction");

        // SUCK IMPLEMENTATIONS INSERT
        for (Order order : this.orders) {
            OrderService.create(this.id, order);
            
        }
    }

    public void deleteOrder(int index) {
        this.orders.remove(index);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public double getTotal(){
        double total = 0;

        for (Order order : this.orders)
            total += order.getProduct().getPrice() * order.getCount();

        return total;
    }

    public void printDetailOrders() {
        System.out.println("== List Orders ==");
        for (Order order : this.orders) {
            Product product = order.getProduct();
            double total = product.getPrice() * order.getCount();

            System.out.println(" - " + product.getName() + " (" +  order.getCount() + ") -> Rp " + total );
        }
    }
}
