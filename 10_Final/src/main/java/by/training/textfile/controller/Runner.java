package by.training.textfile.controller;

import by.training.textfile.view.FileView;

import java.io.IOException;

public class Runner
{
    public static void main( String[] args ) throws IOException {
        FileView fv = new FileView();
        fv.chooseOption();
    }
}
