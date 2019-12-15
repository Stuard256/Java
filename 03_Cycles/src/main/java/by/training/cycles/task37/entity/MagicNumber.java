package by.training.cycles.task37.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 *  Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа: первое число
 * получили путем написания сначала числа А, затем В. Для получения второго числа сначала записали
 * число В, затем А. Найти числа А и В если известно , что первое четырехзначное число нацело делится
 * на 99, а второе на 49
 */
public abstract class MagicNumber {
    private MagicNumber(){}

    private static final Logger log = LogManager.getLogger("log");

    public static void findNumbers(){
        for(int a = 10; a< 100; a++){
            for(int b = 10; b< 100; b++){
                if((a*100 + b)%99 == 0){
                    if((b*100 + a)%49 == 0){
                        log.log(Level.DEBUG, a);
                        log.log(Level.DEBUG, b);
                    }
                }
            }
        }
        log.log(Level.DEBUG, "magic!");

    }
}