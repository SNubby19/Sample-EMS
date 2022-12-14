import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Tusar
 */
public class AddEmployeeWindow extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployeeWindow
     */
    public AddEmployeeWindow() {
        initComponents();
        
        statusSelector.addItem("Full Time Employee");
        statusSelector.addItem("Part Time Employee");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        statusSelector = new javax.swing.JComboBox<>();
        fNameLabel = new javax.swing.JLabel();
        lNameLabel = new javax.swing.JLabel();
        fNameInput = new javax.swing.JTextField();
        lNameInput = new javax.swing.JTextField();
        locLabel = new javax.swing.JLabel();
        locInput = new javax.swing.JTextField();
        deductLabel = new javax.swing.JLabel();
        deductInput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        incomeLabel = new javax.swing.JLabel();
        pteWageLabel = new javax.swing.JLabel();
        pteHPWLabel = new javax.swing.JLabel();
        pteWPYLabel = new javax.swing.JLabel();
        pteWageInput = new javax.swing.JTextField();
        pteWPYInput = new javax.swing.JTextField();
        pteHPWInput = new javax.swing.JTextField();
        addEmpButton = new javax.swing.JButton();
        empNumInpLabel = new javax.swing.JLabel();
        empNumInput = new javax.swing.JTextField();
        genLabel = new javax.swing.JLabel();
        genInput = new javax.swing.JTextField();
        doneButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        statusSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        statusSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusSelectorActionPerformed(evt);
            }
        });

        fNameLabel.setText("First Name:");

        lNameLabel.setText("Last Name:");

        fNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameInputActionPerformed(evt);
            }
        });

        lNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameInputActionPerformed(evt);
            }
        });

        locLabel.setText("Location(City):");

        locInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locInputActionPerformed(evt);
            }
        });

        deductLabel.setText("Deduction Rate:");

        jLabel6.setText("Select Employee Status:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Personal Information");

        incomeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        incomeLabel.setText("Income Information");

        pteWageLabel.setText("Hourly Wage:");

        pteHPWLabel.setText("Hours Per Week:");

        pteWPYLabel.setText("Weeks Per Year:");

        pteWPYInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pteWPYInputActionPerformed(evt);
            }
        });

        pteHPWInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pteHPWInputActionPerformed(evt);
            }
        });

        addEmpButton.setText("Add Employee");
        addEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmpButtonActionPerformed(evt);
            }
        });

        empNumInpLabel.setText("Employee Number:");

        empNumInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empNumInputActionPerformed(evt);
            }
        });

        genLabel.setText("Gender:");

        genInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genInputActionPerformed(evt);
            }
        });

        doneButton.setText("Done");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(addEmpButton)
                        .addGap(58, 58, 58)
                        .addComponent(doneButton))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(locLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empNumInpLabel)
                            .addComponent(genLabel))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fNameInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lNameInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(locInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empNumInput, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(genInput, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deductLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pteWageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pteHPWLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pteWPYLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deductInput, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(pteWageInput)
                            .addComponent(pteHPWInput)
                            .addComponent(pteWPYInput)))
                    .addComponent(jSeparator1))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addComponent(statusSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameLabel)
                    .addComponent(fNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNameLabel)
                    .addComponent(lNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locLabel)
                    .addComponent(locInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empNumInpLabel)
                    .addComponent(empNumInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genLabel)
                    .addComponent(genInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(incomeLabel)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deductLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deductInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pteWageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pteWageInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pteHPWLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pteHPWInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pteWPYLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pteWPYInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEmpButton)
                    .addComponent(doneButton))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosed

    private void statusSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusSelectorActionPerformed
        // TODO add your handling code here:
        if (statusSelector.getSelectedIndex() == 0) {
            // Full Time selected
            pteWageLabel.setText("Yearly Salary");
            pteHPWLabel.setVisible(false);
            pteWPYLabel.setVisible(false);
            pteHPWInput.setVisible(false);
            pteWPYInput.setVisible(false);
        }
        else {
            // Part Time selected
            System.out.println("pte");
            pteWageLabel.setText("Hourly Wage:");
            pteHPWLabel.setVisible(true);
            pteWPYLabel.setVisible(true);
            pteHPWInput.setVisible(true);
            pteWPYInput.setVisible(true);
        }
        
    }//GEN-LAST:event_statusSelectorActionPerformed

    private void fNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameInputActionPerformed

    private void lNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameInputActionPerformed

    private void locInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locInputActionPerformed

    private void pteWPYInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pteWPYInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pteWPYInputActionPerformed

    private void pteHPWInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pteHPWInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pteHPWInputActionPerformed

    private void addEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmpButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) MainJFrame.getEmpTable().getModel();
        
        int empNum = Integer.valueOf(empNumInput.getText());
        String fName = fNameInput.getText();
        String lName = lNameInput.getText();
        String gender = genInput.getText();
        String location = locInput.getText();
        double deductR = Double.valueOf(deductInput.getText());      
        
        empNumInput.setText("");
        fNameInput.setText("");
        lNameInput.setText("");
        genInput.setText("");
        locInput.setText("");
        deductInput.setText("");
        
        if (statusSelector.getSelectedIndex() == 0) {
            double yearlyS = Double.valueOf(pteWageInput.getText());
            String s = "Full Time";
            
            pteWageInput.setText("");
            
            FTE theEmp = new FTE(empNum, fName, lName, gender, location, deductR, s, yearlyS);
            
            
            model.addRow(new Object[]{theEmp.empNum, theEmp.firstName, theEmp.lastName, theEmp.workLoc, theEmp.status});
            MainJFrame.table.addToTable(theEmp);
        } else {
            //PTE(int eN, String fN, String lN, String g, String wL, double dR, double hW, double hPW, double wPY, String status)
            double hourlyWage = Double.valueOf(pteWageInput.getText());
            double hoursPWeek = Double.valueOf(pteHPWInput.getText());
            double weeksPYear = Double.valueOf(pteWPYInput.getText());
            String s = "Part Time";
            
            pteWageInput.setText("");
            pteHPWInput.setText("");
            pteWPYInput.setText("");
            
            PTE theEmp = new PTE(empNum, fName, lName, gender, location, deductR, s, hourlyWage, hoursPWeek, weeksPYear);
            
            
            model.addRow(new Object[]{theEmp.empNum, theEmp.firstName, theEmp.lastName, theEmp.workLoc, theEmp.status});
            MainJFrame.table.addToTable(theEmp);
        }
        
        
        
        
    }//GEN-LAST:event_addEmpButtonActionPerformed

    private void empNumInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empNumInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empNumInputActionPerformed

    private void genInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genInputActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_doneButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmployeeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeeWindow().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmpButton;
    private javax.swing.JTextField deductInput;
    private javax.swing.JLabel deductLabel;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel empNumInpLabel;
    private javax.swing.JTextField empNumInput;
    private javax.swing.JTextField fNameInput;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField genInput;
    private javax.swing.JLabel genLabel;
    private javax.swing.JLabel incomeLabel;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField lNameInput;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JTextField locInput;
    private javax.swing.JLabel locLabel;
    private javax.swing.JTextField pteHPWInput;
    private javax.swing.JLabel pteHPWLabel;
    private javax.swing.JTextField pteWPYInput;
    private javax.swing.JLabel pteWPYLabel;
    private javax.swing.JTextField pteWageInput;
    private javax.swing.JLabel pteWageLabel;
    private javax.swing.JComboBox<String> statusSelector;
    // End of variables declaration//GEN-END:variables
}
