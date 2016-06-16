package observerpattern;

/**
 * Created by Oleksandra_Dmytrenko on 6/15/2016.
 */
public interface Observer {

    void fireUpdate();
    void setInformation(Information information);
    }