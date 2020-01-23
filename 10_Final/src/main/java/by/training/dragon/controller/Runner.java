package by.training.dragon.controller;

import by.training.dragon.model.Dragon;
import by.training.dragon.view.TreasuresObserver;
import by.training.payment.model.Payment;
import by.training.textfile.view.FileView;

import java.io.IOException;

public class Runner
{
    public static void main( String[] args ) {
        TreasuresObserver  treasuresObserver = new TreasuresObserver();
        treasuresObserver.showCommands();
        treasuresObserver.selectCommand();
    }
}
