package chapter15.json;

import java.util.*;

public class Example1 {

    public static void main(String[] args) {
//        Collection<String> words = new TreeSet<>();
//        words.add("Happy");
//        words.add("Happy");
//        words.add("Happy");
//        words.add("Happy");

//        System.out.println(words);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        List<Integer> numbers1 = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);




        List<List<Integer>> lists = new ArrayList<>();
        lists.add(numbers);
        System.out.println(lists);

    }
}
