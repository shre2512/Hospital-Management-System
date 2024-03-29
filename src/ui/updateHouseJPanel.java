/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.House;
import model.HouseDirectory;

/**
 *
 * @author shrey
 */
public class updateHouseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewHouseJPanel
     */
    HouseDirectory houseDirectory;
    
    public updateHouseJPanel(HouseDirectory houseDirectory) {
        initComponents();
        this.houseDirectory = houseDirectory;
        txtCityName.setEditable(false);
        txtCommunityName.setEditable(false);
        populateTable();
    }
    
    private void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) tableViewHouses.getModel();
        model.setRowCount(0);
        
        for(House h:houseDirectory.getHouseDirectory())
        {
            Object[] row = new Object[3];
            row[0] = h;
            row[1] = h.getCommunityName();
            row[2] = h.getCityName();
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

        lblViewHouses = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableViewHouses = new javax.swing.JTable();
        lblCityName = new javax.swing.JLabel();
        txtCityName = new javax.swing.JTextField();
        lblStateName = new javax.swing.JLabel();
        txtCommunityName = new javax.swing.JTextField();
        txtHouseAddress = new javax.swing.JTextField();
        lblStateName1 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 255, 255));

        lblViewHouses.setBackground(new java.awt.Color(255, 255, 255));
        lblViewHouses.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblViewHouses.setForeground(new java.awt.Color(255, 0, 0));
        lblViewHouses.setText("                                                                                    Select a House to Update");

        tableViewHouses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "House Address", "Community Name", "City Name"
            }
        ));
        tableViewHouses.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableViewHouses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableViewHousesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableViewHouses);

        lblCityName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCityName.setText("City Name :");

        txtCityName.setPreferredSize(new java.awt.Dimension(71, 30));
        txtCityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityNameActionPerformed(evt);
            }
        });

        lblStateName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblStateName.setText("Community Name :");

        txtCommunityName.setPreferredSize(new java.awt.Dimension(71, 30));
        txtCommunityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityNameActionPerformed(evt);
            }
        });

        txtHouseAddress.setPreferredSize(new java.awt.Dimension(71, 30));
        txtHouseAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHouseAddressActionPerformed(evt);
            }
        });

        lblStateName1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblStateName1.setText("Enter House Address :");

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblViewHouses, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStateName)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStateName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHouseAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(337, 337, 337))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(494, 494, 494)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(338, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewHouses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblStateName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHouseAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStateName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(228, 228, 228)
                    .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(33, 33, 33)
                    .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(229, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityNameActionPerformed

    private void txtCommunityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityNameActionPerformed

    private void txtHouseAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHouseAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseAddressActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String validate = validationCheck();
        if(!validate.isEmpty())
        {
            JOptionPane.showMessageDialog(this, validate);
        }
        else
        {
            int selectedRowIndex = tableViewHouses.getSelectedRow();
            if(selectedRowIndex < 0)
            {
                JOptionPane.showMessageDialog(this, "Please Select a row to update");
            }
            DefaultTableModel model = (DefaultTableModel) tableViewHouses.getModel();
            House selectedHouse = (House) model.getValueAt(selectedRowIndex, 0);
            selectedHouse.setStreetAddress(txtHouseAddress.getText());
            JOptionPane.showMessageDialog(this, "Info Updated Successfully!");
            txtCityName.setText("");
            txtCommunityName.setText("");
            txtHouseAddress.setText("");
            populateTable();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tableViewHousesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableViewHousesMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableViewHouses.getModel();
        int selectedRowIndex = tableViewHouses.getSelectedRow();
        House selectedHouse = (House) model.getValueAt(selectedRowIndex, 0);
        txtCityName.setText(selectedHouse.getCityName());
        txtCommunityName.setText(selectedHouse.getCommunityName());
    }//GEN-LAST:event_tableViewHousesMouseClicked
    
    private String validationCheck()
    {
        if(txtHouseAddress.getText().isEmpty())
        {
            return "Please fill all fields!";
        }
        return "";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCityName;
    private javax.swing.JLabel lblStateName;
    private javax.swing.JLabel lblStateName1;
    private javax.swing.JLabel lblViewHouses;
    private javax.swing.JTable tableViewHouses;
    private javax.swing.JTextField txtCityName;
    private javax.swing.JTextField txtCommunityName;
    private javax.swing.JTextField txtHouseAddress;
    // End of variables declaration//GEN-END:variables
}
