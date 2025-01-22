package produttoriconsumatori;

public class ProduttoriConsumatori {

	public static void main(String[] args) {
		Semaforo semaforo = new Semaforo(true);
                Produttore p = new Produttore(semaforo, 100);
                Consumatore c = new Consumatore(semaforo, 231);
                
                p.start();
                c.start();
	}
}
