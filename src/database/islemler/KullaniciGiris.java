/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.islemler;

import database.DbConnection;
import database.IBilgiKontrol;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sevinc
 */
public class KullaniciGiris extends DbConnection implements IBilgiKontrol {

    private String musteriNo = null;
    private String musteriSifre = null;

    public boolean girisBilgileriKontrol() {
        if (bilgilerGecerlimi()) {
            if (girisBasarilimi()) {
                this.getHesapBilgileri().girisYap(musteriNo);
                return true;
            } else {
                return false;
            }

        }
        return false;
    }

    private boolean girisBasarilimi() {
        String sql = "SELECT tcNo , musteriNo,sifre from kullanicilar "
                + "where (tcNo = '" + this.musteriNo + "'"
                + " OR "
                + "musteriNo = '" + this.musteriNo + "')"
                + "AND"
                + " sifre = '" + this.musteriSifre + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(KullaniciGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean bilgilerGecerlimi() {
        return !(this.musteriNo == null
                || this.musteriSifre == null);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
return HesapBilgileri.getInstance();
        }

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public String getMusteriSifre() {
        return musteriSifre;
    }

    public void setMusteriSifre(String musteriSifre) {
        this.musteriSifre = musteriSifre;
    }

}
