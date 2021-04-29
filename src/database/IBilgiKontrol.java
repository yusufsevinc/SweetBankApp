
package database;

import database.islemler.HesapBilgileri;

public interface IBilgiKontrol {
    public boolean bilgilerGecerlimi();
    
    
    public HesapBilgileri getHesapBilgileri();
    
}
