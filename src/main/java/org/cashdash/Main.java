package org.cashdash;

import org.cashdash.controllers.Authentication;
import org.cashdash.models.Category;
import org.cashdash.models.Product;
import org.cashdash.models.User;
import org.cashdash.services.CategoryService;
import org.cashdash.services.ProductService;

import java.util.ArrayList;


public class Main {
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

            for (Product p : products) {
                System.out.println(p.getId() + " -> " + p.getName());
                if (ProductService.delete(p) != -1) {
                    System.out.println("Product berhasil dihapus");
                } else {
                    System.out.println("Product gagal dihapus");
                }
            }

            System.out.println(ProductService.delete(products.get(0)));


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