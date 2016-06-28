package наблюдатель;

import java.util.logging.Logger;

/**
 * Created by olexandra on 6/28/16.
 */
public class ObserverWeatherChannel extends Observer{
    @Override
    public void fireUpdate() {
        super.fireUpdate();
        System.out.printf("New feed: " + getInformation());
        Logger.getLogger(this.getClass().getName()).info("Закончил передачу информации");
    }
}