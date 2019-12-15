package by.training.branching.task14.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он
 прямоугольным.
 */
public abstract class Triangle {

    private Triangle(){}

    private static final Logger log = LogManager.getLogger("log");
    public static void doesTriangleExist(double a, double b){
        if(a + b < 180){
            log.log(Level.DEBUG, "Треугольник существует!");
            if(a == 90 || b == 90 || a+b == 90){
                log.log(Level.DEBUG, "Треугольник прямоугольный!");
            }
        }
        else
            log.log(Level.DEBUG, "Треугольник не существует!");
    }
}