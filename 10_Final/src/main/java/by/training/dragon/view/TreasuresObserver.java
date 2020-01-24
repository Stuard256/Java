package by.training.dragon.view;

import by.training.dragon.service.DragonServiceImpl;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.System.exit;

public class TreasuresObserver {
    DragonServiceImpl dragonService = new DragonServiceImpl();
    Scanner scanner;

    private void initScanner(){
         scanner = new Scanner(System.in);
         scanner.useDelimiter("\n");
    }

    public void showCommands(){
        System.out.println("===LIST OF COMMANDS===");
        System.out.println("=== 1. Add random treasure ===");
        System.out.println("=== 2. Add couple of random treasures ===");
        System.out.println("=== 3. List of treasures ===");
        System.out.println("=== 4. Show the most expensive treasure ===");
        System.out.println("=== 5. Select sum of treasures ===");
        System.out.println("=== 6. Show list of commands ===");
        System.out.println("=== 7. Exit ===");
        System.out.println("==================================");
    }

    public void selectCommand()  throws InterruptedException{
        System.out.println("=== Please select number: ===");
        initScanner();
            try{
                switch(scanner.next()){
                    case "1" ->  dragonService.addRandomTreasure();
                    case "2" -> {
                        int number = askForNumber();
                        dragonService.addSomeRandomTreasures(number);
                    }
                    case "3" ->  dragonService.showTreasures();
                    case "4" ->  dragonService.showTheMostExpensive();
                    case "5" ->  dragonService.selectForPrice(askForNumber());
                    case "6" ->  showCommands();
                    case "7" -> {
                        scanner.close();
                        exit(0);
                    }
                    default -> {
                        System.err.println("Please enter valid number!");
                        //scanner.wait();
                    }
                }
            }catch(Error e){
                System.err.println(e.getMessage());
                //scanner.wait();
            }finally {
                //scanner.wait();
                //selectCommand();
            }
    }


    /**
     * TODO: Дописать обработку ошибок, ловить scanner на падении
     * @return
     */
    private int askForNumber() throws InterruptedException{
        int number;
        //initScanner();
        System.out.println("Please enter number:");
            if(scanner.hasNextInt()){
                number = scanner.nextInt();
            }
            else{
                System.err.println("Please enter valid number!");
                scanner.next();
                number = askForNumber();
            }
        //scanner.close();
        return number;
    }
}