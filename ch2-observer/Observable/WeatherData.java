package Observable;

import java.util.Observable;

/**
 * 使用java.util内置的观察者模式实现
 * Created by jimersylee on 17-8-19.
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {

    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
