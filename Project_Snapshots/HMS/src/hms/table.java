/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Anshul
 */
public class table {
    
    JTable table=new JTable();
    
 int selectedRow;
 String stt;
  DefaultTableModel dt=new DefaultTableModel();
  table (JPanel p,String tablename,String [] cnames){
    
    table.setEnabled(false);
     dt.setColumnIdentifiers(cnames);


 table.setModel(dt);
 table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
table.setFillsViewportHeight(true);
JScrollPane scroll = new JScrollPane(table);
scroll.setHorizontalScrollBarPolicy(
JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
scroll.setVerticalScrollBarPolicy(
JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);


try
{
     Class.forName("com.mysql.jdbc.Driver");//loads driver
      
String url1="jdbc:mysql://localhost/hms?user=root&password=india@123";
Connection cn1; 
        
            cn1 = DriverManager.getConnection(url1); //connection established
      


String q1="select * from "+tablename ;
PreparedStatement st1=cn1.prepareStatement(q1);

ResultSet rs=st1.executeQuery();
int count=0;
while(rs.next())
{
count++;

         switch (tablename) {
             case " department":
                 dt.addRow(new Object[]{count,rs.getString(2)});
                 break;
            
         }






}


        table.setBackground(new Color(210,235,245));





        }
catch(ClassNotFoundException | SQLException e)
{
JOptionPane.showMessageDialog(null, e.getMessage());
}
p.add(scroll);
    
    
    }
    
}
