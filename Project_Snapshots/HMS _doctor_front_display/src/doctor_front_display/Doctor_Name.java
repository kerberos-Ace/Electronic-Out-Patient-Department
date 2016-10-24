/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor_front_display;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Anshul
 */
public class Doctor_Name {
    
    public String return_name(String display,String table_name,String c_name,int value,JComboBox j)
    { String temp="";
        try{
           Class.forName("com.mysql.jdbc.Driver");//loads driver
                        String url="jdbc:mysql://localhost/hms?user=root&password=india@123";
                        Connection cn=DriverManager.getConnection(url); //connection established

                        String q=" select "+display+" from "+table_name+"  where "+c_name+" = "+value+"";
      
PreparedStatement st1=cn.prepareStatement(q);

ResultSet rs=st1.executeQuery();
j.removeAllItems();
j.addItem("Select");
if(rs.next())
{
        temp=(rs.getString(2));
       if(rs.getString(4).equals("1")){
       
       j.addItem("Morning");
       
       } else if (rs.getString(4).equals("2")){
       
        j.addItem("Evening");
       
       } else if (rs.getString(4).equals("3")){
        j.addItem("Morning");
          j.addItem("Evening");
       }
        
    }} catch(Exception e){
    
        JOptionPane.showMessageDialog(null, e.getMessage());
    }   return temp;
}
    
    
    
   
    
    
}
