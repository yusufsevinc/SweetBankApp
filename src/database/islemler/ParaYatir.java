/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.islemler;

import database.DbConnection;
import database.IBilgiKontrol;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParaYatir extends DbConnection implements IBilgiKontrol {

    private int yatirilacakMiktar = 0;

    public int getYatirilacakMiktar() {
        return yatirilacakMiktar;
    }

    public void setYatirilacakMiktar(int yatirilacakMiktar) {
        this.yatirilacakMiktar = yatirilacakMiktar;
    }

    public boolean paraYatirildimi() {
        if (bilgilerGecerlimi()) {
            String sql = "update kullanici_bakiye set bakiye = bakiye + '" + this.yatirilacakMiktar + "' "
                    + "where "
                    + "kullaniciId = '" + getHesapBilgileri().getKullaniciId() + "'";
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(sql);
                getHesapBilgileri().setBakiye(getHesapBilgileri().getBakiye() + yatirilacakMiktar);

            } catch (SQLException ex) {
                Logger.getLogger(ParaYatir.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;

        }
        return false;
    }

    @Override
    public boolean bilgilerGecerlimi() {
        return !(this.yatirilacakMiktar < 0
                || this.yatirilacakMiktar == 0);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

}
