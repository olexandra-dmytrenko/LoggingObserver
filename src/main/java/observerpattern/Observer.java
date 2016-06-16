package observerpattern;

/**
 * Created by Oleksandra_Dmytrenko on 6/15/2016.
 */
abstract class Observer {

    private Information information;

    abstract void fireUpdate();

    public void setInformation(Information information) {
        this.information = information;
    }
}