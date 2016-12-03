/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Department;

import Business.Enterprise.Enterprise;
import Business.ExtendedClasses.Machine;
import Business.ExtendedClasses.Sensor;
import Business.Organization.Organization;
import Business.Organization.ProcurementOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DeptProcurementWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class AddSensorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddSensorJPanel
     */
    private JPanel userProcessContainer;
    private Machine machine;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organization org;
    public AddSensorJPanel(JPanel userProcessContainer,Machine machine,Enterprise enterprise , UserAccount account,Organization org) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.machine = machine;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.org=org;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboSensorValue = new javax.swing.JComboBox();
        btnSave = new javax.swing.JButton();

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Sensor Name");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Sensor Value");

        comboSensorValue.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Need to Replace", "Critical", "Down" }));
        comboSensorValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSensorValueActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(backJButton))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addComponent(comboSensorValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(421, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboSensorValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(btnSave))
                .addContainerGap(376, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void comboSensorValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSensorValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSensorValueActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Sensor sensor =machine.getSensorData();
        sensor.setSensorName(jTextField1.getText());
        sensor.setSensorVlaue(comboSensorValue.getSelectedItem().toString());
        JOptionPane.showMessageDialog(null,"Sensor Data Added Successfully");
        
        
        if(comboSensorValue.getSelectedItem().toString().equalsIgnoreCase("Down"))
        {
            if(machine.isIsRequestSent())
            {
                
            }
            else{
        System.out.println("Inside");
        DeptProcurementWorkRequest request = new DeptProcurementWorkRequest();
        machine.setIsRequestSent(true);
        request.setSensorStatusOld(machine.getSensorData().getSensorVlaue());
        request.setMachine(machine);
        request.setSender(userAccount);
        //request.setDeptmessage(message);
        request.setMessage("Automated Request");
        request.setStatus("Sent to Procurement");
        request.setOrg(org);
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof ProcurementOrganization){
                org = organization;
                break;
            }
        }
        
        if (org!=null){
            request.setCurrentOwnerOrganzation(org);
            org.getWorkQueue().getWorkRequestList().add(request);
            System.out.println(userAccount);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        
            }
        }
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox comboSensorValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
