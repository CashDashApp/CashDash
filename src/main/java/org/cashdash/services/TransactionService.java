package org.cashdash.services;

import org.cashdash.database.Database;
import org.cashdash.models.*;

import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

public class TransactionService {
//    public static int create(String id, User user, Customer customer) throws Exception {
    public static int create(String id, User user) throws Exception {
        return Database.executeUpdate("INSERT INTO transactions VALUES (?, ?, ?)",
            id,
            user.getId(),
            Date.valueOf(LocalDate.now())
        );
    }

    public static ArrayList<Transaction> getAll() throws Exception {
        
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();
        
        try (ResultSet result = Database.executeQuery("SELECT * FROM transactions")) {
            while (result.next()){
                Transaction transaction = new Transaction(result.getString("id"), result.getInt("user_id"), result.getDate("transaction_date"));
                transactions.add(transaction);
            }
        }

        return transactions;
    }
}