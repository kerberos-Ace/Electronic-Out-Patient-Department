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
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Anshul
 */
public class Resc_appo extends javax.swing.JInternalFrame {
String Expiry_Date;
  int check,app,temp ,Client_identification ,Doctor_identification;
 
    public Resc_appo() {
        initComponents();
         this.getRootPane().setDefaultButton(jButton1);
         Calendar c=Calendar.getInstance();
          dateChooserCombo1.setMinDate(c);
                jComboBox4.removeAllItems();
        jComboBox4.addItem("Select");
        
        try{
        Class.forName("com.mysql.jdbc.Driver");//loads driver
      
String url="jdbc:mysql://localhost/hms?user=root&password=india@123";
Connection cn; 
        
            cn = DriverManager.getConnection(url); //connection established
        
     
  
       String q="select * from appointment where auto_id="+Entry.identification+";";
PreparedStatement st=cn.prepareStatement(q);

ResultSet rs1=st.executeQuery();
 rtrnd_name rr=new rtrnd_name();
if(rs1.next())
{
    
     Client_identification=rs1.getInt(2);
     Doctor_identification=rs1.getInt(4);
      jTextField1.setText( rr.client_name(Client_identification," registration "," ID " , " c_name "));
      jTextField2.setText(rr.client_name(Doctor_identification," doctor "," d_id " , " d_name "));
      jTextField3.setText(rs1.getString(10));
      String tem_string=rr.client_name(Doctor_identification," doctor "," d_id " , " slot ");
       if(tem_string.equals("1")){
                        
jComboBox4.addItem("Morning");
  }else  if(tem_string.equals("2")){
                            
jComboBox4.addItem("Evening");
          } else if(tem_string.equals("3")){
              jComboBox4.addItem("Morning");
          jComboBox4.addItem("Evening");
         }
      Expiry_Date=rr.return_date(rs1.getInt(1));
       temp=rr.doc_name(""," doctor " ," d_id "," app_limit ",Doctor_identification);
}    
  


   
      

   }
    catch (Exception ex1) {
           JOptionPane.showMessageDialog(null,ex1.getClass());
        }
       
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Reschedule Appointment");
        setToolTipText("Reschedule Appointment");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ALL    FIELDS   ARE    MANDATORY", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 1, 16))); // NOI18N
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.lightGray), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 3, 16))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel2.setText("Client's Name");

        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField1.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel4.setText("Appointment Type");

        jLabel9.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel9.setText("Slot");

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
        jButton1.setText("Reschedule  Appointment");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel10.setText("Doctor's Name");

        jTextField2.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel5.setText("Department");

        jTextField3.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 156, Short.MAX_VALUE)
                                .addComponent(jTextField3)
                                .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanel7.add(jPanel1);

        jPanel9.add(jPanel7, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel1.setText("Reschedule appointment");
        jPanel8.add(jLabel1);

        jPanel9.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel9);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Calendar cal=dateChooserCombo1.getSelectedDate();
                                     
                              int tmp_slot=0;
                 if(jComboBox4.getSelectedItem().equals("Morning")){
   tmp_slot=1;
  }else  if(jComboBox4.getSelectedItem().equals("Evening")){
   tmp_slot=2;
 
  
  }   
                 
        int mcq=0;

        // JOptionPane.showMessageDialog(null,"for"+O);

        Validation v=new Validation();//JOptionPane.showMessageDialog(null,"if"+O);
        mcq= v.validate_all(jPanel1);

        if(mcq==0){
            rec_return rec=new rec_return();
        if(rec.rec_ret(Client_identification,tmp_slot, Doctor_identification, new java.sql.Date(cal.getTimeInMillis()))==0){
                    

            try {

                Class.forName("com.mysql.jdbc.Driver");//loads driver

                String url2="jdbc:mysql://localhost/hms?user=root&password=india@123";
                Connection cn2;

                cn2 = DriverManager.getConnection(url2); //connection established

               

                String q2="select count(*) from appointment where slot='"+tmp_slot+"' and dr='"+Doctor_identification+"' and app_date='"+new java.sql.Date(cal.getTimeInMillis())+"'";

                PreparedStatement st2=cn2.prepareStatement(q2);

                ResultSet rs2=st2.executeQuery();

                if(rs2.next())
                {
                    check=rs2.getInt(1);

                } cn2.close();}
                catch(ClassNotFoundException | SQLException ee){
                    JOptionPane.showMessageDialog(null, ee.getMessage());
                }

                if(check<temp)
                {

                    try{
                        Class.forName("com.mysql.jdbc.Driver");//loads driver
                        String url="jdbc:mysql://localhost/hms?user=root&password=india@123";
                        Connection cn=DriverManager.getConnection(url); //connection established

                        String q="insert into appointment(c_id,a_type,dr,slot,validity,app_date,fee,app_no,dept,a_mode,status) values(?,?,?,?,?,?,?,?,?,?,?)";
                        PreparedStatement st=cn.prepareStatement(q);

                        st.setInt(1,Client_identification);

                        st.setString(2,(String) jComboBox1.getSelectedItem());

                        st.setInt(3,Doctor_identification );

                              
                            st.setInt(4, tmp_slot);
                       // JOptionPane.showMessageDialog(null, "In1");
                        st.setInt(5,0);

                        app=check;
                        if(check==0){

                            app=1;

                        }
                        else {app++;}
                        Calendar cal1=dateChooserCombo1.getSelectedDate();

                        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                        java.util.Date parsed=  format.parse(Expiry_Date);

                        java.sql.Date sql = new Date(parsed.getTime());

                        java.sql.Date sql1=new java.sql.Date(cal1.getTimeInMillis());
                        java.util.Date util=new   java.util.Date();
                      //  JOptionPane.showMessageDialog(null,"calend:"+sql1);

                        java.sql.Date sqlq = new java.sql.Date((util.getTime()));
 //JOptionPane.showMessageDialog(null, sqlq+""+sql);
                        if(   ((sql1.before(sql)) || (sql1.compareTo(sql)==0) )&& ((sql1.after(sqlq)) ||(sql1.compareTo(sqlq)==0)) ) {

                            st.setDate(6, sql1);
                          

                        }

                        //JOptionPane.showMessageDialog(null,"1");

                        //t.setString(7,);
                        st.setString(7,"0");

                        st.setInt(8,app);
                        st.setString(9, jTextField3.getText());
                        st.setString(10, "res");
                        st.setInt(11,0);
                        st.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Appointment has been successfully reschedule");
                        this.dispose();

                        cn.close();
                    }

                    catch(Exception e) {
                        JOptionPane.showMessageDialog(null,"Invalid Date");}}

                else

                {JOptionPane.showMessageDialog(null, "Slot is not empty");}

            } else {
            JOptionPane.showMessageDialog(null, "Appointment already exists");
        }}

            else if(mcq==2){
                JOptionPane.showMessageDialog(null, "Please choose value");
            }

            else{

                  JOptionPane.showMessageDialog(null, "Fields can't be left blank");

            }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
