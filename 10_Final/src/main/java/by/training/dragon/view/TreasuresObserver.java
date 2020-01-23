package by.training.dragon.view;

import by.training.dragon.service.DragonServiceImpl;

import java.util.Scanner;

public class TreasuresObserver {
      DragonServiceImpl dragonService = new DragonServiceImpl();

    public void showCommands(){
        System.out.println("===LIST OF COMMANDS===");
        System.out.println("=== 1. Add random treasure ===");
        System.out.println("=== 2. Add couple of random treasures ===");
        System.out.println("=== 3. List of treasures ===");
        System.out.println("=== 4. Show the most expensive treasure ===");
        System.out.println("=== 5. Select sum of treasures ===");
        System.out.println("==================================");
    }

    public void selectCommand(){
        System.out.println("=== Please select number: ===");
        try(Scanner scanner = new Scanner(System.in)){
            if(scanner.hasNextInt()){
                switch(scanner.nextInt()){
                    case 1 ->  dragonService.addRandomTreasure();
                    case 2 ->  dragonService.addSomeRandomTreasures(askForNumber());
                    case 3 ->  dragonService.showTreasures();
                    case 4 ->  dragonService.showTheMostExpensive();
                    case 5 ->  dragonService.selectForPrice(askForNumber());
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
    }

    private int askForNumber(){
        System.out.println("Please enter number:");
        try(Scanner scanner2 = new Scanner(System.in)){
            if(scanner2.hasNextInt()){
                int number = scanner2.nextInt();
                return number;
            }
            else{
                return 0;
        }
        }
    }

}
