/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.CityDirectory;
/**
 *
 * @author shrey
 */
public class updateCityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewCityJPanel
     */
     CityDirectory cityDirectory;
     
    public updateCityJPanel(CityDirectory cityDirectory) {
        initComponents();
        this.cityDirectory = cityDirectory;
        txtStateName.setEditable(false);
        populateTable();
    }
    private void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) viewCityTable.getModel();
        model.setRowCount(0);
        
        for(City c:cityDirectory.getCityDirectory())
        {
            Object[] row = new Object[2];
            row[0] = c;
            row[1] = c.getStateName();
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

        lblViewCity = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewCityTable = new javax.swing.JTable();
        txtCityName = new javax.swing.JTextField();
        txtStateName = new javax.swing.JTextField();
        lblStateName = new javax.swing.JLabel();
        lblCityName = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 255, 255));

        lblViewCity.setBackground(new java.awt.Color(255, 255, 255));
        lblViewCity.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblViewCity.setForeground(new java.awt.Color(255, 0, 0));
        lblViewCity.setText("                                                                             Select a city to Update");

        viewCityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "City Name", "State Name"
            }
        ));
        viewCityTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        viewCityTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewCityTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viewCityTable);

        txtCityName.setPreferredSize(new java.awt.Dimension(71, 30));
        txtCityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityNameActionPerformed(evt);
            }
        });

        txtStateName.setPreferredSize(new java.awt.Dimension(71, 30));
        txtStateName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateNameActionPerformed(evt);
            }
        });

        lblStateName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblStateName.setText("State Name :");

        lblCityName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCityName.setText("Enter City Name :");

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
                            .addComponent(lblViewCity, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblStateName)
                                        .addGap(68, 68, 68)
                                        .addComponent(txtStateName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(289, 289, 289)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblViewCity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStateName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStateName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewCityTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCityTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) viewCityTable.getModel();
        int selectedRowIndex = viewCityTable.getSelectedRow();
        City selectedCity = (City) model.getValueAt(selectedRowIndex, 0);
        txtStateName.setText(selectedCity.getStateName());
    }//GEN-LAST:event_viewCityTableMouseClicked

    private void txtCityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityNameActionPerformed

    private void txtStateNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateNameActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        String validate = validationCheck();
        if(!validate.isEmpty())
        {
            JOptionPane.showMessageDialog(this, validate);
        }
        else
        {
            int selectedRowIndex = viewCityTable.getSelectedRow();
            if(selectedRowIndex < 0)
            {
                JOptionPane.showMessageDialog(this, "Please Select a row to update");
            }
            DefaultTableModel model = (DefaultTableModel) viewCityTable.getModel();
            City selectedCity = (City) model.getValueAt(selectedRowIndex, 0);
            selectedCity.setCityName(txtCityName.getText());
            JOptionPane.showMessageDialog(this, "Info Updated Successfully!");
            txtCityName.setText("");
            txtStateName.setText("");
            populateTable();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private String validationCheck()
    {
        if(txtCityName.getText().isEmpty())
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
    private javax.swing.JLabel lblViewCity;
    private javax.swing.JTextField txtCityName;
    private javax.swing.JTextField txtStateName;
    private javax.swing.JTable viewCityTable;
    // End of variables declaration//GEN-END:variables
}
