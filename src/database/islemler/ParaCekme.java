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
public class ParaCekme  extends DbConnection implements IBilgiKontrol{
    
    private int cekilecekMiktar = 0;
 public boolean paraCekildimi(){
        if (this.bilgilerGecerlimi()) {
            String sql = "update kullanici_bakiye "
                    + "set bakiye =bakiye - '"+this.cekilecekMiktar+"' "
                    + "where "
                    + "kullaniciId = '"+getHesapBilgileri().getKullaniciId()+"'";
            try {
                super.statement = super.connection.createStatement();
                super.statement.executeUpdate(sql);
                getHesapBilgileri().setBakiye(getHesapBilgileri().getBakiye() - this.cekilecekMiktar);
            } catch (Exception e) {
            }
         return true;
     }else{
            return false;
        }
    }
    @Override
    public boolean bilgilerGecerlimi() {
        return !(this.cekilecekMiktar == 0
                || getHesapBilgileri().getBakiye() < this.cekilecekMiktar);
    }

    @Override
    public HesapBilgileri getHesapBilgileri(){
        return HesapBilgileri.getInstance();
    }

    public int getCekilecekMiktar() {
        return cekilecekMiktar;
    }

    public void setCekilecekMiktar(int cekilecekMiktar) {
        this.cekilecekMiktar = cekilecekMiktar;
    }
    
    
}
