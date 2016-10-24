/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anshul
 */
public class rtrnd_name {
static int counterq;

public int _String(int isq,int name,int name1,java.sql.Date name2){
       int temp=0;  
       
    try{    
     Class.forName("com.mysql.jdbc.Driver");//loads driver
      
String url1="jdbc:mysql://localhost/hms?user=root&password=india@123";
Connection cn1; 
       cn1 = DriverManager.getConnection(url1); //connection established
      
String q1="";
if(isq==1){
q1="select count(*)  from appointment where c_id = '"+name+"' and dr='"+name1+"' and app_date ='"+name2+"' " ;}
PreparedStatement st1=cn1.prepareStatement(q1);

ResultSet rs=st1.executeQuery();

while(rs.next())
{
    
   
        temp=(rs.getInt(1));
        
    }} catch(Exception e){
    
        JOptionPane.showMessageDialog(null,e.getMessage());
    }   return temp;
}
    
    


/*
public int Registration_String(int isq,String name,int name1,java.sql.Date name2){
       int temp=0;  
    try{    
     Class.forName("com.mysql.jdbc.Driver");//loads driver
      
String url1="jdbc:mysql://localhost/hms?user=root&password=india@123";
Connection cn1; 
       cn1 = DriverManager.getConnection(url1); //connection established
      
String q1="";
if(isq==1){
q1="select count(*)  from appointment where c_id = '"+name+"' and dr='"+name1+"' and app_date ='"+name2+"' " ;}
PreparedStatement st1=cn1.prepareStatement(q1);

ResultSet rs=st1.executeQuery();

while(rs.next())
{
    
   
        temp=(rs.getInt(1));
        
    }} catch(Exception e){
    
        JOptionPane.showMessageDialog(null,"tt"+ e.getMessage());
    }   return temp;
}
    

    
    */
    
    
    
    
    
    public String doc_String(String name,String t_name,String c_name,String d_id){
        String temp="";  
    try{    
     Class.forName("com.mysql.jdbc.Driver");//loads driver
      
String url1="jdbc:mysql://localhost/hms?user=root&password=india@123";
Connection cn1; 
       cn1 = DriverManager.getConnection(url1); //connection established
      


String q1="select "+d_id+" from "+t_name+" where "+c_name+" = '"+name+"' " ;
PreparedStatement st1=cn1.prepareStatement(q1);

ResultSet rs=st1.executeQuery();

if(rs.next())
{
        temp=(rs.getString(1));
        
    }} catch(Exception e){
    
        JOptionPane.showMessageDialog(null, e.getMessage());
    }   return temp;
}
    
    
    
    
    
    
    
    
    
    
    
    

    public int doc_name(String name,String t_name,String c_name,String d_id,int name2){
    int temp=0;
    try{    
     Class.forName("com.mysql.jdbc.Driver");//loads driver
      
String url1="jdbc:mysql://localhost/hms?user=root&password=india@123";
Connection cn1; 
       cn1 = DriverManager.getConnection(url1); //connection established
   String q1="";   
if(name2!=0){q1="select "+d_id+" from "+t_name+" where "+c_name+" = '"+name2+"' " ;
}
else{
q1="select "+d_id+" from "+t_name+" where "+c_name+" = '"+name+"' " ;}
PreparedStatement st1=cn1.prepareStatement(q1);

ResultSet rs=st1.executeQuery();

if(rs.next())
{
        temp=(rs.getInt(1));
        
    }} catch(Exception e){
    
        JOptionPane.showMessageDialog(null, e.getMessage());
    }   return temp;
}


