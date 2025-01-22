package pkg10sensori;

public class Sensore extends Thread {
    private int tempoAttesa, nome;
    private Osservatore centralina;

    public Sensore(int tempoAttesa, Osservatore centralina, int nome) {
        this.tempoAttesa = tempoAttesa;
        this.centralina = centralina;
        this.nome = nome;
    }
    
    @Override
    public void run() {
        while(true) {
            centralina.allarme(this);
            try {
                sleep(tempoAttesa);
            } catch(InterruptedException e) {
            }
        }
    }
    
    public int getNome() {
        return nome;
    }
}