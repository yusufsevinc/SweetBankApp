/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.IBilgiKontrol;
import database.islemler.Ayarlar;
import database.islemler.HesapBilgileri;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.IconAyarlari;
import gui.ayarlar.TextAyarlari;
import javax.swing.JOptionPane;

/**
 *
 * @author sevinc
 */
public class AyarlarGui extends javax.swing.JFrame implements IDuzenleyici, IBilgiKontrol {

    /**
     * Creates new form AyarlarGui
     */
    private Ayarlar ayarlar = null;
    private static boolean kontrol = false;
    private String telNo = null;

    public AyarlarGui() {
        initComponents();
        getEdits();
    }

    public Ayarlar getAyarlar() {
        if (this.ayarlar == null) {
            return ayarlar = new Ayarlar();
        }
        return ayarlar;
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setFocusable(true);
        TextAyarlari.sadeceSayiGir(textTel);
        TextAyarlari.karakterSayiKontrol(textTel, 11);
        lblAdsoyad.setText(getAyarlar().getHesapBilgileri().getAdSoyad());

    }

    @Override
    public boolean bilgilerGecerlimi() {

        return !(TextAyarlari.uzunlukKontrol(11, textTel.getText().trim()));

    }

    private void telNoGuncelle() {

        ayarlar.setTelNo(telNo);
        if (getAyarlar().telGuncelendimi()) {
            Dialogs.ozelMesajGoster(this, "Tel No Güncellendi.");
        } else {
            Dialogs.ozelMesajGoster(this, "Tel No güncelenmedi");
        }
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblAdsoyad = new javax.swing.JLabel();
        lblGeriIconTus = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textTel = new javax.swing.JTextField();
        textSifre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblTelNoIcon = new javax.swing.JLabel();
        lblSifreIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank Hesap Ayarları Ekranı");

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));

        lblAdsoyad.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAdsoyad.setForeground(new java.awt.Color(51, 51, 255));
        lblAdsoyad.setText("Sayın [Kullanıcı Adı Soyadı]");

        lblGeriIconTus.setForeground(new java.awt.Color(255, 51, 51));
        lblGeriIconTus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        lblGeriIconTus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGeriIconTus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGeriIconTusMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Telefon Numaranız :");

        textTel.setEditable(false);
        textTel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelActionPerformed(evt);
            }
        });
        textTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textTelKeyReleased(evt);
            }
        });

        textSifre.setEditable(false);
        textSifre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textSifre.setText("***************");
        textSifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSifreActionPerformed(evt);
            }
        });
        textSifre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textSifreKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Şifreniz:");

        lblTelNoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/updateTelIcon.png"))); // NOI18N
        lblTelNoIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTelNoIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTelNoIconMouseClicked(evt);
            }
        });

        lblSifreIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/updateTelIcon.png"))); // NOI18N
        lblSifreIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSifreIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSifreIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblGeriIconTus))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(textSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(textTel, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblAdsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelNoIcon)
                            .addComponent(lblSifreIcon))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGeriIconTus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAdsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(textTel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelNoIcon)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(textSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lblSifreIcon))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblGeriIconTusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGeriIconTusMouseClicked
        ActionAyarlari.setVisible(this, new HesapGui());
    }//GEN-LAST:event_lblGeriIconTusMouseClicked

    private void textTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelActionPerformed

    }//GEN-LAST:event_textTelActionPerformed

    private void textTelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTelKeyReleased


    }//GEN-LAST:event_textTelKeyReleased

    private void textSifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSifreActionPerformed

    }//GEN-LAST:event_textSifreActionPerformed

    private void textSifreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSifreKeyReleased

    }//GEN-LAST:event_textSifreKeyReleased

    private void lblTelNoIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTelNoIconMouseClicked
        if (!kontrol) {
            textTel.setEditable(true);
            IconAyarlari.changeIcon(lblTelNoIcon, "updateTelIcon2");
            kontrol = true;

        } else {
            textTel.setEditable(false);
            telNo = textTel.getText().trim();
            if (bilgilerGecerlimi()) {
                telNoGuncelle();
            } else {
                Dialogs.bosOlamazMesajGoster(this);
            }
            IconAyarlari.changeIcon(lblTelNoIcon, "updateTelIcon");
            kontrol = false;
            this.setFocusable(true);
        }


    }//GEN-LAST:event_lblTelNoIconMouseClicked

    private void lblSifreIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSifreIconMouseClicked
        ActionAyarlari.setVisible(this, new SifreYenilemeGui());        // TODO add your handling code here:
    }//GEN-LAST:event_lblSifreIconMouseClicked

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
            java.util.logging.Logger.getLogger(AyarlarGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AyarlarGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AyarlarGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AyarlarGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AyarlarGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAdsoyad;
    private javax.swing.JLabel lblGeriIconTus;
    private javax.swing.JLabel lblSifreIcon;
    private javax.swing.JLabel lblTelNoIcon;
    private javax.swing.JTextField textSifre;
    private javax.swing.JTextField textTel;
    // End of variables declaration//GEN-END:variables

}
