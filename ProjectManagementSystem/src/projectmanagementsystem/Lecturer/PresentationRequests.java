/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectmanagementsystem.Lecturer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class PresentationRequests extends javax.swing.JFrame {

    /**
     * Creates new form PresentationRequests
     */
    public PresentationRequests() {
        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        confirmBtn = new javax.swing.JButton();
        rejectBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Presentation Requests");

        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        rejectBtn.setText("Reject");
        rejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "ID", "Type", "Date"
            }
        ));
        jScrollPane2.setViewportView(requestTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(backBtn)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rejectBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(confirmBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(rejectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(282, 282, 282)
                        .addComponent(backBtn))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        // TODO add your handling code here:
        int selectedIndex = requestTable.getSelectedRow();
        if (selectedIndex != -1) {
            String assessmentId = requestTable.getValueAt(selectedIndex, 0).toString();
            updatePresentationStatus(assessmentId, "Approved");
            JOptionPane.showMessageDialog(this, "Presentation has been approved.");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a presentation request to approve.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void rejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestTable.getSelectedRow();

        // Check if a row is selected
        if (selectedRow != -1) {
            // Get selected student name for confirmation
            String selectedStudent = (String) requestTable.getValueAt(selectedRow, 0);

            // Confirmation prompt
            int confirmation = JOptionPane.showConfirmDialog(this,
                    "Are you sure you want to reject the presentation request from " + selectedStudent + "?",
                    "Reject Confirmation", JOptionPane.YES_NO_OPTION);

            if (confirmation == JOptionPane.YES_OPTION) {
                // Maintain a list of lines from the file
                List<String> presentationLines;

                // Read the entire presentation.txt file into the list
                try (BufferedReader reader = new BufferedReader(new FileReader("presentation.txt"))) {
                    presentationLines = reader.lines().collect(Collectors.toList());
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error reading presentation file!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Find the line to remove based on student ID
                int lineToRemove = -1;
                for (int i = 0; i < presentationLines.size(); i++) {
                    String[] parts = presentationLines.get(i).split("\",\\s*\"");
                    if (parts.length >= 2 && parts[1].equals(requestTable.getValueAt(selectedRow, 1))) {
                        lineToRemove = i;
                        break;
                    }
                }

                // Remove the line from the list if found
                if (lineToRemove != -1) {
                    presentationLines.remove(lineToRemove);
                }

                // Rewrite the presentation.txt file with the updated list
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("presentation.txt"))) {
                    for (String line : presentationLines) {
                        writer.write(line + System.lineSeparator());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error writing presentation file!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Update table 
                DefaultTableModel model = (DefaultTableModel) requestTable.getModel();
                model.removeRow(selectedRow);

                JOptionPane.showMessageDialog(this, "Presentation request rejected successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a presentation request to reject!", "Selection Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_rejectBtnActionPerformed

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) requestTable.getModel();

        try (BufferedReader reader = new BufferedReader(new FileReader("presentation.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\",\\s*\""); // Split the line by "\", " with optional spaces

                // Check if the line contains data for the desired user
                if (parts.length >= 4) {
                    // Extract data for ID, Type, Date, and Link from the parts array
                    String sName = parts[0];
                    String id = parts[1];
                    String type = parts[2];
                    String date = parts[3];

                    // Remove double quotes from extracted values
                    sName = sName.replaceAll("\"", "").trim();
                    id = id.replaceAll("\"", "").trim();
                    type = type.replaceAll("\"", "").trim();
                    date = date.replaceAll("\"", "").trim();

                    // Create an array with the data and add it as a new row to the table
                    Object[] rowData = {sName, id, type, date};
                    model.addRow(rowData);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updatePresentationStatus(String assessmentId, String newStatus) {
        File inputFile = new File("presentation.txt");
        ArrayList<String> fileContent = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("\"" + assessmentId + "\"") && line.contains("\"Not Approved\"")) {
                    line = line.replace("Not Approved", newStatus);
                }
                fileContent.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
            for (String line : fileContent) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(PresentationRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PresentationRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PresentationRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PresentationRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PresentationRequests().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton rejectBtn;
    private javax.swing.JTable requestTable;
    // End of variables declaration//GEN-END:variables
}
