package dominio;

import java.io.Serializable;

/**
 * Classe che implementa una stazione, una stazione contiene x numeri di rilevazioni.
 * @author emanu
 */
public class Station implements Serializable{
    
    private String stationId;
    
    public Station(){}
    
    public Station(String stationId){
        this.stationId = stationId;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }
    
}
