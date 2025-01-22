package produttoriconsumatori;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Questa classe rappresenta la classe produttore, produce una risorsa solo se
 * e' presente spazio in memoria per produrre altre risorse.
 * @author Emanuele Licata
 */
class Produttore extends Thread{
    
    /**
     * Costruttore della classe
     * @param semaforo istanza della classe semaforo, funziona come un mutex
    */
    public Produttore(Semaforo semaforo, int id){
        new Thread(new Runnable(){
            @Override
            public void run(){
                while (true) {                    
                    synchronized(semaforo){
                        if(semaforo.stato){
                            System.out.println("Produco. Con id uguale a: " + id);
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
