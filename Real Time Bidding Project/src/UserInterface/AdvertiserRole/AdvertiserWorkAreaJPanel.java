/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.AdvertiserRole;

import Business.Advertising.DSP;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AdvertiserOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author anirudhbedre
 */
public class AdvertiserWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdvertiserWorkAreaJPanel
     */
     private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private AdvertiserOrganization organization;
    public AdvertiserWorkAreaJPanel(JPanel upc, Enterprise enterprise,AdvertiserOrganization organization,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer=upc;
        this.enterprise=enterprise;
        this.userAccount=userAccount;
        this.organization=organization;
        
        advertiserJLabel.setText("Welcome "+userAccount.getEmployee().getName()+" !!!");
        
        
         DSP dsp=organization.getDsp();
        baseBiddingPriceTextField.setText(String.valueOf(dsp.getBaseBiddingAmount()));
        budgetJTextField.setText(String.valueOf(organization.getAdvertisingBudget()));
                
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
        baseBiddingPriceTextField = new javax.swing.JTextField();
        setButton = new javax.swing.JButton();
        manageAdsJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        budgetJTextField = new javax.swing.JTextField();
        advertiserJLabel = new javax.swing.JLabel();
        configureDSPJButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Advertiser Work Area ");

        jLabel2.setText("Base bidding price:   $");

        setButton.setText("Set");
        setButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setButtonActionPerformed(evt);
            }
        });

        manageAdsJButton.setText("Manage Ads");
        manageAdsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAdsJButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Advertising Budget:  $");

        advertiserJLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        advertiserJLabel.setText("Advertiser");

        configureDSPJButton.setText("Configure DSP");
        configureDSPJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configureDSPJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(setButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(budgetJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(advertiserJLabel)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2)
                                .addComponent(configureDSPJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(manageAdsJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(7, 7, 7)
                            .addComponent(baseBiddingPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(advertiserJLabel)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(budgetJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(baseBiddingPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(setButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageAdsJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(configureDSPJButton)
                .addGap(68, 68, 68))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setButtonActionPerformed
        // TODO add your handling code here:
        try{
        float baseBiddingAmount=Float.parseFloat(baseBiddingPriceTextField.getText());
        float budget=Float.parseFloat(budgetJTextField.getText());
        DSP dsp=organization.getDsp();
        dsp.setBaseBiddingAmount(baseBiddingAmount);
        organization.setAdvertisingBudget(budget);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter valid number for Budget and Base Bpidding Price !!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_setButtonActionPerformed

    private void manageAdsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAdsJButtonActionPerformed
        // TODO add your handling code here:
         ManageAdsJPanel manageAdsJPanel = new ManageAdsJPanel(userProcessContainer,organization);
        userProcessContainer.add("ManageAdsJPanel",manageAdsJPanel);
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_manageAdsJButtonActionPerformed

    private void configureDSPJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configureDSPJButtonActionPerformed
        // TODO add your handling code here:
        ConfigureDSPJPanel configureDSPJPanel = new ConfigureDSPJPanel(userProcessContainer,organization);
        userProcessContainer.add("ConfigureDSPJPanel",configureDSPJPanel);
        ((CardLayout)userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_configureDSPJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advertiserJLabel;
    private javax.swing.JTextField baseBiddingPriceTextField;
    private javax.swing.JTextField budgetJTextField;
    private javax.swing.JButton configureDSPJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton manageAdsJButton;
    private javax.swing.JButton setButton;
    // End of variables declaration//GEN-END:variables
}