package grafica;

public class Calcolo extends javax.swing.JFrame {

    public Calcolo() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        coeffA = new javax.swing.JTextField();
        coeffB = new javax.swing.JTextField();
        coeffC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bottoneCDelta = new javax.swing.JButton();
        delta = new javax.swing.JLabel();
        soluzione1 = new javax.swing.JRadioButton();
        soluzione2 = new javax.swing.JRadioButton();
        soluzioneN = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        radice1 = new javax.swing.JTextField();
        radice2 = new javax.swing.JTextField();
        bottoneCRadici = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        coeffA.setMinimumSize(new java.awt.Dimension(6, 27));
        coeffA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coeffAActionPerformed(evt);
            }
        });

        coeffC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coeffCActionPerformed(evt);
            }
        });

        jLabel1.setText("Inserisci l'equazione");

        jLabel2.setText("x^2");

        jLabel3.setText("x");

        bottoneCDelta.setText("calcolo delta");
        bottoneCDelta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneCDeltaActionPerformed(evt);
            }
        });

        soluzione1.setText("1");
        soluzione1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soluzione1ActionPerformed(evt);
            }
        });

        soluzione2.setText("2");

        soluzioneN.setText("nessuna");
        soluzioneN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soluzioneNActionPerformed(evt);
            }
        });

        jLabel5.setText("Soluzioni");

        radice1.setText("radice 1");

        radice2.setText("radice 2");

        bottoneCRadici.setText("calcolo radici");
        bottoneCRadici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneCRadiciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(radice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(radice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bottoneCDelta)
                        .addGap(88, 88, 88)
                        .addComponent(delta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bottoneCRadici)))
                .addGap(21, 548, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(soluzioneN)
                    .addComponent(soluzione2)
                    .addComponent(soluzione1)
                    .addComponent(jLabel5))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(coeffA, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(60, 60, 60)
                        .addComponent(coeffB, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(59, 59, 59)
                        .addComponent(coeffC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coeffA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coeffB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coeffC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bottoneCDelta)
                            .addComponent(delta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(soluzione1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(soluzione2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(soluzioneN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(bottoneCRadici)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void soluzione1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soluzione1ActionPerformed

    }//GEN-LAST:event_soluzione1ActionPerformed

    private void soluzioneNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soluzioneNActionPerformed

    }//GEN-LAST:event_soluzioneNActionPerformed

    private void coeffAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coeffAActionPerformed

    }//GEN-LAST:event_coeffAActionPerformed

    private void coeffCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coeffCActionPerformed

    }//GEN-LAST:event_coeffCActionPerformed

    private void bottoneCDeltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneCDeltaActionPerformed
     soluzione1.setSelected(false);
     soluzione2.setSelected(false);
     soluzioneN.setSelected(false);
        double delta1= Math.sqrt(Math.pow(Double.valueOf(coeffB.getText()), 2)-(4*Double.valueOf(coeffA.getText())*Double.valueOf(coeffC.getText())));
        delta.setText(delta1+"");
        if(delta1>0)
            soluzione2.setSelected(rootPaneCheckingEnabled);
        else if(delta1<0)
            soluzioneN.setSelected(rootPaneCheckingEnabled);
        else
            soluzione1.setSelected(rootPaneCheckingEnabled);
    }//GEN-LAST:event_bottoneCDeltaActionPerformed

    private void bottoneCRadiciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneCRadiciActionPerformed
       double radiceN1=(-Double.valueOf(coeffB.getText()))+Double.valueOf(delta.getText())/(2*Double.valueOf(coeffA.getText()));
       double radiceN2=(-Double.valueOf(coeffB.getText()))-Double.valueOf(delta.getText())/(2*Double.valueOf(coeffA.getText()));
        
        radice1.setText(radiceN1+"");
         radice2.setText(radiceN2+"");
    }//GEN-LAST:event_bottoneCRadiciActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bottoneCDelta;
    private javax.swing.JButton bottoneCRadici;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField coeffA;
    private javax.swing.JTextField coeffB;
    private javax.swing.JTextField coeffC;
    private javax.swing.JLabel delta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField radice1;
    private javax.swing.JTextField radice2;
    private javax.swing.JRadioButton soluzione1;
    private javax.swing.JRadioButton soluzione2;
    private javax.swing.JRadioButton soluzioneN;
    // End of variables declaration//GEN-END:variables
}
