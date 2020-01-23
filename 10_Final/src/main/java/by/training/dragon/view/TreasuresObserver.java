package by.training.dragon.view;

import by.training.dragon.service.DragonServiceImpl;

import java.util.Scanner;

import static java.lang.System.exit;

public class TreasuresObserver {
      DragonServiceImpl dragonService = new DragonServiceImpl();
    Scanner scanner = new Scanner(System.in);

    public void showCommands(){
        System.out.println("===LIST OF COMMANDS===");
        System.out.println("=== 1. Add random treasure ===");
        System.out.println("=== 2. Add couple of random treasures ===");
        System.out.println("=== 3. List of treasures ===");
        System.out.println("=== 4. Show the most expensive treasure ===");
        System.out.println("=== 5. Select sum of treasures ===");
        System.out.println("=== 6. Exit ===");
        System.out.println("==================================");
    }

    public void selectCommand(){
        System.out.println("=== Please select number: ===");
            if(scanner.hasNextInt()){
                switch(scanner.nextInt()){
                    case 1 ->  dragonService.addRandomTreasure();
                    case 2 ->  dragonService.addSomeRandomTreasures(askForNumber());
                    case 3 ->  dragonService.showTreasures();
                    case 4 ->  dragonService.showTheMostExpensive();
                    case 5 ->  dragonService.selectForPrice(askForNumber());
                    case 6 ->  exit(0);
                    default -> {
                        System.out.println("Enter valid number!");
                        selectCommand();
                    }
                }
            }else{
                System.out.println("Enter valid value!");
                selectCommand();
            }
            selectCommand();
    }

    private int askForNumber(){
        System.out.println("Please enter number:");
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                //scanner.close();
                return number;
            }
            else{
                //scanner.close();
                return 0;
        }
    }

}
