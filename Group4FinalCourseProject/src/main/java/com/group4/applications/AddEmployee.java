 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.group4.applications;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import com.group4.libraries.Employee;
import com.group4.libraries.EmployeeList;

/**
 *
 * @author Andrew
 */
public class AddEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    public AddEmployee() {
        initComponents();

    }

    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
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
        jPanel1 = new javax.swing.JPanel();
        label_specifics = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Department = new javax.swing.JTextField();
        Position = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Salary = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textField_specifics = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        PartTimer = new javax.swing.JRadioButton();
        FullTimer = new javax.swing.JRadioButton();
        BoxPerformance = new javax.swing.JCheckBox();
        Exit = new javax.swing.JButton();
        Rating = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(237, 232, 208));

        label_specifics.setText("Assigned Office");

        jLabel6.setText("Performance Rating:");

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                none(evt);
            }
        });

        Department.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DepartmentKeyReleased(evt);
            }
        });

        Position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PositionActionPerformed(evt);
            }
        });
        Position.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PositionKeyReleased(evt);
            }
        });

        jLabel1.setText("Name");

        Salary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SalaryKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SalaryKeyTyped(evt);
            }
        });

        jLabel2.setText("Department");

        textField_specifics.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textField_specifics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_specificsActionPerformed(evt);
            }
        });
        textField_specifics.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textField_specificsKeyReleased(evt);
            }
        });

        jLabel3.setText("Department Position");

        jLabel4.setText("Salary");

        Submit.setBackground(new java.awt.Color(201, 197, 177));
        Submit.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Submit.setText("Submit");
        Submit.setEnabled(false);
        Submit.setFocusable(false);
        Submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SubmitMouseEntered(evt);
            }
        });
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        buttonGroup1.add(PartTimer);
        PartTimer.setText("Part-Time");
        PartTimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PartTimerMouseReleased(evt);
            }
        });
        PartTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartTimerActionPerformed(evt);
            }
        });
        PartTimer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PartTimerKeyReleased(evt);
            }
        });

        buttonGroup1.add(FullTimer);
        FullTimer.setSelected(true);
        FullTimer.setText("Full_Time");
        FullTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullTimerActionPerformed(evt);
            }
        });

        BoxPerformance.setText("Grade Employee's Performance");
        BoxPerformance.setFocusable(false);
        BoxPerformance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxPerformanceActionPerformed(evt);
            }
        });
        BoxPerformance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BoxPerformanceKeyReleased(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(201, 197, 177));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Rating.setEnabled(false);
        Rating.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RatingKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RatingKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Submit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(PartTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FullTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_specifics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(BoxPerformance, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textField_specifics)
                                    .addComponent(Position, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Department)
                                    .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(Salary)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(119, 119, 119)
                                .addComponent(Rating)))
                        .addGap(18, 18, 18)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Department, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Position, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PartTimer)
                    .addComponent(FullTimer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_specifics, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_specifics, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BoxPerformance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Rating, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitMouseEntered

    private void PositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PositionActionPerformed

    private void BoxPerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxPerformanceActionPerformed

        if (BoxPerformance.isSelected()){
            Rating.setEnabled(true);
        }else if (PartTimer.isSelected() && !BoxPerformance.isSelected()){
            Submit.setEnabled(false);
            Rating.setEnabled(false);
            Rating.setText(" ");
        }else {
            Rating.setEnabled(false);
            Rating.setText(" ");
        } 
        
//      Rating.setEditable(BoxPerformance.isSelected());
        
    }//GEN-LAST:event_BoxPerformanceActionPerformed

    private void FullTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullTimerActionPerformed
        if (FullTimer.isSelected()){
            label_specifics.setText("Assigned Office: ");
            textField_specifics.setText("");
        }
    }//GEN-LAST:event_FullTimerActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        EmployeeList employeeList = new EmployeeList();
        // reset all text values to null
        Name.setText("");
        Department.setText("");
        Position.setText("");
        Salary.setText("");
        textField_specifics.setText("");
        Rating.setText("");
        
        // "close" the window
        Submit.setEnabled(false);
        
        
    }//GEN-LAST:event_SubmitActionPerformed

    private void textField_specificsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_specificsActionPerformed

    }//GEN-LAST:event_textField_specificsActionPerformed

    private void PartTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PartTimerActionPerformed
        if (PartTimer.isSelected()){
            label_specifics.setText("Primary Alternative Occupation: ");
            textField_specifics.setText("");
        }
    }//GEN-LAST:event_PartTimerActionPerformed

    private void none(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_none
        // TODO add your handling code here:
    }//GEN-LAST:event_none

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void NameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameKeyReleased
        if (Name.getText().length()>0 
                && Department.getText().length()>0 
                && Position.getText().length()>0 
                && Salary.getText().length()>0 
                && FullTimer.isSelected()
                && textField_specifics.getText().length()>0 
                && BoxPerformance.isSelected()
                && Rating.getText().length()>0){          
            Submit.setEnabled(true);
        }else if (Name.getText().length()>0 
                && Department.getText().length()>0 
                && Position.getText().length()>0 
                && Salary.getText().length()>0 
                && PartTimer.isSelected()
                && BoxPerformance.isSelected()
                && Rating.getText().length()>0){
            Submit.setEnabled(true);
        }else if (Name.getText().length()>0 
                && Department.getText().length()>0 
                && Position.getText().length()>0 
                && Salary.getText().length()>0 
                && FullTimer.isSelected()
                && textField_specifics.getText().length()>0){
            Submit.setEnabled(true);
        }else {
            Submit.setEnabled(false);
        }
    }//GEN-LAST:event_NameKeyReleased

    private void DepartmentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DepartmentKeyReleased
        if (Name.getText().length()>0 
                && Department.getText().length()>0 
                && Position.getText().length()>0 
                && Salary.getText().length()>0 
                && FullTimer.isSelected()
                && textField_specifics.getText().length()>0 
                && BoxPerformance.isSelected()
                && Rating.getText().length()>0){          
            Submit.setEnabled(true);
        }else if (Name.getText().length()>0 
                && Department.getText().length()>0 
                && Position.getText().length()>0 
                && Salary.getText().length()>0 
                && PartTimer.isSelected()
                && BoxPerformance.isSelected()
                && Rating.getText().length()>0){
            Submit.setEnabled(true);
        }else if (Name.getText().length()>0 
                && Department.getText().length()>0 
                && Position.getText().length()>0 
                && Salary.getText().length()>0 
                && FullTimer.isSelected()
                && textField_specifics.getText().length()>0){
            Submit.setEnabled(true);
        }else {
            Submit.setEnabled(false);
        }
    }//GEN-LAST:event_DepartmentKeyReleased

    private void PositionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PositionKeyReleased
        if (Name.getText().length()>0 
                && Department.getText().length()>0 
                && Position.getText().length()>0 
                && Salary.getText().length()>0 
                && FullTimer.isSelected()
                && textField_specifics.getText().length()>0 
                && BoxPerformance.isSelected()
                && Rating.getText().length()>0){          
            Submit.setEnabled(true);
        }else if (Name.getText().length()>0 
                && Department.getText().length()>0 
                && Position.getText().length()>0 
                && Salary.getText().length()>0 
                && PartTimer.isSelected()
                && BoxPerformance.isSelected()
                && Rating.getText().length()>0){
            Submit.setEnabled(true);
        }else if (Name.getText().length()>0 
                && Department.getText().length()>0 
                && Position.getText().length()>0 
                && Salary.getText().length()>0 
                && FullTimer.isSelected()
                && textField_specifics.getText().length()>0){
            Submit.setEnabled(true);
        }else {
            Submit.setEnabled(false);
        }
    }//GEN-LAST:event_PositionKeyReleased

    private void SalaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SalaryKeyReleased
        if (Name.getText().length()>0 
                && Department.getText().length()>0 
                && Position.getText().length()>0 
                && Salary.getText().length()>0 
                && FullTimer.isSelected()
                && textField_specifics.getText().length()>0 
                && BoxPerformance.isSelected()
                && Rating.getText().length()>0){          
            Submit.setEnabled(true);
        }else if (Name.getText().length()>0 
                && Department.getText().length()>0 
                && Position.getText().length()>0 
                && Salary.getText().length()>0 
                && PartTimer.isSelected()
                && BoxPerformance.isSelected()
                && Rating.getText().length()>0){
            Submit.setEnabled(true);
        }else if (Name.getText().length()>0 
                && Department.getText().length()>0 
                && Position.getText().length()>0 
                && Salary.getText().length()>0 
                && FullTimer.isSelected()
                && textField_specifics.getText().length()>0){
            Submit.setEnabled(true);
        }else {
            Submit.setEnabled(false);
        }
    }//GEN-LAST:event_SalaryKeyReleased

    private void textField_specificsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_specificsKeyReleased
        if (Name.getText().length()>0 
                && Department.getText().length()>0 
                && Position.getText().length()>0 
                && Salary.getText().length()>0 
                && FullTimer.isSelected()
                && textField_specifics.getText().length()>0 
                && BoxPerformance.isSelected()
                && Rating.getText().length()>0){          
            Submit.setEnabled(true);
        }else if (Name.getText().length()>0 
                && Department.getText().length()>0 
                && Position.getText().length()>0 
                && Salary.getText().length()>0 
                && PartTimer.isSelected()
                && BoxPerformance.isSelected()
                && Rating.getText().length()>0){
            Submit.setEnabled(true);
        }else if (Name.getText().length()>0 
                && Department.getText().length()>0 
                && Position.getText().length()>0 
                && Salary.getText().length()>0 
                && FullTimer.isSelected()
                && textField_specifics.getText().length()>0){
            Submit.setEnabled(true);
        }else {
            Submit.setEnabled(false);
        }
    }//GEN-LAST:event_textField_specificsKeyReleased

    private void BoxPerformanceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BoxPerformanceKeyReleased

    }//GEN-LAST:event_BoxPerformanceKeyReleased

    private void PartTimerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PartTimerKeyReleased

    }//GEN-LAST:event_PartTimerKeyReleased

    private void PartTimerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PartTimerMouseReleased
        if (PartTimer.isSelected() && !BoxPerformance.isSelected()){
            Submit.setEnabled(false);
        }
    }//GEN-LAST:event_PartTimerMouseReleased

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        close();
        Show pi = new Show();
        pi.setVisible(true);
    }//GEN-LAST:event_ExitActionPerformed

    private void SalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SalaryKeyTyped
        try{
            Double.parseDouble(Salary.getText()+evt.getKeyChar());
        } catch(NumberFormatException e){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_SalaryKeyTyped

    private void RatingKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RatingKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_RatingKeyReleased

    private void RatingKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RatingKeyTyped
        try{
            Double.parseDouble(Salary.getText()+evt.getKeyChar());
        } catch(NumberFormatException e){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_RatingKeyTyped

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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox BoxPerformance;
    private javax.swing.JTextField Department;
    private javax.swing.JButton Exit;
    private javax.swing.JRadioButton FullTimer;
    private javax.swing.JTextField Name;
    private javax.swing.JRadioButton PartTimer;
    private javax.swing.JTextField Position;
    private javax.swing.JTextField Rating;
    private javax.swing.JTextField Salary;
    private javax.swing.JButton Submit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_specifics;
    private javax.swing.JTextField textField_specifics;
    // End of variables declaration//GEN-END:variables
}
