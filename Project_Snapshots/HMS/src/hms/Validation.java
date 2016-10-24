/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;
import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Anshul
 */
public class Validation {
    
    Validation(){}
    Validation(Object o){
   if (o instanceof JTextField)//||O instanceof JTextArea)
        {
            JTextField t=(JTextField)o;
            t.setText("");
            }
  // else if(o instanceof  JScrollPane)
    
  // {
       
    //  JScrollPane jc1=(JScrollPane)o;
      
  // Object oo[]=jc1.getComponents();
   //    for(Object ooo:oo)
      // {
        //   System.out.println(ooo.getClass().getName());
           
         //  if(ooo instanceof JViewport)
         //  {
          //     JViewport p=(JViewport)ooo;
           //  JTextArea t=(JTextArea) p.getComponent(0);
            
           // t.setText("");
          // }
      // }
  // }
   
  else if(o instanceof  JComboBox)
   {
   
    JComboBox t=(JComboBox)o;
    t.setSelectedIndex(0);
   
   }
    
    }
    
    
public int    validate_all(JPanel p){
 int count=0;
try{
    
      for(Object o:p.getComponents()) {
    
    
    // JOptionPane.showMessageDialog(null,o);
 if (o instanceof JTextField)//||O instanceof JTextArea)
        {
            JTextField t=(JTextField)o;
           
           if (t.getText().length()==0){count++;
           }
            }
 else if (o instanceof JTextArea)//||O instanceof JTextArea)
        {
            JTextArea t=(JTextArea)o;
           if (t.getText().length()==0){count++;
           }
            }
   
  else if(o instanceof  JComboBox)
   {
       JComboBox t=(JComboBox)o;
   
   if( t.getSelectedItem().equals("Select")){
      
    count++;count++;
   
   }
   else if(t.getSelectedIndex()==-1)
           {  //JOptionPane.showMessageDialog(null,"3");
            JOptionPane.showMessageDialog(null,"Please Choose Value");count++;
          
           }}
       if(count!=0){
     break;
      }}
     

  }
   
    catch(Exception e){
        
    JOptionPane.showMessageDialog(null,e.getClass());}
   
   
    return count;
   
    }
    

public int  email_mobile( String text_value, int int_temp ){
String mydomain = text_value;int count=0;
String emailregex="";
if(int_temp==1){
   
        emailregex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
}else {

emailregex = "[789][0-9]{9}";

} 
Boolean b = mydomain.matches(emailregex);

        if (int_temp==1 && b == false) {
          count++;
        }else if (int_temp==2 && b == false){
        
       count++;
       
        }

    return count;

      

}



}
    

