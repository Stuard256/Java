package by.training.dragon.service;

import by.training.dragon.model.Treasure;

import java.util.ArrayList;

public interface DragonService {

    void addRandomTreasure();

    void addSomeRandomTreasures(int number);

    void showTreasures();

    void showTreasures(ArrayList<Treasure> treasures);

    void selectForPrice(int price);

    void showTheMostExpensive();
}
