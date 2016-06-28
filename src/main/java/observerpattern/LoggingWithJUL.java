package observerpattern;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 * Created by olexandra on 6/29/16.
 */
public class LoggingWithJUL {
    private static Logger logger = Logger.getLogger(WatchWeather.class.getName());

    public static void main(String[] args) {
        logger.info("Hello World");
        System.out.println("Hello World!");
        Handler[] handlers = Logger.getLogger("").getHandlers();
        Stream.of(handlers).forEach(h -> h.setLevel(Level.ALL));
//        for (Handler handler : handlers) { // 1
//            handler.setLevel(Level.FINEST);
//            handler.setLevel(Level.ALL);
//        }
        logger.setLevel(Level.FINER); // 2
        logger.finer("The finest and tiniest we can ever want to output");
        logger.finest("message");
    }
}
