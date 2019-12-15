package by.training.branching.season.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Создать программу, которая по цифре месяца определяет пору года
 */
public abstract class Season {
    private enum Seasons{SPRING, SUMMER, AUTUMN, WINTER,UNDEFINED}

    private static final Logger log = LogManager.getLogger("log");

    private Season(){ }

    public static void showSeason(byte month){
        Seasons season;
        switch (month) {
            case 12, 1, 2 -> season = Seasons.WINTER;
            case 3, 4, 5 -> season = Seasons.SPRING;
            case 6, 7, 8 -> season = Seasons.SUMMER;
            case 9, 10, 11 -> season = Seasons.AUTUMN;
            default -> season = Seasons.UNDEFINED;
        }
        if(!season.name().isEmpty())
            log.log(Level.DEBUG, season);
    }
}

