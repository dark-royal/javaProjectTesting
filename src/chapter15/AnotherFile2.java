package chapter15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnotherFile2 {
    public static void main(String[] args) throws IOException {

        String location = "";

        Path path = Paths.get(location);

        Files.delete(path);
        ;


    }

}
