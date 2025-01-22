package persistenza;

import dominio.Detection;
import java.util.HashMap;

/**
 *
 * @author emanu
 */
public class PersistanceDetectionFile implements IPersistance<Long, Detection>{
    
    private final HashMap<Long, Detection> detectionList = new HashMap<>();
    
    @Override
    public void create(Detection obj) throws IllegalArgumentException {
        detectionList.put(obj.getIdDetection(), obj);
    }

    @Override
    public Detection read(Long idDetection) throws IllegalArgumentException {
        return detectionList.get(idDetection);
    }

    @Override
    public void update(Long idDetection, Detection newObj) throws IllegalArgumentException {
        detectionList.replace(idDetection, newObj);
    }

    @Override
    public void delete(Detection obj) throws IllegalArgumentException {
        detectionList.remove(obj);
    }
    
}
