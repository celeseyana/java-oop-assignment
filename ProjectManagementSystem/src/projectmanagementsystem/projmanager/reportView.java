/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectmanagementsystem.projmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class reportView extends javax.swing.JFrame {
    
    private ArrayList<String> globalrptname;
    private ArrayList<String> globalassessmenttype;
    private ArrayList<String> globaldatetime;
    private ArrayList<String> globallink;
    private ArrayList<String> globalstatus;
    private ArrayList<String> globalgrade;
    /**
     * Creates new form assignStudent
     */
    public reportView() {
        initComponents();
        globalrptname = new ArrayList<>();
        globalassessmenttype = new ArrayList<>();
        globaldatetime = new ArrayList<>();
        globallink = new ArrayList<>();
        globalstatus = new ArrayList<>();
        globalgrade = new ArrayList<>();
        reportTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        viewrptBack = new javax.swing.JButton();
        viewrptExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setText("Student Report");

        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Assessment", "Date of Submission", "Time of Submission", "Submission Link", "Submission Status", "Submission Grade"
            }
        ));
        jScrollPane1.setViewportView(reportTable);

        viewrptBack.setText("Back");
        viewrptBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewrptBackActionPerformed(evt);
            }
        });

        viewrptExit.setText("Quit");
        viewrptExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewrptExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewrptBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(viewrptExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewrptExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewrptBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        label1.getAccessibleContext().setAccessibleName("studentReport");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewrptBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewrptBackActionPerformed
        homepageprojmanager homepageFrame = new homepageprojmanager();
        homepageFrame.setVisible(true);
        reportView.this.setVisible(false);
    }//GEN-LAST:event_viewrptBackActionPerformed

    private void viewrptExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewrptExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_viewrptExitActionPerformed

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
            java.util.logging.Logger.getLogger(reportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reportView().setVisible(true);
            }
        });    
    }

    
        public void reportTable() {
        globalrptname = new ArrayList<>();
        globalassessmenttype = new ArrayList<>();
        globaldatetime = new ArrayList<>();
        globallink = new ArrayList<>();
        globalstatus = new ArrayList<>();
        globalgrade = new ArrayList<>();

        DefaultTableModel model = (DefaultTableModel) reportTable.getModel();

        try (BufferedReader reader = new BufferedReader(new FileReader("assessment.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\",\\s*\""); // Split the line by "\", " with optional spaces

                // Check if the line contains data for the desired user
                if (parts.length >= 7) {
                    // Extract data for ID, Type, Date, and Link from the parts array
                    String name = parts[0];
                    String assessmenttype = parts[2];
                    String datetime = parts[3];
                    String link = parts[4];
                    String status = parts[5];
                    String grade = parts[6];

                    globalrptname.add(parts[0]);
                    globalassessmenttype.add(parts[2]);
                    globaldatetime.add(parts[3]);
                    globallink.add(parts[4]);
                    globalstatus.add(parts[5]);
                    globalgrade.add(parts[6]);
                    
                    String[] datetime1 = datetime.split("T");
                    String date = datetime1[0];
                    String time = datetime1[1];

                    // Remove double quotes from extracted values
                    name = name.replaceAll("\"", "").trim();
                    assessmenttype = assessmenttype.replaceAll("\"", "").trim();
                    date = date.replaceAll("\"", "").trim();
                    time = time.replaceAll("\"", "").trim();
                    link = link.replaceAll("\"", "").trim();
                    status = status.replaceAll("\"", "").trim();
                    grade = grade.replaceAll("\"", "").trim();


                    // Create an array with the data and add it as a new row to the table
                    Object[] rowData = {name, assessmenttype, date, time, link, status, grade};
                    model.addRow(rowData);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JTable reportTable;
    private javax.swing.JButton viewrptBack;
    private javax.swing.JButton viewrptExit;
    // End of variables declaration//GEN-END:variables
}
