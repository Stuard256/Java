package by.training.dragon.service;

import by.training.dragon.model.Dragon;
import by.training.dragon.model.Treasure;

import java.util.ArrayList;

public class DragonServiceImpl implements DragonService{
    static Dragon dragon = new Dragon();
    TreasureServiceImpl treasureService = new TreasureServiceImpl();

    @Override
    public void addRandomTreasure(){
        Treasure treasure = treasureService.randomTreasure();
        dragon.addTreasure(treasure);
        if (treasure.getPrice() > dragon.getTheMostExpensive().getPrice())
            dragon.setTheMostExpensive(treasure);
    }

    @Override
    public void addSomeRandomTreasures(int number){
        for(int i = 0;i < number;i++){
            addRandomTreasure();
        }
    }

    @Override
    public void showTreasures(){
        if(dragon.getTreasures().isEmpty())
            System.out.println("Unfortunately, our dragon doesn't have any treasures yet");
        for(Treasure tr : dragon.getTreasures()){
            System.out.println(tr.toString());
        }
    }

    @Override
    public void showTreasures(ArrayList<Treasure> treasures){
        for(Treasure tr : treasures){
            System.out.println(tr.toString());
        }
    }

    @Override
    public void selectForPrice(int price){
        ArrayList<Treasure> result = treasureService.selectForPrice(price,dragon.getTreasures());
        System.out.println("Selected treasures for "+  price + " are:");
        showTreasures(result);
        System.out.println("Their common price is: " + treasureService.commonPrice(result));

    }

    @Override
    public void showTheMostExpensive(){
        System.out.println("Dragon's most expensive treasure is " + dragon.getTheMostExpensive().getName() + ", which costs " + dragon.getTheMostExpensive().getPrice());
    }
}
