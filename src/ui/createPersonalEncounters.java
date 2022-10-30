/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Doctor;
import model.Encounter;
import model.EncounterDirectory;
import model.Hospital;
import model.HospitalDirectory;
import model.Patient;

/**
 *
 * @author shrey
 */
public class createPersonalEncounters extends javax.swing.JPanel {

    /**
     * Creates new form createEncounters
     */
    EncounterDirectory ecounterDirectory;
    HospitalDirectory hospitalDirectory;
    Patient p;
    
    public createPersonalEncounters(Patient p, EncounterDirectory ecounterDirectory, HospitalDirectory hospitalDirectory) {
        initComponents();
        this.p = p;
        this.ecounterDirectory = ecounterDirectory;
        this.hospitalDirectory = hospitalDirectory;
        populateHospitalComboBox(hospitalDirectory);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCreateEncounter = new javax.swing.JLabel();
        lblSelectHospital = new javax.swing.JLabel();
        lblSelectDoctor = new javax.swing.JLabel();
        hospitalComboBox = new javax.swing.JComboBox<>();
        doctorComboBox = new javax.swing.JComboBox<>();
        txtSymptoms = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        lblSymptoms = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        btnCreateEncounter = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 255, 255));

        lblCreateEncounter.setBackground(new java.awt.Color(255, 255, 255));
        lblCreateEncounter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCreateEncounter.setForeground(new java.awt.Color(255, 0, 0));
        lblCreateEncounter.setText("                                                                                         Create Encounter");

        lblSelectHospital.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSelectHospital.setText("Select Hospital :");

        lblSelectDoctor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSelectDoctor.setText("Select Doctor :");

        hospitalComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalComboBoxActionPerformed(evt);
            }
        });

        doctorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorComboBoxActionPerformed(evt);
            }
        });

        txtSymptoms.setPreferredSize(new java.awt.Dimension(72, 22));
        txtSymptoms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSymptomsActionPerformed(evt);
            }
        });

        lblDate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDate.setText("Enter Date :");

        lblSymptoms.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSymptoms.setText("Enter Symptoms:");

        txtDate.setPreferredSize(new java.awt.Dimension(72, 22));
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        btnCreateEncounter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCreateEncounter.setForeground(new java.awt.Color(255, 0, 0));
        btnCreateEncounter.setText("Create Encounter");
        btnCreateEncounter.setPreferredSize(new java.awt.Dimension(104, 30));
        btnCreateEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEncounterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCreateEncounter, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(lblSelectHospital)
                                        .addGap(98, 98, 98)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(hospitalComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtSymptoms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(doctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblDate)
                                            .addComponent(lblSymptoms)
                                            .addComponent(lblSelectDoctor))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(417, 417, 417)
                                .addComponent(btnCreateEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreateEncounter)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelectHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelectDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSymptoms, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSymptoms, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnCreateEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hospitalComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalComboBoxActionPerformed
        // TODO add your handling code here:
        String selectedHospital = hospitalComboBox.getSelectedItem().toString();
        populateDoctorComboBox(selectedHospital);
    }//GEN-LAST:event_hospitalComboBoxActionPerformed

    private void doctorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorComboBoxActionPerformed

    private void txtSymptomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSymptomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSymptomsActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void btnCreateEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEncounterActionPerformed
        // TODO add your handling code here:
        
        Encounter e = ecounterDirectory.addNewEncounter(p.getPatientId());
        
        e.setHospitalName(hospitalComboBox.getSelectedItem().toString());
        e.setDoctorName(doctorComboBox.getSelectedItem().toString());
        e.setEncounterSymptoms(txtSymptoms.getText());
        e.setEncounterDate(txtDate.getText());
        p.getPatientEncounters().add(e);
        
        JOptionPane.showMessageDialog(this, "Encounter Created!");
    }//GEN-LAST:event_btnCreateEncounterActionPerformed
    
    private void populateHospitalComboBox(HospitalDirectory hospitalDirectory)
    {
        for(Hospital h:hospitalDirectory.getHospitalDirectory())
        {
            hospitalComboBox.addItem(h.getHospitalName());
        }
    }
    
    private void populateDoctorComboBox(String selectedHospital)
    {
        doctorComboBox.removeAllItems();
        for(Hospital h:hospitalDirectory.getHospitalDirectory())
        {
            if(h.getHospitalName().equals(selectedHospital))
            {
                for(Doctor d:h.getHospitalDoctors())
                {
                    doctorComboBox.addItem(d.getName());
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateEncounter;
    private javax.swing.JComboBox<String> doctorComboBox;
    private javax.swing.JComboBox<String> hospitalComboBox;
    private javax.swing.JLabel lblCreateEncounter;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblSelectDoctor;
    private javax.swing.JLabel lblSelectHospital;
    private javax.swing.JLabel lblSymptoms;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtSymptoms;
    // End of variables declaration//GEN-END:variables
}
