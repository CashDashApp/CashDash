package org.cashdash.services;

import org.cashdash.database.Database;
import org.cashdash.models.*;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            String sql = "SELECT id FROM transactions WHERE id LIKE 'INV-%';";
            try (ResultSet result = Database.executeQuery(sql)){
                while (result != null && result.next()) {
                    String id = result.getString("id");
                    int zzValue = Integer.parseInt(id.substring(id.lastIndexOf("INV-") + 4));
                    if (zzValue > maxNumber) {
                        maxNumber = zzValue;
                    }
                }

            } catch (SQLException e) {
                e.printStackTrace();  // Handle the exception appropriately
            }
            return maxNumber;
        }
}