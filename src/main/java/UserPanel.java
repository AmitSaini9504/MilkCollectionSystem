import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.print.PrinterException;
import java.awt.PrintJob;



import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserPanel extends javax.swing.JFrame {
    
    //for clear data 
    
   
    


    public UserPanel() {
        initComponents();
        
         Date now = new Date();
        SimpleDateFormat DT = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = DT.format(now);
        
            
       TextArea.setText("\n"
                +"--------------------------4032 - Fresh Milk Collection------------------------"+"\n\n"+"Address : Village Chomu, Jaipur ,Rajasthan 304505"+"\n"
                
                +"Contact No. - 7300440421"+"\n"+"Date & Time "+formattedDateTime + "\n\n"+
                        "------------"
                        + "------------------Customer Summary----------------------------");
       
        
        
        
        
 
      
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        print = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CustomerCode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        shift = new javax.swing.JComboBox<>();
        Amount1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        price1 = new javax.swing.JTextField();
        Fat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Qty = new javax.swing.JTextField();
        AddData = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(164, 188, 146));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel3.setBackground(new java.awt.Color(199, 233, 176));

        Table.setBackground(new java.awt.Color(204, 204, 204));
        Table.setForeground(new java.awt.Color(0, 0, 0));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Farmer Code", "Shift", "Fat", "Qty", "Price", "Amount"
            }
        ));
        jScrollPane2.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        TextArea.setEditable(false);
        TextArea.setColumns(20);
        TextArea.setRows(5);
        TextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jScrollPane1.setViewportView(TextArea);

        print.setBackground(new java.awt.Color(63, 90, 17));
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("Print Recipt");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Customer Code");

        CustomerCode.setBackground(new java.awt.Color(233, 237, 201));
        CustomerCode.setForeground(new java.awt.Color(51, 51, 51));
        CustomerCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Shift");

        shift.setBackground(new java.awt.Color(204, 213, 174));
        shift.setForeground(new java.awt.Color(51, 51, 51));
        shift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Evening" }));

        Amount1.setEditable(false);
        Amount1.setBackground(new java.awt.Color(233, 237, 201));
        Amount1.setForeground(new java.awt.Color(51, 51, 51));
        Amount1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Amount");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Do you want to display Price & Amount ");

        jCheckBox1.setBackground(new java.awt.Color(199, 233, 176));
        jCheckBox1.setForeground(new java.awt.Color(68, 104, 48));
        jCheckBox1.setText("Yes ");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Fat%");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Price");

        price1.setEditable(false);
        price1.setBackground(new java.awt.Color(233, 237, 201));
        price1.setForeground(new java.awt.Color(51, 51, 51));
        price1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));

        Fat.setBackground(new java.awt.Color(233, 237, 201));
        Fat.setForeground(new java.awt.Color(51, 51, 51));
        Fat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Milk Quantity");

        Qty.setBackground(new java.awt.Color(233, 237, 201));
        Qty.setForeground(new java.awt.Color(51, 51, 51));
        Qty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));

        AddData.setBackground(new java.awt.Color(63, 90, 17));
        AddData.setForeground(new java.awt.Color(255, 255, 255));
        AddData.setText("Process Data ");
        AddData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDataActionPerformed(evt);
            }
        });

        Save.setBackground(new java.awt.Color(63, 90, 17));
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(63, 90, 17));
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(164, 188, 146));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Farmer Recipt");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CustomerCode))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(price1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Amount1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Qty))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AddData, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(print, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(price1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(Amount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(Fat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(CustomerCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jCheckBox1)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(436, 436, 436)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(print)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddData)
                    .addComponent(Save)
                    .addComponent(Clear))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1234, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDataActionPerformed
        // TODO add your handling code here:
        
        String customerCode = CustomerCode.getText();
    String selectedShift = (String) shift.getSelectedItem();
    String qtyStr = Qty.getText();
    String fatStr = Fat.getText();
    
      if (customerCode.isEmpty() || qtyStr.isEmpty() || fatStr.isEmpty()) {
            JOptionPane.showMessageDialog(UserPanel.this, "Please fill in all details.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
              
    }
     try {
        // Parse input values
        int qty = Integer.parseInt(qtyStr);
        float fat = Float.parseFloat(fatStr);
        float calculatedPrice = fat * 6;
        float calculatedAmount = qty * calculatedPrice;
        

        price1.setText(String.valueOf(calculatedPrice));
        Amount1.setText(String.valueOf(calculatedAmount));
        
          
        // Append details to the TextArea
        

        
        TextArea.append("\nCustomer Code: " + customerCode
                + "\nShift: " + selectedShift
                + "\nQty: " + qty
                + "\nFat: " + fat
                + "\nPrice: " + calculatedPrice
                + "\nAmount: " + calculatedAmount
                +"\n------------------------------------------------------------------\n\n\n\n\n\n\n\n\n\n\t\t Thank You....."
                
                 );
        
         // Clear input fields for new data entry
         
       
        
       
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Please enter valid numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    
        
    }//GEN-LAST:event_AddDataActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        
             
       
       
        
        
    }//GEN-LAST:event_printActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        
       TextArea.setText("");
       
        Date now = new Date();
        SimpleDateFormat DT = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = DT.format(now);
        
            
       TextArea.setText("\n"
                +"--------------------------4032 - Fresh Milk Collection------------------------"+"\n\n"+"Address : Village Chomu, Jaipur ,Rajasthan 304505"+"\n"
                
                +"Contact No. - 7300440421"+"\n"+"Date & Time "+formattedDateTime + "\n\n"+
                        "------------"
                        + "------------------Customer Summary----------------------------");
       
        
        
        
     
    }//GEN-LAST:event_ClearActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        
        
    
    
    String qtyStr = Qty.getText();
    String fatStr = Fat.getText();
    
      if (!qtyStr.isEmpty() && !fatStr.isEmpty()) {
    } else {
          JOptionPane.showMessageDialog(UserPanel.this, "Please fill in all details.", "Error", JOptionPane.ERROR_MESSAGE);
          return;
        }
     try {
        // Parse input values
        int qty = Integer.parseInt(qtyStr);
        float fat = Float.parseFloat(fatStr);
        float calculatedPrice = fat * 6;
        float calculatedAmount = qty * calculatedPrice;
        

        price1.setText(String.valueOf(calculatedPrice));
        Amount1.setText(String.valueOf(calculatedAmount));
        
          
        // Append details to the TextArea
        

        
      
        
         // Clear input fields for new data entry
         
        
        
        
         
        
       
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Please enter valid numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    
       
 
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed



 Date now = new Date();
   SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
    String formattedDate = dateFormat.format(now);
    String formattedTime = timeFormat.format(now);
        
        
        
        String customerCode = CustomerCode.getText();
    String selectedShift = (String) shift.getSelectedItem();
    String qtyStr = Qty.getText();
    String fatStr = Fat.getText();
    
      if (customerCode.isEmpty() || qtyStr.isEmpty() || fatStr.isEmpty()) {
            JOptionPane.showMessageDialog(UserPanel.this, "Please fill in all details.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
              
    }
     try {
        // Parse input values
        int qty = Integer.parseInt(qtyStr);
        float fat = Float.parseFloat(fatStr);
        float calculatedPrice = fat * 6;
        float calculatedAmount = qty * calculatedPrice;
        

        price1.setText(String.valueOf(calculatedPrice));
        Amount1.setText(String.valueOf(calculatedAmount));
        
          
        // Append details to the TextArea
        

        
     
        
         // Clear input fields for new data entry
         
       
         
        
       
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Please enter valid numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
        // TODO add your handling code here:
        
         String TableData[] = {formattedDate,formattedTime,CustomerCode.getText(),(String) shift.getSelectedItem(),Fat.getText(),Qty.getText(),price1.getText(),Amount1.getText()};

            DefaultTableModel TB = (DefaultTableModel) Table.getModel();
            
            TB.addRow(TableData);


            
              CustomerCode.setText("");
         Qty.setText("");
         Fat.setText("");
         price1.setText("");
         Amount1.setText("");
         
    }//GEN-LAST:event_SaveActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddData;
    private javax.swing.JTextField Amount1;
    private javax.swing.JButton Clear;
    private javax.swing.JTextField CustomerCode;
    private javax.swing.JTextField Fat;
    private javax.swing.JTextField Qty;
    private javax.swing.JButton Save;
    private javax.swing.JTable Table;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField price1;
    private javax.swing.JButton print;
    private javax.swing.JComboBox<String> shift;
    // End of variables declaration//GEN-END:variables

    private static class Shift {

        public Shift() {
        }
    }
}
