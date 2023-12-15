package org.cashdash.models;

public class Product extends Item {
    private Category category;
    private String description;
    private String imageUrl;
    private double price;

    public Product(int id, String name, String description, Integer stock, double price) {
        super(id, name, stock);
        this.description = description;
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public double getPrice() {
        return price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void getInfo() {
        
    }

    
}
