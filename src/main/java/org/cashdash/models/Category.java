package org.cashdash.models;

import org.cashdash.database.Database;

public class Category {
    private int id;
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int save() throws Exception {
        return Database.executeUpdate("UPDATE category SET name = ? WHERE id = ?",
            this.name,
            this.id
        );
    }
}
