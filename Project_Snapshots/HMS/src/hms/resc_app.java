/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import static hms.Entry.identification;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Anshul
 */
public class resc_app extends javax.swing.JInternalFrame {
int check,app,temp,temp2;
      String [] date=new String[50];;
            ArrayList doctor_identification= new ArrayList();
    public resc_app() {
        initComponents();
      
       rtrnd_name rr=new rtrnd_name();
      jTextField1.setText( rr.client_name(Entry.identification," registration "," ID " , " c_name "));
   try {
      
       for(int i=0;i<Search.arr123.size();i++)
       {
         
        String s= (String) Search.arr123.get(i);
        String ss[]=new String[4];
             ss = s.split(":");
            
             
                 
                 doctor_identification.add(Integer.parseInt(ss[0]));
                  
       
        }     
          
            Class.forName("com.mysql.jdbc.Driver");//loads driver
      
String url="jdbc:mysql://localhost/hms?user=root&password=india@123";
Connection cn; 
        
            cn = DriverManager.getConnection(url); //connection established
        
       //  Set uniqueValues = new HashSet(doctor_identification);
            jComboBox2.addItem("Select");
            jComboBox6.addItem("Select");
       for(Object d_i:doctor_identification)
       {
             
       String q="select dept,d_name from doctor where d_id="+d_i+";";
PreparedStatement st=cn.prepareStatement(q);

//JOptionPane.showMessageDialog(null, d_i+"abc1");  
ResultSet rs1=st.executeQuery();
if(rs1.next())
{
    
   ArrayList temp_list =new ArrayList();
  
    for(int iz=0;iz<jComboBox2.getItemCount()-1;iz++)
    {
    temp_list.add(jComboBox2.getItemAt(iz));
    
    }  int index = Collections.binarySearch(temp_list,rs1.getString(1));
    //JOptionPane.showMessageDialog(null, index);
    if(index<0)
    
    {
    jComboBox2.addItem(rs1.getString(1));
    }jComboBox6.addItem(rs1.getString(2));
//JOptionPane.showMessageDialog(null, rs1.getString(1)+"akula");  


}
        
       }
   }
    catch (Exception ex1) {
           JOptionPane.showMessageDialog(null,ex1.getClass());
        }
       
       
       
       
      
          
      
         
  
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jLabel8 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();

        setClosable(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.lightGray), "ALL    FIELDS   ARE    MENDATORY", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 3, 16))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel1.setText("Client's Name");

        jTextField1.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField1.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel4.setText("Appointment Type");

        jLabel9.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel9.setText("slot");

        jLabel7.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel7.setText("Appointment Date");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Manual", "Telephonic" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jButton1.setText("Resch Appoin");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dateChooserCombo1.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));

    jLabel8.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
    jLabel8.setText("Department");

    jComboBox6.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            jComboBox6ItemStateChanged(evt);
        }
    });
    jComboBox6.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBox6ActionPerformed(evt);
        }
    });

    jLabel10.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
    jLabel10.setText("Dr.");

    jComboBox2.setEnabled(false);
    jComboBox2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBox2ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)
                            .addComponent(jTextField1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(141, 141, 141))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))))
            .addGap(20, 20, 20))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBox2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 11, Short.MAX_VALUE))
    );

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

    pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int mcq=0;
           
        // JOptionPane.showMessageDialog(null,"for"+O);
          
         Validation v=new Validation();//JOptionPane.showMessageDialog(null,"if"+O);
        mcq= v.validate_all(jPanel1);
     
       
        if(mcq==0){
            
            
        
        
        
        
        String tempz="";
        String tempx;
        
        
          try {  
    

            Class.forName("com.mysql.jdbc.Driver");//loads driver
      
String url2="jdbc:mysql://localhost/hms?user=root&password=india@123";
Connection cn2; 
        
            cn2 = DriverManager.getConnection(url2); //connection established
      
Calendar cal=dateChooserCombo1.getSelectedDate();


String q2="select count(*) from appointment where slot='"+jComboBox4.getSelectedItem()+"' and dr='"+temp2+"' and app_date='"+new java.sql.Date(cal.getTimeInMillis())+"'";

PreparedStatement st2=cn2.prepareStatement(q2);

ResultSet rs2=st2.executeQuery();

 
if(rs2.next())
{
check=rs2.getInt(1);

} cn2.close();}
        catch(Exception ee){
            JOptionPane.showMessageDialog(null, ee.getMessage());
            }

  if(check<temp)
  {
   
try{
    Class.forName("com.mysql.jdbc.Driver");//loads driver
String url="jdbc:mysql://localhost/hms?user=root&password=india@123";
Connection cn=DriverManager.getConnection(url); //connection established

String q="insert into appointment(c_id,a_type,dr,slot,validity,app_date,fee,app_no,dept,a_mode) values(?,?,?,?,?,?,?,?,?,?)";
PreparedStatement st=cn.prepareStatement(q);
 
st.setInt(1,identification);
 
st.setString(2,(String) jComboBox1.getSelectedItem());
  
st.setInt(3,temp2 );
  
//JOptionPane.showMessageDialog(null, "In");
st.setInt(4, (int) jComboBox4.getSelectedItem());
  //JOptionPane.showMessageDialog(null, "In1");
st.setInt(5,0);
        
 
  app=check;
if(check==0){

app=1;


}
else {app++;}
Calendar cal1=dateChooserCombo1.getSelectedDate();
for(int i=0;i<Search.arr123.size();i++)
       {
           
        String sqw= (String) Search.arr123.get(i);
        String ssqw[]=new String[4];
             ssqw = sqw.split(":");
            
           
                 tempz=ssqw[0];
                 tempx=ssqw[1];
          

if(temp2==Integer.parseInt(tempz)){
      
SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date parsed=  format.parse(tempx);
      
        java.sql.Date sql = new Date(parsed.getTime());
     
   java.sql.Date sql1=new java.sql.Date(cal1.getTimeInMillis());
   java.util.Date util=new   java.util.Date();
  // JOptionPane.showMessageDialog(null,"calend:"+sql1);

        java.sql.Date sqlq = new java.sql.Date((util.getTime()));
        
	 if(   ((sql1.before(sql)) || (sql1.compareTo(sql)==0) )&& ((sql1.after(sqlq)) ||(sql1.compareTo(sqlq)==0)) ) {
          
         st.setDate(6, sql1);
          // JOptionPane.showMessageDialog(null,"bha"+sql1);
         
         } else {

JOptionPane.showMessageDialog(null, "Invalid Date");
}}
else {

JOptionPane.showMessageDialog(null, "Invalid Date");
}

             



             }


         

 // JOptionPane.showMessageDialog(null,"1");



 
//t.setString(7,);
st.setString(7,"0");
  
st.setInt(8,app);
 st.setString(9, (String) jComboBox2.getSelectedItem());
 st.setString(10, "res");

st.executeUpdate();

        JOptionPane.showMessageDialog(null, "Done");
this.dispose();
        
            cn.close();
        }

        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());}}
  
  else
  
  {JOptionPane.showMessageDialog(null, "Slot is not empty");}
        
        
        
        }
                   
        else if(mcq==2){
    JOptionPane.showMessageDialog(null, "Please Choose Value");
    }
        
        else{
        
        JOptionPane.showMessageDialog(null, "Field Cant be left blank");
        
        }
        

        
        
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox6ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ItemStateChanged

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
 
        jComboBox4.removeAllItems();
        jComboBox4.addItem("Select");try {
            Class.forName("com.mysql.jdbc.Driver");//loads driver
      
String url="jdbc:mysql://localhost/hms?user=root&password=india@123";
Connection cn; 
        
            cn = DriverManager.getConnection(url); //connection established
      
       
       String q="select slot,d_id,app_limit  from doctor where d_name='"+jComboBox6.getSelectedItem()+"' and dept = '"+jComboBox2.getSelectedItem()+"' ";
PreparedStatement st=cn.prepareStatement(q);

ResultSet rs1=st.executeQuery();
while(rs1.next())
{
    for(int i=1;i<=rs1.getInt(1);i++)
        
jComboBox4.addItem(i);
temp2=rs1.getInt(2);
temp=rs1.getInt(3);


        }}
    catch (ClassNotFoundException | SQLException ex1) {
           JOptionPane.showMessageDialog(null, ex1.getMessage());
        }
       
       
              
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
