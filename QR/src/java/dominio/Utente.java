package dominio;

import java.io.Serializable;

/**
 * 24-feb-2023
 * @author emanu
 */

public final class Utente implements Serializable {

    private String username;
    private String password;
    
    public Utente() {
    }

    public Utente(String username, String password) {
        this.username = username;
        this.password = password;
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

}

