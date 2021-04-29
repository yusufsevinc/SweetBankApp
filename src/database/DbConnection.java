/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sevinc
 */
public class DbConnection {
    
    private final String host = "localhost";
    private final String port = "3306";
    private final String veritabaniAdi = "sweetbank";
    private final String user = "root";
    private final String password = "";    

    protected Connection connection = null;
    protected Statement statement = null;

    public DbConnection() {
    
       String url = "jdbc:mysql://"+this.host+":"+this.port+"/"+this.veritabaniAdi;
        try {
            this.connection = DriverManager.getConnection(url, user, password);
            System.out.println("Bağlantı başarılı....");
        } catch (SQLException e) {
            errorException(e.getMessage(),e.getErrorCode());
            System.out.println("Bağlantı başarısız....");
        }
        
    }//CONSTRUCTOR
    
    public static void errorException(String exception ){
        System.out.println("Hata : " +exception );
    
    }
     public static void errorException(String exception ,int errorCode ){
        System.err.println("Hata : " +exception );
    System.err.println("Hata Kodu : " +errorCode );
    }
    
    
}//CLASS
