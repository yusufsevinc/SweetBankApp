/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.IBilgiKontrol;
import database.islemler.HesapBilgileri;
import database.islemler.KullaniciBasvuru;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;
import javax.swing.JOptionPane;
import gui.ayarlar.IDuzenleyici;

/**
 *
 * @author sevinc
 */
public class BasvuruGui extends javax.swing.JFrame implements IDuzenleyici, IBilgiKontrol {

    private KullaniciBasvuru kullaniciBasvuru;

    public BasvuruGui() {
        initComponents();
        getEdits();
    }

    @Override
    public boolean bilgilerGecerlimi() {
        return TextAyarlari.textAlanDolumKontrol(jPanel1);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
return HesapBilgileri.getInstance();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        jPanel1.setFocusable(true);
        TextAyarlari.sadeceSayiGir(textTc);
        TextAyarlari.sadeceSayiGir(textTelefon);
        TextAyarlari.sadeceHarfGir(textAdSoyad);
        TextAyarlari.karakterSayiKontrol(textTc, 11);
        TextAyarlari.karakterSayiKontrol(textTelefon, 11);

    }

    public KullaniciBasvuru getKullaniciBasvuru() {
        if (this.kullaniciBasvuru == null) {
            kullaniciBasvuru = new KullaniciBasvuru();

        }
        return kullaniciBasvuru;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textAdSoyad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textTc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textTelefon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        boxSoru = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        textCevap = new javax.swing.JTextField();
        btnUyeOl = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Ad Soyad: ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank Başvuru Ekranı");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Kişisel Bilgiler");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Ad Soyad: ");

        textAdSoyad.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("T.C. Kimlik No: ");

        textTc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Telefon No: ");

        textTelefon.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Güvenlik Bilgileri");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Cevap: ");

        boxSoru.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        boxSoru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Evcil hayvanınız adı nedir ?", "Ensevdiğiniz nesne nedir ?", "İlkokul öğretmeninizin soyadı nedir ?", "Yaşamak istediğiniz yer neresidir ?", "Rasgele cümle girin (önerilir)." }));
        boxSoru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boxSoru.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxSoruİtemStateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Güvenlik Sorusu: ");

        textCevap.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        textCevap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textCevapMouseExited(evt);
            }
        });

        btnUyeOl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnUyeOl.setText("Üye Ol");
        btnUyeOl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUyeOl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUyeOlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUyeOlMouseExited(evt);
            }
        });
        btnUyeOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUyeOlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnUyeOl, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCevap, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(textTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(boxSoru, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(textTc, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(textAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(393, 393, 393))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(393, 393, 393))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {boxSoru, textAdSoyad, textCevap, textTc, textTelefon});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(textAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(textTc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jLabel7)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxSoru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCevap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnUyeOl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, jLabel4, textAdSoyad, textTc});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {boxSoru, jLabel6, jLabel8, textCevap, textTelefon});

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

    private void boxSoruİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxSoruİtemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_boxSoruİtemStateChanged

    private void btnUyeOlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUyeOlMouseEntered
        // TODO add your handling code here:
        ButtonAyarlari.setBg(btnUyeOl, Color.cyan);
    }//GEN-LAST:event_btnUyeOlMouseEntered

    private void textCevapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCevapMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_textCevapMouseExited

    private void btnUyeOlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUyeOlMouseExited
        ButtonAyarlari.setOriginColor(btnUyeOl);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUyeOlMouseExited

    private void btnUyeOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUyeOlActionPerformed
        // TODO add your handling code here:
        if (bilgilerGecerlimi()) {
            this.basvuruGerceklestir();
           
        } else {
            Dialogs.bosOlamazMesajGoster(this);
        }

    }//GEN-LAST:event_btnUyeOlActionPerformed
    private void basvuruGerceklestir() {
        this.getKullaniciBasvuru().setAdSoyad(this.textAdSoyad.getText());
        this.getKullaniciBasvuru().setTcNo(this.textTc.getText());
        this.getKullaniciBasvuru().setTelNo(this.textTelefon.getText());

        this.getKullaniciBasvuru().setGuvenlikSorusu(String.valueOf(this.boxSoru.getSelectedIndex()));
        this.getKullaniciBasvuru().setGuvenlikCevap(textCevap.getText().trim());
        this.getKullaniciBasvuru().setMusteriNo(musteriNoAl());
        this.getKullaniciBasvuru().setSifre(musteriSifreAl());
        
        if(this.getKullaniciBasvuru().basvuruOnaylandimi()){
           Dialogs.ozelMesajGoster(this,"Bşvurunuz kabul edilmiştir...\n"
                    + "Müşteri Numaranız : " + kullaniciBasvuru.getMusteriNo() +"\n"
                            + "Müşteri Şifreniz : " + kullaniciBasvuru.getSifre()); 
             ActionAyarlari.setVisible(this, new GirisGui());
        }else{
            Dialogs.ozelMesajGoster(this,"Bşvurunuz kabul edilmemiştir...\n"
                    + "Bilgilerinizi kontrol ediniz...");
        }
        
    }
    private String musteriNoAl(){
        String musteriNo;
        do {            
          musteriNo = String.valueOf(1000000 + (int) (Math.random() * 9000000));
        } while (this.getKullaniciBasvuru().musteriNoTablodaVarmi());
        return musteriNo;
    }
    
    private String musteriSifreAl(){
        String sifre;
        sifre = String.valueOf(1000 + (int) (Math.random() * 9000));
        return sifre;
    }

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
            java.util.logging.Logger.getLogger(BasvuruGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasvuruGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasvuruGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasvuruGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasvuruGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxSoru;
    private javax.swing.JButton btnUyeOl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField textAdSoyad;
    private javax.swing.JTextField textCevap;
    private javax.swing.JTextField textTc;
    private javax.swing.JTextField textTelefon;
    // End of variables declaration//GEN-END:variables
}
