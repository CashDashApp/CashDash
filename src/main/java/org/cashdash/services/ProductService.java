package org.cashdash.services;

import org.cashdash.database.Database;
import org.cashdash.models.Category;
import org.cashdash.models.Product;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductService {
    public static Product storeResultToProduct(ResultSet result) throws Exception {
        Product product = null;
        if (result.next()) {
            product = new Product(
                result.getInt("id"),
                result.getString("name"),
                result.getString("description"),
                result.getInt("stock"),
                result.getDouble("price")
            );
            Category category = new Category(
                result.getInt("category.id"),
                result.getString("category.name")
            );
            product.setCategory(category);
        }
        return product;
    }

    public static Product findById(int id) throws Exception {
        try (ResultSet result = Database.executeQuery("SELECT * FROM products INNER JOIN category ON category.id = products.category_id WHERE products.id = ?", Integer.toString(id))) {
            return storeResultToProduct(result);
        }
    }

    public static ArrayList<Product> getAll() throws Exception {
        ArrayList<Product> products = new ArrayList<>();

        try (ResultSet result = Database.executeQuery("SELECT * FROM products INNER JOIN category ON category.id = products.category_id ORDER BY products.id")) {
            for (;;) {
                Product product = storeResultToProduct(result);

                if (product == null)
                    break;

                products.add(product);
            }
        }

        return products;
    }

    public static int create(Product product) throws Exception {
        return Database.executeUpdate("INSERT INTO products VALUES (NULL, ?, ?, ?, ?, ?)",
            product.getName(),
            product.getStock(),
            product.getCategory().getId(),
            product.getDescription(),
            product.getPrice()
        );
    }
    
    public static int update(Product product) throws Exception {
        return Database.executeUpdate("UPDATE products SET name = ?, stock = ?, category_id = ?, description = ?, price = ? WHERE id = ?",
            product.getName(),
            product.getStock(),
            product.getCategory().getId(),
            product.getDescription(),
            product.getPrice(),
            product.getId()
        );
    }

    public static int delete(Product product) throws Exception {
        return Database.executeUpdate("DELETE FROM products WHERE id = ?",
            product.getId()
        );
    }
}