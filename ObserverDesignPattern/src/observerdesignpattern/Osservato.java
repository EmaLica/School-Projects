/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern;

import java.util.ArrayList;

/**
 *
 * @author emanu
 */
public class Osservato {
    private ArrayList<DiventaObserver> elencoObserver = new ArrayList<>();
    
    public void addOsservatori(DiventaObserver oss){
        elencoObserver.add(oss);
    }
    
    public void generaEvento1(){
        for(DiventaObserver o : elencoObserver){
            o.evento1(new ChiEStato(this));
            new Thread(new Runnable() {
              @Override
              public void run() {
                 
              }
          }).start();
        }
    }
    
}
