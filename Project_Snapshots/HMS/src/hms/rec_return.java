/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Anshul
 */
public class rec_return {
    int count;
    int rec_ret(int client,int tmp_slot,int temp2,java.sql.Date date)
    {
    
    
    
    try {

                    Class.forName("com.mysql.jdbc.Driver");//loads driver

                    String url2="jdbc:mysql://localhost/hms?user=root&password=india@123";
                    Connection cn2;

                    cn2 = DriverManager.getConnection(url2); //connection established

                //JOptionPane.showMessageDialog(null, tmp_slot+"and"+temp2+"and"+date);

                    String q2="select count(*) from appointment where  c_id='"+client+"' and slot='"+tmp_slot+"' and dr='"+temp2+"' and app_date='"+date+"'";

                    PreparedStatement st2=cn2.prepareStatement(q2);

                    ResultSet rs2=st2.executeQuery();

                    if(rs2.next())
                    {
                        count=rs2.getInt(1);

                    } cn2.close();}
                    catch(Exception ee){
                        JOptionPane.showMessageDialog(null, ee.getMessage());
                    }

    return count;
    
    }
}
