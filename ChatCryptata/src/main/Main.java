package main;

import domain.User;
import libCrittografia.EccezioneCripto;
import service.Autenticatore;
import service.Controllore;

/**
 * @author emanu
 * Date: 16-mag-2023
 */

public class Main {
    public static void main(String[] args) throws EccezioneCripto {
        Controllore controllore = new Controllore();
        Autenticatore autenticatore = new Autenticatore();
        User utente1 = new User(controllore, autenticatore, "Mario");
        User utente2 = new User(controllore, autenticatore, "Paolo");
        User utente3 = new User(controllore, autenticatore, "Luca");
        controllore.inserisciUtenti();
    }
    
}