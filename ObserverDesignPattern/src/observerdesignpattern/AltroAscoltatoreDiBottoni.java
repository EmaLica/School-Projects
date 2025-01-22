   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author emanu
 */
public class AltroAscoltatoreDiBottoni implements DiventaObserver, ActionListener{

    @Override
    public void evento1(ChiEStato chi) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton chiEStato = (JButton)e.getSource();
        System.out.println(chiEStato.getText());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AltroAscoltatoreDiBottoni.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
