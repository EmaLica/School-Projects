package produttoriconsumatori;

/**
 * Questa classe rappresenta un semaforo(mutex) che gestisce la mutua esclusione
 * di due o piu' Thread che necessitano di una variabile condivisa
 * in questo caso gestisce i Thread nel produrre e consumare delle risorse
 * @author Emanuele Licata
*/
public class Semaforo {
	public boolean stato;
        
        /**
         * Costruttore della classe
         * @param stato valore booleano che simula un mutex (true = accesso,
         * false = aspetta)
        */
	public Semaforo(boolean stato) {
		this.stato = stato;
	}
	
}
