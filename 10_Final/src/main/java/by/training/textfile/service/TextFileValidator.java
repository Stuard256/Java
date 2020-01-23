package by.training.textfile.service;

import by.training.textfile.model.TextFile;

import java.io.IOException;
import java.util.Scanner;

public class TextFileValidator extends TextFile {

    public void createByAbsolutePathAndName() throws IOException {
        System.out.println("You chose creating file by absolute path & name");
        String path;
        String name;
        System.out.println("Please enter path");
        try(Scanner scanner = new Scanner(System.in)){
            path = scanner.next();
            System.out.println("Please enter filename (without .txt)");
            name = scanner.next();
            super.createByAbsolutePathAndName(path, name);
        }
    }

    public void createByName() throws IOException {
        System.out.println("You chose creating file by name");
        String name;
        System.out.println("Please enter name");
        try(Scanner scanner = new Scanner(System.in)){
            name = scanner.next();
            super.createByName(name);
        }
    }

    public void createByRelativePathAndName() throws IOException {
        System.out.println("You chose creating file by relative path & name");
        String path;
        String name;
        System.out.println("Please enter relative path");
        try(Scanner scanner = new Scanner(System.in)){
            path = scanner.next();
            System.out.println("Please enter filename (without .txt)");
            name = scanner.next();
            super.createByRelativePathAndName(path, name);
        }
    }

    public void rename(){
        System.out.println("You chose renaming file");
        System.out.println("Please enter new name");
        try(Scanner scanner = new Scanner(System.in)){
            if(super.rename(scanner.next())){
                System.out.println("File was renamed successfully");
            }
            else{
                System.out.println("Something bad happened :(");
            }
        }
    }

    public void printFile() throws IOException {
        super.printFile();
    }
}
