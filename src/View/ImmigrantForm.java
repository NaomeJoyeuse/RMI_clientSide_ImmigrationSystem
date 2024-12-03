/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Country;
import Model.Immigrant;
import Model.Intent;
import Model.Visa;
import Service.CountryService;
import Service.ImmigrantService;
import Service.IntentService;
import Service.VisaService;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Naome
 */
public class ImmigrantForm extends javax.swing.JInternalFrame {
private DefaultListModel<Intent> defintentlist=new DefaultListModel<>();
private DefaultListModel<Visa> defVisalist=new DefaultListModel<>();
    /**
     * Creates new form ImmigrantForm
     */
    public ImmigrantForm() {
        initComponents();
           this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
           ui.setNorthPane(null);
        adddataofCountry();
        adddataIntents();
        adddataVisa();
        displaydata();
    }
     private void displaydata(){
        
        try {
            Registry reg=LocateRegistry.getRegistry("127.0.0.1", 5000);
            ImmigrantService paises =(ImmigrantService) reg.lookup("immigra");
           List<Immigrant> thecnt=paises.Allimmigrants();
            DefaultTableModel tmodel=(DefaultTableModel)immigraTb.getModel();
            tmodel.setRowCount(0);
           if(thecnt!=null){
               for(Immigrant cnt:thecnt){
                   Object data[]={
                       
                   cnt.getImmigrantID(),
                  cnt.getFirstName(),
                   cnt.getPassportNumber(),
                   cnt.getEnteringDate(),
                   cnt.getVisas(),
                   cnt.getCountry(),
                   cnt.getIntents()
                   
                   };
                   tmodel.addRow(data);
                  
               }
           }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }  
        
     
        private void adddataofCountry(){
        try {
            Registry reg=LocateRegistry.getRegistry("127.0.0.1", 5000);
           CountryService paises=(CountryService) reg.lookup("pais");
           List<Country> thefaculty=paises.AllCountries();
           if(thefaculty!=null){
               for(Country county:thefaculty){
                   countryCombo.addItem(county);  
               }
           }
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
        }
          private void adddataIntents(){
        try {
            Registry reg=LocateRegistry.getRegistry("127.0.0.1", 5000);
            IntentService facs=(IntentService) reg.lookup("intention");
           List<Intent> thecour=facs.Allintents();
           if(thecour!=null){
               for(Intent depts:thecour){
                  defintentlist.addElement(depts);
               }
               Intentlistdata1.setModel(defintentlist);
           }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
      
    }
             private void adddataVisa(){
        try {
            Registry reg=LocateRegistry.getRegistry("127.0.0.1", 5000);
            VisaService facs=(VisaService) reg.lookup("vista");
           List<Visa> thecour=facs.AllgivenVisa();
           if(thecour!=null){
               for(Visa depts:thecour){
                  defVisalist.addElement(depts);
               }
               Visatlistdata.setModel(defVisalist);
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
        regbtn = new javax.swing.JButton();
        PassTXT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        immigraTb = new javax.swing.JTable();
        searchbtn = new javax.swing.JButton();
        DelBtn = new javax.swing.JButton();
        updateBTN = new javax.swing.JButton();
        nameTXT = new javax.swing.JTextField();
        idTXT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        countryCombo1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        countryCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Visatlistdata = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        Intentlistdata1 = new javax.swing.JList<>();

        regbtn.setText("REGISTER");
        regbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regbtnActionPerformed(evt);
            }
        });

        jLabel1.setText("NAME");

        immigraTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "LOCATION", "COUNTRY"
            }
        ));
        jScrollPane1.setViewportView(immigraTb);

