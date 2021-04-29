/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.DbConnection;
import database.IBilgiKontrol;
import database.islemler.HesapBilgileri;
import database.islemler.KullaniciGiris;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;
import gui.ayarlar.IDuzenleyici;

/**
 *
 * @author sevinc
 */
public final class GirisGui extends javax.swing.JFrame implements IDuzenleyici ,IBilgiKontrol{

    /**
     * Creates new form GirisEkranGui
     */
     private  String tc = "T.C. Kimlik No / Müşteri No";
     private String sifre = "############";
     
     private KullaniciGiris kulllaniciGiris = null;

    public KullaniciGiris getKulllaniciGiris() {
        if(kulllaniciGiris == null){
            kulllaniciGiris = new KullaniciGiris();
        }
        return kulllaniciGiris;
    }
      @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        panelGirisEkrani.setFocusable(true);
        textKimlik.setText(tc);
        textSifre.setText(sifre);
        TextAyarlari.karakterSayiKontrol( textKimlik,11);
                TextAyarlari.karakterSayiKontrol(textSifre,11);

  
    }
    public GirisGui() {
        initComponents();
        getEdits();
        DbConnection dbConnection = new DbConnection();
        TextAyarlari.textAlanDolumKontrol(panelGirisEkrani);

    }

    @Override
    public boolean bilgilerGecerlimi() {
        return !(this.textKimlik.getText().equals(tc)
                || String.valueOf(this.textSifre.getText()).equals(sifre));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
return HesapBilgileri.getInstance();
        }

   
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGirisEkrani = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textKimlik = new javax.swing.JTextField();
        textSifre = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnGiris = new javax.swing.JButton();
        btnBasvur = new javax.swing.JButton();
        lblSifremiUnuttum = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank ");
        setPreferredSize(new java.awt.Dimension(839, 565));
        setResizable(false);

        panelGirisEkrani.setBackground(new java.awt.Color(204, 255, 204));
        panelGirisEkrani.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SWEET BANK 'a Hoşgeldiniz");

        textKimlik.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textKimlik.setForeground(new java.awt.Color(153, 153, 153));
        textKimlik.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textKimlikFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textKimlikFocusLost(evt);
            }
        });
        textKimlik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textKimlikActionPerformed(evt);
            }
        });

        textSifre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textSifre.setForeground(new java.awt.Color(153, 153, 153));
        textSifre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textSifreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textSifreFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Halen Sweet Banklı Değilmisiniz ? ");

        btnGiris.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnGiris.setText("Giriş");
        btnGiris.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGiris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGirisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGirisMouseExited(evt);
            }
        });
        btnGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisActionPerformed(evt);
            }
        });

        btnBasvur.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBasvur.setText("Başvur");
        btnBasvur.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBasvur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBasvurMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBasvurMouseExited(evt);
            }
        });
        btnBasvur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBasvurActionPerformed(evt);
            }
        });

        lblSifremiUnuttum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSifremiUnuttum.setForeground(new java.awt.Color(51, 51, 255));
        lblSifremiUnuttum.setText("Şifreni mi unuttun ?");
        lblSifremiUnuttum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSifremiUnuttum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSifremiUnuttumMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelGirisEkraniLayout = new javax.swing.GroupLayout(panelGirisEkrani);
        panelGirisEkrani.setLayout(panelGirisEkraniLayout);
        panelGirisEkraniLayout.setHorizontalGroup(
            panelGirisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGirisEkraniLayout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addGroup(panelGirisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textKimlik, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelGirisEkraniLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btnBasvur, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSifremiUnuttum))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        panelGirisEkraniLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {textKimlik, textSifre});

        panelGirisEkraniLayout.setVerticalGroup(
            panelGirisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGirisEkraniLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(textKimlik, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(textSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSifremiUnuttum, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(panelGirisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnBasvur, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        panelGirisEkraniLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {textKimlik, textSifre});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGirisEkrani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGirisEkrani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void textKimlikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textKimlikActionPerformed
        
    }//GEN-LAST:event_textKimlikActionPerformed
   
    
    private void textKimlikFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textKimlikFocusGained
        
        TextAyarlari.focusGaind(textKimlik,tc );
    }//GEN-LAST:event_textKimlikFocusGained

    private void textKimlikFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textKimlikFocusLost
        
        TextAyarlari.focusLost(textKimlik);
    }//GEN-LAST:event_textKimlikFocusLost

    private void textSifreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textSifreFocusGained
        
                TextAyarlari.focusGaind(textSifre,sifre );

    }//GEN-LAST:event_textSifreFocusGained

    private void textSifreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textSifreFocusLost
        
        TextAyarlari.focusLost(textSifre);
    }//GEN-LAST:event_textSifreFocusLost

    private void btnGirisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGirisMouseEntered
        
        ButtonAyarlari.setBg(btnGiris, Color.cyan);
    }//GEN-LAST:event_btnGirisMouseEntered

    private void btnBasvurMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBasvurMouseEntered
        
        ButtonAyarlari.setBg(btnBasvur, Color.red);
    }//GEN-LAST:event_btnBasvurMouseEntered

    private void btnGirisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGirisMouseExited
        
        ButtonAyarlari.setOriginColor(btnGiris);
    }//GEN-LAST:event_btnGirisMouseExited

    private void btnBasvurMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBasvurMouseExited
        
                ButtonAyarlari.setOriginColor(btnBasvur);

    }//GEN-LAST:event_btnBasvurMouseExited

    private void btnBasvurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBasvurActionPerformed
        
                ActionAyarlari.setVisible(this, new BasvuruGui());

    }//GEN-LAST:event_btnBasvurActionPerformed

    private void btnGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisActionPerformed
        if (bilgilerGecerlimi()) {
            String musteriNo = this.textKimlik.getText().trim();
            String musteriSifre = String.valueOf(this.textSifre.getText());
            this.girisYap(musteriNo, musteriSifre);
        }
        else{
            Dialogs.bosOlamazMesajGoster(this);
        }
    }//GEN-LAST:event_btnGirisActionPerformed
    private void girisYap(String musteriNo , String musteriSifre){
     this.getKulllaniciGiris().setMusteriNo(musteriNo);
     this.getKulllaniciGiris().setMusteriSifre(musteriSifre);
     if(this.getKulllaniciGiris().girisBilgileriKontrol()){
         ActionAyarlari.setVisible(this, new HesapGui());
     }else{
         Dialogs.ozelMesajGoster(this, "Giriş Bilgilerinizi Lütfen Kontrol Ediniz...");
     }
    }
    private void lblSifremiUnuttumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSifremiUnuttumMouseClicked
       SifreYenilemeGui sifreYenileme = new SifreYenilemeGui();
       sifreYenileme.getTextEskiSifre().setEnabled(false);
       sifreYenileme.getTextEskiSifre().setVisible(false);
       sifreYenileme.getlblEskiSifre().setVisible(false);
        ActionAyarlari.setVisible(this,sifreYenileme);
    }//GEN-LAST:event_lblSifremiUnuttumMouseClicked

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
            java.util.logging.Logger.getLogger(GirisGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBasvur;
    private javax.swing.JButton btnGiris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblSifremiUnuttum;
    private javax.swing.JPanel panelGirisEkrani;
    private javax.swing.JTextField textKimlik;
    private javax.swing.JPasswordField textSifre;
    // End of variables declaration//GEN-END:variables

   
}
