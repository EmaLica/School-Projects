package chatcifrata;

import dominio.Autenticazione;
import libCrittografia.EccezioneCripto;
import libCrittografia.Rsa;
import service.Autenticatore;
import service.Controllore;

public class Utente {
    private final Controllore controllore;
    private final Autenticatore autenticatore;
    private String nome;
    private final Autenticazione aut;
    private final Rsa cifratore;
    private final int codice;
    private static int codiceCounter = 0;

    public Utente(Controllore controllore, Autenticatore autenticatore, String nome) throws EccezioneCripto {
        this.controllore = controllore;
        this.autenticatore = autenticatore;
        this.nome = nome;
        aut = autenticatore.creaCertificato(this.nome);
        cifratore = new Rsa(aut.getCertificato().getPublicKey(), aut.getChiavePrivata());
        codice = codiceCounter;
        codiceCounter++;
        controllore.aggiungiUtente(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodice() {
        return codice;
    }
    
    public String cifra(String testo) throws EccezioneCripto {
        return cifratore.cifraPubblica(testo, cifratore.getChiavePubblica());
    }
    
    public String decifra(String testoCifrato) throws EccezioneCripto {
        return cifratore.decifraPrivata(testoCifrato, cifratore.getChiavePrivata());
    }
}