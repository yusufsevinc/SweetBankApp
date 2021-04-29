/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.IBilgiKontrol;
import database.islemler.HavaleIslemleri;
import database.islemler.HesapBilgileri;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;

/**
 *
 * @author sevinc
 */
public class HavaleGui extends javax.swing.JFrame implements IDuzenleyici, IBilgiKontrol {

    /**
     * Creates new form ParaCekmeGui
     */
    private int gonderilecekMiktar = 0;
    private final String musteriNo = "Müşteri No";
    private HavaleIslemleri havaleIslemleri = null;
    
    public HavaleIslemleri getHavaleIslemleri() {
        if (this.havaleIslemleri == null) {
            this.havaleIslemleri = new HavaleIslemleri();
            
        }
        return havaleIslemleri;
    }
    
    public HavaleGui() {
        initComponents();
        getEdits();
    }
    
    @Override
    public void getEdits() {
        this.setFocusable(true);
        this.setLocationRelativeTo(null);
        TextAyarlari.sadeceSayiGir(textMiktar);
        TextAyarlari.sadeceSayiGir(textHavaleKisi);
        TextAyarlari.karakterSayiKontrol(textMiktar, 5);
        lblBakiye.setText(String.valueOf(getHesapBilgileri().getBakiye()));
        lblAdSoyad.setText(getHesapBilgileri().getAdSoyad());
        
    }

    private void havaleYap() {
        getHavaleIslemleri().setGonderilenMiktar(this.gonderilecekMiktar);
        getHavaleIslemleri().setMusteriNo(this.textHavaleKisi.getText());
        if (getHavaleIslemleri().havaleGerceklestimi()) {
            Dialogs.ozelMesajGoster(this,"Havale İşlemi başarıyla gerçekleşmiştir...\n"
                    + "Gönderilen Müşteri No: " + this.textHavaleKisi.getText() +"\n"
                            + "Gönderilen Miktar: " + this.gonderilecekMiktar + " TL.");
            ActionAyarlari.setVisible(this, new HesapGui());
        }else{
            Dialogs.ozelMesajGoster(this,"İşlem Başarız...\n"
                    + "Bilgilerinizi Kontrol Ediniz...");
        }
        
    }

    @Override
    public boolean bilgilerGecerlimi() {
        return !(this.textHavaleKisi.getText().trim().equals(musteriNo)
                || this.textMiktar.getText().trim().equals(""));
    }
    
    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAdSoyad = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBakiye = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textMiktar = new javax.swing.JTextField();
        lblGeriIconTus = new javax.swing.JLabel();
        textHavaleKisi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnHavaleYap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank Para Çekme Ekranı");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        lblAdSoyad.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAdSoyad.setForeground(new java.awt.Color(51, 51, 255));
        lblAdSoyad.setText("Sayın [Kullanıcı Adı Soyadı]");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Tek seferde maksimum 20000 TL gönderebilirsiniz!");

        lblBakiye.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBakiye.setText("[BAKİYE]");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Toplam Bakiyeniz :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Göndereceğiniz Miktar :");

        textMiktar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textMiktar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMiktarActionPerformed(evt);
            }
        });
        textMiktar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textMiktarKeyReleased(evt);
            }
        });

        lblGeriIconTus.setForeground(new java.awt.Color(255, 51, 51));
        lblGeriIconTus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        lblGeriIconTus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGeriIconTus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGeriIconTusMouseClicked(evt);
            }
        });

        textHavaleKisi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textHavaleKisi.setForeground(new java.awt.Color(204, 204, 204));
        textHavaleKisi.setText("Müşteri No");
        textHavaleKisi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textHavaleKisiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textHavaleKisiFocusLost(evt);
            }
        });
        textHavaleKisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textHavaleKisiActionPerformed(evt);
            }
        });
        textHavaleKisi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textHavaleKisiKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Havale Alacak Kişi :");

        btnHavaleYap.setBackground(new java.awt.Color(204, 255, 255));
        btnHavaleYap.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHavaleYap.setText("Havale Yap");
        btnHavaleYap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHavaleYap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHavaleYapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHavaleYapMouseExited(evt);
            }
        });
        btnHavaleYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHavaleYapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(lblBakiye))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblAdSoyad))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblGeriIconTus))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(157, 157, 157)
                                    .addComponent(jLabel4))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textHavaleKisi, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(textMiktar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btnHavaleYap)))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblGeriIconTus)
                .addGap(31, 31, 31)
                .addComponent(lblAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel2)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBakiye)
                    .addComponent(jLabel4))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(textHavaleKisi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addComponent(btnHavaleYap)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel4, jLabel5, lblBakiye, textMiktar});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel6, textHavaleKisi});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textMiktarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMiktarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMiktarActionPerformed

    private void lblGeriIconTusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGeriIconTusMouseClicked
        // TODO add your handling code here:
        ActionAyarlari.setVisible(this, new HesapGui());
    }//GEN-LAST:event_lblGeriIconTusMouseClicked

    private void textMiktarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textMiktarKeyReleased
        // TODO add your handling code here:
        gonderilecekMiktar = TextAyarlari.setKeyReleased(textMiktar, 20000);
        textMiktar.setText(String.valueOf(gonderilecekMiktar));

    }//GEN-LAST:event_textMiktarKeyReleased

    private void textHavaleKisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textHavaleKisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textHavaleKisiActionPerformed

    private void textHavaleKisiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textHavaleKisiKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_textHavaleKisiKeyReleased

    private void btnHavaleYapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHavaleYapMouseEntered
        ButtonAyarlari.setBg(btnHavaleYap, Color.red);
    }//GEN-LAST:event_btnHavaleYapMouseEntered

    private void btnHavaleYapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHavaleYapMouseExited
        ButtonAyarlari.setOriginColor(btnHavaleYap);
    }//GEN-LAST:event_btnHavaleYapMouseExited

    private void btnHavaleYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHavaleYapActionPerformed
        // TODO add your handling code here:
        if (this.bilgilerGecerlimi()) {
            this.havaleYap();
        } else {
            Dialogs.bosOlamazMesajGoster(this);
        }
    }//GEN-LAST:event_btnHavaleYapActionPerformed

    private void textHavaleKisiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textHavaleKisiFocusGained
        // TODO add your handling code here:
        TextAyarlari.focusGaind(textHavaleKisi, musteriNo);
    }//GEN-LAST:event_textHavaleKisiFocusGained

    private void textHavaleKisiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textHavaleKisiFocusLost
        // TODO add your handling code here:
        TextAyarlari.focusLost(textHavaleKisi);
    }//GEN-LAST:event_textHavaleKisiFocusLost

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
            java.util.logging.Logger.getLogger(ParaYatirGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaYatirGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaYatirGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaYatirGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaYatirGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHavaleYap;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdSoyad;
    private javax.swing.JLabel lblBakiye;
    private javax.swing.JLabel lblGeriIconTus;
    private javax.swing.JTextField textHavaleKisi;
    private javax.swing.JTextField textMiktar;
    // End of variables declaration//GEN-END:variables
}
