package Observable;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData=new WeatherData();

        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80,30,33.2f);
    }
}
