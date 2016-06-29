package observerpattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

/**
 * Created by Oleksandra_Dmytrenko on 6/15/2016.
 */
public class Slf4jLogging {

    //The root logger resides at the top of the logger hierarchy.
    // It always exists, cannot be retrieved by name.
    private static Logger logger = LoggerFactory.getLogger(Slf4jLogging.class);


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("there");
        list.add(" ");
        list.add(":)");

        logger.info("Args: {}, {}, {}, {}", list.get(0), list.get(2), list.get(2), list.get(3));    }
}
