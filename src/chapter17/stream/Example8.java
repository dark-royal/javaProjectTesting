package chapter17.stream;

import java.util.List;

public class Example8 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,4,7,1,6,9,2);
        List<Integer> result = numbers.stream().distinct().sorted().toList();
        System.out.println(result);
    }
}
