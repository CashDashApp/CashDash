package org.cashdash;

import org.cashdash.controllers.Authentication;
import org.cashdash.models.User;
import org.cashdash.views.LoginForm;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();

        loginForm.display();

    }
}