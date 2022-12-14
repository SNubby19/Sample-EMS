import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Tusar
 */
public class MainJFrame extends javax.swing.JFrame {
    public static MyHashTable table;
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame(){
        initComponents();
        table = new MyHashTable(10);
        
        empTable.getColumnModel().getColumn(0).setHeaderValue("Employee Number");
        empTable.getColumnModel().getColumn(1).setHeaderValue("First Name");
        empTable.getColumnModel().getColumn(2).setHeaderValue("Last Name");
        empTable.getColumnModel().getColumn(3).setHeaderValue("Location");
        empTable.getColumnModel().getColumn(4).setHeaderValue("Status");
        
       
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        
        
        try {
            File emsFile = new File("EMSData.txt");
            
            if (emsFile.createNewFile()) {
                System.out.println("File created: " + emsFile.getName());
            } else {
              System.out.println("File already exists.");
            }

                        
            Scanner fileScanner = new Scanner(emsFile);
            
            while (fileScanner.hasNextLine()) {
                String data = fileScanner.nextLine();
                //"sujash, nayak, 820053
                String[] entry = data.split(",");
                //[sujash, nayak, 820053]
                String status = entry[0];
                int empNum = Integer.valueOf(entry[1]);
                String fName = entry[2];
                String lName = entry[3];
                String gender = entry[4];
                String workLoc = entry[5];
                double deductR = Double.valueOf(entry[6]);
                
                if (status.equals("Full Time")) {
                    double yearlyS = Double.valueOf(entry[7]);
                    
                    FTE newFTE = new FTE(empNum, fName, lName, gender, workLoc, deductR, status, yearlyS);
                    
                    table.addToTable(newFTE);
                    model.addRow(new Object[]{newFTE.empNum, newFTE.firstName, newFTE.lastName, newFTE.workLoc, newFTE.status}); 
                    
                } else {
                    double hourlyWage = Double.valueOf(entry[7]);
                    double hoursPWeek = Double.valueOf(entry[8]);
                    double weeksPYear = Double.valueOf(entry[9]);
                    
                    PTE newPTE = new PTE(empNum, fName, lName, gender, workLoc, deductR, status, hourlyWage, hoursPWeek ,weeksPYear);
                
                    table.addToTable(newPTE);
                    model.addRow(new Object[]{newPTE.empNum, newPTE.firstName, newPTE.lastName, newPTE.workLoc, newPTE.status}); 
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("File Not Found!");
        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton3 = new javax.swing.JButton();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jMenu10 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        addEmpButton = new javax.swing.JButton();
        remEmpButton = new javax.swing.JButton();
        chgEmpButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();

        jButton3.setText("jButton1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu8.setText("jMenu8");

        jMenuItem2.setText("jMenuItem2");

        jMenu10.setText("jMenu10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("This should be comic sans");
        setFocusTraversalPolicyProvider(true);
        setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        addEmpButton.setText("Add New Employee");
        addEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmpButtonActionPerformed(evt);
            }
        });

        remEmpButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        remEmpButton.setText("Remove Employee");
        remEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remEmpButtonActionPerformed(evt);
            }
        });

        chgEmpButton.setText("Change Employee Data");
        chgEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chgEmpButtonActionPerformed(evt);
            }
        });

        searchField.setText("Employee Number");
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
        });
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFieldKeyPressed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(empTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(remEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chgEmpButton)))
                        .addGap(0, 204, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(addEmpButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chgEmpButton)
                            .addComponent(remEmpButton))))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void remEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remEmpButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        RemEmpFrame lessEmp = new RemEmpFrame(model);
        lessEmp.setVisible(true);
        
    }//GEN-LAST:event_remEmpButtonActionPerformed

    private void chgEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chgEmpButtonActionPerformed
        // TODO add your handling code here:
        ChangeEmpFrame chgEmp = new ChangeEmpFrame();
        chgEmp.setVisible(true);
    }//GEN-LAST:event_chgEmpButtonActionPerformed

    private void addEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmpButtonActionPerformed
        // TODO add your handling code here:
        AddEmployeeWindow newEmp = new AddEmployeeWindow();
        newEmp.setVisible(true);
    }//GEN-LAST:event_addEmpButtonActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        if (searchField.getText().equals("")) {
            
        }
        
        String eNumber = searchField.getText();
        int eN = Integer.valueOf(eNumber);
        searchField.setText("Employee Number");
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        SearchEmployeeWindow searchEmp = new SearchEmployeeWindow(eN, model);
        int numRows = model.getRowCount();
        String title = String.format("Employee #%s", eNumber);
        searchEmp.setTitle(title);
        searchEmp.setVisible(true);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        // TODO add your handling code here:
        searchField.setText("");
    }//GEN-LAST:event_searchFieldFocusGained

    private void searchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_searchFieldKeyPressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
         try {
            FileWriter sFWriter = new FileWriter("EMSData.txt", false);
            
            sFWriter.write("");
            sFWriter.flush();
            sFWriter.close();
            
            FileWriter dataToAdd = new FileWriter ("EMSData.txt", true);
            
            if (table.numInTable == 0) {
			System.out.println("Hash table is empty");
            } else {
                    for (ArrayList<EmployeeInfo> arrayList: table.buckets) {
                            if (!arrayList.isEmpty()) {
                                    for (EmployeeInfo employee: arrayList) {
                                            dataToAdd.write(employee.status + ",");
                                            dataToAdd.write(employee.empNum + ",");
                                            dataToAdd.write(employee.firstName + ",");
                                            dataToAdd.write(employee.lastName + ",");
                                            dataToAdd.write(employee.gender + ",");
                                            dataToAdd.write(employee.workLoc + ",");
                                            dataToAdd.write(Double.toString(employee.deductRate) + ",");
                                            
                                            if (employee.status.equals("Full Time")) {
                                                FTE employeeF = (FTE) employee;
                                                
                                                dataToAdd.write(Double.toString(employeeF.getYearlySalary()) + "\n"); 
                                                
                                            } else {
                                                PTE employeeP = (PTE) employee;
                                                
                                                dataToAdd.write(Double.toString(employeeP.hourlyWage) + ",");
                                                dataToAdd.write(Double.toString(employeeP.hoursPerWeek) + ",");
                                                dataToAdd.write(Double.toString(employeeP.weeksPerYear) + "\n");
                                            }
                                            
                                            System.out.println("Successfully wrote to file");     
                                    }
                            }
                    }
                    
                    dataToAdd.flush();
                    dataToAdd.close();
            }            
        } catch (IOException ex) {
            ex.printStackTrace();
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

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
    
    
    public static javax.swing.JTable getEmpTable() {
        return empTable;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmpButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton chgEmpButton;
    private static javax.swing.JTable empTable;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton remEmpButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
