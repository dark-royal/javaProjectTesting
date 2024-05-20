package chapter15.streams;

import java.io.IOException;
import java.io.PrintStream;

public class Example2 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\ClassFire\\src\\chapter15\\streams\\sample.txt";
        try(PrintStream printStream = new PrintStream(fileLocation)){
           printStream.println("Hello World");
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }

    }
}
