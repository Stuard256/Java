package by.training.cycles.task4.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100
 * включительно.
 */
public abstract class EvenNumber {

    private EvenNumber(){}

    private static final Logger log = LogManager.getLogger("log");
    public static void printEvenNumbers(){
        int x = 2;
        while(x <= 100){
            log.log(Level.DEBUG, x );
            x = x + 2;
        }
    }
}
