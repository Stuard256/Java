package by.training.branching.task37.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
    Вычислить значение функции
    F(x) = {-x^2 }
 */
public abstract class Function {

    private Function(){}

    private static final Logger log = LogManager.getLogger("log");
    public static void findValue(double x) {
        double result;
        if(x >= 3){
            result = -x*x+3*x+9;
        }
        else{
            result = 1/(x*x*x -6);
        }
        log.log(Level.DEBUG, result);
    }
}