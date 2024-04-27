/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectmanagementsystem.Admin;

import projectmanagementsystem.Admin.Admin;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

/**
 *
 * @author Tioh
 */
public class EditLecturerDetails extends javax.swing.JFrame {

    String usernameToDelete = LecturerData.usernameToDelete;
    String passwordToEdit = LecturerData.passwordToEdit;
    String projectManagerStatus = LecturerData.projectManagerStatus;

    /**
     * Creates new form EditStudentDetails
     */
    public EditLecturerDetails() {
        initComponents();
        loadLecturerDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ProjectManagerBox = new javax.swing.JComboBox<>();
        LecturerNameTF = new javax.swing.JTextField();
        passwordTF = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Edit Lecturer Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );

        jLabel2.setText("Name:");

        jLabel3.setText("Password:");

        jLabel4.setText("Project Manager:");

        ProjectManagerBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        ProjectManagerBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProjectManagerBoxActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LecturerNameTF)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ProjectManagerBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(passwordTF))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(saveBtn)
                .addGap(36, 36, 36)
                .addComponent(BackBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LecturerNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ProjectManagerBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(BackBtn))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProjectManagerBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProjectManagerBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProjectManagerBoxActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        EditLecturerDetails.this.setVisible(false);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String selectedValue = (String) ProjectManagerBox.getSelectedItem();
        saveData(LecturerNameTF.getText(), passwordTF.getText(), selectedValue);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void loadLecturerDetails() {
        LecturerNameTF.setText(usernameToDelete);
        passwordTF.setText(passwordToEdit);
        if (projectManagerStatus.equalsIgnoreCase("false")) {
            ProjectManagerBox.setSelectedItem("No");
        } else {
            ProjectManagerBox.setSelectedItem("Yes");
        }
    }

    private void saveData(String usr, String pw, String projectManagerStatus) {
        try (RandomAccessFile raf = new RandomAccessFile("lecturer.txt", "rw")) {
            StringBuilder newData = new StringBuilder();
            String line;
            boolean foundProjectManager = false; // Flag to track if "Project Manager" line is found
            boolean updatedPassword = false; // Flag to track if password line has been updated
            boolean updatedSecondMarker = false; // Flag to track if "Second Marker" line has been updated
            while ((line = raf.readLine()) != null) {
                String trimmedLine = line.trim(); // Trim the line for comparison
                if (trimmedLine.startsWith("Username:") && trimmedLine.substring("Username:".length()).trim().equals(usernameToDelete)) {
                    // Append username
                    newData.append("Username:").append(usr).append("\n");
                } else if (trimmedLine.startsWith("Password:")) {
                    // Skip appending the password line if it has been updated
                    if (!updatedPassword) {
                        newData.append("Password:").append(pw).append("\n");
                        updatedPassword = true; // Set flag to true
                    }
                } else if (trimmedLine.startsWith("Project Manager:")) {
                    // Append "Project Manager" status based on projectManagerStatus variable
                    newData.append("Project Manager: ").append(projectManagerStatus.equalsIgnoreCase("yes") ? "true" : "false").append("\n");
                    foundProjectManager = true; // Set flag to true
                } else if (trimmedLine.startsWith("Second Marker:") && !updatedSecondMarker) {
                    // Append "Second Marker" line with its existing value only once
                    newData.append(trimmedLine).append("\n");
                    updatedSecondMarker = true; // Set flag to true
                } else {
                    // Append the line as it is if not modified
                    newData.append(line).append("\n");
                }
            }
            // If "Project Manager" line was not found, append it at the end
            if (!foundProjectManager) {
                newData.append("Project Manager: ").append(projectManagerStatus.equalsIgnoreCase("yes") ? "true" : "false").append("\n");
            }
            // Remove the last newline character if it exists
            if (newData.length() > 0 && newData.charAt(newData.length() - 1) == '\n') {
                newData.setLength(newData.length() - 1);
            }
            raf.seek(0);
            raf.writeBytes(newData.toString());
            JOptionPane.showMessageDialog(EditLecturerDetails.this, "Data Updated Successfully!");
        } catch (IOException e) {
            System.err.println("Error reading or writing file: " + e.getMessage());
        }

        EditLecturerDetails.this.setVisible(false);
        Admin edt = new Admin();
        edt.setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(EditLecturerDetails.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditLecturerDetails.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditLecturerDetails.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditLecturerDetails.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditLecturerDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField LecturerNameTF;
    private javax.swing.JComboBox<String> ProjectManagerBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField passwordTF;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}