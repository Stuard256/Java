package by.training.cycles.rubles.service;

import by.training.cycles.rubles.entity.Money;
import by.training.cycles.rubles.entity.Ruble;

import java.util.Scanner;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class RubleService {

    private RubleService(){}

    private static final Logger log = LogManager.getLogger("log");

    public static void read(){
        log.log(Level.DEBUG,"Enter your number between 0 and 9999: ");
        try(Scanner scanner = new Scanner(System.in)){
            if(scanner.hasNextInt()){
                RubleService.print(new Ruble(scanner.nextInt()));
            }
            else{
                log.log(Level.ERROR, "Enter valid number!");
            }
        }
        catch(Exception e){
            log.error(e.getMessage());
        }

    }

    static void print(Money ruble) {
        StringBuilder result = new StringBuilder();
        RubleParser rubleParser = new RubleParser();
        rubleParser.parse(ruble);

        printThousands(result, rubleParser.getThousands());
        printHundreds(result, rubleParser.getHundreds());
        printDozens(result, rubleParser.getDozens());
        printUnits(result, rubleParser);

        log.log(Level.DEBUG,result);
    }

    private static void printThousands(StringBuilder result, byte quantity){
        switch (quantity) {
            case 1 -> result.append("одна тысяча ");
            case 2 -> result.append("две тысячи ");
            case 3 -> result.append("три тысячи ");
            case 4 -> result.append("четыре тысячи ");
            case 5 -> result.append("пять тысяч ");
            case 6 -> result.append("шесть тысяч ");
            case 7 -> result.append("семь тысяч ");
            case 8 -> result.append("восемь тысяч ");
            case 9 -> result.append("девять тысяч ");
            default -> result.append("");
        }
    }

    private static void printHundreds(StringBuilder result, byte quantity){
        switch (quantity) {
            case 1 -> result.append("сто ");
            case 2 -> result.append("двести ");
            case 3 -> result.append("триста ");
            case 4 -> result.append("четыреста ");
            case 5 -> result.append("пятьсот ");
            case 6 -> result.append("шестьсот ");
            case 7 -> result.append("семьсот ");
            case 8 -> result.append("восемьсот ");
            case 9 -> result.append("девятьсот ");
            default -> result.append("");
        }
    }

    private static void printDozens(StringBuilder result, byte quantity){
        switch (quantity) {
            case 2 -> result.append("двадцать ");
            case 3 -> result.append("тридцать ");
            case 4 -> result.append("сорок ");
            case 5 -> result.append("пятьдесят ");
            case 6 -> result.append("шестьдесят ");
            case 7 -> result.append("семьдесят ");
            case 8 -> result.append("восемьдесят ");
            case 9 -> result.append("девяносто ");
            default -> result.append("");
        }
    }

    private static void printUnits(StringBuilder result, RubleParser rubleParser){
        byte dozens = rubleParser.getDozens();
        if (dozens == 1) {
            switch (rubleParser.getUnits()) {
                case 1 -> result.append("одиннадцать рублей");
                case 2 -> result.append("двенадцать рублей");
                case 3 -> result.append("тринадцать рублей");
                case 4 -> result.append("четырнадцать рублей");
                case 5 -> result.append("пятнадцать рублей");
                case 6 -> result.append("шестнадцать рублей");
                case 7 -> result.append("семнадцать рублей");
                case 8 -> result.append("восемнадцать рублей");
                case 9 -> result.append("девятнадцать рублей");
                default -> result.append("десять рублей");
            }
        } else {
            switch (rubleParser.getUnits()) {
                case 1 -> result.append("один рубль");
                case 2 -> result.append("два рубля");
                case 3 -> result.append("три рубля");
                case 4 -> result.append("четыре рубля");
                case 5 -> result.append("пять рублей");
                case 6 -> result.append("шесть рублей");
                case 7 -> result.append("семь рублей");
                case 8 -> result.append("восемь рублей");
                case 9 -> result.append("девять рублей");
                default -> checkNull(rubleParser, result);
            }
        }
    }

    private static void checkNull(RubleParser rubleParser, StringBuilder result){
        if (rubleParser.getThousands() == 0 && rubleParser.getHundreds() == 0 && rubleParser.getDozens() == 0) {
            result.append("ноль рублей");
        }
        else
            result.append("рублей");
    }
}