        searchbtn.setText("SEARCH");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        DelBtn.setText("DELETE");
        DelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelBtnActionPerformed(evt);
            }
        });

        updateBTN.setText("UPDATE");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        jLabel3.setText("ID");

        jLabel4.setText("IMMIGRANT");

        jLabel5.setText("COUNTRY");

        countryCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryCombo1ActionPerformed(evt);
            }
        });

        jLabel7.setText("PASSPORT NO:");

        countryCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryComboActionPerformed(evt);
            }
        });

        jLabel8.setText("VISA");

        jLabel9.setText("INTENT");

        Visatlistdata.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jScrollPane2.setViewportView(Visatlistdata);

        Intentlistdata1.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jScrollPane3.setViewportView(Intentlistdata1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(countryCombo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(388, 388, 388))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(countryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PassTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3)
                                .addGap(34, 34, 34)
                                .addComponent(idTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(regbtn)
                                .addGap(18, 18, 18)
                                .addComponent(DelBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateBTN)
                            .addComponent(searchbtn))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(PassTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(countryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBTN)
                    .addComponent(DelBtn)
                    .addComponent(regbtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(searchbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(countryCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regbtnActionPerformed
        //validations
        try {
          Registry reg=LocateRegistry.getRegistry("127.0.0.1", 5000);
            ImmigrantService deptservice=(ImmigrantService) reg.lookup("immigra");
            Immigrant dm =new Immigrant();
            dm.setFirstName(nameTXT.getText());
            dm.setPassportNumber(PassTXT.getText());
            dm.setEnteringDate((new Date()));
            Country adddataitem= (Country) countryCombo.getSelectedItem();
            dm.setCountry(adddataitem);
            Set<Intent>IntentSets=new HashSet<>();
            List<Intent>IntentList=(List<Intent>) Intentlistdata1.getSelectedValuesList();
            for(Intent theintent:IntentList){
                IntentSets.add(theintent);
            }
            
            Set<Visa>VisaSets=new HashSet<>();
            List<Visa>VisaList=Visatlistdata.getSelectedValuesList();
            for(Visa thevisa:VisaList){
            VisaSets.add(thevisa);
            }
           dm.setVisas(VisaList);
           dm.setIntents(IntentList);
            Immigrant theimmig =deptservice.RegisterImmigra(dm);
           
            if(theimmig!=null){
                JOptionPane.showMessageDialog(this, "Data Saved Successful");
            }else{
                 JOptionPane.showMessageDialog(this, "Data not Saved");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_regbtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        try{
            Registry reg=LocateRegistry.getRegistry("127.0.0.1", 5000);
            ImmigrantService paises =(ImmigrantService) reg.lookup("immigra");
            Immigrant cnt=new Immigrant();
            cnt.setImmigrantID(Integer.parseInt(idTXT.getText()));
            Immigrant thecnt=paises.SearchImmigra(cnt);
            if(thecnt!=null){
                nameTXT.setText(thecnt.getFirstName());
                PassTXT.setText(thecnt.getPassportNumber());
                

            }else{
                JOptionPane.showMessageDialog(this,"Country ID not Exist! Register Now");
            }

        } catch (Exception e) {
            e.printStackTrace();
       }

    }//GEN-LAST:event_searchbtnActionPerformed

    private void DelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelBtnActionPerformed
        // TODO add your handling code here:
        try {
            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 5000);
            ImmigrantService paises =( ImmigrantService) reg.lookup("immigra");

            // paises.set(Integer.parseInt(idTXT.getText()));

            // Get the selected row from the table
            int selectedRow = immigraTb.getSelectedRow();

            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Please select an immigrant to delete.");
                return;
            }

            // Get the country id from the selected row
            int ImmigrantId = (int) immigraTb.getValueAt(selectedRow, 0);

            // Create a new Country object with the country id to delete
            Immigrant cnt=new Immigrant();
            cnt.setImmigrantID(ImmigrantId);

            // Call the delete method with the selected country
            Immigrant deletedemb = paises.DeleteImmigra(cnt);

            if (deletedemb != null) {
                JOptionPane.showMessageDialog(this, "Data deleted successfully");
                nameTXT.setText("");
                idTXT.setText("");
                PassTXT.setText("");

                displaydata();
            } else {
                JOptionPane.showMessageDialog(this, "Data couldn't be deleted");
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_DelBtnActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        // validations
//        try {
//            Registry reg=LocateRegistry.getRegistry("127.0.0.1", 5000);
//            ImmigrantService embbb=(ImmigrantService) reg.lookup("emba");
//            Immigrant emb =new Immigrant();
//            emb.setImmigrantId(Integer.parseInt(idTXT.getText()));
//            emb.setImmigrantName(nameTXT.getText());
//            emb.setLocation(PassTXT.getText());
//            Country adddataitem=(Country) visaCombo.getSelectedItem();
//            emb.setCountry(adddataitem);
//
//            Immigrant theembcy=embbb.UpdateEmb(emb);
//            if(theembcy!=null){
//                JOptionPane.showMessageDialog(this, "Data updated Successful");
//                displaydata();
//            }else{
//                JOptionPane.showMessageDialog(this, "Data not Saved");
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }//GEN-LAST:event_updateBTNActionPerformed

    private void countryCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryCombo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryCombo1ActionPerformed

    private void countryComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DelBtn;
    private javax.swing.JList<Intent> Intentlistdata1;
    private javax.swing.JTextField PassTXT;
    private javax.swing.JList<Visa> Visatlistdata;
    private javax.swing.JComboBox<Country> countryCombo;
    private javax.swing.JComboBox<Country> countryCombo1;
    private javax.swing.JTextField idTXT;
    private javax.swing.JTable immigraTb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nameTXT;
    private javax.swing.JButton regbtn;
    private javax.swing.JButton searchbtn;
    private javax.swing.JButton updateBTN;
    // End of variables declaration//GEN-END:variables
}
