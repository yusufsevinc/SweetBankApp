package database.islemler;

import database.DbConnection;
import database.IBilgiKontrol;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HavaleIslemleri extends DbConnection implements IBilgiKontrol {

    private int gonderilenMiktar = 0;
    private String musteriNo = null;

    public boolean havaleGerceklestimi() {
        if (bilgilerGecerlimi()) {
            String sql = "update kullanici_bakiye set "
                    + "bakiye = bakiye - '" + gonderilenMiktar + "' "
                    + "where kullaniciId = '" + getHesapBilgileri().getKullaniciId() + "'";
            String sql2 = "update kullanici_bakiye set "
                    + "bakiye = bakiye + '" + gonderilenMiktar + "' "
                    + "where musteriNo = '" + this.musteriNo + "'";

            try {
                super.statement = super.connection.createStatement();
                if (statement.executeUpdate(sql2) == 1) {
                    statement.executeLargeUpdate(sql);
                    getHesapBilgileri().setBakiye(getHesapBilgileri().getBakiye() - gonderilenMiktar);
                    return true;
                } else {
                    return false;
                }
            } catch (SQLException ex) {
                Logger.getLogger(HavaleIslemleri.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }

        }
        return false;
    }

    @Override
    public boolean bilgilerGecerlimi() {
        return !(this.gonderilenMiktar == 0
                || this.musteriNo == null
                || this.gonderilenMiktar > this.getHesapBilgileri().getBakiye()
                || this.musteriNo.equals(getHesapBilgileri().getMusteriNo()));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public int getGonderilenMiktar() {
        return gonderilenMiktar;
    }

    public void setGonderilenMiktar(int gonderilenMiktar) {
        this.gonderilenMiktar = gonderilenMiktar;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }
}
