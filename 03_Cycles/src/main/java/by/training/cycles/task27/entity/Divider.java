package by.training.cycles.task27.entity;
import by.training.cycles.rubles.entity.Ruble;
import by.training.cycles.rubles.service.RubleService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и
 * самого числа. m и n вводятся с клавиатуры.
 */
public abstract class Divider {
    private Divider(){}

    private static final Logger log = LogManager.getLogger("log");




    public static void readNumbers(){
        int n, m;
        log.log(Level.DEBUG,"Enter your number n: ");
        try(Scanner scanner = new Scanner(System.in)){
            if(scanner.hasNextInt()){
                n = scanner.nextInt();
                log.log(Level.DEBUG,"Enter your number m: ");
                if(scanner.hasNextInt()){
                    m = scanner.nextInt();
                    findDividers(n,m);
                }
                else{
                    log.log(Level.ERROR, "Enter valid number m!");
                }
            }
            else{
                log.log(Level.ERROR, "Enter valid number n!");
            }
        }
        catch(Exception e){
            log.error(e.getMessage());
        }

    }
    private static void findDividers(int n, int m){
        HashSet<Integer> dividersList = new HashSet<>(); // нет повторяющихся значений
        while(n <= m){
            for(int i=n;i>0;i--){
                int b=n%i;
                if(b==0 && i!= 1 && i!= n)
                    dividersList.add(i);
            }
            n++;
        }
        for(int i : dividersList){
            log.log(Level.DEBUG, i);
        }

    }
}
