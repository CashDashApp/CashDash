/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cashdash.views;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.cashdash.models.User;

public class HomePage extends javax.swing.JFrame {
    ScreenData Data = new ScreenData();
    User user;
    
    public HomePage(User user) {
        this.user = user;
        Data.get_Category();
        Data.get_Product();
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackroundPanel = new javax.swing.JPanel();
        Navigation_Panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Pemesananbtn1 = new javax.swing.JButton();
        Storagebtn1 = new javax.swing.JButton();
        LogOutbtn2 = new javax.swing.JButton();
        Pemesananbtn2 = new javax.swing.JButton();
        Show_Panel = new javax.swing.JPanel();
        Pemesanan_Panel = new javax.swing.JPanel();
        PrintBill_Panel = new javax.swing.JPanel();
        Storage_Panel = new javax.swing.JPanel();
        Welcome_Panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackroundPanel.setBackground(new java.awt.Color(255, 255, 255));

        Navigation_Panel.setBackground(new java.awt.Color(51, 51, 51));
        Navigation_Panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 20, true));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("CashDash");

        Pemesananbtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Pemesananbtn1.setForeground(new java.awt.Color(102, 102, 102));
        Pemesananbtn1.setText("Pemesanan");
        Pemesananbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pemesananbtn1ActionPerformed(evt);
            }
        });

        Storagebtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Storagebtn1.setForeground(new java.awt.Color(102, 102, 102));
        Storagebtn1.setText("Storage");
        Storagebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Storagebtn1ActionPerformed(evt);
            }
        });

        LogOutbtn2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogOutbtn2.setForeground(new java.awt.Color(255, 0, 51));
        LogOutbtn2.setText("LogOut");
        LogOutbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutbtn2ActionPerformed(evt);
            }
        });

        Pemesananbtn2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Pemesananbtn2.setForeground(new java.awt.Color(102, 102, 102));
        Pemesananbtn2.setText("Transaksi");
        Pemesananbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pemesananbtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Navigation_PanelLayout = new javax.swing.GroupLayout(Navigation_Panel);
        Navigation_Panel.setLayout(Navigation_PanelLayout);
        Navigation_PanelLayout.setHorizontalGroup(
            Navigation_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Navigation_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Navigation_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pemesananbtn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogOutbtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Storagebtn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Navigation_PanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12))
                    .addComponent(Pemesananbtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Navigation_PanelLayout.setVerticalGroup(
            Navigation_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Navigation_PanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(Pemesananbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(Pemesananbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(Storagebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(LogOutbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        Show_Panel.setBackground(new java.awt.Color(0, 153, 255));
        Show_Panel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout Pemesanan_PanelLayout = new javax.swing.GroupLayout(Pemesanan_Panel);
        Pemesanan_Panel.setLayout(Pemesanan_PanelLayout);
        Pemesanan_PanelLayout.setHorizontalGroup(
            Pemesanan_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1086, Short.MAX_VALUE)
        );
        Pemesanan_PanelLayout.setVerticalGroup(
            Pemesanan_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        Show_Panel.add(Pemesanan_Panel, "card2");

        javax.swing.GroupLayout PrintBill_PanelLayout = new javax.swing.GroupLayout(PrintBill_Panel);
        PrintBill_Panel.setLayout(PrintBill_PanelLayout);
        PrintBill_PanelLayout.setHorizontalGroup(
            PrintBill_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1086, Short.MAX_VALUE)
        );
        PrintBill_PanelLayout.setVerticalGroup(
            PrintBill_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        Show_Panel.add(PrintBill_Panel, "card4");

        javax.swing.GroupLayout Storage_PanelLayout = new javax.swing.GroupLayout(Storage_Panel);
        Storage_Panel.setLayout(Storage_PanelLayout);
        Storage_PanelLayout.setHorizontalGroup(
            Storage_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1086, Short.MAX_VALUE)
        );
        Storage_PanelLayout.setVerticalGroup(
            Storage_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        Show_Panel.add(Storage_Panel, "card5");

        Welcome_Panel.setBackground(new java.awt.Color(204, 204, 204));
        Welcome_Panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 20, true));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("CashDash");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 50, true));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("(Nama User)");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Waktu:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout Welcome_PanelLayout = new javax.swing.GroupLayout(Welcome_Panel);
        Welcome_Panel.setLayout(Welcome_PanelLayout);
        Welcome_PanelLayout.setHorizontalGroup(
            Welcome_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Welcome_PanelLayout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(242, 242, 242))
        );
        Welcome_PanelLayout.setVerticalGroup(
            Welcome_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Welcome_PanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BackroundPanelLayout = new javax.swing.GroupLayout(BackroundPanel);
        BackroundPanel.setLayout(BackroundPanelLayout);
        BackroundPanelLayout.setHorizontalGroup(
            BackroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackroundPanelLayout.createSequentialGroup()
                .addComponent(Navigation_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Welcome_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(Show_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1086, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BackroundPanelLayout.setVerticalGroup(
            BackroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Show_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BackroundPanelLayout.createSequentialGroup()
                        .addGroup(BackroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Welcome_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Navigation_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Pemesananbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pemesananbtn1ActionPerformed
        Show_Panel.removeAll();
       
        NewPemesananUI Pemesanan = new NewPemesananUI(user); // Instantiate the HomePanel
        Show_Panel.add(Pemesanan);
        Show_Panel.repaint();
        Show_Panel.revalidate();
    }//GEN-LAST:event_Pemesananbtn1ActionPerformed

    private void Storagebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Storagebtn1ActionPerformed
        Show_Panel.removeAll();
       
        Storage_Panel Storage;
        try {
            Storage = new Storage_Panel(); // Instantiate the HomePanel
            Show_Panel.add(Storage);
            Show_Panel.repaint();
            Show_Panel.revalidate();
        } catch (Exception ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_Storagebtn1ActionPerformed

    private void LogOutbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutbtn2ActionPerformed
        int dialogBtn = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Anda Yakin Akan Keluar", "Peringatan", dialogBtn);
        if(dialogResult == 0){
            System.exit(0);
        }

    }//GEN-LAST:event_LogOutbtn2ActionPerformed

    private void Pemesananbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pemesananbtn2ActionPerformed
        Show_Panel.removeAll();
       
        Transaction_Panel Transaksi;
        try {
            Transaksi = new Transaction_Panel(); // Instantiate the HomePanel
            Show_Panel.add(Transaksi);
            Show_Panel.repaint();
            Show_Panel.revalidate();
        } catch (Exception ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_Pemesananbtn2ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HomePage(User user).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackroundPanel;
    private javax.swing.JButton LogOutbtn2;
    private javax.swing.JPanel Navigation_Panel;
    private javax.swing.JPanel Pemesanan_Panel;
    private javax.swing.JButton Pemesananbtn1;
    private javax.swing.JButton Pemesananbtn2;
    private javax.swing.JPanel PrintBill_Panel;
    private javax.swing.JPanel Show_Panel;
    private javax.swing.JPanel Storage_Panel;
    private javax.swing.JButton Storagebtn1;
    private javax.swing.JPanel Welcome_Panel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
