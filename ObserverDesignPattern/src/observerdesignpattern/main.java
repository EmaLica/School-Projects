/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern;

/**
 *
 * @author emanu
 */
public class main {
    
    public static void main(String args[]){
        AltroAscoltatoreDiBottoni o2 = new AltroAscoltatoreDiBottoni();
        Finestra f = new Finestra(o2);
        Osservatore o1 = new Osservatore();
        Osservato osservato = new Osservato();
        
        osservato.addOsservatori(o1);
        osservato.addOsservatori(o2);
        
    }
    
}
