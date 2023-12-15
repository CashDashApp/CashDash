package org.cashdash;

import org.cashdash.models.Product;
import org.cashdash.services.ProductService;


public class Main {
    public static void main(String[] args) {
        try {
            for (Product p : ProductService.getAll()) {
                System.out.println(p.getName());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}