package observerpattern;

/**
 * Created by Oleksandra_Dmytrenko on 6/15/2016.
 */
public class WatchWeather {
    public static void main(String[] args) {
        Subject weatherStation = new SubjectWeatherStation();

        ObserverWeatherChannel weatherChannel = new ObserverWeatherChannel();
        weatherStation.registerObserver(weatherChannel);

        Weather weather = new Weather(34.5, 123, 694);
        weatherStation.setInformation(weather);
        weatherStation.setInformation(new Weather(32, 432, 13));
        weatherStation.setInformation(new Weather());
    }
}