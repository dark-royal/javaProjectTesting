package chapter17.stream;

import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<String> numbers = List.of("ERTY","FGHJ","RTYUI", "TYUI");
        numbers.stream()
                .map((word)->word.length())
                .forEach(System.out::println);
    }
}
























































