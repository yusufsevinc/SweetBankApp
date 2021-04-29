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
public class SifreYenileme extends DbConnection implements IBilgiKontrol {

    private String tcNo = null;
    private String telNo = null;
    private String guvenlikSoruCevap = null;
    private String yeniSifre = null;
    private String eskiSifre = null;
    private String yeniSifreTekrar = null;

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

    public String getGuvenlikSoruCevap() {
        return guvenlikSoruCevap;
    }

    public void setGuvenlikSoruCevap(String guvenlikSoruCevap) {
        this.guvenlikSoruCevap = guvenlikSoruCevap;
    }

    public String getYeniSifre() {
        return yeniSifre;
    }

    public void setYeniSifre(String yeniSifre) {
        this.yeniSifre = yeniSifre;
    }

    public String getEskiSifre() {
        return eskiSifre;
    }

    public void setEskiSifre(String eskiSifre) {
        this.eskiSifre = eskiSifre;
    }

    public String getYeniSifreTekrar() {
        return yeniSifreTekrar;
    }

    public void setYeniSifreTekrar(String yeniSifreTekrar) {
        this.yeniSifreTekrar = yeniSifreTekrar;
    }

    @Override
    public boolean bilgilerGecerlimi() {
        return !(this.getGuvenlikSoruCevap().equals(null)
                || this.getTcNo().equals(null)
                || this.getTelNo().equals(null)
                || this.getYeniSifre().equals(null)
                || this.getYeniSifreTekrar().equals(null)
                || (!this.getYeniSifre().equals(this.getYeniSifreTekrar())));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    private boolean bilgiKontrol() {
        if (bilgilerGecerlimi()) {
            String sql = "select tcNo from kullanicilar where "
                    + "tcNo = '" + this.getTcNo() + "' and "
                    + "telNo = '" + this.getTelNo() + "' and "
                    + "guvenlikCevap = '" + this.getGuvenlikSoruCevap() + "' ";

            if (this.getEskiSifre() != null) {
                sql += " and sifre = '" + this.getEskiSifre() + "' ";

            }
            try {
                super.statement = super.connection.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                    return true;

                }
            } catch (SQLException ex) {
                Logger.getLogger(SifreYenileme.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }

        }
        return false;
    }

    public boolean sifreDegistimi() {
        if (bilgiKontrol()) {
            String sql = "update kullanicilar set sifre = '" + this.getYeniSifre() + "' "
                    + "where tcNo = '" + this.getTcNo() + "' ";
            try {
                super.statement = super.connection.createStatement();
                super.statement.executeUpdate(sql);
                return true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        } else {
            return false;
        }
    }

}
