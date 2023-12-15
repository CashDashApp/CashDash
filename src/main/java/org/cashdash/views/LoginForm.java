package org.cashdash.views;

import org.cashdash.Main;
import org.cashdash.controllers.Authentication;
import org.cashdash.models.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField username;
    private JPasswordField password;
    private JButton submitButton;
    private JPanel loginPanel;

    public LoginForm() {
        setContentPane(loginPanel);
        setSize(1000, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(false);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                User userLogin = new User(username.getText(), password.getPassword().toString());

                try {
                    Authentication.login(userLogin);
                    System.out.println("== USER LOGGED IN ==");
                } catch (Exception exception) {
                    System.out.println(exception.getMessage());
                }
            }
        });
    }

    public void display() {
        setVisible(true);
    }

    public void hide() {
        setVisible(false);
    }


}
