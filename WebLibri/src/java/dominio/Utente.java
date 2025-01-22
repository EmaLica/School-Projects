package dominio;

import java.io.Serializable;

public final class Utente implements Serializable {

    private String username;
    private String password;
    private String nomeCompleto;
    private Ruolo ruolo;

    public Utente() {
    }

    public Utente(String username, String password) {
        this.username = username;
        this.password = password;
        this.nomeCompleto = nomeCompleto;
        this.ruolo = ruolo;
    }

    public Utente(Utente obj) {
        setUsername(obj.getUsername());
        setPassword(obj.getPassword());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Ruolo getRuolo() {
        return ruolo;
    }

    public void setRuolo(Ruolo ruolo) {
        this.ruolo = ruolo;
    }
    
    public enum Ruolo {
        OSPITE, UTENTE, AMMINISTRATORE;
    }
}
