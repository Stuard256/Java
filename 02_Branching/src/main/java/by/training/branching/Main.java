package by.training.branching;

import by.training.branching.season.entity.Season;
import by.training.branching.task14.entity.Triangle;
import by.training.branching.task27.entity.Maximum;
import by.training.branching.task37.entity.Function;
import by.training.branching.task4.entity.EqualNumbers;

public class Main {

    public static void main(String[] args) {
	    Season.showSeason((byte)1);
        EqualNumbers.areNumbersEqual(2,20);
        Triangle.doesTriangleExist(125,90);
        Maximum.findMax(2,6,4,128);
        Function.findValue(31.3);
    }
}
