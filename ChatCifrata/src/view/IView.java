package view;

import service.Controllore;

public interface IView {
    public void aggiungiUtente(String nome);
    public void stampa(int valore, String testo);
    public void setControllore(Controllore controllore);
}