package dominio;

import java.io.Serializable;

/**
 * Relazione uno a molti unidirezionale Relazione uno a molti bidirezionale
 * one-to-many bidirectional association
 * @author emanu
 */
public class Detection implements Serializable {

    private String idStation;
    private float celsiusTemperature;
    private float pascalPressure;
    private long timeInMilliseconds;
    private final long idDetection;
    private static long idCounter = 1;

    public Detection() {
        idDetection = idCounter;
        idCounter++;
    }

    public Detection(String idStation, float celsiusTemperature, float pascalPressure, long timeInMilliseconds, long idDetection) {
        this.idStation = idStation;
        this.celsiusTemperature = celsiusTemperature;
        this.pascalPressure = pascalPressure;
        this.timeInMilliseconds = timeInMilliseconds;
        this.idDetection = idDetection;
    }

    public String getIdStation() {
        return idStation;
    }

    public float getCelsiusTemperature() {
        return celsiusTemperature;
    }

    public float getPascalPressure() {
        return pascalPressure;
    }

    public long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }

    public long getIdDetection() {
        return idDetection;
    }

}
