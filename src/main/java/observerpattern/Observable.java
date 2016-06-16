package observerpattern;

/**
 * Created by Oleksandra_Dmytrenko on 6/15/2016.
 */
abstract class Observable {
    Information information;

    abstract void notifyAllObservers();

    abstract void registerObserver(Observer o);

    abstract void unregisterObserver(Observer o);

    public void setInformation(Information information) {
        this.information = information;
    }
}
