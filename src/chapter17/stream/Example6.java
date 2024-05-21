package chapter17.stream;

import java.util.stream.IntStream;

public class Example6 {
    public static void main(String[] args) {
        String word = "Hello";
        word.chars().filter((number) -> number > 100).mapToObj((number) -> Boolean.TRUE)
                .reduce(false, (a, b) -> a != b);
    }
}
