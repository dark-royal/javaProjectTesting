package chapter17.stream;

import java.util.List;

public class Example9 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,3,6,7,8,9,12,13);
        numbers.stream()
                .map((number)-> String.format("number = %d", number))
                .forEach(System.out::println);
    }
}
