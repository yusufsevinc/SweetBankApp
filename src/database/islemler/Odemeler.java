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
public class Odemeler extends DbConnection implements IBilgiKontrol {
      
    private double odencekTutar = 0;
    private String faturaTuru = "elektrik";

    public double getOdencekTutar() {
        return odencekTutar;
    }

    public void setOdencekTutar(double odencekTutar) {
        this.odencekTutar = odencekTutar;
    }

    public String getFaturaTuru() {
        return faturaTuru;
    }

    public void setFaturaTuru(String faturaTuru) {
        this.faturaTuru = faturaTuru;
    }
    
    
    @Override
    public boolean bilgilerGecerlimi() {
        
     
        return !(this.getFaturaTuru() == null ||
                this.getOdencekTutar() == 0);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();

    }
    
    public boolean odemeYapildimi(){
        if (bilgilerGecerlimi()) {
            
           String sql = "update kullanici_bakiye set bakiye  = bakiye - '"+this.getOdencekTutar()+"'"
                   + " where "
                   + "kullaniciId = '"+getHesapBilgileri().getKullaniciId()+"'";
           String sql2 = "update kullanici_faturalar set "+this.getFaturaTuru()+" = 0 "
                   + "where "
                   + "kullaniciId = '"+getHesapBilgileri().getKullaniciId()+"'" ;
           
            try {
                super.statement = super.connection.createStatement();
                int row = statement.executeUpdate(sql2);
                if (row == 1) {
                    statement.executeUpdate(sql);
                    return true;
                }
            } catch (Exception e) {
                return false;
            }
            
           
            
        }
        
        return false;
    }

}
