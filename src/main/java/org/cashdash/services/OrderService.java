package org.cashdash.services;

import java.sql.ResultSet;
import java.util.ArrayList;
import org.cashdash.database.Database;
import org.cashdash.models.Order;


public class OrderService {
    public static int create(String transactionID, Order order) throws Exception {
        return Database.executeUpdate("INSERT INTO orders VALUES (NULL, ?, ?, ?)",
            transactionID,
            order.getProduct().getId(),
            order.getCount()
        );
    }
    
    public static ArrayList<Order> getAll(String id) throws Exception {
        ArrayList<Order> orders = new ArrayList<>();

        try (ResultSet result = Database.executeQuery("SELECT * FROM orders WHERE transaction_id = ? ",id)) {
            while (result.next()) {
                Order order = new Order(ProductService.findById(result.getInt("product_id")),result.getInt("count"));
                orders.add(order);
            }
        }
        return orders;
    }
}
