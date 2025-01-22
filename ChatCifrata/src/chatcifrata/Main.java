package chatcifrata;

import libCrittografia.EccezioneCripto;
import service.Autenticatore;
import service.Controllore;

public class Main {
    public static void main(String[] args) throws EccezioneCripto {
        Controllore controllore = new Controllore();
        Autenticatore autenticatore = new Autenticatore();
        Utente utente1 = new Utente(controllore, autenticatore, "Mario");
        Utente utente2 = new Utente(controllore, autenticatore, "Paolo");
        Utente utente3 = new Utente(controllore, autenticatore, "Luca");
        controllore.inserisciUtenti();
    }
}