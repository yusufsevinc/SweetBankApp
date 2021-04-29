/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.islemler;

import database.DbVeri;
import database.IBilgiKontrol;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sevinc
 */
public class HesapBilgileri extends DbVeri implements IBilgiKontrol {

    private static HesapBilgileri hesapBilgileri = null;

    public static HesapBilgileri getInstance() {
        if (hesapBilgileri == null) {
            hesapBilgileri = new HesapBilgileri();

        }
        return hesapBilgileri;
    }

    public void girisYap(String musteriNo) {
        this.kullaniciAl(musteriNo);
        this.bakiyeAl();
        this.faturalriAl();
    }

    @Override
    public boolean bilgilerGecerlimi() {
        return !(super.kullaniciId == 0);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void kullaniciAl(String musteriNo) {
        String sql = "Select * from kullanicilar WHERE "
                + "tcNo = '" + musteriNo + "'"
                + " OR "
                + "musteriNo = '" + musteriNo + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                super.kullaniciId = rs.getInt("kullaniciId");
                super.adSoyad = rs.getNString("adSoyad");
                super.tcNo = rs.getNString("tcNo");
                super.telNo = rs.getNString("telNo");
                super.musteriNo = rs.getNString("musteriNO");

            }
        } catch (Exception e) {
        }

    }

    private void bakiyeAl() {
        if (this.bilgilerGecerlimi()) {
            String sql = "select * from kullanici_bakiye "
                    + " where "
                    + "kullaniciId = '" + super.getKullaniciId() + "'";
            try {
                super.statement = super.connection.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                    super.bakiye = rs.getDouble("bakiye");

                }
            } catch (SQLException ex) {
                Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private void faturalriAl() {
        if (this.bilgilerGecerlimi()) {
            String sql = "select * from kullanici_faturalar "
                    + "where "
                    + "kullaniciId = '" + super.getKullaniciId() + "'";
            try {
                super.statement = super.connection.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                    super.elektrikFaturasi = rs.getDouble("elektrik");
                    super.suFaturasi = rs.getDouble("su");
                    super.dogalgazFaturasi = rs.getDouble("dogalgaz");
                    super.internetFaturasi = rs.getDouble("internet");

                }
            } catch (SQLException ex) {
                Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
