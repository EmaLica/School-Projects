package observerdesignpattern;

public class Osservatore implements DiventaObserver{
    
    public void evento1(ChiEStato e){
        System.out.println("ev 1 verificato");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
        }
    }
}
