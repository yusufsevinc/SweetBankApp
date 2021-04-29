/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.IBilgiKontrol;
import database.islemler.HesapBilgileri;
import database.islemler.ParaYatir;
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
public class ParaYatirGui extends javax.swing.JFrame implements IDuzenleyici, IBilgiKontrol {

    /**
     * Creates new form ParaCekmeGui
     */
    private int yatirilacakMiktar = 0;

    private ParaYatir paraYatir = null;

    public ParaYatirGui() {
        initComponents();
        getEdits();
    }

    public ParaYatir getParaYatir() {
        if (this.paraYatir == null) {
            paraYatir = new ParaYatir();
        }
        return paraYatir;
    }

    @Override
    public boolean bilgilerGecerlimi() {
        return !(this.textMiktar.getText().equals(""));

    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    @Override
    public void getEdits() {
        this.setFocusable(true);
        this.setLocationRelativeTo(null);
        TextAyarlari.sadeceSayiGir(textMiktar);
        TextAyarlari.karakterSayiKontrol(textMiktar, 5);
        this.lblBakiye.setText(String.valueOf(getHesapBilgileri().getBakiye()));
        this.lblKullaniciAdi.setText(getHesapBilgileri().getAdSoyad());

    }

    private void paraYatir() {
        this.getParaYatir().setYatirilacakMiktar(yatirilacakMiktar);

        if (this.getParaYatir().paraYatirildimi()) {
            Dialogs.ozelMesajGoster(this, "Para Yatırma İşlemi Başarılı...\n"
                    + "Yatırılan miktar : " + this.yatirilacakMiktar);
            ActionAyarlari.setVisible(this, new HesapGui());

        } else {
            Dialogs.ozelMesajGoster(this, "Bilgilerinizi Kontrol Ediniz...");
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblKullaniciAdi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBakiye = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textMiktar = new javax.swing.JTextField();
        btnParaYatir = new javax.swing.JButton();
        lblGeriIconTus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank Para Yatırma Ekranı");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lblKullaniciAdi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblKullaniciAdi.setForeground(new java.awt.Color(51, 51, 255));
        lblKullaniciAdi.setText("Sayın [Kullanıcı Adı Soyadı]");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Tek seferde maksimum 40000 TL yatırabilirsiniz!");

        lblBakiye.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBakiye.setText("[BAKİYE]");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Toplam Bakiyeniz :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Yatıracağanız Miktar :");

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

        btnParaYatir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnParaYatir.setText("Para Yatır");
        btnParaYatir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnParaYatir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnParaYatirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnParaYatirMouseExited(evt);
            }
        });
        btnParaYatir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParaYatirActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnParaYatir)
                            .addComponent(textMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(lblBakiye))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblGeriIconTus))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblGeriIconTus)
                .addGap(26, 26, 26)
                .addComponent(lblKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBakiye)
                    .addComponent(jLabel4))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addComponent(btnParaYatir)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel4, jLabel5, lblBakiye, textMiktar});

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

    private void btnParaYatirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParaYatirMouseEntered
        // TODO add your handling code here:
        ButtonAyarlari.setBg(btnParaYatir, Color.red);
    }//GEN-LAST:event_btnParaYatirMouseEntered

    private void btnParaYatirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParaYatirMouseExited
        // TODO add your handling code here:
        ButtonAyarlari.setOriginColor(btnParaYatir);
    }//GEN-LAST:event_btnParaYatirMouseExited

    private void lblGeriIconTusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGeriIconTusMouseClicked
        // TODO add your handling code here:
        ActionAyarlari.setVisible(this, new HesapGui());
    }//GEN-LAST:event_lblGeriIconTusMouseClicked

    private void textMiktarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textMiktarKeyReleased
        // TODO add your handling code here:
        yatirilacakMiktar = TextAyarlari.setKeyReleased(textMiktar, 40000);
        textMiktar.setText(String.valueOf(yatirilacakMiktar));

    }//GEN-LAST:event_textMiktarKeyReleased

    private void btnParaYatirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParaYatirActionPerformed
        if (bilgilerGecerlimi()) {
            this.paraYatir();

        }else{
            Dialogs.bosOlamazMesajGoster(this);
        }
    }//GEN-LAST:event_btnParaYatirActionPerformed

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
    private javax.swing.JButton btnParaYatir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBakiye;
    private javax.swing.JLabel lblGeriIconTus;
    private javax.swing.JLabel lblKullaniciAdi;
    private javax.swing.JTextField textMiktar;
    // End of variables declaration//GEN-END:variables
}
