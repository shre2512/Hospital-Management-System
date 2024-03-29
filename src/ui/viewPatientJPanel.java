/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.table.DefaultTableModel;
import model.Patient;
import model.PatientDirectory;

/**
 *
 * @author shrey
 */
public class viewPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewPatientJPanel
     */
    PatientDirectory patientDirectory;
    
    public viewPatientJPanel(PatientDirectory patientDirectory) {
        initComponents();
        this.patientDirectory = patientDirectory;
        populatePatientTable(patientDirectory);
    }
    
    private void populatePatientTable(PatientDirectory patientDirectory)
    {
        DefaultTableModel model = (DefaultTableModel) tablePatient.getModel();
        model.setRowCount(0);
        
        for(Patient p:patientDirectory.getPatientDirectory())
        {
            Object[] row = new Object[8];
            row[0] = p.getPatientId();
            row[1] = p;
            row[2] = p.getAge();
            row[3] = p.getGender();
            row[4] = p.getEmailId();
            row[5] = p.getPhoneNumber();
            row[6] = p.getPatientWeight();
            row[7] = p.getPatientBloodGroup();
            model.addRow(row);
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

        lblViewPatients = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePatient = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 255, 255));

        lblViewPatients.setBackground(new java.awt.Color(255, 255, 255));
        lblViewPatients.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblViewPatients.setForeground(new java.awt.Color(255, 0, 0));
        lblViewPatients.setText("                                                                                 Patient Directory");

        tablePatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Id", "Name", "Age", "Gender", "Email ID", "Phone", "Weight", "Blood Group"
            }
        ));
        jScrollPane2.setViewportView(tablePatient);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblViewPatients, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(331, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblViewPatients;
    private javax.swing.JTable tablePatient;
    // End of variables declaration//GEN-END:variables
}
