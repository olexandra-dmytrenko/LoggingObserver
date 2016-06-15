package observerpattern;

/**
 * Created by Oleksandra_Dmytrenko on 6/15/2016.
 */
public class ObserverWeatherStation implements Observer {

    String information;
    public void update() {
        System.out.println("Update method " + information);
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
