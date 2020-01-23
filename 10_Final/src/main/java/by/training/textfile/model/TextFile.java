package by.training.textfile.model;

//Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
//        вывести на консоль содержимое, дополнить, удалить.

import java.io.*;

public class TextFile {
    String fileSeparator = System.getProperty("file.separator"); // for platform independence
    File file;

    protected void createByAbsolutePathAndName(String absoluteFilePath, String name) throws IOException {
        //absolute file name with path
        String absoluteFilePathAndName = absoluteFilePath + fileSeparator + name + ".txt";
        file = new File(absoluteFilePath);
        if(file.createNewFile()){
            System.out.println(absoluteFilePathAndName+" File Created");
        }else System.out.println("File "+absoluteFilePathAndName+" already exists");
    }

    protected void createByName(String name) throws IOException {
        //file name only
        file = new File(name + ".txt");
        if(file.createNewFile()){
            System.out.println("File " + name  + " created in Project root directory");
        }else System.out.println("File " + name  + " already exists in the project root directory");
    }

    protected void createByRelativePathAndName(String relativePath,String name) throws IOException {
        //relative path
        String relativePathAndName = relativePath + fileSeparator + name + ".txt";
        file = new File(relativePathAndName);
        if(file.createNewFile()){
            System.out.println(relativePathAndName+" File Created in Project root directory");
        }else System.out.println("File "+relativePathAndName+" already exists in the project root directory");
    }

    /**
     * TODO: Доделать эту функцию
     * @param name - во что переименовываем
     * @return булевое значение , переименовал или нет (ошибка)
     */
    protected boolean rename(String name){
        File f2 = new File(file.getAbsolutePath());
        System.out.println(file.getAbsolutePath());
        return file.renameTo(f2);
        // if b is true, then the file has been renamed successfully
    }


    public void printFile() throws IOException{
        InputStream input = new BufferedInputStream(new FileInputStream(this.file));
        byte[] buffer = new byte[8192];

        try {
            for (int length = 0; (length = input.read(buffer)) != -1;) {
                System.out.write(buffer, 0, length);
            }
        } finally {
            input.close();
        }
    }

    public void delete() throws IOException{
        if(file.delete())
            System.out.println("File deleted successfully");
        else
            System.out.println("Error while deleting file");
    }
}

