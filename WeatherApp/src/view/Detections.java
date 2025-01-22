package view;

import controllore.Controller;
import java.awt.Color;

/**
 *
 * @author emanu
 */
public class Detections extends javax.swing.JFrame implements IView {
    private Controller controllore;
    public Detections() {
        initComponents();
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        celsiusTemperatureTextField = new javax.swing.JTextField();
        pascalPressureTextField = new javax.swing.JTextField();
        timeInMillisecondsTextField = new javax.swing.JTextField();
        idDetectionTextField = new javax.swing.JTextField();
        createDetectionRadioBtn = new javax.swing.JRadioButton();
        readDetectionRadioBtn = new javax.swing.JRadioButton();
        updateDetectionRadioBtn = new javax.swing.JRadioButton();
        removeDetectionRadioBtn = new javax.swing.JRadioButton();
        sendButton = new javax.swing.JButton();
        stationsComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        alertTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Parametri:");

        celsiusTemperatureTextField.setForeground(new java.awt.Color(153, 153, 153));
        celsiusTemperatureTextField.setText("temperatura in celsius");
        celsiusTemperatureTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                celsiusTemperatureTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                celsiusTemperatureTextFieldFocusLost(evt);
            }
        });

        pascalPressureTextField.setForeground(new java.awt.Color(153, 153, 153));
        pascalPressureTextField.setText("pressione in pascal");
        pascalPressureTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pascalPressureTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pascalPressureTextFieldFocusLost(evt);
            }
        });
        pascalPressureTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pascalPressureTextFieldActionPerformed(evt);
            }
        });

        timeInMillisecondsTextField.setForeground(new java.awt.Color(153, 153, 153));
        timeInMillisecondsTextField.setText("tempo in millisecondi");
        timeInMillisecondsTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                timeInMillisecondsTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                timeInMillisecondsTextFieldFocusLost(evt);
            }
        });
        timeInMillisecondsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeInMillisecondsTextFieldActionPerformed(evt);
            }
        });

        idDetectionTextField.setForeground(new java.awt.Color(153, 153, 153));
        idDetectionTextField.setText("id Rilevazione");
        idDetectionTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idDetectionTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idDetectionTextFieldFocusLost(evt);
            }
        });
        idDetectionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idDetectionTextFieldActionPerformed(evt);
            }
        });

        buttonGroup1.add(createDetectionRadioBtn);
        createDetectionRadioBtn.setText("Crea Rilevazione");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, createDetectionRadioBtn, org.jdesktop.beansbinding.ELProperty.create("${actionCommand}"), createDetectionRadioBtn, org.jdesktop.beansbinding.BeanProperty.create("actionCommand"));
        bindingGroup.addBinding(binding);

        buttonGroup1.add(readDetectionRadioBtn);
        readDetectionRadioBtn.setText("Leggi Rilevazione");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, readDetectionRadioBtn, org.jdesktop.beansbinding.ELProperty.create("${actionCommand}"), readDetectionRadioBtn, org.jdesktop.beansbinding.BeanProperty.create("actionCommand"));
        bindingGroup.addBinding(binding);

        buttonGroup1.add(updateDetectionRadioBtn);
        updateDetectionRadioBtn.setText("Aggiorna Rilevazione");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, updateDetectionRadioBtn, org.jdesktop.beansbinding.ELProperty.create("${actionCommand}"), updateDetectionRadioBtn, org.jdesktop.beansbinding.BeanProperty.create("actionCommand"));
        bindingGroup.addBinding(binding);

        buttonGroup1.add(removeDetectionRadioBtn);
        removeDetectionRadioBtn.setText("Rimuovi Rilevazione");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, removeDetectionRadioBtn, org.jdesktop.beansbinding.ELProperty.create("${actionCommand}"), removeDetectionRadioBtn, org.jdesktop.beansbinding.BeanProperty.create("actionCommand"));
        bindingGroup.addBinding(binding);

        sendButton.setText("Invia");
        sendButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendButtonMouseClicked(evt);
            }
        });

        stationsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stationsComboBoxActionPerformed(evt);
            }
        });

        alertTextArea.setEditable(false);
        alertTextArea.setColumns(20);
        alertTextArea.setForeground(new java.awt.Color(255, 0, 0));
        alertTextArea.setRows(5);
        jScrollPane1.setViewportView(alertTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(idDetectionTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(timeInMillisecondsTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pascalPressureTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(celsiusTemperatureTextField, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(sendButton)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeDetectionRadioBtn)
                    .addComponent(jScrollPane1)
                    .addComponent(updateDetectionRadioBtn)
                    .addComponent(stationsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createDetectionRadioBtn)
                    .addComponent(readDetectionRadioBtn))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stationsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createDetectionRadioBtn)
                    .addComponent(celsiusTemperatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(readDetectionRadioBtn)
                    .addComponent(pascalPressureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(timeInMillisecondsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateDetectionRadioBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idDetectionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeDetectionRadioBtn))
                        .addGap(18, 18, 18)
                        .addComponent(sendButton)
                        .addContainerGap(74, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timeInMillisecondsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeInMillisecondsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeInMillisecondsTextFieldActionPerformed

    private void pascalPressureTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pascalPressureTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pascalPressureTextFieldActionPerformed

    private void celsiusTemperatureTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_celsiusTemperatureTextFieldFocusGained
        // TODO add your handling code here:
        if (celsiusTemperatureTextField.getText().equals("temperatura in celsius")) {
            celsiusTemperatureTextField.setText("");
            celsiusTemperatureTextField.setForeground(new Color(153, 153, 153, 153));
        }
    }//GEN-LAST:event_celsiusTemperatureTextFieldFocusGained

    private void celsiusTemperatureTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_celsiusTemperatureTextFieldFocusLost
        // TODO add your handling code here:
        if (celsiusTemperatureTextField.getText().equals("")) {
            celsiusTemperatureTextField.setText("temperatura in celsius");
            celsiusTemperatureTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_celsiusTemperatureTextFieldFocusLost

    private void pascalPressureTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pascalPressureTextFieldFocusGained
        // TODO add your handling code here:
        if (pascalPressureTextField.getText().equals("pressione in pascal")) {
            pascalPressureTextField.setText("");
            pascalPressureTextField.setForeground(new Color(153, 153, 153, 153));
        }
    }//GEN-LAST:event_pascalPressureTextFieldFocusGained

    private void pascalPressureTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pascalPressureTextFieldFocusLost
        // TODO add your handling code here:
        if (pascalPressureTextField.getText().equals("")) {
            pascalPressureTextField.setText("pressione in pascal");
            pascalPressureTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_pascalPressureTextFieldFocusLost

    private void timeInMillisecondsTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_timeInMillisecondsTextFieldFocusGained
        // TODO add your handling code here:
        if (timeInMillisecondsTextField.getText().equals("tempo in millisecondi")) {
            timeInMillisecondsTextField.setText("");
            timeInMillisecondsTextField.setForeground(new Color(153, 153, 153, 153));
        }
    }//GEN-LAST:event_timeInMillisecondsTextFieldFocusGained

    private void timeInMillisecondsTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_timeInMillisecondsTextFieldFocusLost
        // TODO add your handling code here:
        if (timeInMillisecondsTextField.getText().equals("")) {
            timeInMillisecondsTextField.setText("tempo in millisecondi");
            timeInMillisecondsTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_timeInMillisecondsTextFieldFocusLost

    private void idDetectionTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idDetectionTextFieldFocusGained
        // TODO add your handling code here:
        if (idDetectionTextField.getText().equals("id Rilevazione")) {
            idDetectionTextField.setText("");
            idDetectionTextField.setForeground(new Color(153, 153, 153, 153));
        }
    }//GEN-LAST:event_idDetectionTextFieldFocusGained

    private void idDetectionTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idDetectionTextFieldFocusLost
        // TODO add your handling code here:
        if (idDetectionTextField.getText().equals("")) {
            idDetectionTextField.setText("id Rilevazione");
            idDetectionTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_idDetectionTextFieldFocusLost

    private void sendButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendButtonMouseClicked
        // TODO add your handling code here:
        // l'id della stazione lo prendo dal combo box e glielo passo nel costruttore della detection
        String wichCrudOperation = buttonGroup1.getSelection().getActionCommand();
        String wichStation = stationsComboBox.getSelectedItem().toString();
        try {
            if (wichCrudOperation.equals("Crea Rilevazione")) {
                System.out.println("Hai selezionato crea rilevazione");
                System.out.println("Hai selezionato la stazione: " + wichStation);
            } else if (wichCrudOperation.equals("Leggi Rilevazione")) {
                System.out.println("Hai selezionato leggi rilevazione");
                System.out.println("Hai selezionato la stazione: " + wichStation);
            } else if (wichCrudOperation.equals("Aggiorna Rilevazione")) {
                System.out.println("Hai selezionato aggiorna rilevazione");
                System.out.println("Hai selezionato la stazione: " + wichStation);
            } else if (wichCrudOperation.equals("Rimuovi Rilevazione")) {
                System.out.println("Hai selezionato rimuovi rilevazione");
                System.out.println("Hai selezionato la stazione: " + wichStation);
            }
        } catch (NullPointerException e) {
            System.out.println("Nel sistema non e' presente nemmeno una stazione!");
            e.printStackTrace();
            alertTextArea.append("Nel sistema non e' presente nemmeno una stazione!");
        }
        
    }//GEN-LAST:event_sendButtonMouseClicked

    private void stationsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stationsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stationsComboBoxActionPerformed

    private void idDetectionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idDetectionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idDetectionTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Detections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Detections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Detections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Detections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Detections().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alertTextArea;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField celsiusTemperatureTextField;
    private javax.swing.JRadioButton createDetectionRadioBtn;
    private javax.swing.JTextField idDetectionTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pascalPressureTextField;
    private javax.swing.JRadioButton readDetectionRadioBtn;
    private javax.swing.JRadioButton removeDetectionRadioBtn;
    private javax.swing.JButton sendButton;
    private javax.swing.JComboBox<String> stationsComboBox;
    private javax.swing.JTextField timeInMillisecondsTextField;
    private javax.swing.JRadioButton updateDetectionRadioBtn;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostraMessaggio(String msg) {
        
    }

    @Override
    public void setControllore(Controller controllore) {
        this.controllore = controllore;
    }

}
