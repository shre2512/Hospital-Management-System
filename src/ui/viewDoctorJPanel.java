/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.DoctorDirectory;

/**
 *
 * @author shrey
 */
public class viewDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewPatientJPanel
     */
    DoctorDirectory doctorDirectory;
    
    public viewDoctorJPanel(DoctorDirectory doctorDirectory) {
        initComponents();
        this.doctorDirectory = doctorDirectory;
        populateDoctorTable(doctorDirectory);
    }
    
    private void populateDoctorTable(DoctorDirectory doctorDirectory)
    {
        DefaultTableModel model = (DefaultTableModel) tableDoctors.getModel();
        model.setRowCount(0);
        
        for(Doctor d:doctorDirectory.getDoctorDirectory())
        {
            Object[] row = new Object[7];
            row[0] = d.getDoctorId();
            row[1] = d;
            row[2] = d.getAge();
            row[3] = d.getGender();
            row[4] = d.getEmailId();
            row[5] = d.getPhoneNumber();
            row[6] = d.getDoctorSpecialization();
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

        lblViewDoctors = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDoctors = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 255, 255));

        lblViewDoctors.setBackground(new java.awt.Color(255, 255, 255));
        lblViewDoctors.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblViewDoctors.setForeground(new java.awt.Color(255, 0, 0));
        lblViewDoctors.setText("                                                                                 Doctor Directory");

        tableDoctors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Doctor Id", "Name", "Age", "Gender", "Email ID", "Phone", "Specialization"
            }
        ));
        jScrollPane2.setViewportView(tableDoctors);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblViewDoctors, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(331, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblViewDoctors;
    private javax.swing.JTable tableDoctors;
    // End of variables declaration//GEN-END:variables
}
