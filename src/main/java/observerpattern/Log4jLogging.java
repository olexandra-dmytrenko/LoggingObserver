package observerpattern;

import org.apache.log4j.Logger;

/**
 * Created by Oleksandra_Dmytrenko on 6/15/2016.
 */
public class Log4jLogging {

    //The root logger resides at the top of the logger hierarchy.
    // It always exists, cannot be retrieved by name.
    private static Logger loggerRoot = Logger.getRootLogger();
    private static Logger logger = Logger.getLogger(Log4jLogging.class.getName());
    private static Logger loggerPack = Logger.getLogger("observerpattern");


    public static void main(String[] args) {
//        loggerRoot.setLevel(Level.ERROR);
//        loggerPack.setLevel(Level.DEBUG);
        //logger.setLevel(Level.INFO);
        logger.warn("Hello warning");
        logger.info("Hello info");
//        loggerPack.debug("Hello debug");
        logger.debug("Hello debug");
    }
}
