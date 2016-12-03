/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Servicing;

import Business.Enterprise.Enterprise;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class ServicingProcessRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ServicingProcessRequestJPanel
     */
    private WorkRequest request;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    public ServicingProcessRequestJPanel(JPanel userProcessContainer,Enterprise enterprise,WorkRequest request) {
        initComponents();
        this.request = request;
        this.userProcessContainer =userProcessContainer;
        this.enterprise =enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        TextFieldFinMessage = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        backJButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        comboSensorValue = new javax.swing.JComboBox();

        jLabel2.setText("Message for Department");

        TextFieldFinMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldFinMessageActionPerformed(evt);
            }
        });

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        backJButton2.setText("<< Back");
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Sensor Value");

        comboSensorValue.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Working Fine" }));
        comboSensorValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSensorValueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(backJButton2))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(103, 103, 103)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1)
                    .addComponent(comboSensorValue, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextFieldFinMessage))
                .addContainerGap(499, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboSensorValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextFieldFinMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(backJButton2))
                .addContainerGap(281, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldFinMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldFinMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldFinMessageActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       // String price = TextFieldTotalPrice.getText();
        String messageforDept = TextFieldFinMessage.getText();
        
            request.setMsgforDept(messageforDept);
            request.getMachine().getSensorData().setSensorVlaue(comboSensorValue.getSelectedItem().toString());
            request.getMachine().setIsRequestSent(false);
            request.setStatus("Serviced");
            request.setResolveDate(new Date());
            request.setCurrentOwner(null);
            request.setCurrentOwnerOrganzation(null); 
            JOptionPane.showMessageDialog(null,"Servicing Finished");
            userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ServicingViewAllRequest dwjp = (ServicingViewAllRequest) component;
        dwjp.populateworkRequestJTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ServicingViewAllRequest dwjp = (ServicingViewAllRequest) component;
        dwjp.populateworkRequestJTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton2ActionPerformed

    private void comboSensorValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSensorValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSensorValueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldFinMessage;
    private javax.swing.JButton backJButton2;
    private javax.swing.JComboBox comboSensorValue;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
