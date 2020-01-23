package by.training.dragon.service;

import by.training.dragon.model.Treasure;

import java.util.ArrayList;
import java.util.List;

public interface TreasureService {

  Treasure randomTreasure();

  ArrayList<Treasure> selectForPrice(int maxPrice , List<Treasure> treasures);

  int commonPrice(List<Treasure> treasures);
}
