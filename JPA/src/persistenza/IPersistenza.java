package persistenza;

import java.io.Serializable;
import java.util.List;

/**
 * @author emanu
 * @param <TipoChiave> Parametro chiave primaria con la quale si identifica l'oggetto
 * @param <TipoOggetto> Parametro oggetto
 */
public interface IPersistenza<TipoChiave, TipoOggetto extends Serializable> {
   
    public void create(TipoOggetto obj) throws IllegalArgumentException;
    public TipoOggetto read(TipoChiave idObject) throws IllegalArgumentException;
    public void update(TipoOggetto newObj) throws IllegalArgumentException;
    public void delete(TipoOggetto obj) throws IllegalArgumentException;
    
    public List<TipoOggetto> elencoCompleto();
}
