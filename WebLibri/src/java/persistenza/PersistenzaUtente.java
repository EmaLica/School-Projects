package persistenza;

import dominio.Utente;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class PersistenzaUtente implements IPersistenza<String, Utente> {
    private static PersistenzaUtente singleton = null;
    private final HashMap<String, Utente> elenco;
    private final String path;

    private PersistenzaUtente(String path) {
        this.path = path;
        elenco = load(path);
    }

    public static synchronized PersistenzaUtente creaIstanza(String path) {
        if (singleton == null) {
            singleton = new PersistenzaUtente(path);
        }
        return singleton;
    }

    @Override
    public void create(Utente obj) throws IllegalArgumentException {
        if (!elenco.containsKey(obj.getUsername())) {
            Utente newObj = new Utente(obj);
            elenco.put(newObj.getUsername(), newObj);
            save(path);
        } else {
            throw new IllegalArgumentException("Utente già esistente");
        }
    }

    @Override
    public Utente read(String codice) throws IllegalArgumentException {
        if (elenco.containsKey(codice)) {
            Utente newObj = new Utente(elenco.get(codice));
            return newObj;
        } else {
            throw new IllegalArgumentException("Utente già esistente");
        }
    }

    @Override
    public void update(String codice, Utente nuovoObj) throws IllegalArgumentException {
        if (elenco.containsKey(codice)) {
            Utente obj = new Utente(nuovoObj);
            elenco.replace(codice, obj);
            save(path);
        } else {
            throw new IllegalArgumentException("Utente già esistente");
        }
    }

    @Override
    public void delete(Utente obj) throws IllegalArgumentException {
        if (elenco.containsKey(obj.getUsername())) {
            elenco.remove(obj.getUsername());
            save(path);
        } else {
            throw new IllegalArgumentException("Utente già esistente");
        }
    }

    @Override
    public Object elenco() {
        return load(path);
    }

    private void save(String path) {
        try {
            FileOutputStream file = new FileOutputStream(path);
            ObjectOutputStream obj = new ObjectOutputStream(file);
            obj.writeObject(elenco);
            obj.close();
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    private HashMap<String, Utente> load(String path) {
        try {
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream(path));
            return (HashMap<String, Utente>) obj.readObject();
        } catch (FileNotFoundException ex) {
            return new HashMap<>();
        } catch (IOException | ClassNotFoundException ex) {
            return new HashMap<>();
        }
    }
}