package controllore;

import dominio.Detection;
import dominio.Station;
import persistenza.IPersistance;
import view.IView;
import view.mainScene;

/**
 * Gestisce il layer di persistenza, verificando che tutti i dati inseriti siano
 * corretti, e che in uno scenario in cui il salvataggio avviene su File,
 * database, archivi ecc, non si "sporchi il DBMS" di valori inadeguati per lo
 * scenario.
 *
 * @author emanu
 */
public class Controller {

    private final IPersistance<Long, Detection> detectionList;
    private final IPersistance<String, Station> stationList;
    private final IView view;

    public Controller(IPersistance<Long, Detection> detectionList, IPersistance<String, Station> stationList, IView view) {
        this.detectionList = detectionList;
        this.stationList = stationList;
        this.view = view;
        view.setControllore(this);
    }

    public static void main(String[] args) {
        new mainScene().setVisible(true);
    }

    public IPersistance<Long, Detection> getDetectionList() {
        return detectionList;
    }

    public IPersistance<String, Station> getStationList() {
        return stationList;
    }
//    celsiusTemperatureTextField.getText(), pascalPressureTextField.getText(), 
//            timeInMillisecondsTextField.getText(), idDetectionTextField.getText());

    public void manageDetection(String wichStation, String wichCrudOperation, String celsiusTemperature, String pascalPressure, String timeInMilliseconds, String idDetection) {
        switch (wichCrudOperation) {
            case "Crea Rilevazione":
                checkCreateDetection(wichStation, new Float(celsiusTemperature), new Float(pascalPressure), new Long(timeInMilliseconds), new Long(idDetection));
                break;
            case "Leggi Rilevazione":

                break;
            case "Aggiorna Rilevazione":

                break;
            case "Rimuovi Rilevazione":

                break;
            default:

        }

    }
    
    public void addStation(String stationName){
        Station s = new Station(stationName);
        stationList.create(s);
        System.out.println("Ho creato la stazione di nome:" + stationName);
    }
    
    public void checkCreateDetection(String idStation, float celsiusTemperature, float pascalPressure, long timeInMilliseconds, long idDetection) {
        boolean validation = true;
        while (validation == true) {
            if (idStation.isEmpty()) {
                System.out.println("Campo id stazione vuoto!");
                validation = false;
            } else if (celsiusTemperature == 0) {
                System.out.println("Campo temperatura in celsius vuoto!");
                validation = false;
            } else if (pascalPressure == 0) {
                System.out.println("Campo pressione in pascal vuoto!");
                validation = false;
            } else if (timeInMilliseconds == 0) {
                System.out.println("Campo tempo in millisecondi vuoto!");
                validation = false;
            } else if (idDetection == 0) {
                System.out.println("Campo id rilevazione vuoto!");
                validation = false;
            }
            Detection newObj = new Detection(idStation, celsiusTemperature, pascalPressure, timeInMilliseconds, idDetection);
            detectionList.create(newObj);
        }

    }

    public void readDetection(Long idDetection) {
        detectionList.read(idDetection);
    }

    public void checkCreateStation(String idStation) {
        Station s = new Station(idStation);
        stationList.create(s);
    }

//    public void checkUpdateDetection(Long idDetection){
//        
//        detectionList.update(Long.MIN_VALUE, newObj);
//    }
}
