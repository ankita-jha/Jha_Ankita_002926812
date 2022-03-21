/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInteface.Patient;

import business.Person;
import business.PersonDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RamCharan
 */
public class VitalSignReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VitalSignReport
     */
    
    private PersonDirectory personDirectory;
    private JPanel userProcessContainer;
    public VitalSignReportJPanel() {
    }

    public VitalSignReportJPanel(JPanel userProcessContainer, PersonDirectory personDirectory) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
         initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
        System.out.println(personDirectory.getPersonHistory().size());
        int len = personDirectory.getPersonHistory().size();
        ArrayList<Person> reportList = new ArrayList<>();
        int countA =0, totalA =0;
        int countB =0, totalB =0;
        int countC =0, totalC =0;
        int countD =0, totalD =0;
        reportList = personDirectory.getPersonHistory();
        for (int i =0; i<len; i++){
            if(reportList.get(i).getCommunity().equals("CommunityA")){
                totalA++;
                if(reportList.get(i).isHasVitalSigns()){
                    countA++;
                }
                
            }
            
            else if(reportList.get(i).getCommunity().equals("CommunityB")){
                totalB++;
                if(reportList.get(i).isHasVitalSigns()){
                    countB++;
                }
                
            }
            else if(reportList.get(i).getCommunity().equals("CommunityC")){
                totalC++;
                if(reportList.get(i).isHasVitalSigns()){
                    countC++;
                }
                
            }
            else if(reportList.get(i).getCommunity().equals("CommunityD")){
                totalD++;
                if(reportList.get(i).isHasVitalSigns()){
                    countD++;
                }
                
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) vieReportJTable.getModel();
        model.setRowCount(0);
        if(reportList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No Data to generate Report. Please add data accordingly",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
       
            Object[] row = new Object[4];
            row[0] = "Community A";
            row[1]= ""+totalA;
            row[2]= ""+countA;
            if(totalA ==0){
                row[3] = "Not Applicable";
            }
            else{
                row[3] = (countA/totalA)*100;
            }
            
            model.addRow(row);
            row[0] = "Community B";
            row[1]= ""+totalB;
            row[2]= ""+countB;
            if(totalB ==0){
                row[3] = "Not Applicable";
            }
            else{
                row[3] = (countB/totalB)*100;
            }
            model.addRow(row);
            row[0] = "Community C";
            row[1]= ""+totalC;
            row[2]= ""+countC;
            if(totalC ==0){
                row[3] = "Not Applicable";
            }
            else{
                row[3] = (countC/totalC)*100;
            }
            model.addRow(row);
            row[0] = "Community D";
            row[1]= ""+totalD;
            row[2]= ""+countD;
            if(totalD ==0){
                row[3] = "Not Applicable";
            }
            else{
                row[3] = (countD/totalD)*100;
            }
            model.addRow(row);
        
        
        //System.out.println("total number of patients is "+count);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        vieReportJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        vieReportJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Community", "Total No. in community", "no. of abnormal", "Percent of abnormal"
            }
        ));
        jScrollPane1.setViewportView(vieReportJTable);

        jLabel1.setText("Abnormality report based on community");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable vieReportJTable;
    // End of variables declaration//GEN-END:variables
}
