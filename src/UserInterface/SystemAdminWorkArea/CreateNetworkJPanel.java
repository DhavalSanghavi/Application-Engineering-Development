/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class CreateNetworkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNetworkJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    public CreateNetworkJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
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
        networkNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        AreaServedTextField = new javax.swing.JTextField();
        CreateNetworkButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        jLabel1.setText("Network Name *");
        jLabel1.setToolTipText("");

        jLabel2.setText("Area served");

        AreaServedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaServedTextFieldActionPerformed(evt);
            }
        });

        CreateNetworkButton.setText("Create Network");
        CreateNetworkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateNetworkButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(CreateNetworkButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(networkNameTextField)
                            .addComponent(AreaServedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))))
                .addContainerGap(543, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(networkNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AreaServedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateNetworkButton)
                    .addComponent(backJButton))
                .addContainerGap(345, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AreaServedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaServedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AreaServedTextFieldActionPerformed

    private void CreateNetworkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateNetworkButtonActionPerformed
        // TODO add your handling code here:
        
        String name = networkNameTextField.getText();
        String areaServed = AreaServedTextField.getText();
        if(name.equals("") || name.equals(null))
        {
            JOptionPane.showMessageDialog(null, "Kindly Enter Network Name");
        }
        else
        {
            Network network = system.createAndAddNetwork();
            network.setName(name);
            network.setAreaServed(areaServed);
            Calendar currentCalendar = Calendar.getInstance();
           Date currentTime = currentCalendar.getTime();
            network.setCreatedDate(currentTime);
            JOptionPane.showMessageDialog(null,"Network "+name+" has been created Succcessfully");
            networkNameTextField.setText("");
            AreaServedTextField.setText("");
        }
    }//GEN-LAST:event_CreateNetworkButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AreaServedTextField;
    private javax.swing.JButton CreateNetworkButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField networkNameTextField;
    // End of variables declaration//GEN-END:variables
}
