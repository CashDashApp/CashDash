package org.cashdash.models;

import java.time.LocalDate;

public class Equipment extends Item {
    private LocalDate datein;
    private String condition;

    public Equipment(int id, String condition, String name, Integer stock) {
        super(id, name, stock);
        this.datein = LocalDate.now();
        this.condition = condition;
    }

    public void setDatein(LocalDate datein) {
        this.datein = datein;
    }

    public void setCondtion(String condtion) {
        this.condition = condtion;
    }


    public LocalDate getDatein() {
        return datein;
    }

    public String getCondtion() {
        return condition;
    }
}
