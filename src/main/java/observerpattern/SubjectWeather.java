package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleksandra_Dmytrenko on 6/15/2016.
 */
public class SubjectWeather implements Subject {

    List<Observer> observers = new ArrayList<Observer>();

    public void notifyAllObservers() {
        observers.stream().forEach(Observer::update);
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void unregisterObserver(Observer o) {
    }
}
