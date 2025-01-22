package persistenza;

import dominio.Utente;
import java.util.HashMap;

/**
 * 24-feb-2023
 * @author emanu
 */

public final class PersistenzaUtente implements IPersistenza<String, Utente> {
    private static PersistenzaUtente SINGLETON = null;
    private final HashMap<String, Utente> elenco;

    private PersistenzaUtente() {
        elenco = new HashMap<>();
        create(new Utente("Alberto", "1234"));
    }

    public static synchronized PersistenzaUtente creaIstanza() {
        if (SINGLETON == null) {
            SINGLETON = new PersistenzaUtente();
        }
        return SINGLETON;
    }

    @Override
    public void create(Utente obj) throws IllegalArgumentException {
        if (!elenco.containsKey(obj.getUsername())) {
            Utente newObj = new Utente(obj);
            elenco.put(newObj.getUsername(), newObj);
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
        } else {
            throw new IllegalArgumentException("Utente già esistente");
        }
    }

    @Override
    public void delete(Utente obj) throws IllegalArgumentException {
        if (elenco.containsKey(obj.getUsername())) {
            elenco.remove(obj.getUsername());
        } else {
            throw new IllegalArgumentException("Utente già eliminato");
        }
    }

    @Override
    public Object elenco() {
        return null;
    }

//    private void save(String path) {
//        try {
//            FileOutputStream file = new FileOutputStream(path);
//            ObjectOutputStream obj = new ObjectOutputStream(file);
//            obj.writeObject(elenco);
//            obj.close();
//        } catch (FileNotFoundException ex) {
//
//        } catch (IOException ex) {
//
//        }
//    }
//
//    private HashMap<String, Utente> load(String path) {
//        try {
//            ObjectInputStream obj = new ObjectInputStream(new FileInputStream(path));
//            return (HashMap<String, Utente>) obj.readObject();
//        } catch (FileNotFoundException ex) {
//            return new HashMap<>();
//        } catch (IOException | ClassNotFoundException ex) {
//            return new HashMap<>();
//        }
    }
