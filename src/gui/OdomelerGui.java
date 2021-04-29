/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.IBilgiKontrol;
import database.islemler.HesapBilgileri;
import database.islemler.Odemeler;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author sevinc
 */
public class OdomelerGui extends javax.swing.JFrame implements IDuzenleyici, IBilgiKontrol {

    private Odemeler odemeler = null;
    private String faturaTuru = null;
    private double fatura = 0;

    public Odemeler getOdemeler() {
        if (this.odemeler == null) {
           return this.odemeler = new Odemeler();

        }
        return odemeler;
    }

    public OdomelerGui() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setFocusable(true);
        this.lblAdSoyad.setText(getHesapBilgileri().getAdSoyad());
        this.lblElektrik.setText(String.valueOf(getHesapBilgileri().getElektrikFaturasi()));
        this.lblSu.setText(String.valueOf(getHesapBilgileri().getSuFaturasi()));
        this.lblInternet.setText(String.valueOf(getHesapBilgileri().getInternetFaturasi()));
        this.lblDogalgaz.setText(String.valueOf(getHesapBilgileri().getDogalgazFaturasi()));

    }

    @Override
    public boolean bilgilerGecerlimi() {

        return true;
    }

    private void odemeYap(double miktar , String faturaTuru) {
             getOdemeler().setFaturaTuru(faturaTuru);
             getOdemeler().setOdencekTutar(miktar);
        if (getOdemeler().odemeYapildimi()) {
              Dialogs.ozelMesajGoster(this, faturaTuru +" faturanız ödendi. \n"
                    + "Ödenen tutar: " + fatura);
        } else {
            Dialogs.ozelMesajGoster(this, "Faturanız borcunuz bulunmamaktadır...");

        }

    }

    public boolean bilgilerGecerlimi(double miktar) {

        return !(miktar > getHesapBilgileri().getBakiye());
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
        lblGeriIconTus = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSu = new javax.swing.JLabel();
        lblDogalgaz = new javax.swing.JLabel();
        lblElektrik = new javax.swing.JLabel();
        lblInternet = new javax.swing.JLabel();
        btnOdeElektrik = new javax.swing.JButton();
        btnOdeDogalgaz = new javax.swing.JButton();
        btnOdeSu = new javax.swing.JButton();
        btnOdeInternet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank Odemeler Ekranı");

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        lblAdSoyad.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAdSoyad.setForeground(new java.awt.Color(51, 51, 255));
        lblAdSoyad.setText("Sayın [Kullanıcı Adı Soyadı]");

        lblGeriIconTus.setForeground(new java.awt.Color(255, 51, 51));
        lblGeriIconTus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        lblGeriIconTus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGeriIconTus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGeriIconTusMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Toplam su faturası borcunuz :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Toplam doğalgaz faturası borcunuz :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Toplam internet faturası borcunuz :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Toplam elektrik faturası borcunuz :");

        lblSu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSu.setForeground(new java.awt.Color(0, 51, 204));
        lblSu.setText("[BAKİYE]");

        lblDogalgaz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDogalgaz.setForeground(new java.awt.Color(0, 51, 204));
        lblDogalgaz.setText("[BAKİYE]");

        lblElektrik.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblElektrik.setForeground(new java.awt.Color(0, 51, 204));
        lblElektrik.setText("[BAKİYE]");

        lblInternet.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblInternet.setForeground(new java.awt.Color(0, 51, 204));
        lblInternet.setText("[BAKİYE]");

        btnOdeElektrik.setBackground(new java.awt.Color(255, 255, 153));
        btnOdeElektrik.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOdeElektrik.setText("ÖDE");
        btnOdeElektrik.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOdeElektrik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOdeElektrikMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOdeElektrikMouseExited(evt);
            }
        });
        btnOdeElektrik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdeElektrikActionPerformed(evt);
            }
        });

        btnOdeDogalgaz.setBackground(new java.awt.Color(255, 255, 153));
        btnOdeDogalgaz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOdeDogalgaz.setText("ÖDE");
        btnOdeDogalgaz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOdeDogalgaz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOdeDogalgazMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOdeDogalgazMouseExited(evt);
            }
        });
        btnOdeDogalgaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdeDogalgazActionPerformed(evt);
            }
        });

        btnOdeSu.setBackground(new java.awt.Color(204, 204, 0));
        btnOdeSu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOdeSu.setText("ÖDE");
        btnOdeSu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOdeSu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOdeSuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOdeSuMouseExited(evt);
            }
        });
        btnOdeSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdeSuActionPerformed(evt);
            }
        });

        btnOdeInternet.setBackground(new java.awt.Color(204, 204, 0));
        btnOdeInternet.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOdeInternet.setText("ÖDE");
        btnOdeInternet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOdeInternet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOdeInternetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOdeInternetMouseExited(evt);
            }
        });
        btnOdeInternet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdeInternetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(lblAdSoyad))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblGeriIconTus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(329, 329, 329))))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDogalgaz)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblElektrik)
                            .addComponent(lblSu)
                            .addComponent(lblInternet))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOdeInternet)
                            .addComponent(btnOdeDogalgaz)
                            .addComponent(btnOdeElektrik)
                            .addComponent(btnOdeSu))))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGeriIconTus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOdeElektrik)
                    .addComponent(lblElektrik)
                    .addComponent(jLabel5))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblSu)
                    .addComponent(btnOdeSu))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblDogalgaz)
                    .addComponent(btnOdeDogalgaz))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblInternet)
                    .addComponent(btnOdeInternet))
                .addGap(52, 52, 52))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnOdeElektrik, jLabel5, lblElektrik});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnOdeInternet, jLabel4, lblInternet});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnOdeDogalgaz, jLabel3, lblDogalgaz});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnOdeSu, jLabel2, lblSu});

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

    private void lblGeriIconTusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGeriIconTusMouseClicked
        // TODO add your handling code here:
        ActionAyarlari.setVisible(this, new HesapGui());
    }//GEN-LAST:event_lblGeriIconTusMouseClicked

    private void btnOdeElektrikMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOdeElektrikMouseEntered
        ButtonAyarlari.setBg(btnOdeElektrik, Color.red);
    }//GEN-LAST:event_btnOdeElektrikMouseEntered

    private void btnOdeElektrikMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOdeElektrikMouseExited
        ButtonAyarlari.setOriginColor(btnOdeElektrik);
    }//GEN-LAST:event_btnOdeElektrikMouseExited

    private void btnOdeSuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOdeSuMouseEntered
        ButtonAyarlari.setBg(btnOdeSu, Color.red);
    }//GEN-LAST:event_btnOdeSuMouseEntered

    private void btnOdeSuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOdeSuMouseExited
        ButtonAyarlari.setOriginColor(btnOdeSu);
    }//GEN-LAST:event_btnOdeSuMouseExited

    private void btnOdeDogalgazMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOdeDogalgazMouseEntered
        ButtonAyarlari.setBg(btnOdeDogalgaz, Color.red);
    }//GEN-LAST:event_btnOdeDogalgazMouseEntered

    private void btnOdeDogalgazMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOdeDogalgazMouseExited
        ButtonAyarlari.setOriginColor(btnOdeDogalgaz);
    }//GEN-LAST:event_btnOdeDogalgazMouseExited

    private void btnOdeInternetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOdeInternetMouseEntered
        ButtonAyarlari.setBg(btnOdeInternet, Color.red);
    }//GEN-LAST:event_btnOdeInternetMouseEntered

    private void btnOdeInternetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOdeInternetMouseExited
        ButtonAyarlari.setOriginColor(btnOdeInternet);
    }//GEN-LAST:event_btnOdeInternetMouseExited

    private void btnOdeElektrikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdeElektrikActionPerformed
         fatura = getHesapBilgileri().getElektrikFaturasi();
         faturaTuru = "elektrik";
        if (this.bilgilerGecerlimi(fatura)) {
            this.odemeYap(fatura , faturaTuru);
                                getHesapBilgileri().setBakiye(getHesapBilgileri().getBakiye() - fatura  );
                                getHesapBilgileri().setElektrikFaturasi( getHesapBilgileri().getElektrikFaturasi() -fatura);
                                this.lblElektrik.setText(String.valueOf(getHesapBilgileri().getElektrikFaturasi()));


        } else {
            Dialogs.ozelMesajGoster(this, "Bakiyeniz yetersiz.");
        }
    }//GEN-LAST:event_btnOdeElektrikActionPerformed

    private void btnOdeSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdeSuActionPerformed
                 fatura = getHesapBilgileri().getSuFaturasi();
         faturaTuru = "su";
        if (this.bilgilerGecerlimi(fatura)) {
            
            this.odemeYap(fatura , faturaTuru);
            
                                getHesapBilgileri().setBakiye(getHesapBilgileri().getBakiye() - fatura  );
                                getHesapBilgileri().setSuFaturasi(getHesapBilgileri().getSuFaturasi()-fatura);
                                this.lblSu.setText(String.valueOf(getHesapBilgileri().getSuFaturasi()));


        } else {
            Dialogs.ozelMesajGoster(this, "Bakiyeniz yetersiz.");
        }
    }//GEN-LAST:event_btnOdeSuActionPerformed

    private void btnOdeDogalgazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdeDogalgazActionPerformed
         fatura = getHesapBilgileri().getDogalgazFaturasi();
         faturaTuru = "dogalgaz";
        if (this.bilgilerGecerlimi(fatura)) {
            this.odemeYap(fatura , faturaTuru);
            
                                getHesapBilgileri().setBakiye(getHesapBilgileri().getBakiye() - fatura  );
                                getHesapBilgileri().setDogalgazFaturasi(getHesapBilgileri().getDogalgazFaturasi()-fatura);
                                this.lblDogalgaz.setText(String.valueOf(getHesapBilgileri().getDogalgazFaturasi()));


        } else {
            Dialogs.ozelMesajGoster(this, "Bakiyeniz yetersiz.");
        }    }//GEN-LAST:event_btnOdeDogalgazActionPerformed

    private void btnOdeInternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdeInternetActionPerformed
         fatura = getHesapBilgileri().getInternetFaturasi();
         faturaTuru = "internet";
        if (this.bilgilerGecerlimi(fatura)) {
            this.odemeYap(fatura , faturaTuru);
           
                                getHesapBilgileri().setBakiye(getHesapBilgileri().getBakiye() - fatura  );
                                getHesapBilgileri().setInternetFaturasi(getHesapBilgileri().getInternetFaturasi()-fatura);
                                this.lblInternet.setText(String.valueOf(getHesapBilgileri().getInternetFaturasi()));


        } else {
            Dialogs.ozelMesajGoster(this, "Bakiyeniz yetersiz.");
        }    }//GEN-LAST:event_btnOdeInternetActionPerformed
     
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
            java.util.logging.Logger.getLogger(OdomelerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OdomelerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OdomelerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OdomelerGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OdomelerGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOdeDogalgaz;
    private javax.swing.JButton btnOdeElektrik;
    private javax.swing.JButton btnOdeInternet;
    private javax.swing.JButton btnOdeSu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdSoyad;
    private javax.swing.JLabel lblDogalgaz;
    private javax.swing.JLabel lblElektrik;
    private javax.swing.JLabel lblGeriIconTus;
    private javax.swing.JLabel lblInternet;
    private javax.swing.JLabel lblSu;
    // End of variables declaration//GEN-END:variables

}
