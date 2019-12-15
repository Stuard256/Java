package by.training.branching.task4.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
    Составить программу: равны ли два числа а и b?
 */
public abstract class EqualNumbers {

    private EqualNumbers(){}

    private static final Logger log = LogManager.getLogger("log");
    public static void areNumbersEqual(int a, int b){
        if(a == b){
            log.log(Level.DEBUG, "Числа равны!");
        }
        else
            log.log(Level.DEBUG, "Числа не равны!");
    }
}