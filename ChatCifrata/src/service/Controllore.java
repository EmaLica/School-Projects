package service;

import chatcifrata.Utente;
import java.util.HashMap;
import libCrittografia.EccezioneCripto;
import view.IView;
import view.View;

public class Controllore {
    private final HashMap<Integer, Utente> listaUtenti;
    private final HashMap<String, IView> listaView;
    
    public Controllore() {
        listaUtenti = new HashMap<>();
        listaView = new HashMap<>();
    }

    public void aggiungiUtente(Utente utente) {
        listaUtenti.put(utente.getCodice(), utente);
        IView view = new View(utente.getNome());
        view.setControllore(this);
        listaView.put(utente.getNome(), view);
    }
    
    public void inserisciUtenti() {
        for (int i = 0; i < listaUtenti.size(); i++) {
            Utente u = listaUtenti.get(i);
            listaView.get(u.getNome()).aggiungiUtente(u.getNome());
        }
    }
    
    public void invia(int valore, String testo) throws EccezioneCripto {
        String testocifrato = listaUtenti.get(valore).cifra(testo);
        listaView.get(listaUtenti.get(valore).getNome()).stampa(valore, testocifrato);
    }

    public HashMap<Integer, Utente> getListaUtenti() {
        return listaUtenti;
    }
}