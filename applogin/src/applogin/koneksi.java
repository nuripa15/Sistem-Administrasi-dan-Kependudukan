package applogin;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmad Nuripa
 */
public class koneksi {
    private Connection koneksi;
    public Connection connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil Koneksi");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Gagal Koneksi "+ cnfe);
        }
        String url = "jdbc:mysql://localhost:3306/basisdata";
        try {
            koneksi = DriverManager.getConnection(url, "root","");
            System.out.println("Database Berhasil Tersambung");
        } catch (SQLException se) {
            System.out.println("Tidak ada database "+se);
        }
        return koneksi;
    }
}
