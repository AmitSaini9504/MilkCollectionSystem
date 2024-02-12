package com.mycompany.milkcollectionsystem;

import java.text.SimpleDateFormat;
import java.util.Date;


interface Check
{
    void show();
}
 public class MilkCollectionSystem {

    public static void main(String[] args) {
     
        
        
        
        Date now = new Date();
        SimpleDateFormat DT = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = DT.format(now);
        
          System.out.println("\n"
                +"--------------------------4032 - Fresh Milk Collection------------------------"+"\n\n"+"Address : Village Chomu, Jaipur ,Rajasthan 304505"+"\n"
                
                +"Contact No. - 7300440421"+"\n"+"Date & Time "+formattedDateTime + "\n\n"+
                        "------------"
                        + "------------------Customer Summary----------------------------");  
    }
    
 }
                
    
        
      
    


     
    