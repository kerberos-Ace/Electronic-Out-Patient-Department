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
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anshul
 */
public class View_appointments extends javax.swing.JInternalFrame {
int counter;
   

 DefaultTableModel model;
    /**
     * Creates new form View_appointments
     */
    public View_appointments() {
        initComponents();
     model=(DefaultTableModel)jTable2.getModel();
 this.getRootPane().setDefaultButton(jButton1);
 jTable2.setEnabled(false);
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setTitle("View Appointments");
        setToolTipText("View Appointments");
        setVisible(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ALL    FIELDS   ARE    MANDATORY", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 1, 16))); // NOI18N
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.gray), "View Appointments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Andalus", 1, 16))); // NOI18N

        jButton1.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/images/imageedit_2_2984795339.png"))); // NOI18N
        jButton1.setText("View Appointment");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.gray));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jRadioButton1.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jRadioButton1.setText("Doctor");
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });
        jRadioButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton1StateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel2.setText(" Department");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel3.setText(" Doctor");

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel4.setText("Slot");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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
    dateChooserCombo1.setFieldFont(new java.awt.Font("Andalus", java.awt.Font.PLAIN, 13));

    jLabel5.setFont(new java.awt.Font("Andalus", 0, 11)); // NOI18N
    jLabel5.setText("To");

    jRadioButton4.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
    jRadioButton4.setText("Date");

    dateChooserCombo2.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
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
dateChooserCombo2.setFieldFont(new java.awt.Font("Andalus", java.awt.Font.PLAIN, 13));

javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
jPanel2.setLayout(jPanel2Layout);
jPanel2Layout.setHorizontalGroup(
    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(17, 17, 17)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addComponent(dateChooserCombo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(dateChooserCombo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(dateChooserCombo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
    );

    javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
    jPanel21.setLayout(jPanel21Layout);
    jPanel21Layout.setHorizontalGroup(
        jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel21Layout.createSequentialGroup()
            .addGap(171, 171, 171)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 173, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanel21Layout.setVerticalGroup(
        jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel21Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(16, 16, 16))
    );

    jPanel3.add(jPanel21);

    jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

    jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    jPanel5.setLayout(new java.awt.BorderLayout());

    jTable2.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "S.No", "Client ID", "Client Name", "App. No.", "Doctor Name", "Department", "Slot", "Date"
        }
    ));
    jTable2.setEnabled(false);
    jScrollPane2.setViewportView(jTable2);

    jPanel5.add(jScrollPane2, java.awt.BorderLayout.CENTER);

    jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

    getContentPane().add(jPanel1);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      int tmp_slot=0;
        int val_count=0;
        if(jRadioButton1.isSelected()==true||jRadioButton4.isSelected()==true) {
            if(jRadioButton1.isSelected()==true){
                Validation v=new Validation();//JOptionPane.showMessageDialog(null,"if"+O);
                val_count= v.validate_all(jPanel2);}
            if(val_count==0){
                

                try {

                    Class.forName("com.mysql.jdbc.Driver");//loads driver

                    String url2="jdbc:mysql://localhost/hms?user=root&password=india@123";
                    Connection cn2;
                    String q="select * from appointment where ";
  
                    cn2 = DriverManager.getConnection(url2); //connection established

                    for(Object O:jPanel2.getComponents()) {

                        if (O instanceof JRadioButton)//||O instanceof JTextArea)
                    {    //JOptionPane.showMessageDialog(null,"sd12");
                        JRadioButton t=(JRadioButton)O;
                        if(t.isSelected()){
                          //  JOptionPane.showMessageDialog(null, "yo"+counter);
                            switch (t.getText()) {
                                case "Doctor":
                                {                                    
                 if(jComboBox3.getSelectedItem().equals("Morning")){
   tmp_slot=1;
  }else  if(jComboBox3.getSelectedItem().equals("Evening")){
   tmp_slot=2;}

                                    rtrnd_name nnn=new rtrnd_name();
                                    int temp=  nnn.doc_name((String) jComboBox2.getSelectedItem(),"doctor","d_name","d_id",0);
                                    q=q+"dr = '"+temp+"' and dept='"+jComboBox1.getSelectedItem()+"' and slot='"+tmp_slot+"'";
                                 
                                    /*
                                    break;

                                }
                                case "Slot":
                                {
                                    int temp=0;
                                    if(jComboBox2.getSelectedItem().equals("Morning")){
                                        temp=1;}else{temp=2;}
                                    if(counter==0){
                                        q=q+" slot = '"+temp+"'";

                                    }else {
                                        q=q+" and slot = '"+temp+"'";

                                    }               break;
                                }
                                case "Department":
                                if(counter==0){
                                    q=q+" dept = '"+jComboBox3.getSelectedItem()+"'";

                                }else {
                                    q=q+" and dept = '"+jComboBox3.getSelectedItem()+"'";
                                    */
                                }           break;
                                case "Date":
                                Calendar cal1=dateChooserCombo1.getSelectedDate();
                                Calendar cal2=dateChooserCombo2.getSelectedDate();
                                if(counter==0){
                                    q=q+" app_date  BETWEEN '"+new java.sql.Date(cal1.getTimeInMillis())+"' and '"+new java.sql.Date(cal2.getTimeInMillis())+"'";

                                }else {
                                    q=q+" and app_date  BETWEEN '"+new java.sql.Date(cal1.getTimeInMillis())+"' and '"+new java.sql.Date(cal2.getTimeInMillis())+"'";

                                }           break;
                            }
                            counter++;
                        }
                    }

                }

                //String q2="select * from appointment where dr = '"+dr.getSelectedItem()+"' and slot like '%"+slot.getSelectedItem()+"' ";

                PreparedStatement st2=cn2.prepareStatement(q);

                ResultSet rs2=st2.executeQuery();
                int counter2=0;
               // JOptionPane.showMessageDialog(null, q);
model.getDataVector().removeAllElements();

            model.fireTableDataChanged();
                while (rs2.next())
                {

                    counter2++;
                    rtrnd_name rtr=new rtrnd_name();
   //JOptionPane.showMessageDialog(null, "akira");
                    // String [] cn_name={"S.No","Client Name","App_NO","Doctor Name","Department","Slot","Date"};
                    String an_temp="";
                                       if(rs2.getString(5).equals("1")){
                    an_temp=    "Morning";
  }else  if(rs2.getString(5).equals("2")){
                            
an_temp="Evening";
          } else if(rs2.getString(5).equals("3")){
              an_temp="Morning+Evening";
         }
                    model.insertRow(model.getRowCount(),new Object[]{counter2,rs2.getInt(2),rtr.client_name(rs2.getInt(2),"registration", "ID","c_name"),rs2.getInt(9),rtr.client_name(rs2.getInt(4), "doctor", "d_id","d_name"),rs2.getString(10),an_temp,rs2.getDate(7)});

                   // JOptionPane.showMessageDialog(null, q);

                }
                cn2.close();

                if (counter2==0){JOptionPane.showMessageDialog(null,"No Records");}}
            catch(Exception ee){
                JOptionPane.showMessageDialog(null, ee.getMessage());
            }
            counter=0;

        }  else{

            JOptionPane.showMessageDialog(null, "Please choose value");

        }

        }
        else{

            JOptionPane.showMessageDialog(null, "Please choose");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        jComboBox3.removeAllItems();
        jComboBox3.addItem("Select");
        if(  jRadioButton1.isSelected() ){

            try{
                Class.forName("com.mysql.jdbc.Driver");//loads driver

                String url1="jdbc:mysql://localhost/hms?user=root&password=india@123";
                Connection cn1;
                cn1 = DriverManager.getConnection(url1); //connection established

                String q1="select slot from doctor where dept = '"+jComboBox1.getSelectedItem()+"' and d_name ='"+jComboBox2.getSelectedItem()+"' " ;
                PreparedStatement st1=cn1.prepareStatement(q1);

                ResultSet rs=st1.executeQuery();

                while(rs.next())
                {
                    
                             if(rs.getString(1).equals("1")){
                        
jComboBox3.addItem("Morning");
  }else  if(rs.getString(1).equals("2")){
                            
jComboBox3.addItem("Evening");
          } else if(rs.getString(1).equals("3")){
              jComboBox3.addItem("Morning");
          jComboBox3.addItem("Evening");
         }
                    
                   

                }} catch(Exception e){

                    JOptionPane.showMessageDialog(null, e.getMessage());
                }

            }else{
                jComboBox3.removeAllItems();

            }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jComboBox2.removeAllItems();
        jComboBox2.addItem("Select");
        if(  jRadioButton1.isSelected() ){

            try{
                Class.forName("com.mysql.jdbc.Driver");//loads driver

                String url1="jdbc:mysql://localhost/hms?user=root&password=india@123";
                Connection cn1;
                cn1 = DriverManager.getConnection(url1); //connection established

                String q1="select d_name from doctor where dept = '"+jComboBox1.getSelectedItem()+"' " ;
                PreparedStatement st1=cn1.prepareStatement(q1);

                ResultSet rs=st1.executeQuery();

                while(rs.next())
                {
                    jComboBox2.addItem(rs.getString(1));

                }} catch(Exception e){

                    JOptionPane.showMessageDialog(null, e.getMessage());
                }

            }

            else{  jComboBox2.removeAllItems();}
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton1StateChanged

       
    }//GEN-LAST:event_jRadioButton1StateChanged

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged

        jComboBox1.removeAllItems();
        jComboBox1.addItem("Select");
        if(jRadioButton1.isSelected()){

            try
            {
                Class.forName("com.mysql.jdbc.Driver");//loads driver

                String url1="jdbc:mysql://localhost/hms?user=root&password=india@123";
                Connection cn1;

                cn1 = DriverManager.getConnection(url1); //connection established

                String q1="select   depart  from department " ;
                PreparedStatement st1=cn1.prepareStatement(q1);

                ResultSet rs=st1.executeQuery();
                while(rs.next())
                {

                    jComboBox1.addItem(rs.getString(1));

                }

            }catch(Exception e){

                JOptionPane.showMessageDialog(null,e.getMessage());}

        }   else{  jComboBox1.removeAllItems();
        }       
        
        
        
        
        
    }//GEN-LAST:event_jRadioButton1ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
