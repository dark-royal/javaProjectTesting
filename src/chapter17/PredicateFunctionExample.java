package chapter17;

import java.util.function.Predicate;

public class PredicateFunctionExample {
    public static void main(String[] args) {
        Predicate<String> predicate = (word)-> {
            return word.contains("a");
        };
        System.out.println(predicate.test("praise"));
    }
}
