/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.EncounterDirectory;
import model.Patient;
import model.PatientDirectory;

/**
 *
 * @author shrey
 */
public class viewAllEncounters extends javax.swing.JPanel {

    /**
     * Creates new form viewAllEncounters
     */
    EncounterDirectory ecounterDirectory;
    PatientDirectory patientDirectory;
    
    public viewAllEncounters(EncounterDirectory ecounterDirectory, PatientDirectory patientDirectory) {
        initComponents();
        this.patientDirectory = patientDirectory;
        this.ecounterDirectory = ecounterDirectory;
        populateTable(ecounterDirectory);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblViewEncounters = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncounters = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 255, 255));

        lblViewEncounters.setBackground(new java.awt.Color(255, 255, 255));
        lblViewEncounters.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblViewEncounters.setForeground(new java.awt.Color(255, 0, 0));
        lblViewEncounters.setText("                                                                                         View Encounters");

        tblEncounters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Encounter Date", "Doctor Name", "Hospital Name", "Symptoms"
            }
        ));
        tblEncounters.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblEncounters);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblViewEncounters, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewEncounters, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(327, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateTable(EncounterDirectory ecounterDirectory)
    {
        DefaultTableModel model = (DefaultTableModel) tblEncounters.getModel();
        model.setRowCount(0);
        
        for(Encounter e:ecounterDirectory.getEncounterDirectory())
        {
            Object[] row = new Object[5];
            row[0] = name(e);
            row[1] = e;
            row[2] = e.getDoctorName();
            row[3] = e.getHospitalName();
            row[4] = e.getEncounterSymptoms();
            model.addRow(row);
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblViewEncounters;
    private javax.swing.JTable tblEncounters;
    // End of variables declaration//GEN-END:variables
}
