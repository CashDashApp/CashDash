package org.cashdash;

import java.sql.Date;
import java.time.LocalDate;
import org.cashdash.controllers.Authentication;
import org.cashdash.models.*;
import org.cashdash.services.CategoryService;
import org.cashdash.services.ProductService;

import java.util.ArrayList;
import java.util.Scanner;
import org.cashdash.database.Database;
import org.cashdash.services.TransactionService;


public class Main {
 
    public static void main(String[] args) {
        try {
            ArrayList<Product> products = ProductService.getAll();

            for (Product p : products) {
                System.out.println(p.getId() + " -> " + p.getName());
            }

            User u = new User("Testing User",  "testing4","testing");
            
            Authentication.register(u);
            Authentication.login(u);

            Transaction t = new Transaction(u);

            t.addOrder(products.get(0), 1);
            t.addOrder(products.get(0), 2);
            t.addOrder(products.get(1), 1);

            t.printDetailOrders();

            System.out.println("Total harga: Rp. " + t.getTotal());

            t.save();
 

//            ArrayList<Category> categories = CategoryService.getAll();
//
//            for (Category c : categories) {
//                System.out.println(c.getId() + " -> " + c.getName());
//            }
//
//            Product pNew = new Product(
//                "Stand Monitor",
//                10,
//                "Stand monitor yang bisa nempel tembok",
//                120000
//            );
//            pNew.setCategory(categories.get(0));
//
//            if (ProductService.create(pNew) != -1) {
//                System.out.println("Product berhasil ditambahkan");
//            } else {
//                System.out.println("Product gagal ditambahkan");
//            }
//
//            ArrayList<Product> products = ProductService.getAll();
//
//            Product pEdit = products.get(0);
//            pEdit.setStock(1337);
//
//            if (pEdit.save() != -1) {
//                System.out.println("Product berhasil diupdate");
//            } else {
//                System.out.println("Product gagal diupdate");
//            }

//            for (Product p : ProductService.getAll()) {
//                System.out.println(p.getId() + " -> " + p.getName());
//                if (ProductService.delete(p) != -1) {
//                    System.out.println("Product berhasil dihapus");
//                } else {
//                    System.out.println("Product gagal dihapus");
//                }
//            }
//
//            System.out.println(ProductService.delete(products.get(0)));

//            User uLogin = new User("Testing User 1", "testing1", "testing");
//
//            try {
//                Authentication.register(uLogin);
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//
//            Authentication.login(uLogin);
//
//            System.out.println("Hello, " + uLogin.getFullname() + "!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}