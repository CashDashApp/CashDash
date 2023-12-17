package org.cashdash.services;

import org.cashdash.database.Database;
import org.cashdash.models.User;
import org.cashdash.utils.Hash;

import javax.xml.crypto.Data;
import java.sql.ResultSet;

public class UserService {
    private static final String FIND_BY_USERNAME_QUERY = "SELECT * FROM users WHERE username = ?";
    private static final String CREATE_USER_QUERY = "INSERT INTO users (fullname, username, password) VALUES (?, ?, ?)";

    public static User findByUsername(String username) throws Exception {
        try (ResultSet result = Database.executeQuery(FIND_BY_USERNAME_QUERY, username)) {
            if (result == null || !result.next())
                return null;

            User u = new User(
                    result.getInt("id"),
                    result.getString("fullname"),
                    result.getString("username"),
                    result.getString("password"),
                    result.getBoolean("is_admin")
            );

            return u;
        }
    }

    // TODO: create create user dto?
    public static int createUser(String fullname, String username, String password) throws Exception {
        String hashed = Hash.password(password);

        return Database.executeUpdate(CREATE_USER_QUERY, fullname, username, hashed);
    }
}
