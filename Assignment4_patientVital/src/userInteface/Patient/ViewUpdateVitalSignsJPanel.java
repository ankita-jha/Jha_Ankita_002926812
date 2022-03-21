/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInteface.Patient;

import business.MyNumericVerifier;
import business.VitalSign;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author RamCharan
 */
public class ViewUpdateVitalSignsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewUpdateVitalSignsJPanel
     */
    private VitalSign vitalSign;
    private JPanel userProcessContainer;
    private Boolean isEdit = Boolean.FALSE;

    public ViewUpdateVitalSignsJPanel(JPanel upc, VitalSign vitalSign, Boolean isEdit) {
        initComponents();
        this.userProcessContainer = upc;
        this.vitalSign = vitalSign;
        this.isEdit = isEdit;
        addVerifiers();
        populateVitalSignDetails();
        modifyTextFields(this.isEdit);
    }

    private void addVerifiers() {
        InputVerifier integerVerifier = new MyNumericVerifier();
        respiratoryRateJTextField.setInputVerifier(integerVerifier);
        heartRateJTextField.setInputVerifier(integerVerifier);
        bloodPressureJTextField.setInputVerifier(integerVerifier);
        weightJTextField.setInputVerifier(integerVerifier);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        respiratoryRateJTextField = new javax.swing.JTextField();
        heartRateJTextField = new javax.swing.JTextField();
        bloodPressureJTextField = new javax.swing.JTextField();
        weightJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        editVitalSignJButton = new javax.swing.JButton();
        saveJButton = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(500, 700));
        setPreferredSize(new java.awt.Dimension(500, 700));

        jLabel1.setText("Respiratory rate");

        jLabel2.setText("Heart rate");

        jLabel3.setText("Systolic blood pressure");

        jLabel4.setText("Weight in pounds");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Vital Sign");

        editVitalSignJButton.setText("Edit");
        editVitalSignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editVitalSignJButtonActionPerformed(evt);
            }
        });

        saveJButton.setText("Save");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(189, 189, 189)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(weightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bloodPressureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(heartRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(respiratoryRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editVitalSignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(respiratoryRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(heartRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bloodPressureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(weightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(editVitalSignJButton)
                    .addComponent(saveJButton))
                .addContainerGap(487, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        // TODO add your handling code here:

        try {
            int respiratoryRate = Integer.parseInt(respiratoryRateJTextField.getText());
            int heartRate = Integer.parseInt(heartRateJTextField.getText());
            int bloodPressure = Integer.parseInt(bloodPressureJTextField.getText());
            int weight = Integer.parseInt(weightJTextField.getText());
            vitalSign.setRespiratoryRate(respiratoryRate);
            vitalSign.setHeartRate(heartRate);
            vitalSign.setBloodPressure(bloodPressure);
            vitalSign.setWeight(weight);
            /*Set current date and time as TimeStamp*/
            vitalSign.setTimestamp(new Date());
            JOptionPane.showMessageDialog(this, "Vital signs updated!!", "Update", 
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please enter correct values", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        modifyTextFields(false);
    }//GEN-LAST:event_saveJButtonActionPerformed

    private void editVitalSignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editVitalSignJButtonActionPerformed
        // TODO add your handling code here:
        modifyTextFields(true);
    }//GEN-LAST:event_editVitalSignJButtonActionPerformed
    private void modifyTextFields(Boolean isEdit) {
        if (isEdit) {
            respiratoryRateJTextField.setEnabled(true);
            heartRateJTextField.setEnabled(true);
            bloodPressureJTextField.setEnabled(true);
            weightJTextField.setEnabled(true);
        } else {
            respiratoryRateJTextField.setEnabled(false);
            heartRateJTextField.setEnabled(false);
            bloodPressureJTextField.setEnabled(false);
            weightJTextField.setEnabled(false);
        }
    }

    private void populateVitalSignDetails() {
        respiratoryRateJTextField.setText(String.valueOf(vitalSign.getRespiratoryRate()));
        heartRateJTextField.setText(String.valueOf(vitalSign.getHeartRate()));
        bloodPressureJTextField.setText(String.valueOf(vitalSign.getBloodPressure()));
        weightJTextField.setText(String.valueOf(vitalSign.getWeight()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField bloodPressureJTextField;
    private javax.swing.JButton editVitalSignJButton;
    private javax.swing.JTextField heartRateJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField respiratoryRateJTextField;
    private javax.swing.JButton saveJButton;
    private javax.swing.JTextField weightJTextField;
    // End of variables declaration//GEN-END:variables
}
