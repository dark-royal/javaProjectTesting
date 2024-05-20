package chapter15.streams;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example6 {
    public static void main(String[] args) throws IOException {
        String location = "C:\\Users\\DELL\\IdeaProjects\\ClassFire\\src\\chapter15\\streams\\Example6.java\\sample6.txt";
        Path path = Paths.get(location);

        BufferedWriter writer = Files.newBufferedWriter(path);
        writer.write("Happy birthday to me");
        writer.close();
    }
}
