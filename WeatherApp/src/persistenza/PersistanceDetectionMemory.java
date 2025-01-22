/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistenza;

import dominio.Detection;

/**
 * Questa classe permette di istanziare una rilevazione in memoria, applicando il patter singleton per evitare
 * di creare persistenze nuove in memoria.
 * @author emanu
 */
public class PersistanceDetectionMemory implements IPersistance<Long, Detection>{

    @Override
    public void create(Detection obj) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detection read(Long idObject) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Long idObject, Detection newObj) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Detection obj) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //APPLICARE PATTERN SINGLETON, PER EVITARE DI CREARE PERSISTENZE
    //NUOVE IN MEMORIA
}
