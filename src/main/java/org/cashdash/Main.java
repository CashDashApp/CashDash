package org.cashdash;

import org.cashdash.models.Product;
import org.cashdash.services.ProductService;


public class Main {
    public static void main(String[] args) {
        try {
            Product p = ProductService.findById(4);

            System.out.println(p.getId());
            System.out.println(p.getName());
            System.out.println(p.getDescription());
            System.out.println(p.getPrice());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
}