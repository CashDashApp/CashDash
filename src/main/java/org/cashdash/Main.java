package org.cashdash;

import org.cashdash.controllers.Authentication;
import org.cashdash.models.*;


public class Main {
 
    public static void main(String[] args) {
        try {
            User u = new User("Arla Sifhana Putri",  "arlasp","password");
            
            Authentication.register(u);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}