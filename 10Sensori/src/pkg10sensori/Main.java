package pkg10sensori;

public class Main {
    public static void main(String[] args) {
        Centralina c = new Centralina();
        for (int i = 0; i < 10; i++)
            new Sensore((i + 1) * 1000, c, i).start();
    }   
}