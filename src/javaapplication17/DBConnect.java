
package javaapplication17;


import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//this Class for Database Connection
class DBConnect {
 public static Connection getConnection(){
     Connection con = null;
     try{
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/mydb1","root", "password");
         
     }catch(Exception ex)
     {
         System.out.println(ex.getMessage());
     }
    return con; 
 
 
 }   


}

