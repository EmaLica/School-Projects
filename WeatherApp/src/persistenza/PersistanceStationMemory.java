package persistenza;

import dominio.Station;
import java.util.HashMap;

/**
 * Questa classe permette di creare in memoria una persistenza di stazioni, ognuna contiene rilevazioni.
 * @author emanu
 */
public class PersistanceStationMemory implements IPersistance<String, Station>{

    private HashMap<String, Station> stationList = new HashMap<>();
    
    @Override
    public void create(Station obj) throws IllegalArgumentException {
        stationList.put(obj.getStationId(), obj);
    }

    @Override
    public Station read(String idStation) throws IllegalArgumentException {
        return stationList.get(idStation);
    }

    @Override
    public void update(String idStation, Station newObj) throws IllegalArgumentException {
        stationList.replace(idStation, newObj);
    }

    @Override
    public void delete(Station obj) throws IllegalArgumentException {
        stationList.remove(obj);
    }


    
}
