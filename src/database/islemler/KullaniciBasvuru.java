/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.islemler;

import database.DbConnection;
import database.IBilgiKontrol;
import gui.ayarlar.TextAyarlari;
import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sevinc
 */
public class KullaniciBasvuru extends DbConnection implements IBilgiKontrol {

    //başvuru bilgileri
    private String adSoyad = null, tcNo = null, telNo = null;
    private String guvenlikSorusu = null, guvenlikCevap = null;

    //sistem tarafından verilecek bilgiler
    private String musteriNo = null;
    private String sifre = null;

    @Override
    public boolean bilgilerGecerlimi() {
        return !(this.adSoyad == null
                || this.tcNo == null
                || this.telNo == null
                || this.guvenlikSorusu == null
                || this.guvenlikCevap == null
                || this.musteriNo == null
                || this.sifre == null
                || TextAyarlari.uzunlukKontrol(11, this.tcNo)
                || TextAyarlari.uzunlukKontrol(11, telNo));
    }

    public boolean basvuruOnaylandimi() {
        if (this.bilgilerGecerlimi()) {
            if (this.tcNoTablodaVarmi()) {
                return false;

            } else {
                this.basvuruyuOnayla();
                return true;
            }
        } else {
            return false;
        }
    }

    private boolean tcNoTablodaVarmi() {
        String sql = "SELECT tcNo from kullanicilar WHERE tcNo = '" + this.tcNo + "'";

        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                return true;

            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciBasvuru.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    private void basvuruyuOnayla() {
        String sql = "INSERT INTO kullanicilar (adSoyad , tcNo, telNo,"
                + "guvenlikSorusu,guvenlikCevap,musteriNo,sifre) values"
                + "('" + this.adSoyad.toUpperCase() + "','" + this.tcNo + "','" + this.telNo + "','" + this.guvenlikSorusu + "','" + this.guvenlikCevap + "','" + this.musteriNo + "','" + this.sifre + "')";
        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciBasvuru.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean musteriNoTablodaVarmi() {
        String sql = "SELECT musteriNo from kullanicilar WHERE musteriNo = '" + this.musteriNo + "'";

        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                return true;

            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciBasvuru.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getGuvenlikSorusu() {
        return guvenlikSorusu;
    }

    public void setGuvenlikSorusu(String guvenlikSorusu) {
        this.guvenlikSorusu = guvenlikSorusu;
    }

    public String getGuvenlikCevap() {
        return guvenlikCevap;
    }

    public void setGuvenlikCevap(String guvenlikCevap) {
        this.guvenlikCevap = guvenlikCevap;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

}
