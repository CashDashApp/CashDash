/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cashdash.views;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.cashdash.models.Category;
import org.cashdash.models.Order;
import org.cashdash.models.Product;
import org.cashdash.models.Transaction;

public class ScreenData {
    public static ArrayList<Category> ObjCategory = new ArrayList<Category>();
    public static ArrayList<Order> ArrOrder = new ArrayList<Order>(); 
    public static ArrayList<Product> ObjProduct = new ArrayList<Product>();
    public static ArrayList<Transaction> ObjTransaction = new ArrayList<Transaction>();
    public static DefaultTableModel Print_Bill = new DefaultTableModel(null,new String [] {"Product", "Harga", "Jumlah", "Total"});    
    public static DefaultTableModel Storage_Panel = new DefaultTableModel(null,new String [] {"Barang", "Sisa Stock"});
    public static DefaultTableModel Transaction_Panel = new DefaultTableModel(null, new String [] {"IDTransaksi", "Cashier", "Customer", "No Telp", "Harga", "Date"});
    
    
    public void get_Category(){
        /*Category C = new Category("Makanan");
        C.setId(0);
        ObjCategory.add(C);
        C = new Category("Minuman");
        C.setId(1);
        ObjCategory.add(C);*/
    }
    
    public void get_Product(){
        /*Product P = new Product("Batagor","Batagor 15.000 terlalu kenyang",99);
        P.setId(0);
        P.setImageUrl("/image/Batagor.jpg");
        P.setCategory(ObjCategory.getFirst());
        P.setPrice(100000);
        ObjProduct.add(P);
        
        P = new Product("Spaghetti","Italiano Cappucino",99);
        P.setId(1);
        P.setImageUrl("/image/Spageti.jpg");
        P.setCategory(ObjCategory.getFirst());
        P.setPrice(60000);
        ObjProduct.add(P);
        
        P = new Product("Steak","Japanese Wagyu A5?",99);
        P.setId(2);
        P.setImageUrl("/image/Steak.jpg");
        P.setCategory(ObjCategory.getFirst());
        P.setPrice(70000);
        ObjProduct.add(P);
        
        
        P = new Product("Mango Smoothie","Mango Smoothie terbuat dari Mangga",99);
        P.setId(3);
        P.setImageUrl("/image/Mango SMoothie.jpg");
        P.setCategory(ObjCategory.getLast());
        P.setPrice(50000);
        ObjProduct.add(P);  */
    }
    
    public void get_TabelStorage(){
        if(Storage_Panel.getRowCount() == 0){
            for (Product ObjProduct1 : ObjProduct) {
            Storage_Panel.addRow(new Object[] {ObjProduct1.getName(), ObjProduct1.getStock()});
        }
        }
        
    }
    
    public Product CariNamaProduct(String Nama){
        for(int i = 0; i < ObjProduct.size(); i++){
            if(Nama.equals(ObjProduct.get(i).getName())){
                return ObjProduct.get(i);
            }
        }
        return null;
    }
    
    public void add_PrintBill(String LabelProduk, String LabelHarga, int JumlahPesanan,int Total){
        Print_Bill.addRow(new Object[] {LabelProduk, LabelHarga, JumlahPesanan, Total});
    }
    
    public void add_Transaction(String IDTransaksi, String Cashier, String Customer, String No_Telp, int Harga, String Date){
        //if(Transaction_Panel.getRowCount() == 0){
            //for(Transaction trs: ObjTransaction){
                Transaction_Panel.addRow(new Object[] {IDTransaksi, Cashier, Customer, No_Telp, Harga,  Date});
            //}
        }
    //}
    
    public void ResetOrder(){
        ArrOrder.clear();
        Print_Bill.setRowCount(0);
    }
    
    public Product Search(String Nama){
        for(int i = 0;i<ObjProduct.size();i++){
            if(ObjProduct.get(i).getName().equals(Nama)){
                return ObjProduct.get(i);
            }
        }
        return null;
    }
    
    
    
    
    
    
}
