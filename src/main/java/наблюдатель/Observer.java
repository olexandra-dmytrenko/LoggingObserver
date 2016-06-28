package наблюдатель;

import информация.Information;

import java.util.logging.Logger;

/**
 * Created by Oleksandra_Dmytrenko on 6/15/2016.
 */
public abstract class Observer {
    Logger log = Logger.getLogger("ABC");

    private Information information;

    public void fireUpdate() {
        log.info("Запустил передачу информации.");
    }

    public void setInformation(Information information) {
        this.information = information;
        log.info("Информацию получил.");
    }

    public Information getInformation() {
        return information;
    }
}