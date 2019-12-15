package by.training.branching.task27.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 Найти max{min(a, b), min(c, d)}
 */
public abstract class Maximum {

    private Maximum(){}

    private static final Logger log = LogManager.getLogger("log");
    public static void findMax(int a, int b, int c, int d) {
        log.log(Level.DEBUG, Math.max(Math.min(a,b), Math.min(c,d)));
    }
}