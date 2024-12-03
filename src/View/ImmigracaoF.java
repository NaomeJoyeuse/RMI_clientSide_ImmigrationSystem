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
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.MessageFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Naome
 */
public class ImmigracaoF extends javax.swing.JInternalFrame {
private DefaultListModel<Intent> defintentlist=new DefaultListModel<>();
private DefaultListModel<Visa> defVisalist=new DefaultListModel<>();
    /**
    /**
     * Creates new form ImmigracaoF
     */
    public ImmigracaoF() {
        initComponents();
         adddataofCountry();
        adddataIntents();
        adddataVisa();
       displaydata();
    }
    ////////////////displaying all immigrants///
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
        
     
   
     /////displaying specific immigrant's data////// 
    private void displayVisasForImmigrant(int immigrantId) {
    try {
        Registry reg = LocateRegistry.getRegistry("127.0.0.1", 5000);
        ImmigrantService immigrantService = (ImmigrantService) reg.lookup("immigra");

        List<Visa> visas = immigrantService.getFromALL(immigrantId);

        if (visas != null) {
            // Clear the existing data in the table
            DefaultTableModel model = (DefaultTableModel) immigraTb.getModel();
            model.setRowCount(0);

            // Populate the table with the retrieved visas
            for (Visa visa : visas) {
                Object[] rowData = {
                    immigrantId,          
                    visa.getVisaId(),    
                    visa.getType()         
                   
                };
                model.addRow(rowData);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Failed to retrieve visas");
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        immigraTb = new javax.swing.JTable();
        trybtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nameTXT = new javax.swing.JTextField();
        PassTXT = new javax.swing.JTextField();
        countryCombo = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        Intentlistdata1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Visatlistdata = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        updateBTN = new javax.swing.JButton();
        displaybtn = new javax.swing.JButton();
        regbtn = new javax.swing.JButton();
        DelBtn = new javax.swing.JButton();
        reportBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        searchbtn = new javax.swing.JButton();
        idTXT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setResizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconee/icons8_africa_50px.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        immigraTb.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 255)));
        immigraTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "passport", "Name", "date", "visa", "coountry", "Intentl"
            }
        ));
        jScrollPane1.setViewportView(immigraTb);

        trybtn.setText("try");
        trybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trybtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 1, 1, 1, new java.awt.Color(0, 0, 255)));

        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("NAME");

        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("PASSPORT NO:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("COUNTRY");

        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("INTENT");

        countryCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryComboActionPerformed(evt);
            }
        });

        Intentlistdata1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        Intentlistdata1.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jScrollPane3.setViewportView(Intentlistdata1);

        Visatlistdata.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        Visatlistdata.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jScrollPane2.setViewportView(Visatlistdata);

        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("VISA");

        updateBTN.setBackground(new java.awt.Color(0, 0, 255));
        updateBTN.setText("UPDATE");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        displaybtn.setBackground(new java.awt.Color(0, 0, 255));
        displaybtn.setText("getall");
        displaybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaybtnActionPerformed(evt);
            }
        });

        regbtn.setBackground(new java.awt.Color(0, 0, 255));
        regbtn.setText("REGISTER");
        regbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regbtnActionPerformed(evt);
            }
        });

        DelBtn.setBackground(new java.awt.Color(0, 0, 255));
        DelBtn.setText("DELETE");
        DelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelBtnActionPerformed(evt);
            }
        });

        reportBtn.setBackground(new java.awt.Color(51, 51, 255));
        reportBtn.setText("Report");
        reportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBtnActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("IMMIGRANT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PassTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(regbtn)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(122, 122, 122)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(displaybtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DelBtn)
                                .addComponent(updateBTN)
                                .addComponent(reportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(161, 161, 161))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(PassTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(regbtn)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(countryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(DelBtn)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(updateBTN)
                        .addGap(28, 28, 28)
                        .addComponent(displaybtn)
                        .addGap(26, 26, 26)
                        .addComponent(reportBtn))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 1, 1, 1, new java.awt.Color(0, 51, 255)));

        searchbtn.setBackground(new java.awt.Color(0, 0, 255));
        searchbtn.setText("SEARCH");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("ID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(75, 75, 75)
                .addComponent(idTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(searchbtn)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchbtn)
                    .addComponent(idTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(trybtn)
                .addGap(704, 704, 704))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(trybtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regbtnActionPerformed
             if(PassTXT.getText().trim().isEmpty()||nameTXT.getText().trim().isEmpty()||countryCombo.getSelectedItem()==null||Intentlistdata1.isSelectionEmpty())  {
       JOptionPane.showMessageDialog(null, "All fields are Mandatory","Mandatory Field",JOptionPane.WARNING_MESSAGE);  
    }else if(!PassTXT.getText().matches("^pass\\d{3}$"))
    {
    JOptionPane.showMessageDialog(null, "the passport shhould be valid","Passport",JOptionPane.WARNING_MESSAGE);
    
    }else{
        try {
            Registry reg=LocateRegistry.getRegistry("127.0.0.1", 5000);
            ImmigrantService deptservice=(ImmigrantService) reg.lookup("immigra");
            Immigrant dm =new Immigrant();
            dm.setFirstName(nameTXT.getText());
            ///////
              String passportToCheck = PassTXT.getText();
            int passportCount = deptservice.countPassport(passportToCheck);

            if (passportCount > 0) {
                JOptionPane.showMessageDialog(this, "Passport already exists!", "Duplicate Passport", JOptionPane.WARNING_MESSAGE);
                return; 
            }
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

            int selectedRow = immigraTb.getSelectedRow();

            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Please select an immigrant to delete.");
                return;
            }

            int ImmigrantId = (int) immigraTb.getValueAt(selectedRow, 0);

            Immigrant cnt=new Immigrant();
            cnt.setImmigrantID(ImmigrantId);
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
          if(PassTXT.getText().trim().isEmpty()||nameTXT.getText().trim().isEmpty()||countryCombo.getSelectedItem()==null||Intentlistdata1.isSelectionEmpty())  {
       JOptionPane.showMessageDialog(null, "All fields are Mandatory","Mandatory Field",JOptionPane.WARNING_MESSAGE);  
    }else if(!PassTXT.getText().matches("^pass\\d{3}$"))
    {
    JOptionPane.showMessageDialog(null, "the passport shhould be valid","Passport",JOptionPane.WARNING_MESSAGE);
    
    }else
           { 
                try {
                        Registry reg=LocateRegistry.getRegistry("127.0.0.1", 5000);
                        ImmigrantService embbb=(ImmigrantService) reg.lookup("immigra");
                          Immigrant dm =new Immigrant();
                          dm.setImmigrantID(Integer.parseInt(idTXT.getText()));
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
            
                        Immigrant theembcy=embbb.UpdateImmigra(dm);
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

    private void countryComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryComboActionPerformed

    private void displaybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaybtnActionPerformed
         int immigrantId = Integer.parseInt(idTXT.getText());
            displayVisasForImmigrant(immigrantId);
         
    }//GEN-LAST:event_displaybtnActionPerformed

    private void reportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBtnActionPerformed
       String reportsDirectory ="C:\\Users\\Naome\\Desktop\\Reports";

    String path = "";
        JFileChooser j = new JFileChooser(reportsDirectory);
    j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    j.setFileHidingEnabled(false);
   // JFileChooser j = new JFileChooser();
   // j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    int x = j.showSaveDialog(this);
    if (x == JFileChooser.APPROVE_OPTION) {
        // Get the selected directory
        File selectedDirectory = j.getSelectedFile();
        
        // Ensure the "Reports" directory exists, and create it if it doesn't
        File reportsDir = new File(selectedDirectory, "Reports");
        if (!reportsDir.exists()) {
            reportsDir.mkdirs();
        }
        
        
        String pdfFileName = JOptionPane.showInputDialog(this, "Enter PDF file name (without extension):");

        if (pdfFileName != null && !pdfFileName.isEmpty()) {
            
            path = reportsDir.getPath() + File.separator + pdfFileName + ".pdf";
            Document doc = new Document();
            try {
                PdfWriter.getInstance(doc, new FileOutputStream(path));
                doc.open();

                // Header
                Paragraph header = new Paragraph("IMMIGRANTS INFORMATIONS", new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD));
                doc.add(header);

                // Data
                Paragraph data = new Paragraph();
                for (int i = 0; i < immigraTb.getRowCount(); i++) {
                    String rowText = "Immigrant ID: " + immigraTb.getValueAt(i, 0) + "\n"
                            + "Immigrant Name: " + immigraTb.getValueAt(i, 1) + "\n"
                            + "Passport No: " + immigraTb.getValueAt(i, 2) + "\n"
                            + "When Enterd In Country: " + immigraTb.getValueAt(i, 3) + "\n"
                            + "From: " + immigraTb.getValueAt(i, 5) + "\n"
                            + "Possui Visas: " + immigraTb.getValueAt(i, 4) + "\n"
                            + "vIsiting Intention: " + immigraTb.getValueAt(i, 6) + "\n"
                           ;
                    data.add(new Paragraph(rowText, new Font(Font.FontFamily.HELVETICA, 12)));
                }
                doc.add(data);

                doc.close();
                JOptionPane.showMessageDialog(this, "PDF file saved successfully.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error while saving PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    
}
    }//GEN-LAST:event_reportBtnActionPerformed

    private void trybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trybtnActionPerformed
        // TODO add your handling code here:
        
        
           try {
            MessageFormat header = new MessageFormat("Expense Table");
            MessageFormat footer = new MessageFormat("0,number,interger");
            PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
            set.add(OrientationRequested.PORTRAIT);
            immigraTb.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, set, true);
            JOptionPane.showMessageDialog(null, "\n" + "Printed!");
        } catch (Exception e) {
            e.printStackTrace();
      }
    }//GEN-LAST:event_trybtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DelBtn;
    private javax.swing.JList<Intent> Intentlistdata1;
    private javax.swing.JTextField PassTXT;
    private javax.swing.JList<Visa> Visatlistdata;
    private javax.swing.JComboBox<Country> countryCombo;
    private javax.swing.JButton displaybtn;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nameTXT;
    private javax.swing.JButton regbtn;
    private javax.swing.JButton reportBtn;
    private javax.swing.JButton searchbtn;
    private javax.swing.JButton trybtn;
    private javax.swing.JButton updateBTN;
    // End of variables declaration//GEN-END:variables
}
