/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.islemler;

import database.DbConnection;
import database.IBilgiKontrol;

/**
 *
 * @author sevinc
 */
public class Ayarlar extends DbConnection implements IBilgiKontrol {

    private String telNo = null;

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    @Override
    public boolean bilgilerGecerlimi() {
        return !(this.getTelNo().equals(getHesapBilgileri().getTelNo()));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public boolean telGuncelendimi() {
        if (bilgilerGecerlimi()) {
            String sql = "update kullanicilar set telNo = '" + getTelNo() + "' "
                    + "where "
                    + "kullaniciId = '" + getHesapBilgileri().getKullaniciId() + "'";
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(sql);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        } else {
            return false;
        }
    }//telGuncellendimi

}//class
