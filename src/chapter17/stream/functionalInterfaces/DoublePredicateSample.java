package chapter17.stream.functionalInterfaces;

import java.util.function.DoublePredicate;

public class DoublePredicateSample {
    public static void main(String[] args) {
        DoublePredicate doublePredicate = (number)-> number == number;
        System.out.println(doublePredicate.test(6));}
}
