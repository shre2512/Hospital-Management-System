/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.Encounter;
import model.EncounterDirectory;
import model.Patient;
import model.PatientDirectory;
import model.VitalSigns;
import model.VitalSignsDirectory;

/**
 *
 * @author shrey
 */
public class createVitalSigns extends javax.swing.JPanel {

    /**
     * Creates new form viewDoctorEncounters
     */
    Doctor d;
    EncounterDirectory ed;
    PatientDirectory patientDirectory;
    VitalSignsDirectory vitalSignsDirectory;
    
    public createVitalSigns(Doctor d, EncounterDirectory ed, PatientDirectory patientDirectory, VitalSignsDirectory vitalSignsDirectory) {
        initComponents();
        this.d = d;
        this.ed = ed;
        this.patientDirectory = patientDirectory;
        this.vitalSignsDirectory = vitalSignsDirectory;
        txtUID.setEditable(false);
        populateTable(d, ed);
    }
    
    private void populateTable(Doctor d, EncounterDirectory ed)
    {
        DefaultTableModel model = (DefaultTableModel) tblEncounters.getModel();
        model.setRowCount(0);
        
        for(Encounter e:ed.getEncounterDirectory())
        {
            if(d.getName().equals(e.getDoctorName()))
            {
                Object[] row = new Object[5];
                row[0] = e.getEncounterID();
                row[1] = name(e);
                row[2] = e;
                row[3] = e.getHospitalName();
                row[4] = e.getEncounterSymptoms();
                model.addRow(row);
            }
        }
    }
    
