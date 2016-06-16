package observerpattern;

import java.util.Random;

/**
 * Created by Oleksandra_Dmytrenko on 6/16/2016.
 */
public class Weather implements Information{
    private double temperature;
    private double humidity;
    private double pressure;

    public Weather() {
        new Weather(generateValueFromTo(-20, 40),
                generateValueFromTo(0, 100),
                generateValueFromTo(700, 800));
    }

    public Weather(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }

    private double generateValueFromTo(double min, double max) {
        Random r = new Random();
        return r.nextDouble() + ((max - min) + 1) + min;
    }
}
