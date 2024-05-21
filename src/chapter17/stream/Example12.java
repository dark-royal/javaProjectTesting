package chapter17.stream;

import java.util.List;

public class Example12 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,30,40,50);

        numbers = numbers.stream().limit(2).toList();
        System.out.println(numbers);
    }
}
