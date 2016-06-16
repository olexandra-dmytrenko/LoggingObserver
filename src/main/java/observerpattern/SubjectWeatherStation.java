package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleksandra_Dmytrenko on 6/15/2016.
 */
public class SubjectWeatherStation extends Subject {
Information information;
    List<Observer> observers = new ArrayList<>();

    public void notifyAllObservers() {
        observers.stream().forEach(o -> o.setInformation(information));

//        for (Observer o : observers) {
//            o.setInformation(information);
//        }
        observers.stream().forEach(Observer::fireUpdate);
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void unregisterObserver(Observer o) {
    }

    public List<Observer> getObservers() {
        return observers;
    }
    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
        notifyAllObservers();

    }
}