    private String name(Encounter e)
    {
        for(Patient p:patientDirectory.getPatientDirectory())
        {
            if(p.getPatientId() == e.getPatientID())
            {
                return p.getName();
            }
        }
        return "";
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectEncounter = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEncounters = new javax.swing.JTable();
        txtPulseRate = new javax.swing.JTextField();
        lblEncounterID = new javax.swing.JLabel();
        lblBodyTemperature = new javax.swing.JLabel();
        lblPulseRate = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        txtUID = new javax.swing.JTextField();
        txtBodyTemperature = new javax.swing.JTextField();
        lblRespirationRate = new javax.swing.JLabel();
        txtRespirationRate = new javax.swing.JTextField();
        lblBloodPressure = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 255, 255));

        selectEncounter.setBackground(new java.awt.Color(255, 255, 255));
        selectEncounter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        selectEncounter.setForeground(new java.awt.Color(255, 0, 0));
        selectEncounter.setText("                                                                           Select an Encounter to create Vital Signs");

        tblEncounters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Encounter ID", "Patient Name", "Encounter Date", "Hospital Name", "Symptoms"
            }
        ));
        tblEncounters.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblEncounters.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEncountersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEncounters);

        txtPulseRate.setPreferredSize(new java.awt.Dimension(72, 22));

        lblEncounterID.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblEncounterID.setText("Encounter ID :");

        lblBodyTemperature.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblBodyTemperature.setText("Body Temperature :");

        lblPulseRate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblPulseRate.setText("Pulse Rate :");

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 0, 0));
        btnUpdate.setText("Create");
        btnUpdate.setPreferredSize(new java.awt.Dimension(104, 30));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtUID.setPreferredSize(new java.awt.Dimension(72, 22));

        txtBodyTemperature.setPreferredSize(new java.awt.Dimension(72, 22));
        txtBodyTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBodyTemperatureActionPerformed(evt);
            }
        });

        lblRespirationRate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblRespirationRate.setText("Respiration Rate :");

        txtRespirationRate.setPreferredSize(new java.awt.Dimension(72, 22));
        txtRespirationRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespirationRateActionPerformed(evt);
            }
        });

        lblBloodPressure.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblBloodPressure.setText("Blood Pressure :");

        txtBloodPressure.setPreferredSize(new java.awt.Dimension(72, 22));
        txtBloodPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodPressureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPulseRate)
                            .addComponent(lblEncounterID)
                            .addComponent(lblBodyTemperature)
                            .addComponent(lblRespirationRate)
                            .addComponent(lblBloodPressure))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBodyTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUID, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(331, 331, 331))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectEncounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEncounterID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBodyTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBodyTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        String validate = validationCheck();
        if(!validate.isEmpty())
        {
            JOptionPane.showMessageDialog(this, validate);
        }
        else
        {
            int selectedRowIndex = tblEncounters.getSelectedRow();
            if(selectedRowIndex < 0)
            {
                JOptionPane.showMessageDialog(this, "Please Select an encounter to create Vital Signs");
            }
            DefaultTableModel model = (DefaultTableModel) tblEncounters.getModel();
            Encounter selectedEncounter = (Encounter) model.getValueAt(selectedRowIndex, 2);
            VitalSigns vs = vitalSignsDirectory.addNewVitalSigns();
            selectedEncounter.getEncounterVitalSigns().add(vs);
            vs.setDoctorID(d.getDoctorId());
            vs.setPatientBloodPressure(Integer.parseInt(txtBloodPressure.getText()));
            vs.setPatientBodyTemperature(Integer.parseInt(txtBodyTemperature.getText()));
            vs.setPatientPulseRate(Integer.parseInt(txtPulseRate.getText()));
            vs.setPatientRespirationRate(Integer.parseInt(txtRespirationRate.getText()));
            vs.setEncounterID(selectedEncounter.getEncounterID());
            vs.setEncounterDate(selectedEncounter.getEncounterDate());
            JOptionPane.showMessageDialog(this, "Vital Signs Added!");
            clearFormText();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblEncountersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEncountersMouseClicked
        // TODO add your handling code here:
        Encounter e = (Encounter)tblEncounters.getValueAt(tblEncounters.getSelectedRow(), 2);
        txtUID.setText(String.valueOf(e.getEncounterID()));
    }//GEN-LAST:event_tblEncountersMouseClicked

    private void txtBodyTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBodyTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBodyTemperatureActionPerformed

    private void txtRespirationRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespirationRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespirationRateActionPerformed

    private void txtBloodPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodPressureActionPerformed

    private void clearFormText()
    {
        txtUID.setText("");
        txtBloodPressure.setText("");
        txtBodyTemperature.setText("");
        txtPulseRate.setText("");
        txtRespirationRate.setText("");
    }
    
    private String validationCheck()
    {
        if(txtRespirationRate.getText().isEmpty() || txtPulseRate.getText().isEmpty() || txtBloodPressure.getText().isEmpty() || txtBodyTemperature.getText().isEmpty())
        {
            return "Please fill all fields!";
        }
        try
        {
            int respirationRate = Integer.parseInt(txtRespirationRate.getText());
        }
        catch(NumberFormatException ex)
        {
            return "Respiration Rate has to be a Number!";
        }
        try
        {
            int pulseRate = Integer.parseInt(txtPulseRate.getText());
        }
        catch(NumberFormatException ex)
        {
            return "Pulse Rate has to be a Number!";
        }
        try
        {
            int bloodPressure = Integer.parseInt(txtBloodPressure.getText());
        }
        catch(NumberFormatException ex)
        {
            return "Blood Pressure has to be a Number!";
        }
        try
        {
            int bodyTemp = Integer.parseInt(txtBodyTemperature.getText());
        }
        catch(NumberFormatException ex)
        {
            return "Body Temperature Rate has to be a Number!";
        }
        return "";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblBodyTemperature;
    private javax.swing.JLabel lblEncounterID;
    private javax.swing.JLabel lblPulseRate;
    private javax.swing.JLabel lblRespirationRate;
    private javax.swing.JLabel selectEncounter;
    private javax.swing.JTable tblEncounters;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtBodyTemperature;
    private javax.swing.JTextField txtPulseRate;
    private javax.swing.JTextField txtRespirationRate;
    private javax.swing.JTextField txtUID;
    // End of variables declaration//GEN-END:variables
}
