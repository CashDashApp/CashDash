package org.cashdash.controllers;

import org.cashdash.models.User;
import org.cashdash.services.UserService;
import org.cashdash.utils.Hash;

public class Authentication {
    public static boolean login(User user) throws Exception {
        User ret = UserService.findByUsername(user.getUsername());

        if (ret == null)
            throw new Exception("User not found");

        boolean isValidPassword = Hash.verify(user.getPassword(), ret.getPassword());

        if (!isValidPassword)
            throw new Exception("Invalid password");

        user.setId(ret.getId());
        user.setFullname(ret.getFullname());
        return false;
    }

    public static void register(User user) throws Exception {
        if (UserService.findByUsername(user.getUsername()) != null)
            throw new Exception("Username has been registered");

        int updated = UserService.createUser(user.getFullname(), user.getUsername(), user.getPassword());

        if (updated == 0)
            throw new Exception("User not registered successfully");

    }
}
