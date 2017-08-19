package Observable;

import java.util.Observable;
import java.util.Observer;

/**
 * 天气状况布告板
 * Created by jimersylee on 17-8-19.
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }


    public void update(Observable obs,Object arg){
        if(obs instanceof WeatherData){
            WeatherData weatherData=(WeatherData)obs;
            this.temperature=weatherData.getTemperature();
            this.humidity=weatherData.getHumidity();
            display();
        }
    }

    public void display(){
        System.out.println("Current conditions:"+temperature+"F degrees and "+humidity+"% humidity");
    }



}
