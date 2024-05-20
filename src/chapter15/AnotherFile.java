package chapter15;

import java.io.InputStream;
import java.net.URL;

public class AnotherFile {
    public static void main(String[] args) {
        try {
            String location = "http://www.google.com";
            URL url = new URL(location);
            InputStream inputStream = url.openStream();

            byte[] bytes = inputStream.readAllBytes();

            for (byte data : bytes) {
                System.out.println(Character.toString(data));
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();

        }
    }
}

