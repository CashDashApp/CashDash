package org.cashdash.services;

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
}
