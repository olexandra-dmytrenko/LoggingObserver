package observerpattern;

/**
 * Created by Oleksandra_Dmytrenko on 6/15/2016.
 */
public interface Subject {

    void notifyAllObservers();

    void registerObserver(Observer o);

    void unregisterObserver(Observer o);
}
