/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.ImageIcon;
import model.Car;

/**
 *
 * @author ankitajha
 */
public class ViewJPanel extends javax.swing.JPanel {

    Car car;

    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel(Car car) {
        initComponents();
        this.car = car;
        displayProduct();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblBrand = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblEngineNo = new javax.swing.JLabel();
        lblSeatsNumber = new javax.swing.JLabel();
        lblLicensePlates = new javax.swing.JLabel();
        lblOwnerName = new javax.swing.JLabel();
        lblOwnerTelephoneNumber = new javax.swing.JLabel();
        lblOwnerEmailAddress = new javax.swing.JLabel();
        lblOwnerDrivingLicense = new javax.swing.JLabel();
        lblOwnerSsn = new javax.swing.JLabel();
        lblOwnerAddress = new javax.swing.JLabel();
        lblServiceRecords = new javax.swing.JLabel();
        lblWarrantyYear = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtEngineNumber = new javax.swing.JTextField();
        txtSeatsNumber = new javax.swing.JTextField();
        txtLicenseNumber = new javax.swing.JTextField();
        txtOwnerName = new javax.swing.JTextField();
        txtOwnerTelephoneNumber = new javax.swing.JTextField();
        txtOwnerEmailAddress = new javax.swing.JTextField();
        txtOwnerDrivingLicense = new javax.swing.JTextField();
        txtOwnerSsn = new javax.swing.JTextField();
        txtOwnerAddress = new javax.swing.JTextField();
        txtOwnerServiceRecords = new javax.swing.JTextField();
        txtWarrantyYear = new javax.swing.JTextField();
        lblImage1 = new javax.swing.JLabel();

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Profile");

        lblBrand.setText("Brand");

        lblModel.setText("Model");

        lblColor.setText("Color");

        lblYear.setText("Year'");

        lblEngineNo.setText("Engine Number");

        lblSeatsNumber.setText("SeatsNumber");

        lblLicensePlates.setText("License Plates");

        lblOwnerName.setText("Owner Name");

        lblOwnerTelephoneNumber.setText("Owner telephone number");

        lblOwnerEmailAddress.setText("Owner Email Address");

        lblOwnerDrivingLicense.setText("Owner Driving License");

        lblOwnerSsn.setText("Owner SSn");

        lblOwnerAddress.setText("Owner Address");

        lblServiceRecords.setText("Service_records");

        lblWarrantyYear.setText("Warranty_Year");

        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });

        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });

        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        txtLicenseNumber.setText("jTextField6");

        txtOwnerName.setText(" ");

        txtOwnerTelephoneNumber.setText(" ");

        txtOwnerSsn.setText(" ");

        txtOwnerAddress.setText(" ");

        txtOwnerServiceRecords.setText(" ");

        lblImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/CAR.jpg"))); // NOI18N
        lblImage1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblOwnerAddress)
                    .addComponent(lblWarrantyYear))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtOwnerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addComponent(lblOwnerDrivingLicense)
                                .addGap(18, 18, 18)
                                .addComponent(txtOwnerDrivingLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(479, 479, 479))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblOwnerName)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblLicensePlates)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblOwnerEmailAddress)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtOwnerEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblOwnerTelephoneNumber)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtOwnerTelephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblOwnerSsn)
                                                .addComponent(lblServiceRecords))
                                            .addGap(52, 52, 52)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtOwnerServiceRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtOwnerSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(lblImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 1149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblColor)
                        .addComponent(lblYear)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblSeatsNumber)
                            .addGap(60, 60, 60)
                            .addComponent(txtSeatsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblModel)
                                .addComponent(lblEngineNo)
                                .addComponent(lblBrand))
                            .addGap(47, 47, 47)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtBrand, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                .addComponent(txtModel, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                .addComponent(txtColor, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                .addComponent(txtYear)
                                .addComponent(txtEngineNumber))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicensePlates)
                    .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblOwnerName)
                    .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOwnerTelephoneNumber)
                    .addComponent(txtOwnerTelephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOwnerEmailAddress)
                    .addComponent(txtOwnerEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOwnerDrivingLicense)
                    .addComponent(txtOwnerDrivingLicense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOwnerSsn)
                    .addComponent(txtOwnerSsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOwnerAddress)
                            .addComponent(txtOwnerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblServiceRecords)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(txtOwnerServiceRecords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarrantyYear))
                .addGap(2, 2, 2)
                .addComponent(lblImage1)
                .addContainerGap(380, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblBrand)
                            .addGap(40, 40, 40)
                            .addComponent(lblModel)
                            .addGap(33, 33, 33)
                            .addComponent(lblColor))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(33, 33, 33)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblYear)
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEngineNo)
                        .addComponent(txtEngineNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSeatsNumber)
                        .addComponent(txtSeatsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(670, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandActionPerformed

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblEngineNo;
    private javax.swing.JLabel lblImage1;
    private javax.swing.JLabel lblLicensePlates;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblOwnerAddress;
    private javax.swing.JLabel lblOwnerDrivingLicense;
    private javax.swing.JLabel lblOwnerEmailAddress;
    private javax.swing.JLabel lblOwnerName;
    private javax.swing.JLabel lblOwnerSsn;
    private javax.swing.JLabel lblOwnerTelephoneNumber;
    private javax.swing.JLabel lblSeatsNumber;
    private javax.swing.JLabel lblServiceRecords;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWarrantyYear;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtEngineNumber;
    private javax.swing.JTextField txtLicenseNumber;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtOwnerAddress;
    private javax.swing.JTextField txtOwnerDrivingLicense;
    private javax.swing.JTextField txtOwnerEmailAddress;
    private javax.swing.JTextField txtOwnerName;
    private javax.swing.JTextField txtOwnerServiceRecords;
    private javax.swing.JTextField txtOwnerSsn;
    private javax.swing.JTextField txtOwnerTelephoneNumber;
    private javax.swing.JTextField txtSeatsNumber;
    private javax.swing.JTextField txtWarrantyYear;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    private void displayProduct() {
        txtBrand.setText(car.getBrand());
        txtColor.setText(car.getColor());
        txtEngineNumber.setText(String.valueOf(car.getEngineNo()));
        txtLicenseNumber.setText(String.valueOf(car.getBrand()));
        txtModel.setText(car.getModel());
        txtOwnerAddress.setText(car.getOwnerAddress());
        txtOwnerDrivingLicense.setText(car.getOwnerDriverLicense());
        txtOwnerEmailAddress.setText(car.getOwnerEmailAddresses());
        txtOwnerName.setText(car.getOwnerName());
        txtOwnerServiceRecords.setText(String.valueOf(car.getService_records()));
        txtOwnerSsn.setText(car.getOwnerSocialSecurityNumber());
        txtOwnerTelephoneNumber.setText(String.valueOf(car.getOwnerTelephoneNumber()));
        txtSeatsNumber.setText(String.valueOf(car.getSeatsNumber()));
        txtWarrantyYear.setText(String.valueOf(car.getWarrantyYear()));
        txtYear.setText(String.valueOf(car.getYear()));
        
        
        
        
                   
                   
           
           

    }
}
