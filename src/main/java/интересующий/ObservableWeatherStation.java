package интересующий;

import информация.Information;
import наблюдатель.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Oleksandra_Dmytrenko on 6/15/2016.
 */
public class ObservableWeatherStation extends Observable {
    private List<Observer> observers = new ArrayList<>();

    public void notifyAllObservers() {
        observers.stream().forEach(o -> o.setInformation(information));

//        for (Observer o : observers) {
//            o.setInformation(information);
//        }
        observers.stream()
                .peek(o -> Logger.getLogger(this.getClass().getName()).log(Level.ALL, "initiate firing of the update for observer " + o))
                .peek(System.out::println)
                .forEach(Observer::fireUpdate);
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
