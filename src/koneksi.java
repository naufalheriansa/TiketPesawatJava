/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ApungN
 */
public class koneksi {
    private static Connection mysqlconfig;
    private static Statement st=null;
    Connection con;
    Statement stm;
    
    public static Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/travelgeh";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
        } catch (Exception e){
            System.err.println("Koneksi gagal "+e.getMessage());
        }
        return mysqlconfig;
    }
    
    public void config(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/travelgeh", "root", "");
            stm = con.createStatement();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "koneksi gagal"+e.getMessage());
        }
    }

}
