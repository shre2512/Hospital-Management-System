/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.table.DefaultTableModel;
import model.City;
import model.CityDirectory;
/**
 *
 * @author shrey
 */
public class viewCityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewCityJPanel
     */
     CityDirectory cityDirectory;
     
    public viewCityJPanel( CityDirectory cityDirectory) {
        initComponents();
        this.cityDirectory = cityDirectory;
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

        setBackground(new java.awt.Color(0, 255, 255));

        lblViewCity.setBackground(new java.awt.Color(255, 255, 255));
        lblViewCity.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblViewCity.setForeground(new java.awt.Color(255, 0, 0));
        lblViewCity.setText("                                                                             View Cites");

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
        jScrollPane1.setViewportView(viewCityTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewCity, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewCity)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(331, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblViewCity;
    private javax.swing.JTable viewCityTable;
    // End of variables declaration//GEN-END:variables
}
