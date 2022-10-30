/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.CityDirectory;
import model.Community;
import model.CommunityDirectory;
import model.Doctor;
import model.DoctorDirectory;
import model.Hospital;
import model.HospitalDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author shrey
 */
public class createDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form createPatientJPanel
     */
    CityDirectory cityDirectory;
    CommunityDirectory communityDirectory;
    PersonDirectory personDirectory;
    DoctorDirectory doctorDirectory;
    HospitalDirectory hospitalDirectory;
    
    public createDoctorJPanel(CityDirectory cityDirectory, CommunityDirectory communityDirectory, PersonDirectory personDirectory, DoctorDirectory doctorDirectory, HospitalDirectory hospitalDirectory) {
        initComponents();
        this.cityDirectory = cityDirectory;
        this.communityDirectory = communityDirectory;
        this.personDirectory = personDirectory;
        this.doctorDirectory = doctorDirectory;
        this.hospitalDirectory = hospitalDirectory;
        txtUID.setEditable(false);
        populateCityComboBox(cityDirectory);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFilterSelect = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblViewPerson = new javax.swing.JTable();
        lblPassWord = new javax.swing.JLabel();
        lblCommunityName = new javax.swing.JLabel();
        selectCommunityCombo = new javax.swing.JComboBox<>();
        btnFilter = new javax.swing.JButton();
        txtUID = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        lblCityName = new javax.swing.JLabel();
        txtDoctorSpecialization = new javax.swing.JTextField();
        btnCreateDoctor = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        lblSpecialization = new javax.swing.JLabel();
        lblDoctorUID = new javax.swing.JLabel();
        selectCityCombo = new javax.swing.JComboBox<>();
        hospitalComboBox = new javax.swing.JComboBox<>();
        selectHospitalCombo = new javax.swing.JLabel();
        txtPassWord = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(0, 255, 255));

        lblFilterSelect.setBackground(new java.awt.Color(255, 255, 255));
        lblFilterSelect.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFilterSelect.setForeground(new java.awt.Color(255, 0, 0));
        lblFilterSelect.setText("                                                                                      Filter and Select a Person");

        tblViewPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Gender", "Email", "Age", "Phone", "Address", "Community", "City"
            }
        ));
        tblViewPerson.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblViewPerson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblViewPersonMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblViewPerson);

        lblPassWord.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPassWord.setText("Create Password :");

        lblCommunityName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCommunityName.setText("Select Community : ");

        selectCommunityCombo.setPreferredSize(new java.awt.Dimension(72, 30));
        selectCommunityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCommunityComboActionPerformed(evt);
            }
        });

        btnFilter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFilter.setForeground(new java.awt.Color(255, 0, 0));
        btnFilter.setText("Filter");
        btnFilter.setPreferredSize(new java.awt.Dimension(104, 30));
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        txtUID.setPreferredSize(new java.awt.Dimension(72, 22));

        txtUserName.setPreferredSize(new java.awt.Dimension(72, 22));

        lblCityName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCityName.setText("Select City :");

        txtDoctorSpecialization.setPreferredSize(new java.awt.Dimension(72, 22));
        txtDoctorSpecialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorSpecializationActionPerformed(evt);
            }
        });

        btnCreateDoctor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCreateDoctor.setForeground(new java.awt.Color(255, 0, 0));
        btnCreateDoctor.setText("Create Doctor");
        btnCreateDoctor.setPreferredSize(new java.awt.Dimension(104, 30));
        btnCreateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDoctorActionPerformed(evt);
            }
        });

        lblUserName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUserName.setText("Create Username :");

        lblSpecialization.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSpecialization.setText("Enter Specialization :");

        lblDoctorUID.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDoctorUID.setText("Doctor Unique ID :");

        selectCityCombo.setPreferredSize(new java.awt.Dimension(72, 30));
        selectCityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCityComboActionPerformed(evt);
            }
        });

        hospitalComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalComboBoxActionPerformed(evt);
            }
        });

        selectHospitalCombo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        selectHospitalCombo.setText("Select Hospital :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFilterSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 1051, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(285, 285, 285)
                                        .addComponent(lblCommunityName)
                                        .addGap(105, 105, 105))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(lblCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(71, 71, 71)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectCommunityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selectCityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(458, 458, 458)
                                .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 326, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(457, 457, 457)
                .addComponent(btnCreateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDoctorUID, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblUserName, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(lblPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(selectHospitalCombo)
                                .addGap(8, 8, 8)))
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDoctorSpecialization, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(txtUID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hospitalComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassWord))
                .addGap(332, 332, 332))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFilterSelect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectCityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectCommunityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDoctorUID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtUID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctorSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectHospitalCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btnCreateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectCommunityComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCommunityComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectCommunityComboActionPerformed

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        // TODO add your handling code here:
        String selectedCity = selectCityCombo.getSelectedItem().toString();
        String selectedCommunity = selectCommunityCombo.getSelectedItem().toString();
        populatePersonTable(selectedCity, selectedCommunity);
        populateHospitalComboBox(selectedCity, selectedCommunity);
    }//GEN-LAST:event_btnFilterActionPerformed

    private void txtDoctorSpecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorSpecializationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorSpecializationActionPerformed

    private void btnCreateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDoctorActionPerformed
        // TODO add your handling code here:
        
        String validate = validationCheck();
        if(!validate.isEmpty())
        {
            JOptionPane.showMessageDialog(this, validate);
        }
        else
        {
            Doctor d = doctorDirectory.addNewDoctor(Integer.parseInt(txtUID.getText()), txtUserName.getText(), txtPassWord.getText());
            d.setName(tblViewPerson.getValueAt(tblViewPerson.getSelectedRow(), 0).toString());
            d.setGender(tblViewPerson.getValueAt(tblViewPerson.getSelectedRow(), 1).toString());
            d.setEmailId(tblViewPerson.getValueAt(tblViewPerson.getSelectedRow(), 2).toString());
            d.setAge(Integer.parseInt(tblViewPerson.getValueAt(tblViewPerson.getSelectedRow(), 3).toString()));
            d.setPhoneNumber(tblViewPerson.getValueAt(tblViewPerson.getSelectedRow(), 4).toString());
            d.setHouseAddress(tblViewPerson.getValueAt(tblViewPerson.getSelectedRow(), 5).toString());
            d.setCommunityName(tblViewPerson.getValueAt(tblViewPerson.getSelectedRow(), 6).toString());
            d.setCityName(tblViewPerson.getValueAt(tblViewPerson.getSelectedRow(), 7).toString());
            d.setDoctorSpecialization(txtDoctorSpecialization.getText());
            d.setHospitalName(hospitalComboBox.getSelectedItem().toString());

            for(Hospital h:hospitalDirectory.getHospitalDirectory())
            {
                if(h.getHospitalName().equals(hospitalComboBox.getSelectedItem().toString()))
                {
                    h.getHospitalDoctors().add(d);
                } 
            }
            JOptionPane.showMessageDialog(this, "Doctor Created!");
            txtUID.setText("");
            txtUserName.setText("");
            txtPassWord.setText("");
            txtDoctorSpecialization.setText("");
        }
    }//GEN-LAST:event_btnCreateDoctorActionPerformed

    private void tblViewPersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblViewPersonMouseClicked
        // TODO add your handling code here:
        Person p = (Person)tblViewPerson.getValueAt(tblViewPerson.getSelectedRow(), 0);
        txtUID.setText(String.valueOf(p.getPersonId()));
    }//GEN-LAST:event_tblViewPersonMouseClicked

    private void selectCityComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCityComboActionPerformed
        // TODO add your handling code here:
        String selectedCity = selectCityCombo.getSelectedItem().toString();
        populateCommunityComboBox(selectedCity);
    }//GEN-LAST:event_selectCityComboActionPerformed

    private void hospitalComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalComboBoxActionPerformed

    private void populateCityComboBox(CityDirectory cityDirectory)
    {
        for(City c:cityDirectory.getCityDirectory())
        {
            selectCityCombo.addItem(c.getCityName());
        }
    }
    
    private void populateCommunityComboBox(String selectedCity)
    {
        selectCommunityCombo.removeAllItems();
        for(Community cm:communityDirectory.getCommunityDirectory())
        {
            if(cm.getCityName().equals(selectedCity))
            {
                selectCommunityCombo.addItem(cm.getCommunityName());
            }
        }
    }
    
    private void populatePersonTable(String selectedCity, String selectedCommunity)
    {
        DefaultTableModel model = (DefaultTableModel) tblViewPerson.getModel();
        model.setRowCount(0);
        
        for(Person p:personDirectory.getPersonDirectory())
        {
            if(p.getCityName().equals(selectedCity) && p.getCommunityName().equals(selectedCommunity))
            {
                Object[] row = new Object[8];
                row[0] = p;
                row[1] = p.getGender();
                row[2] = p.getEmailId();
                row[3] = p.getAge();
                row[4] = p.getPhoneNumber();
                row[5] = p.getHouseAddress();
                row[6] = p.getCommunityName();
                row[7] = p.getCityName();
                model.addRow(row);
            }
        }
    }
    
    private void populateHospitalComboBox(String selectedCity, String selectedCommunity)
    {
        hospitalComboBox.removeAllItems();
        for(Hospital h:hospitalDirectory.getHospitalDirectory())
        {
            if(h.getHospitalCommunity().equals(selectedCommunity) && h.getHospitalCity().equals(selectedCity))
            {
                hospitalComboBox.addItem(h.getHospitalName());
            }
        }
    }
    
    private String validationCheck()
    {
        if(txtUserName.getText().isEmpty() || txtPassWord.getText().isEmpty() || txtDoctorSpecialization.getText().isEmpty())
        {
            return "Please fill all fields!";
        }
        return "";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateDoctor;
    private javax.swing.JButton btnFilter;
    private javax.swing.JComboBox<String> hospitalComboBox;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCityName;
    private javax.swing.JLabel lblCommunityName;
    private javax.swing.JLabel lblDoctorUID;
    private javax.swing.JLabel lblFilterSelect;
    private javax.swing.JLabel lblPassWord;
    private javax.swing.JLabel lblSpecialization;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JComboBox<String> selectCityCombo;
    private javax.swing.JComboBox<String> selectCommunityCombo;
    private javax.swing.JLabel selectHospitalCombo;
    private javax.swing.JTable tblViewPerson;
    private javax.swing.JTextField txtDoctorSpecialization;
    private javax.swing.JPasswordField txtPassWord;
    private javax.swing.JTextField txtUID;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
