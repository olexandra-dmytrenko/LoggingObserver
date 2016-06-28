package observerpattern;

import интересующий.Observable;
import интересующий.ObservableWeatherStation;
import информация.Weather;
import наблюдатель.ObserverWeatherChannel;

/**
 * Created by Oleksandra_Dmytrenko on 6/15/2016.
 */
public class WatchWeather {
    public static void main(String[] args) {
        Observable weatherStation = new ObservableWeatherStation();

        ObserverWeatherChannel weatherChannel = new ObserverWeatherChannel();
        weatherStation.registerObserver(weatherChannel);

        Weather weather = new Weather(34.5, 123, 694);
        weatherStation.setInformation(weather);
        weatherStation.setInformation(new Weather(32, 432, 13));
        weatherStation.setInformation(new Weather());
    }
}
