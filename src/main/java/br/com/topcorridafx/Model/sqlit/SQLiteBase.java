///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
package br.com.topcorridafx.Model.sqlit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.sqlite.JDBC;
/**
 *  PedroMarinho pedro.marinho238@gmail.com
 * 
 */
public class SQLiteBase {
 
    protected  Connection conn;
    public Connection open(){
        try {
            try {
                Class.forName("org.sqlite.JDBC");
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
//                System.out.println("erro org.sqlite.JDBC");
//                e.printStackTrace();
            }
            String user = System.getProperty("user.home");
            conn= DriverManager.getConnection("jdbc:sqlite:.TopCorridaFX.sqlite");
            return conn;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
     public void close(){
       
            try {
                 if(conn!=null)
                conn.close();
            } catch (SQLException ex) {
               ex.printStackTrace();
            }
        
    }
}
