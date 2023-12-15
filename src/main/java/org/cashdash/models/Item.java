package org.cashdash.models;

public abstract class Item {
    private String name;
    private Integer id;
    private Integer stock;

    public Item(int id, String name, Integer stock){
        this.id = id;
        this.name = name;
        this.stock = stock;
    }
    
    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getStock() {
        return stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
