package observerpattern;

import org.slf4j.*;

/**
 * Created by Oleksandra_Dmytrenko on 6/15/2016.
 */
public class Slf4jLogging {

    //The root logger resides at the top of the logger hierarchy.
    // It always exists, cannot be retrieved by name.
    private static Logger logger = LoggerFactory.getLogger(Slf4jLogging.class.getName());


    public static void main(String[] args) {
        logger.info("Hello {}", "Sasha");
    }
}
