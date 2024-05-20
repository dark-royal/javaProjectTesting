package chapter15.streams;

import java.io.FileReader;
import java.io.IOException;

public class Example4 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\ClassFire\\src\\chapter15\\streams\\sample.txt";
        char[] fileChars = new char[1024];
        try(FileReader fileReader = new FileReader(fileLocation)){
            int length = fileReader.read(fileChars);
            for (int counter = 0; counter < length; counter++) {
                System.out.print(fileChars[counter]);

            }
        }catch (IOException exception){
            System.err.println("Error :" + exception.getMessage());
        }

    }
}
