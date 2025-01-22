package pezzi;

import java.util.LinkedList;

/**
 * @date 14-feb-2023
 * @author emanu
 */

public class Pezzo<Tipo> implements Azioni {
    
    public boolean white;
    private int posiz_x;
    private int posiz_y;    
    public int x;
    public int y; 
    public String nome;
    private LinkedList<Pezzo> lista;

    public Pezzo(int posiz_x, int posiz_y, boolean white, String nome, LinkedList<Pezzo> lista) {
        this.white = white;
        this.posiz_x = posiz_x;
        this.posiz_y = posiz_y;
        this.x = posiz_x * 100;
        this.y = posiz_y * 100;
        this.lista = lista;
        this.nome = nome;
        lista.add(this);
    }
        
    private enum Nome{
        RE, REGINA, CAVALLO, TORRE, ALFIERE, PEDONE;
    }
    
}
