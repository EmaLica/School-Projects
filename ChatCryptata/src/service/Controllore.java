package service;

import domain.User;
import java.util.HashMap;
import libCrittografia.EccezioneCripto;
import gui.IView;
import gui.View;

/**
 * @author emanu
 * Date: 16-mag-2023
 */

public class Controllore {
    private final HashMap<Integer, User> listaUtenti;
    private final HashMap<String, IView> listaView;
    
    public Controllore() {
        listaUtenti = new HashMap<>();
        listaView = new HashMap<>();
    }

    public void aggiungiUtente(User utente) {
        listaUtenti.put(utente.getCodice(), utente);
        IView view = new View(utente.getNome());
        view.setController(this);
        listaView.put(utente.getNome(), view);
    }
    
    public void inserisciUtenti() {
        for (int i = 0; i < listaUtenti.size(); i++) {
            User u = listaUtenti.get(i);
            listaView.get(u.getNome()).addUser(u.getNome());
        }
    }
    
    public void invia(int valore, String testo) throws EccezioneCripto {
        String testocifrato = listaUtenti.get(valore).cifra(testo);
        listaView.get(listaUtenti.get(valore).getNome()).printClearMessage(valore, testocifrato);
    }

    public HashMap<Integer, User> getListaUtenti() {
        return listaUtenti;
    }
}