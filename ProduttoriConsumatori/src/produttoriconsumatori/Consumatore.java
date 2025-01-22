package produttoriconsumatori;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Questa classe rappresenta la classe consumatore, consuma una risorsa solo se
 * una risorsa e' stata effettivamente prodotta da un produttore.
 * @author Emanuele Licata
 */
public class Consumatore extends Thread{
    
    /**
     * Costruttore della classe
     * @param semaforo istanza della classe semaforo, funziona come un mutex
    */
    private int id;
    
    public Consumatore(Semaforo semaforo, int id){
        new Thread(new Runnable(){
            @Override
            public void run(){
                while (true) {                    
                    synchronized(semaforo){
                        if(!semaforo.stato){
                            System.out.println("Consumo. Con id uguale a: "+id);
                            semaforo.stato = !semaforo.stato;
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Consumatore.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }
            }
        }).start();
    }
    
}
