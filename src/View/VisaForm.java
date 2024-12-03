/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Visa;
import Model.Visa;
import Model.Visa;
import Model.Visa;
import Model.Visa;
import Service.VisaService;
import Service.VisaService;
import Service.VisaService;
import Service.VisaService;
import Service.VisaService;
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
public class VisaForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form VisaForm
     */
    public VisaForm() {
        initComponents();
           this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
           ui.setNorthPane(null);
             displaydata();
        
    }
 private void displaydata(){
        
        try {
            Registry reg=LocateRegistry.getRegistry("127.0.0.1", 5000);
            VisaService paises =(VisaService) reg.lookup("vista");
           List<Visa> thecnt=paises.AllgivenVisa();
            DefaultTableModel tmodel=(DefaultTableModel)visatable.getModel();
            tmodel.setRowCount(0);
           if(thecnt!=null){
               for(Visa cnt:thecnt){
                   Object data[]={
                       
                      cnt.getVisaId(),
                   cnt.getType()
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        idTXT = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        typeTxt1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        visatable = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 204)));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("VISA");

        registerBtn.setBackground(new java.awt.Color(0, 51, 255));
        registerBtn.setText("REGISTER");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("VISA IDENTIFICATION");

        UpdateBtn.setBackground(new java.awt.Color(0, 51, 255));
        UpdateBtn.setText("UPDATE");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(0, 51, 255));
        DeleteBtn.setText("DELETE");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(0, 51, 255));
        searchBtn.setText("SEARCH");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("VISA TYPE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(registerBtn)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteBtn)))
                        .addGap(18, 18, 18)
                        .addComponent(UpdateBtn)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(searchBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(typeTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(searchBtn)))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(idTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(UpdateBtn))
                .addContainerGap())
        );

        visatable.setBackground(new java.awt.Color(51, 102, 255));
        visatable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "IDENTIFICATION", "TYPE"
            }
        ));
        jScrollPane1.setViewportView(visatable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
              if(typeTxt1.getText().trim().isEmpty())  {
       JOptionPane.showMessageDialog(null, "All fields are Mandatory","Mandatory Field",JOptionPane.WARNING_MESSAGE);  
    }
           try {
            Registry reg=LocateRegistry.getRegistry("127.0.0.1", 5000);
            VisaService visas =(VisaService) reg.lookup("vista");
             Visa cnt=new Visa();
             cnt.setVisaId(idTXT.getText());
             cnt.setType(typeTxt1.getText());
             Visa thecnt=visas.RegVisa(cnt);
        
            if(thecnt!=null){
                JOptionPane.showMessageDialog(this, "Visa Saved");
                displaydata();
            }else{
                 JOptionPane.showMessageDialog(this, "Visa couldn't be saved");
            }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
         try{
        Registry reg=LocateRegistry.getRegistry("127.0.0.1", 5000);
            VisaService visas =(VisaService) reg.lookup("vista");
            Visa cnt=new Visa();
           cnt.setVisaId(idTXT.getText());
            Visa thecnt=visas.searchByVisa(cnt);
           if(thecnt!=null){
           typeTxt1.setText(thecnt.getType());
              
           }else{
               JOptionPane.showMessageDialog(this,"Visa ID not Exist! Register Now");
        }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
      if(typeTxt1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are Mandatory","Mandatory Field",JOptionPane.WARNING_MESSAGE); 
      }else{
        try {
            Registry reg=LocateRegistry.getRegistry("127.0.0.1", 5000);
             VisaService paises =(VisaService) reg.lookup("vista");
            Visa cnt=new Visa();
           cnt.setVisaId((idTXT.getText()));
           cnt.setType(typeTxt1.getText());
        
           Visa thecnt=paises.updaVisa(cnt);
            if(thecnt!=null){
                JOptionPane.showMessageDialog(this, "Data Updated Successful");
                idTXT.setText("");
              typeTxt1.setText("");
           
                 displaydata();
            }else{
                 JOptionPane.showMessageDialog(this, "Data not Updated");
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
       try {
        Registry reg = LocateRegistry.getRegistry("127.0.0.1", 5000);
        VisaService visas= (VisaService) reg.lookup("vista");
        
        // Get the selected row from the table
        int selectedRow = visatable.getSelectedRow();
        
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a visatype to delete.");
            return;
        }

        // Get the country id from the selected row
        
        String VisaId =  (String) visatable.getValueAt(selectedRow, 0);
        
        // Create a new Visa object with the country id to delete
        Visa cnt = new Visa();
        cnt.setVisaId(VisaId);

        // Call the delete method with the selected country
        Visa deletedVisa = visas.delVisa(cnt);
        
        if (deletedVisa != null) {
            JOptionPane.showMessageDialog(this, "Data deleted successfully");
        
            idTXT.setText("");
           typeTxt1.setText("");
            displaydata();
        } else {
            JOptionPane.showMessageDialog(this, "Data couldn't be deleted");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_DeleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JTextField idTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton registerBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField typeTxt1;
    private javax.swing.JTable visatable;
    // End of variables declaration//GEN-END:variables
}
