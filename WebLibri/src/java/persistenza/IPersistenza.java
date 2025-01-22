package persistenza;

import java.io.Serializable;

public interface IPersistenza<TipoChiave, TipoOggetto extends Serializable> {
    public void create(TipoOggetto obj) throws IllegalArgumentException;
    public TipoOggetto read(TipoChiave codice) throws IllegalArgumentException;
    public void update(TipoChiave codice, TipoOggetto nuovoObj) throws IllegalArgumentException;
    public void delete(TipoOggetto obj) throws IllegalArgumentException;
    public Object elenco();
}