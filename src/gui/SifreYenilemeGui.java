/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.IBilgiKontrol;
import database.islemler.HesapBilgileri;
import database.islemler.SifreYenileme;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class SifreYenilemeGui extends javax.swing.JFrame implements IDuzenleyici, IBilgiKontrol {

    private SifreYenileme sifreYenileme = null;

    public SifreYenileme getSifreYenileme() {
        if (this.sifreYenileme == null) {
            return this.sifreYenileme = new SifreYenileme();
        }
        return sifreYenileme;
    }

    public SifreYenilemeGui() {
        initComponents();
        getEdits();
    }

    @Override
    public boolean bilgilerGecerlimi() {
        return !(this.textGuvenlikSoru.getText().trim().equals("")
                || this.textYeniSifre.getText().trim().equals("")
                || this.textYeniSifreTekrar.getText().trim().equals("")
                || TextAyarlari.uzunlukKontrol(11, textTcNo.getText().trim())
                || TextAyarlari.uzunlukKontrol(11, textTelNo.getText().trim())
                || (this.textYeniSifre.getText().trim().equals("")
                != this.textYeniSifreTekrar.getText().trim().equals("")));
    }

    private void sifreDegistir() {
        getSifreYenileme().setGuvenlikSoruCevap(this.textGuvenlikSoru.getText().trim());
        getSifreYenileme().setTelNo(this.textTelNo.getText().trim());
        getSifreYenileme().setTcNo(this.textTcNo.getText().trim());
        getSifreYenileme().setYeniSifre(this.textYeniSifre.getText().trim());
        getSifreYenileme().setYeniSifreTekrar(this.textYeniSifreTekrar.getText().trim());
        if (getSifreYenileme().sifreDegistimi()) {

            Dialogs.ozelMesajGoster(this, "Şifreniz başarıyla değiştirildi.");

        } else {
            Dialogs.ozelMesajGoster(this, "Şifre değiştirme başarısız. \n"
                    + "Bilgilerinizi kontrol ediniz.");
        }
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setFocusable(true);
        TextAyarlari.sadeceSayiGir(textTelNo);
        TextAyarlari.sadeceSayiGir(textTcNo);
        TextAyarlari.karakterSayiKontrol(textTelNo, 11);
        TextAyarlari.karakterSayiKontrol(textTcNo, 11);
    }

    public JPasswordField getTextEskiSifre() {
        return textEskiSifre;
    }

    public JLabel getlblEskiSifre() {
        return lblEskiSifre;
    }

    private boolean isEnabledEskiSifre() {
        return this.getTextEskiSifre().isEnabled();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblGeriIconTus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textTcNo = new javax.swing.JTextField();
        textTelNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textGuvenlikSoru = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textEskiSifre = new javax.swing.JPasswordField();
        textYeniSifre = new javax.swing.JPasswordField();
        textYeniSifreTekrar = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        lblEskiSifre = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSifreYenile = new javax.swing.JButton();

        jLabel6.setText("Eski Şifre :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        lblGeriIconTus.setForeground(new java.awt.Color(255, 51, 51));
        lblGeriIconTus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        lblGeriIconTus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGeriIconTus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGeriIconTusMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Şifre Yenileme");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("T.C. Kimlik No :");

        textTcNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textTcNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTcNoActionPerformed(evt);
            }
        });

        textTelNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Telefon No :");

        textGuvenlikSoru.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Gücenlik Sorusu Cevabı :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Yeni Şifre :");

        lblEskiSifre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEskiSifre.setText("Eski Şifre :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Yeni Şifre Tekrar :");

        btnSifreYenile.setBackground(new java.awt.Color(204, 255, 255));
        btnSifreYenile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSifreYenile.setText("Şifre Yenile");
        btnSifreYenile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSifreYenile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSifreYenileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSifreYenileMouseExited(evt);
            }
        });
        btnSifreYenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSifreYenileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textTcNo, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textGuvenlikSoru, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblGeriIconTus)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(lblEskiSifre))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnSifreYenile)
                            .addComponent(textYeniSifreTekrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textEskiSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textYeniSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(143, 143, 143))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {textEskiSifre, textGuvenlikSoru, textYeniSifre, textYeniSifreTekrar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGeriIconTus)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textTcNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textGuvenlikSoru, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEskiSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEskiSifre))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textYeniSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textYeniSifreTekrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(29, 29, 29)
                .addComponent(btnSifreYenile)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {textEskiSifre, textGuvenlikSoru, textYeniSifre, textYeniSifreTekrar});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel4, jLabel5, jLabel8, lblEskiSifre});

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
        if (isEnabledEskiSifre()) {
            ActionAyarlari.setVisible(this, new AyarlarGui());
        } else {
            ActionAyarlari.setVisible(this, new GirisGui());

        }

    }//GEN-LAST:event_lblGeriIconTusMouseClicked

    private void textTcNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTcNoActionPerformed

    }//GEN-LAST:event_textTcNoActionPerformed

    private void btnSifreYenileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSifreYenileMouseEntered
        ButtonAyarlari.setBg(btnSifreYenile, Color.red);
    }//GEN-LAST:event_btnSifreYenileMouseEntered

    private void btnSifreYenileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSifreYenileMouseExited
        ButtonAyarlari.setOriginColor(btnSifreYenile);
    }//GEN-LAST:event_btnSifreYenileMouseExited

    private void btnSifreYenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSifreYenileActionPerformed

        if (isEnabledEskiSifre() || !this.textEskiSifre.getText().trim().equals("")) {
            if (bilgilerGecerlimi()) {
                getSifreYenileme().setEskiSifre(this.textEskiSifre.getText().trim());
                sifreDegistir();
            }else{
                Dialogs.bosOlamazMesajGoster(this);
            }
        } else {
            if (bilgilerGecerlimi()) {
               
                sifreDegistir();

            }else {
                Dialogs.bosOlamazMesajGoster(this);
            }

        }
    }//GEN-LAST:event_btnSifreYenileActionPerformed

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
            java.util.logging.Logger.getLogger(SifreYenilemeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SifreYenilemeGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSifreYenile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEskiSifre;
    private javax.swing.JLabel lblGeriIconTus;
    private javax.swing.JPasswordField textEskiSifre;
    private javax.swing.JTextField textGuvenlikSoru;
    private javax.swing.JTextField textTcNo;
    private javax.swing.JTextField textTelNo;
    private javax.swing.JPasswordField textYeniSifre;
    private javax.swing.JPasswordField textYeniSifreTekrar;
    // End of variables declaration//GEN-END:variables
}
