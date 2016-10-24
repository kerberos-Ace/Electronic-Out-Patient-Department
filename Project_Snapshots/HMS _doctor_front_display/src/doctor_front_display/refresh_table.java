/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor_front_display;


import static doctor_front_display.Login.doctor_id;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anshul
 */
public class refresh_table {
    public refresh_table( ) {}
    
    public refresh_table( DefaultTableModel model,int slot_value) {
        
        
        
               try
{  
    // int slot_value=0;
        Calendar currenttime = Calendar.getInstance();
   Date sqldate = new Date((currenttime.getTime()).getTime());
  //	SimpleDateFormat dateFormat = new SimpleDateFormat(" aa");
//String formattedDate = dateFormat.format(new java.util.Date()).toString();
//if(formattedDate.equals(" AM")){
//slot_value=1;
//}
//else if(formattedDate.equals(" PM")){
//slot_value=2;

//}
        
      
    Class.forName("com.mysql.jdbc.Driver");//loads driver
      
String url11="jdbc:mysql://localhost/hms?user=root&password=india@123";
Connection cn; 
        
            cn = DriverManager.getConnection(url11); //connection established
      
String sql = "select * from myview where dr='"+doctor_id+"' and app_date='"+sqldate+"' and slot='"+slot_value+"' and status='0' ";
//String sql = "select * from myview where dr='"+doctor_id+"' and  status='0' ";
PreparedStatement ps = cn.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
model.getDataVector().removeAllElements();
int counter_start=0;
            model.fireTableDataChanged();
while(rs.next())
{
            
               counter_start++;
                    model.insertRow(model.getRowCount(),new Object[]{counter_start,rs.getInt(2),rs.getString(14),rs.getString(15),rs.getInt(1),rs.getString(9)});


}







        }
catch(Exception e)
{
JOptionPane.showMessageDialog(null, e.getMessage());
}
  
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
     public void  Doctor_Patient_Display( DefaultTableModel model) {
    
     
     
     
     
     
     
       int slot_value=0;
         Calendar currenttime = Calendar.getInstance();
    Date sqldate = new Date((currenttime.getTime()).getTime());
  	SimpleDateFormat dateFormat = new SimpleDateFormat(" aa");
String formattedDate = dateFormat.format(new java.util.Date()).toString();
if(formattedDate.equals(" AM")){
slot_value=1;
}
else if(formattedDate.equals(" PM")){
slot_value=2;

}
        
        try
{  
    Class.forName("com.mysql.jdbc.Driver");//loads driver
      
String url11="jdbc:mysql://localhost/hms?user=root&password=india@123";
Connection cn; 
        
            cn = DriverManager.getConnection(url11); //connection established
      model.getDataVector().removeAllElements();

            model.fireTableDataChanged();
             
//String sql = "select * from myview where dr='"+doctor_id+"' and  status='1' ";
String sql = "select * from myview where dr='"+doctor_id+"' and app_date='"+sqldate+"' and slot='"+slot_value+"' and status='0' ";
PreparedStatement ps = cn.prepareStatement(sql);
ResultSet rs = ps.executeQuery();

while(rs.next())
{
              
               
                    model.insertRow(model.getRowCount(),new Object[]{rs.getInt(2),rs.getString(14),rs.getString(15),rs.getInt(1),rs.getString(9)});


}







        }
catch(Exception e)
{
JOptionPane.showMessageDialog(null, e.getMessage());
}
        
        
        
     
     
     }
     
    
}
