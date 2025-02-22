/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Country;
import Model.Intent;
import Service.CountryService;
import Service.IntentService;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Naome
 */
public class IntentForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form IntentForm
     */
    public IntentForm() {
        initComponents();
           this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
           ui.setNorthPane(null);
    }

        private void displaydata(){
        
        try {
            Registry reg=LocateRegistry.getRegistry("127.0.0.1", 5000);
            IntentService paises =(IntentService) reg.lookup("intention");
           List<Intent> thecnt=paises.Allintents();
            DefaultTableModel tmodel=(DefaultTableModel)IntentTable.getModel();
            tmodel.setRowCount(0);
           if(thecnt!=null){
               for(Intent cnt:thecnt){
                   Object data[]={
                       
                      cnt.getIntentID(),
                   cnt.getName(),
                   cnt.getLocation(),
                   cnt.getDescription()
                   };
                   tmodel.addRow(data);
                  
               }
           }
            
        } catch (Exception e) {
            e.printStackTrace();
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

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        IntentTable = new javax.swing.JTable();
        searchbtn = new javax.swing.JButton();
        idTXT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        locationTXT = new javax.swing.JTextField();
        descTXT = new javax.swing.JTextField();
        nameTXT = new javax.swing.JTextField();
        regbtn = new javax.swing.JButton();
        updateBTN = new javax.swing.JButton();
        DelBtn = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        IntentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "LOCATION", "Description"
            }
        ));
        jScrollPane1.setViewportView(IntentTable);

        searchbtn.setBackground(new java.awt.Color(0, 51, 204));
        searchbtn.setText("SEARCH");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("MOST VISITING PLACES");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 1, 1, 1, new java.awt.Color(0, 0, 204)));

        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText(" NAME");

        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("DESCRIPTION");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("LOCATION");

        descTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descTXTActionPerformed(evt);
            }
        });

        regbtn.setBackground(new java.awt.Color(0, 51, 204));
        regbtn.setText("REGISTER");
        regbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regbtnActionPerformed(evt);
            }
        });

        updateBTN.setBackground(new java.awt.Color(0, 51, 204));
        updateBTN.setText("UPDATE");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        DelBtn.setBackground(new java.awt.Color(0, 51, 204));
        DelBtn.setText("DELETE");
        DelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(regbtn)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(DelBtn)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateBTN)
                            .addComponent(locationTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(descTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regbtn)
                    .addComponent(updateBTN)
                    .addComponent(DelBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel3)
                        .addGap(69, 69, 69)
                        .addComponent(idTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(searchbtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(searchbtn))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regbtnActionPerformed
      if(nameTXT.getText().trim().isEmpty()||locationTXT.getText().trim().isEmpty()||descTXT.getText().trim().isEmpty())  {
       JOptionPane.showMessageDialog(null, "All fields are Mandatory","Mandatory Field",JOptionPane.WARNING_MESSAGE);  
    }else{
        try {
            Registry reg=LocateRegistry.getRegistry("127.0.0.1", 5000);
               IntentService embbb =(IntentService) reg.lookup("intention");
           Intent emb =new Intent();
            emb.setName(nameTXT.getText());
            emb.setLocation(locationTXT.getText());
            emb.setDescription(descTXT.getText());
           

           Intent theembcy=embbb.RegisterIntent(emb);
            if(theembcy!=null){
                JOptionPane.showMessageDialog(this, "Data Saved Successful");
                displaydata();
            }else{
                JOptionPane.showMessageDialog(this, "Data not Saved");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
      }
    }//GEN-LAST:event_regbtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        try{
            Registry reg=LocateRegistry.getRegistry("127.0.0.1", 5000);
           IntentService paises =(IntentService) reg.lookup("intention");
           Intent cnt=new Intent();
            cnt.setIntentID(Integer.parseInt(idTXT.getText()));
           Intent thecnt=paises.SearchIntent(cnt);
            if(thecnt!=null){
                nameTXT.setText(thecnt.getName());
                descTXT.setText(thecnt.getDescription());
                locationTXT.setText(thecnt.getLocation());

            }else{
                JOptionPane.showMessageDialog(this,"Intent ID not Exist! Register Now");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_searchbtnActionPerformed

    private void DelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelBtnActionPerformed
        // TODO add your handling code here:
       try {
        Registry reg = LocateRegistry.getRegistry("127.0.0.1", 5000);
        IntentService paises = (IntentService) reg.lookup("intention");
        
        // Get the selected row from the table
        int selectedRow = IntentTable.getSelectedRow();
        
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a intent to delete.");
            return;
        }

        // Get the country id from the selected row
        int intentId = (int) IntentTable.getValueAt(selectedRow, 0);
        
        // Create a new Country object with the country id to delete
        Intent cnt = new Intent();
        cnt.setIntentID(intentId);

        // Call the delete method with the selected country
        Intent deletedCountry = paises.DeleteIntent(cnt);
        
        if (deletedCountry != null) {
            JOptionPane.showMessageDialog(this, "Data deleted successfully");
            nameTXT.setText("");
            idTXT.setText("");
            locationTXT.setText("");
            descTXT.setText("");
            displaydata();
        } else {
            JOptionPane.showMessageDialog(this, "Data couldn't be deleted");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_DelBtnActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
          if(nameTXT.getText().trim().isEmpty()||locationTXT.getText().trim().isEmpty()||descTXT.getText().trim().isEmpty())  {
       JOptionPane.showMessageDialog(null, "All fields are Mandatory","Mandatory Field",JOptionPane.WARNING_MESSAGE);  
    }else{
        try {
            Registry reg=LocateRegistry.getRegistry("127.0.0.1", 5000);
           IntentService embbb=(IntentService) reg.lookup("intention");
           Intent emb =new Intent();
            emb.setIntentID(Integer.parseInt(idTXT.getText()));
            emb.setName(nameTXT.getText());
            emb.setDescription(descTXT.getText());
            emb.setLocation(locationTXT.getText());
           
           Intent theembcy=embbb.UpdateIntent(emb);
            if(theembcy!=null){
                JOptionPane.showMessageDialog(this, "Data updated Successful");
                displaydata();
            }else{
                JOptionPane.showMessageDialog(this, "Data not Saved");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
          }
    }//GEN-LAST:event_updateBTNActionPerformed

    private void descTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descTXTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DelBtn;
    private javax.swing.JTable IntentTable;
    private javax.swing.JTextField descTXT;
    private javax.swing.JTextField idTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField locationTXT;
    private javax.swing.JTextField nameTXT;
    private javax.swing.JButton regbtn;
    private javax.swing.JButton searchbtn;
    private javax.swing.JButton updateBTN;
    // End of variables declaration//GEN-END:variables
}
