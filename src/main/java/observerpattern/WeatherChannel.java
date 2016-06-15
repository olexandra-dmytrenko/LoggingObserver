package observerpattern;

/**
 * Created by Oleksandra_Dmytrenko on 6/15/2016.
 */
public class WeatherChannel {
    public static void main(String[] args) {
        Subject weather = new SubjectWeather();
        ObserverWeatherStation weatherStation = new ObserverWeatherStation();
        weather.registerObserver(weatherStation);
        weatherStation.setInformation("The temperature is 15 degrees");
        weather.notifyAllObservers();
    }
}
