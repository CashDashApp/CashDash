package org.cashdash;

import org.cashdash.controllers.Authentication;
import org.cashdash.models.Category;
import org.cashdash.models.Product;
import org.cashdash.models.User;
import org.cashdash.services.CategoryService;
import org.cashdash.services.ProductService;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

//    public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//
//        // Session
//        User user = null;
//
//        while (true) {
//            try {
//                System.out.println("== Cashdash ==");
//                System.out.println("[1] Login");
//                System.out.println("[2] Register user (kayanya ga kepake)");
//                System.out.println("[3] Show all product");
//                System.out.println("[4] Insert product");
//                System.out.println("[5] Delete product");
//                System.out.println("[6] Edit product");
//
//                System.out.print(">> ");
//                int choice = inp.nextInt();
//
//                switch (choice) {
//                    case 1:
//                        System.out.print("Username: ");
//                        String username = inp.next();
//
//                        System.out.print("Password: ");
//                        String password = inp.next();
//
//                        User credential = new User(username, password);
//                        Authentication.login(credential);
//
//                        // save to session
//                        user = credential;
//                        break;
//
//                    case 3:
//                        for (Product p : ProductService.getAll()) {
//                            System.out.println("Product ID  : " + p.getId());
//                            System.out.println("Name        : " + p.getName());
//                            System.out.println("Description : " + p.getDescription());
//                            System.out.println("Price       : " + p.getPrice());
//                            System.out.println("Category    : " + p.getCategory().getName());
//                            System.out.println();
//
//                        }
//
//
//
//                }
//
//
//            } catch (Exception e) {
//                System.out.println("Error: " + e.getMessage());
//            }
//        }
//    }

    public static void main(String[] args) {
        try {

            ArrayList<Category> categories = CategoryService.getAll();

            for (Category c : categories) {
                System.out.println(c.getId() + " -> " + c.getName());
            }

            Product pNew = new Product(
                "Stand Monitor",
                10,
                "Stand monitor yang bisa nempel tembok",
                120000
            );
            pNew.setCategory(categories.get(0));

            if (ProductService.create(pNew) != -1) {
                System.out.println("Product berhasil ditambahkan");
            } else {
                System.out.println("Product gagal ditambahkan");
            }

            ArrayList<Product> products = ProductService.getAll();

            Product pEdit = products.get(0);
            pEdit.setStock(1337);

            if (pEdit.save() != -1) {
                System.out.println("Product berhasil diupdate");
            } else {
                System.out.println("Product gagal diupdate");
            }

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