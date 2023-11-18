package org.cashdash.models;

public abstract class Item {
    private String nama;
    private Integer id;
    private Integer stock;

    public Item(String nama, Integer id, Integer stock){
        this.nama = nama;
        this.id = id;
        this.stock = stock;
    }
    
    public String getNama() {
        return nama;
    }

    public Integer getId() {
        return id;
    }

    public Integer getStock() {
        return stock;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
