/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.table.DefaultTableModel;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author shrey
 */
public class viewPersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewPersonJPanel
     */
    
    PersonDirectory personDirectory;
    
    public viewPersonJPanel(PersonDirectory personDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
        populatePersonTable();
    }
    
    private void populatePersonTable()
    {
        DefaultTableModel model = (DefaultTableModel) tableViewPerson.getModel();
        model.setRowCount(0);
        
        for(Person p:personDirectory.getPersonDirectory())
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPersonDirectory = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableViewPerson = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 255, 255));

        lblPersonDirectory.setBackground(new java.awt.Color(255, 255, 255));
        lblPersonDirectory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPersonDirectory.setForeground(new java.awt.Color(255, 0, 0));
        lblPersonDirectory.setText("                                                                                       Person Directory");

        tableViewPerson.setModel(new javax.swing.table.DefaultTableModel(
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
        tableViewPerson.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(tableViewPerson);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
                    .addComponent(lblPersonDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblPersonDirectory)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblPersonDirectory;
    private javax.swing.JTable tableViewPerson;
    // End of variables declaration//GEN-END:variables
}
