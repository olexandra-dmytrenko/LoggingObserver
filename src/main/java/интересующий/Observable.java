package интересующий;

import информация.Information;
import наблюдатель.Observer;

/**
 * Created by Oleksandra_Dmytrenko on 6/15/2016.
 */
public abstract class Observable {
    Information information;

    public abstract void notifyAllObservers();

    public abstract void registerObserver(Observer o);

    public abstract void unregisterObserver(Observer o);

    public void setInformation(Information information) {
        this.information = information;
    }
}
