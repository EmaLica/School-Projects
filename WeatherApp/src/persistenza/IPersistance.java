package persistenza;

import java.io.Serializable;

/**
 * Faccio una interfaccia generica
 * Interfaccia persistenza rilevazione
 * Interfaccia persistenza stazione
 * @author emanu
 * @param <TipoChiave> 
 * @param <TipoOggetto>
 */
//tipoChiave extends Number se voglio che i valori siano solo numeri
public interface IPersistance<TipoChiave, TipoOggetto extends Serializable> {
    //COME SE FOSSE INTERFACE DETECTION
    public void create(TipoOggetto obj) throws IllegalArgumentException;
    public TipoOggetto read(TipoChiave idObject) throws IllegalArgumentException;
    public void update(TipoChiave idObject, TipoOggetto newObj) throws IllegalArgumentException;
    public void delete(TipoOggetto obj) throws IllegalArgumentException;
}
