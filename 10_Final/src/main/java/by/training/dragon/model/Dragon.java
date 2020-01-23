package by.training.dragon.model;

import java.util.ArrayList;

public class Dragon {

    private ArrayList<Treasure> treasures = new ArrayList<>();
    private static Treasure THEMOSTEXPENSIVE;

    static{
        THEMOSTEXPENSIVE =  new Treasure(null,0);
    }

    public void addTreasure(Treasure treasure){
        treasures.add(treasure);
        if (treasure.getPrice() > THEMOSTEXPENSIVE.getPrice())
            THEMOSTEXPENSIVE = treasure;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public Treasure getTheMostExpensive(){
        return THEMOSTEXPENSIVE;
    }

    public void setTheMostExpensive(Treasure treasure){
        THEMOSTEXPENSIVE = treasure;
    }
}
