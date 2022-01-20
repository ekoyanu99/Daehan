/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ekoya
 */
public class ConnectionProvider {
    static Connection con;
    public static Connection getConnection(){
        //Penanganan exception jika gagal terhubung dengan database
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                    + "daehan","root","");
            System.out.println("Koneksi berhasil");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error : Gagal Terhubung ke "
                    + "Database");
            System.exit(0);
        }
        return con;
    }
}
