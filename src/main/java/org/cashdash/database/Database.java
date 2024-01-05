package org.cashdash.database;

import java.sql.*;

public class Database {
    private static final String dbUrl = "jdbc:mysql://localhost:3306/cashdash";
    private static final String dbUsername = "root";
    private static final String dbPassword = "";
    private static Connection connection;

    public static Connection getConnection() {
        if (connection != null)
            return connection;

        try {
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (Exception exception) {
            return null;
        }

        return connection;
    }
    
    private static PreparedStatement craftStatement(Object... args) {
        try {
            PreparedStatement statement = getConnection().prepareStatement(args[0].toString(), new String[] { "id" } );

            for (int i = 1; i < args.length; i++) {
                if (args[i] instanceof Integer)
                    statement.setInt(i, (int) args[i]);
                else if (args[i] instanceof Boolean)
                    statement.setBoolean(i, (boolean) args[i]);
                else if (args[i] instanceof Double)
                    statement.setDouble(i, (double) args[i]);
                else if (args[i] instanceof Date)
                    statement.setDate(i, (Date) args[i]);
                else
                    statement.setString(i, (String) args[i]);
            }
            return statement;
            
        } catch (Exception e) {
            
            return null;
        }    
    }

    public static ResultSet executeQuery(Object... args) {
        try {
            PreparedStatement statement = craftStatement(args);
            
            return statement.executeQuery();
        } catch (Exception exception) {
            return null;
        }
    }

    public static int executeUpdate(Object... args) {
        try {
            PreparedStatement statement = craftStatement(args);
 
            return statement.executeUpdate();

        } catch (Exception exception) {
            return 0;
        }
    }
}
