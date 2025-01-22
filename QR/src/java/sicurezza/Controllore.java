package sicurezza;

import dominio.Utente;
import persistenza.IPersistenza;
import javax.ws.rs.core.*;

/**
 * 24-feb-2023
 * @author emanu
 */

public class Controllore {
    
    public static boolean loginValido(Utente obj, IPersistenza<String, Utente> p) {
        Utente utente = p.read(obj.getUsername());
        if (obj.getUsername().equals(utente.getUsername()) == true) {
            return true;
        } else {
            return false;
        }
    }

    public static NewCookie controllo(Utente obj, IPersistenza<String, Utente> p) {
        String nome = "biscotto al cioccolato";
        String valore = "13542";
        if (loginValido(obj, p) == true) {
            return new NewCookie(nome, valore);
        }
        return null;
    }
}
