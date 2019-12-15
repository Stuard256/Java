package by.training.cycles.task14.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
 */
public abstract class SumOfFractions {
    private SumOfFractions(){}

    private static final Logger log = LogManager.getLogger("log");
    public static void printSum(double n){
        double sum = 0;
        while(n >= 1){
            sum += 1/n;
            n--;
        }
        log.log(Level.DEBUG, sum );

    }
}
