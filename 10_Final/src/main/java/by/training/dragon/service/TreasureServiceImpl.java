package by.training.dragon.service;

import by.training.dragon.model.Treasure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class TreasureServiceImpl implements TreasureService{
    private enum STATES{Golden,Silver,Pretty,Old,Rare,Charming,Roast,Glitter,Scam,Raw, Scary,Shiny,Dirty,Yellow,Copper, Magic, Annoying,Dark, Nasty, Boring}
    private enum NAMES{potato,banana,chips,belt,fury,monkey,beast,rat,cigarette,jam,apple,sock, goose, lens, pirate}

    @Override
    public Treasure randomTreasure(){
        STATES state = STATES.values()[new Random().nextInt(STATES.values().length)];
        NAMES name = NAMES.values()[new Random().nextInt(NAMES.values().length)];
        return new Treasure(state.name() + " "  + name.name(), new Random().nextInt(1000));
    }

    @Override
    public ArrayList<Treasure> selectForPrice(int maxPrice , List<Treasure> treasures){
        int totalSum = 0;
        ArrayList<Treasure> result = new ArrayList<>();
        Comparator<Treasure> comparator = Comparator.comparingInt(Treasure::getPrice);
        treasures.sort(comparator.reversed());
        for(Treasure treasure : treasures){
            int temp = totalSum + treasure.getPrice();
            if(temp < maxPrice){
                totalSum+= treasure.getPrice();
                result.add(treasure);
            }
        }
        return result;
    }

    @Override
    public int commonPrice(List<Treasure> treasures){
        int sum=0;
        for(Treasure treasure: treasures)
            sum+= treasure.getPrice();
        return sum;
    }
}
