/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lufi;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HorváthNauzikaAténa(
 */
public class Lufi extends javax.swing.JFrame {

    private int meretAra;
    private int veglegesAr;
    private int szinAr;
    private int sargaAr;
    private int lilaAr;
    private int kekAr;
    private int vegyesAr;

    /**
     * Creates new form Lufi
     */
    public Lufi() {
        initComponents();
        
        
        veglegesArKiirasa();
    }

    private void veglegesArKiirasa() {
        veglegesAr = meretAra + szinAr;
        lblkiirtar.setText(veglegesAr + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rdbtnfelfujos = new javax.swing.JRadioButton();
        rdbtnhelium = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        cbxmeret = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        cboxsarga = new javax.swing.JCheckBox();
        cboxvegyes = new javax.swing.JCheckBox();
        cboxkek = new javax.swing.JCheckBox();
        cboxlila = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        rdbtn20 = new javax.swing.JRadioButton();
        rdbtn40 = new javax.swing.JRadioButton();
        rdbtn5 = new javax.swing.JRadioButton();
        lblweboldal = new javax.swing.JLabel();
        lblar = new javax.swing.JLabel();
        lblkiirtar = new javax.swing.JLabel();
        lblft = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 255));
        jLabel1.setText("Gömb lufi Rendelés");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lufi fajtája"));

        buttonGroup1.add(rdbtnfelfujos);
        rdbtnfelfujos.setText("Felfújós");

        buttonGroup1.add(rdbtnhelium);
        rdbtnhelium.setText("Héliumos");
        rdbtnhelium.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbtnheliumItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbtnhelium)
                    .addComponent(rdbtnfelfujos))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbtnhelium)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbtnfelfujos)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lufi mérete"));

        cbxmeret.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kicsi (28 cm)", "Közepes (55 cm)", "Nagy (70 cm)" }));
        cbxmeret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxmeretActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxmeret, 0, 129, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxmeret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Lufi színe"));

        cboxsarga.setText("Sárga");
        cboxsarga.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxsargaItemStateChanged(evt);
            }
        });

        cboxvegyes.setText("Vegyes");
        cboxvegyes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxvegyesItemStateChanged(evt);
            }
        });

        cboxkek.setText("Kék");
        cboxkek.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxkekItemStateChanged(evt);
            }
        });

        cboxlila.setText("Lila");
        cboxlila.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxlilaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboxsarga)
                    .addComponent(cboxlila)
                    .addComponent(cboxkek)
                    .addComponent(cboxvegyes))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboxsarga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxlila)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxkek)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxvegyes)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Kiszerelés nagysága (db)"));

        buttonGroup2.add(rdbtn20);
        rdbtn20.setText("20");

        buttonGroup2.add(rdbtn40);
        rdbtn40.setText("40");

        buttonGroup2.add(rdbtn5);
        rdbtn5.setText("5");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbtn5)
                    .addComponent(rdbtn20)
                    .addComponent(rdbtn40))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbtn5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbtn20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbtn40)
                .addContainerGap())
        );

        lblweboldal.setText("<html><a href=\"#\">Hivatalos weboldalunk</a></html");
        lblweboldal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblweboldal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblweboldalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblweboldalMouseEntered(evt);
            }
        });

        lblar.setText("Ár: ");

        lblkiirtar.setText("0");

        lblft.setText("Ft");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/lufikep.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblweboldal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(lblar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblkiirtar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblft)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(24, 24, 24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblar)
                        .addComponent(lblkiirtar)
                        .addComponent(lblft))
                    .addComponent(lblweboldal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblweboldalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblweboldalMouseClicked

        try {
            Desktop.getDesktop().browse(URI.create("https://lufiverzum.hu/"));
        } catch (IOException ex) {
            Logger.getLogger(Lufi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblweboldalMouseClicked

    private void lblweboldalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblweboldalMouseEntered
        lblweboldal.setText("<html><a href=\"#\">Hivatalos weboldalunk</a></html");
    }//GEN-LAST:event_lblweboldalMouseEntered

    private void cbxmeretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxmeretActionPerformed
       int lufiMeret = cbxmeret.getSelectedIndex();
       if(lufiMeret == 0){
           meretAra = 200;
       }else if(lufiMeret == 1){
           meretAra = 300;
       }else{
           meretAra = 500;
       }
       
        veglegesArKiirasa();
    }//GEN-LAST:event_cbxmeretActionPerformed

    private void rdbtnheliumItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbtnheliumItemStateChanged
       
    }//GEN-LAST:event_rdbtnheliumItemStateChanged

    private void cboxsargaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxsargaItemStateChanged
        if(cboxsarga.isSelected()){
            sargaAr = 100;
            szinAr = sargaAr + lilaAr + kekAr + vegyesAr;
            veglegesArKiirasa();
        }
        
        if(cboxsarga.isSelected() == false){
            sargaAr = 0;
            szinAr = sargaAr + lilaAr + kekAr + vegyesAr;
            veglegesArKiirasa();
        }
    }//GEN-LAST:event_cboxsargaItemStateChanged

    private void cboxlilaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxlilaItemStateChanged
        if(cboxlila.isSelected()){
            lilaAr = 100;
            szinAr = sargaAr + lilaAr + kekAr + vegyesAr;
            veglegesArKiirasa();
        }
        
        if(cboxlila.isSelected() == false){
            lilaAr = 0;
            szinAr = sargaAr + lilaAr + kekAr + vegyesAr;
            veglegesArKiirasa();
        }
    }//GEN-LAST:event_cboxlilaItemStateChanged

    private void cboxkekItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxkekItemStateChanged
                if(cboxkek.isSelected()){
            kekAr = 100;
            szinAr = sargaAr + lilaAr + kekAr + vegyesAr;
            veglegesArKiirasa();
        }
        
        if(cboxkek.isSelected() == false){
            kekAr = 0;
            szinAr = sargaAr + lilaAr + kekAr + vegyesAr;
            veglegesArKiirasa();
        }
    }//GEN-LAST:event_cboxkekItemStateChanged

    private void cboxvegyesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxvegyesItemStateChanged
                        if(cboxvegyes.isSelected()){
            vegyesAr = 100;
            szinAr = sargaAr + lilaAr + kekAr + vegyesAr;
            veglegesArKiirasa();
        }
        
        if(cboxvegyes.isSelected() == false){
            vegyesAr = 0;
            szinAr = sargaAr + lilaAr + kekAr + vegyesAr;
            veglegesArKiirasa();
        }
    }//GEN-LAST:event_cboxvegyesItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lufi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lufi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lufi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lufi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lufi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox cboxkek;
    private javax.swing.JCheckBox cboxlila;
    private javax.swing.JCheckBox cboxsarga;
    private javax.swing.JCheckBox cboxvegyes;
    private javax.swing.JComboBox<String> cbxmeret;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblar;
    private javax.swing.JLabel lblft;
    private javax.swing.JLabel lblkiirtar;
    private javax.swing.JLabel lblweboldal;
    private javax.swing.JRadioButton rdbtn20;
    private javax.swing.JRadioButton rdbtn40;
    private javax.swing.JRadioButton rdbtn5;
    private javax.swing.JRadioButton rdbtnfelfujos;
    private javax.swing.JRadioButton rdbtnhelium;
    // End of variables declaration//GEN-END:variables
}