 public String client_name(int id,String t_name,String c_name,String cc){
     String  temp1=""; 
    try{    
     Class.forName("com.mysql.jdbc.Driver");//loads driver
      
String url1="jdbc:mysql://localhost/hms?user=root&password=india@123";
Connection cn1; 
       cn1 = DriverManager.getConnection(url1); //connection established
  


String q1="select " +cc+ " from "+t_name+" where "+c_name+" = '"+id+"' " ;
PreparedStatement st1=cn1.prepareStatement(q1);

ResultSet rs=st1.executeQuery();

if(rs.next())
{
        temp1=(rs.getString(1));
        
    }} catch(Exception e){
    
        JOptionPane.showMessageDialog(null, e.getMessage());
    }   return temp1;



 }


public  void client_date(int c_id,int d_id,DefaultTableModel dt,int IIDD){




    try{    
     Class.forName("com.mysql.jdbc.Driver");//loads driver
      
String url1="jdbc:mysql://localhost/hms?user=root&password=india@123";
Connection cn1; 
       cn1 = DriverManager.getConnection(url1); //connection established
  DateFormat d=new SimpleDateFormat("yyyy-MM-dd");
        Calendar c=Calendar.getInstance();
      

  
String q1="select datediff('"+d.format(c.getTimeInMillis())+"',app_date),Validity,dept,app_date,auto_id  from appointment where auto_id = '"+IIDD+"' and c_id = '"+c_id+"' and dr='"+d_id+"' and a_mode='new'  " ;
PreparedStatement st1=cn1.prepareStatement(q1);

ResultSet rs=st1.executeQuery();
 
if (rs.next())
    
{// JOptionPane.showMessageDialog(null,"differen"+rs.getInt(1));     
    if(rs.getInt(1)>=0&&rs.getInt(2)>=rs.getInt(1))
{

counterq++;
 String untildate=rs.getString(4);  
 //JOptionPane.showMessageDialog(null,untildate);
SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd" );   
Calendar cal = Calendar.getInstance();    
        try {    
            cal.setTime( dateFormat.parse(untildate));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
          
        }
cal.add( Calendar.DATE, rs.getInt(2) );    
String convertedDate=dateFormat.format(cal.getTime());  
//JOptionPane.showMessageDialog(null,"app_date"+rs.getString(4)  );

    rtrnd_name rtr =new rtrnd_name();
   
    
    dt.addRow(new Object[]{counterq,rs.getInt(5),c_id,rtr.client_name(d_id,"doctor", "d_id","d_name"),rs.getString(3),rs.getDate(4),convertedDate});
    Search.arr123.add(Integer.toString(d_id)+":"+convertedDate);
  //JOptionPane.showMessageDialog(null,"here i ma"+Integer.toString(d_id)+":"+convertedDate); 
    
    
    

} else {
    JOptionPane.showMessageDialog(null,"not found");}        
    }} catch(Exception e){
       JOptionPane.showMessageDialog(null,e.getMessage());}      
        
     
     
    } 
         






 public int return_date(int id,int d_id,java.sql.Date now){
    int cvc=0; 
    try{    
     Class.forName("com.mysql.jdbc.Driver");//loads driver
      
String url1="jdbc:mysql://localhost/hms?user=root&password=india@123";
Connection cn1; 
       cn1 = DriverManager.getConnection(url1); //connection established
  


String q1="select app_date ,validity from appointment where c_id = "+id+" and dr="+d_id+" and a_mode='new' order by app_date desc " ;
PreparedStatement st1=cn1.prepareStatement(q1);

ResultSet rs=st1.executeQuery();

while(rs.next())
{
       
    
    
 String untildate=rs.getString(1);  
// JOptionPane.showMessageDialog(null,untildate);
SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd" );   
Calendar cal = Calendar.getInstance();    
        try {    
            cal.setTime( dateFormat.parse(untildate));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
          
        }
cal.add( Calendar.DATE, rs.getInt(2) );    
String convertedDate=dateFormat.format(cal.getTime());  
    
    


SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date parsed=  format.parse(convertedDate);
      
        java.sql.Date sql = new Date(parsed.getTime());
     
  
  
        
	 if(   ((now.before(sql)) || (now.compareTo(sql)==0) )&& ((now.after(rs.getDate(1))) ||(now.compareTo(rs.getDate(1))==0)) ) {
          
         cvc=1;
          // JOptionPane.showMessageDialog(null,"bha"+cvc);
         

         }else{
         cvc=0;}


    
        
    }} catch(Exception e){
    
        JOptionPane.showMessageDialog(null, e.getMessage());
    }   return cvc;



 }
 
 
 
 public String return_date(int id){
   String convertedDate="";
    try{    
     Class.forName("com.mysql.jdbc.Driver");//loads driver
      
String url1="jdbc:mysql://localhost/hms?user=root&password=india@123";
Connection cn1; 
       cn1 = DriverManager.getConnection(url1); //connection established
  


String q1="select app_date,validity  from appointment where auto_id='"+id+"' " ;
PreparedStatement st1=cn1.prepareStatement(q1);

ResultSet rs=st1.executeQuery();

while(rs.next())
{
       
    
    
 String untildate=rs.getString(1);  
 
SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd" );   
Calendar cal = Calendar.getInstance();    
          
            cal.setTime( dateFormat.parse(untildate));
        
cal.add( Calendar.DATE, rs.getInt(2) );    
 convertedDate=dateFormat.format(cal.getTime());  
    
    
}

    } catch (Exception e){
        
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
 
 return convertedDate;
         
         }


}










    

