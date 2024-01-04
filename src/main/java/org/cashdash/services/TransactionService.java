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
    
        public static Transaction getTransactionById(String id) throws Exception {
            
        try (ResultSet result = Database.executeQuery("SELECT * FROM transactions WHERE id = ?",id)) {
            while (result.next()){
                Transaction transaction = new Transaction(result.getString("id"), result.getInt("user_id"), result.getDate("transaction_date"));
                return transaction;
            }
        }

        return null;
    }
        
        public static int getHighestId() throws Exception {
            int maxNumber = -1;
            try (ResultSet result = Database.executeQuery("SELECT MAX(CAST(SUBSTRING(id, LENGTH('INV-YYMM')+1) AS SIGNED)) \n" + "FROM transaction\n" +"WHERE id LIKE 'INV-YYMM%';")){
                
                if (result.next()) {
                    maxNumber = result.getInt(1);
                }
            }
            return maxNumber;
        }
}