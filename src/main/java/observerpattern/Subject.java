package observerpattern;

/**
 * Created by Oleksandra_Dmytrenko on 6/15/2016.
 */
public abstract class Subject {
    Information information;

    abstract void notifyAllObservers();

    abstract void registerObserver(Observer o);

    abstract void unregisterObserver(Observer o);

    public  abstract void setInformation(Information information);
    }
