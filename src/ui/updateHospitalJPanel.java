/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Community;
import model.Hospital;
import model.HospitalDirectory;

/**
 *
 * @author shrey
 */
public class updateHospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewHospitalJPanel
     */
    HospitalDirectory hospitalDirectory;
    
    public updateHospitalJPanel(HospitalDirectory hospitalDirectory) {
        initComponents();
        this.hospitalDirectory = hospitalDirectory;
        txtCityName.setEditable(false);
        txtCommunityName.setEditable(false);
        populateTable();
    }
    
    private void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) tableViewHospitals.getModel();
        model.setRowCount(0);
        
        for(Hospital h:hospitalDirectory.getHospitalDirectory())
        {
            Object[] row = new Object[4];
            row[0] = h;
            row[1] = h.getHospitalZip();
            row[2] = h.getHospitalCommunity();
            row[3] = h.getHospitalCity();
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

        lblViewHospitals = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableViewHospitals = new javax.swing.JTable();
        txtCityName = new javax.swing.JTextField();
        txtCommunityName = new javax.swing.JTextField();
        lblCityName = new javax.swing.JLabel();
        lblCommunityName = new javax.swing.JLabel();
        txtHospitalZip = new javax.swing.JTextField();
        txtHospitalName = new javax.swing.JTextField();
        lblHospitalZip = new javax.swing.JLabel();
        lblHospitalName = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 255, 255));

        lblViewHospitals.setBackground(new java.awt.Color(255, 255, 255));
        lblViewHospitals.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblViewHospitals.setForeground(new java.awt.Color(255, 0, 0));
        lblViewHospitals.setText("                                                                                 Select a Hospital to Update");

        tableViewHospitals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hospital Name", "Hospital Zipcode", "Community Name", "City Name"
            }
        ));
        tableViewHospitals.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableViewHospitals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableViewHospitalsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableViewHospitals);

        txtCityName.setPreferredSize(new java.awt.Dimension(71, 30));
        txtCityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityNameActionPerformed(evt);
            }
        });

        txtCommunityName.setPreferredSize(new java.awt.Dimension(71, 30));
        txtCommunityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityNameActionPerformed(evt);
            }
        });

        lblCityName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCityName.setText("City Name :");

        lblCommunityName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCommunityName.setText("Community Name :");

        txtHospitalZip.setPreferredSize(new java.awt.Dimension(71, 30));
        txtHospitalZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalZipActionPerformed(evt);
            }
        });

        txtHospitalName.setPreferredSize(new java.awt.Dimension(71, 30));
        txtHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalNameActionPerformed(evt);
            }
        });

        lblHospitalZip.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblHospitalZip.setText("Hospital Zipcode :");

        lblHospitalName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblHospitalName.setText("Hospital Name :");

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 0, 0));
        btnUpdate.setText("Update");
        btnUpdate.setPreferredSize(new java.awt.Dimension(104, 30));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblViewHospitals, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHospitalZip)
                                .addGap(88, 88, 88))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHospitalZip, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHospitalName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(338, 338, 338))
            .addGroup(layout.createSequentialGroup()
                .addGap(418, 418, 418)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(304, 304, 304)
                    .addComponent(lblCommunityName)
                    .addGap(86, 86, 86)
                    .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(338, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewHospitals)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospitalZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHospitalZip, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(291, 291, 291)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(228, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityNameActionPerformed

    private void txtCommunityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityNameActionPerformed

    private void txtHospitalZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalZipActionPerformed

    private void txtHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalNameActionPerformed

    private void tableViewHospitalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableViewHospitalsMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableViewHospitals.getModel();
        int selectedRowIndex = tableViewHospitals.getSelectedRow();
        Hospital selectedHospital = (Hospital) model.getValueAt(selectedRowIndex, 0);
        txtCityName.setText(selectedHospital.getHospitalCity());
        txtCommunityName.setText(selectedHospital.getHospitalCommunity());
    }//GEN-LAST:event_tableViewHospitalsMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        String validate = validationCheck();
        if(!validate.isEmpty())
        {
            JOptionPane.showMessageDialog(this, validate);
        }
        else
        {
            int selectedRowIndex = tableViewHospitals.getSelectedRow();
            if(selectedRowIndex < 0)
            {
                JOptionPane.showMessageDialog(this, "Please Select a row to update");
            }
            DefaultTableModel model = (DefaultTableModel) tableViewHospitals.getModel();
            Hospital selectedHospital = (Hospital) model.getValueAt(selectedRowIndex, 0);
            selectedHospital.setHospitalName(txtHospitalName.getText());
            selectedHospital.setHospitalZip(txtHospitalZip.getText());
            JOptionPane.showMessageDialog(this, "Info Updated Successfully!");
            txtCityName.setText("");
            txtCommunityName.setText("");
            txtHospitalName.setText("");
            txtHospitalZip.setText("");
            populateTable();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed
    
    private String validationCheck()
    {
        if(txtHospitalName.getText().isEmpty() || txtHospitalZip.getText().isEmpty())
        {
            return "Please fill all fields!";
        }
        return "";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCityName;
    private javax.swing.JLabel lblCommunityName;
    private javax.swing.JLabel lblHospitalName;
    private javax.swing.JLabel lblHospitalZip;
    private javax.swing.JLabel lblViewHospitals;
    private javax.swing.JTable tableViewHospitals;
    private javax.swing.JTextField txtCityName;
    private javax.swing.JTextField txtCommunityName;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtHospitalZip;
    // End of variables declaration//GEN-END:variables
}