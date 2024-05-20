package chapter15.streams;

import java.io.IOException;
import java.io.PrintStream;

public class Example1 {
    public static void main(String[] args) {
        try (PrintStream printStream =
                     new PrintStream("C:\\Users\\DELL\\IdeaProjects\\ClassFire\\src\\chapter15\\streams\\sample.txt")) {
            printStream.println("There is tide in the affairs of men");

        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
