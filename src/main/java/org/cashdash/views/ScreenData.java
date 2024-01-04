/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cashdash.views;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.cashdash.models.Category;
import org.cashdash.models.Order;
import org.cashdash.models.Product;
import org.cashdash.models.Transaction;
import org.cashdash.services.ProductService;

public class ScreenData {
    public static ArrayList<Category> ObjCategory = new ArrayList<Category>();
    public static ArrayList<Order> ArrOrder = new ArrayList<Order>(); 
    public static ArrayList<Product> ObjProduct = new ArrayList<Product>();
    public static ArrayList<Transaction> ObjTransaction = new ArrayList<Transaction>();
    public static DefaultTableModel Print_Bill = new DefaultTableModel(null,new String [] {"ID", "Nama", "Jenis", "Harga Satuan", "Jumlah Pesanan", "Total"});
    public static DefaultTableModel Storage_Panel = new DefaultTableModel(null,new String [] {"ID", "Barang", "Sisa Stock"});
    public static DefaultTableModel Transaction_Panel = new DefaultTableModel(null, new String [] {"IDTransaksi", "Cashier", "Harga", "Date"});
    
    
    public void get_Category(){
        Category C = new Category(0, "Makanan");
        ObjCategory.add(C);
        C = new Category(1, "Minuman");
        ObjCategory.add(C);
    }
    
    public void get_Product(){
        if(ObjProduct.isEmpty()){
            try {
                for(Product P : ProductService.getAll()){
                    ObjProduct.add(P);
                }
            } catch (Exception ex) {
                Logger.getLogger(ScreenData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void clearRow(){
        int rowCount = Storage_Panel.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            Storage_Panel.removeRow(i);
        }
    }
    
    public void get_TabelStorage(){
        clearRow();
        for (Product ObjProduct1 : ObjProduct) {
            System.out.println(ObjProduct.get(1).getName());
            Storage_Panel.addRow(new Object[] {ObjProduct1.getId(), ObjProduct1.getName(), ObjProduct1.getStock()});
        }
    }
    
    public Product CariProductById(int Nama){
        for(int i = 0; i < ObjProduct.size(); i++){
            if(Nama == ObjProduct.get(i).getId()){
                return ObjProduct.get(i);
            }
        }
        return null;
    }
    
    public void add_PrintBill(String LabelProduk, String LabelHarga, int JumlahPesanan,int Total){
        Print_Bill.addRow(new Object[] {LabelProduk, LabelHarga, JumlahPesanan, Total});
    }
    
    public void add_Transaction(Transaction trs){
        String IDTransaksi = trs.getId();
        String Cashier = trs.getUser().getFullname();
        double Harga = trs.getTotal();
        Date date = trs.getDate();
        //if(Transaction_Panel.getRowCount() == 0){
            //for(Transaction trs: ObjTransaction){
                Transaction_Panel.addRow(new Object[] {IDTransaksi, Cashier, Harga,  date});
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
    
    
    public void getTableTransaction(){
        Transaction_Panel.setRowCount(0);
            for (Transaction ObjTransaction1 : ObjTransaction) {
            Transaction_Panel.addRow(new Object[] {null, null,ObjTransaction1.getTotal(),ObjTransaction1.getDate()});
            } 
    }
    
    public void ReduceStock(ArrayList<Order> JumlahPesanan){
        for(int i = 0; i < JumlahPesanan.size();i++){
            Product Prodak = CariProductById(JumlahPesanan.get(i).getProduct().getId());
            if(Prodak != null){
                Prodak.setStock(Prodak.getStock() - JumlahPesanan.get(i).getCount());
                System.out.println(Prodak.getStock());
            }
        }
        System.out.println(ObjProduct.size());
    }
    
}
