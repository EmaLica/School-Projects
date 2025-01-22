package pkg10sensori;

public class Centralina implements Osservatore {
    @Override
    public void allarme(Sensore e) {
        System.out.println("L'allarme è partito dal sensore " + e.getNome());
    }
}