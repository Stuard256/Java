package by.training.textfile.view;

import by.training.textfile.model.TextFile;
import by.training.textfile.service.TextFileValidator;

import java.io.IOException;
import java.util.Scanner;

public class FileView {
    TextFileValidator validator = new TextFileValidator();


    public void chooseOption() throws IOException {
        System.out.println("==================Text File Helper================");
        System.out.println("Your system path separator is " +  System.getProperty("file.separator"));
        System.out.println("Options list:");
        System.out.println("1 - Create file by absolute path & name");
        System.out.println("2 - Create file by name");
        System.out.println("3 - Create file by relative path & name");
        System.out.println("4 - Rename file");
        System.out.println("5 - Print file on console");
        System.out.println("6 - Add text to file");
        System.out.println("7 - Delete file");
        System.out.println("==================================================");
        System.out.println("Enter your choice:");
        try( Scanner scanner = new Scanner(System.in)){
            int option = scanner.nextInt();
            switch(option){
                case 1 -> validator.createByAbsolutePathAndName();
                //case 2 -> validator.
            }
        }

    }
}
