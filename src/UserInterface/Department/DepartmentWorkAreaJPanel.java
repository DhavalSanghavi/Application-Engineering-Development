/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Department;

import Business.Enterprise.Enterprise;
import Business.Organization.DepartmentOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;


/**
 *
 * @author Abhishek
 */
public class DepartmentWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DepartmentWorkAreaJPane
     */
    
    private JPanel userProcessContainer;
    private DepartmentOrganization org;
    private Enterprise enterprise;
    private UserAccount userAccount;
    public DepartmentWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DepartmentOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.org = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        System.out.println(userAccount);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMachineJbutton = new javax.swing.JButton();
        viewMachinesJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        addMachineJbutton.setText("Add Machine");
        addMachineJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMachineJbuttonActionPerformed(evt);
            }
        });

        viewMachinesJButton.setText("View Current Requests");
        viewMachinesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMachinesJButtonActionPerformed(evt);
            }
        });

        jButton1.setText("View Completed Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addMachineJbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewMachinesJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(addMachineJbutton)
                .addGap(29, 29, 29)
                .addComponent(viewMachinesJButton)
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addContainerGap(135, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addMachineJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMachineJbuttonActionPerformed
        // TODO add your handling code here:
        AddMachineJPanel AddMachineJPanel = new AddMachineJPanel(userProcessContainer,org,userAccount,enterprise);
        userProcessContainer.add("manageOrganizationJPanel", AddMachineJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_addMachineJbuttonActionPerformed

    private void viewMachinesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMachinesJButtonActionPerformed
        // TODO add your handling code here:
        
        System.out.println(userAccount+"Juset send");
        ViewRequestJpanel ViewRequestJpanel = new ViewRequestJpanel(userProcessContainer,org,userAccount,enterprise);
        userProcessContainer.add("ViewRequestJpanel", ViewRequestJpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewMachinesJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DepartmentViewCompletedRequest DepartmentViewCompletedRequest = new DepartmentViewCompletedRequest(userProcessContainer,org,userAccount,enterprise);
        userProcessContainer.add("DepartmentViewCompletedRequest", DepartmentViewCompletedRequest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMachineJbutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton viewMachinesJButton;
    // End of variables declaration//GEN-END:variables
}
