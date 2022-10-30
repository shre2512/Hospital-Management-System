/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Admin;
import model.CityDirectory;
import model.CommunityDirectory;
import model.Doctor;
import model.DoctorDirectory;
import model.EncounterDirectory;
import model.HospitalDirectory;
import model.HouseDirectory;
import model.Patient;
import model.PatientDirectory;
import model.PersonDirectory;

/**
 *
 * @author shrey
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    private final Admin systemAdmin;
    private final Admin communityAdmin;
    private final Admin hospitalAdmin;
    EncounterDirectory encounterDirectory;
    HospitalDirectory hospitalDirectory;
    HouseDirectory houseDirectory;
    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;
    CityDirectory cityDirectory;
    CommunityDirectory communityDirectory;
    DoctorDirectory doctorDirectory;
    
    public MainJFrame() {
        initComponents();
        buttonLogOut.setVisible(false);
        this.systemAdmin = new Admin("System Admin", "systemadmin", "admin");
        this.communityAdmin = new Admin("Community Admin", "communityadmin", "admin");
        this.hospitalAdmin = new Admin("Hospital Admin", "hospitaladmin", "admin");
        encounterDirectory = new EncounterDirectory();
        hospitalDirectory = new HospitalDirectory();
        houseDirectory = new HouseDirectory();
        patientDirectory = new PatientDirectory();
        personDirectory = new PersonDirectory();
        communityDirectory = new CommunityDirectory();
        cityDirectory = new CityDirectory();
        doctorDirectory = new DoctorDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        buttonLogOut = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();
        passWordLabel = new javax.swing.JLabel();
        userNameText = new javax.swing.JTextField();
        userNameLabel = new javax.swing.JLabel();
        loginAs = new javax.swing.JLabel();
        selectRole = new javax.swing.JComboBox<>();
        buttonLogIn = new javax.swing.JButton();
        passwordText = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonLogOut.setText("Log Out");
        buttonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(buttonLogOut)
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(buttonLogOut)
                .addContainerGap(326, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlPanel);

        passWordLabel.setText("Password :");

        userNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextActionPerformed(evt);
            }
        });

        userNameLabel.setText("User Name : ");

        loginAs.setText("Role : ");

        selectRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System Admin", "Community Admin", "Hospital Admin", "Patient", "Doctor" }));
        selectRole.setMinimumSize(new java.awt.Dimension(72, 30));
        selectRole.setPreferredSize(new java.awt.Dimension(72, 30));

        buttonLogIn.setText("Log In");
        buttonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogInActionPerformed(evt);
            }
        });

        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(buttonLogIn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workAreaLayout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(workAreaLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(loginAs, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workAreaLayout.createSequentialGroup()
                                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passWordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)))
                        .addGap(47, 47, 47)
                        .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectRole, 0, 192, Short.MAX_VALUE)
                            .addComponent(passwordText))))
                .addGap(323, 323, 323))
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passWordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectRole, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginAs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(buttonLogIn)
                .addContainerGap(225, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextActionPerformed

    private void buttonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogInActionPerformed
        // TODO add your handling code here:
                
        if (systemAdmin.getAdminRole().equals(selectRole.getSelectedItem().toString()) && systemAdmin.getAdminUserName().equals(userNameText.getText()) && systemAdmin.getAdminPassWord().equals(passwordText.getText()))
        {
            try {
                JOptionPane.showMessageDialog(this, "Logged In As System Admin");
                systemAdminJPanel sysAdmin = new systemAdminJPanel(cityDirectory, communityDirectory, hospitalDirectory, houseDirectory, patientDirectory, personDirectory, doctorDirectory, encounterDirectory);
                splitPane.setRightComponent(sysAdmin);
                buttonLogOut.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if (communityAdmin.getAdminRole().equals(selectRole.getSelectedItem().toString()) && communityAdmin.getAdminUserName().equals(userNameText.getText()) && communityAdmin.getAdminPassWord().equals(passwordText.getText()))
        {
            try {
                JOptionPane.showMessageDialog(this, "Logged In As Community Admin");
                communityAdminJPanel comAdmin = new communityAdminJPanel();
                splitPane.setRightComponent(comAdmin);
                buttonLogOut.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        /*     
        else if (hospitalAdmin.getAdminRole().equals(selectRole.getSelectedItem().toString()) && hospitalAdmin.getAdminUserName().equals(userNameText.getText()) && hospitalAdmin.getAdminPassWord().equals(passwordText.getText()))
        {
            JOptionPane.showMessageDialog(this, "Logged In As Hospital Admin");
            hospitalAdminJPanel hosAdmin = new hospitalAdminJPanel();
            splitPane.setRightComponent(hosAdmin); 
            buttonLogOut.setVisible(true);
        }
        */
        else if(selectRole.getSelectedItem().toString().equals("Patient"))
        {
            boolean flag = false;
            Patient pInitial = null;
            for(Patient p:patientDirectory.getPatientDirectory())
            {
                if(p.getPatientUserName().equals(userNameText.getText()) && p.getPatientPassWord().equals(passwordText.getText()))
                {
                    flag = true;
                    pInitial = p;
                    break;
                }
            }
            if(flag == true)
            {
                try {
                    JOptionPane.showMessageDialog(this, "Logged In As Patient");
                    patientJPanel patient = new patientJPanel(pInitial, personDirectory, cityDirectory, communityDirectory, doctorDirectory, hospitalDirectory, encounterDirectory);
                    splitPane.setRightComponent(patient);
                    buttonLogOut.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Invalid Credentials");
            }
        }
        
        else if(selectRole.getSelectedItem().toString().equals("Doctor"))
        {
            boolean flag = false;
            Doctor dInitial = null;
            for(Doctor d:doctorDirectory.getDoctorDirectory())
            {
                if(d.getDoctorUserName().equals(userNameText.getText()) && d.getDoctorPassWord().equals(passwordText.getText()))
                {
                    flag = true;
                    dInitial = d;
                    break;
                }
            }
            if(flag == true)
            {
                try {
                    JOptionPane.showMessageDialog(this, "Logged In As Doctor");
                    doctorJPanel doctor = new doctorJPanel(dInitial);
                    splitPane.setRightComponent(doctor);
                    buttonLogOut.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Invalid Credentials");
            }
        }
        
        else
        {
            JOptionPane.showMessageDialog(this, "Invalid Credentials");
        }
    }//GEN-LAST:event_buttonLogInActionPerformed

    private void buttonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogOutActionPerformed
        // TODO add your handling code here:
        splitPane.setRightComponent(workArea);
        buttonLogOut.setVisible(false);
        userNameText.setText("");
        passwordText.setText("");
        
    }//GEN-LAST:event_buttonLogOutActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogIn;
    private javax.swing.JButton buttonLogOut;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel loginAs;
    private javax.swing.JLabel passWordLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JComboBox<String> selectRole;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameText;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
