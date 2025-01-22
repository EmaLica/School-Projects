package service;

import domain.Autenticazione;
import java.util.HashMap;
import libCrittografia.EccezioneCripto;
import libCrittografia.Rsa;

/**
 * @author emanu
 * Date: 16-mag-2023
 */

public class Autenticatore {
    private final HashMap<Integer, Autenticazione> listaCertificati;
    private final Rsa chiavi;
    private int codice;
    private static int codiceCounter = 0;

    public Autenticatore() throws EccezioneCripto {
        listaCertificati = new HashMap<>();
        chiavi = new Rsa();
    }
    
    public Autenticazione creaCertificato(String nome) throws EccezioneCripto {
        Rsa chiaviUtente = new Rsa();
        Autenticazione autenticazione = new Autenticazione(nome, chiaviUtente.getChiavePubblica(), chiaviUtente.getChiavePrivata(), "Ente");
        autenticazione.getCertificato().setFirmaCertificato(chiavi.cifraPrivata(autenticazione.getCertificato().getHash(), chiavi.getChiavePrivata()));
        codice = codiceCounter;
        listaCertificati.put(codice, autenticazione);
        codiceCounter++;
        return autenticazione;
    }
}