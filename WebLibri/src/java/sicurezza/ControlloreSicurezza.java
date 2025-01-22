package sicurezza;

import dominio.Utente;
import persistenza.PersistenzaUtente;

public class ControlloreSicurezza {
    PersistenzaUtente p = PersistenzaUtente.creaIstanza("utenti.dat");
    
    public Boolean checkUtente(String username, String password) {
        if (p.read(username) == null || !p.read(username).getPassword().equals(password))
            return false;
        else
            return true;
    }
    
    public void saveUtente(String username, String password) {
        p.create(new Utente(username, password));
    }
}