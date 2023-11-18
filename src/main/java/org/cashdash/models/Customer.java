package org.cashdash.models;

public class Customer {
    String nama;
    String PhoneNumber;
    
    public Customer(String nama, String Phone){
        this.nama = nama;
        this.PhoneNumber = Phone;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    
    



    
}
