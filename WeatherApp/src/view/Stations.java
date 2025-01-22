package view;

import controllore.Controller;
import dominio.Station;
import java.awt.Color;
import javax.swing.JOptionPane;
import persistenza.PersistanceStationMemory;
import persistenza.PersistanceDetectionFile;

/**
 *
 * @author emanu
 */
public class Stations extends javax.swing.JFrame implements IView{
    
    private Controller controllore;
    public Stations() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        stationIdTextField = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Parametri:");

        stationIdTextField.setText("Id Stazione");
        stationIdTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                stationIdTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                stationIdTextFieldFocusLost(evt);
            }
        });
        stationIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stationIdTextFieldActionPerformed(evt);
            }
        });

        sendButton.setText("Invia");
        sendButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(sendButton)
                    .addComponent(stationIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stationIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sendButton)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stationIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stationIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stationIdTextFieldActionPerformed

    private void stationIdTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stationIdTextFieldFocusGained
        // TODO add your handling code here:
        if (stationIdTextField.getText().equals("Id Stazione")) {
            stationIdTextField.setText("");
            stationIdTextField.setForeground(new Color(153, 153, 153, 153));
        }
    }//GEN-LAST:event_stationIdTextFieldFocusGained

    private void stationIdTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stationIdTextFieldFocusLost
        // TODO add your handling code here:
        if (stationIdTextField.getText().equals("")) {
            stationIdTextField.setText("Id Stazione");
            stationIdTextField.setForeground(new Color(153, 153, 153, 153));
        }
    }//GEN-LAST:event_stationIdTextFieldFocusLost

    private void sendButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendButtonMouseClicked
        // TODO add your handling code here:
        controllore.addStation(stationIdTextField.getText());
    }//GEN-LAST:event_sendButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Stations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sendButton;
    private javax.swing.JTextField stationIdTextField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostraMessaggio(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    @Override
    public void setControllore(Controller controllore) {
        this.controllore = controllore;
    }

    
}
