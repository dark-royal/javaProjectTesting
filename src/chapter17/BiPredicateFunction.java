package chapter17;

import java.util.function.BiPredicate;

public class BiPredicateFunction {
    public static void main(String[] args) {
//        BiPredicate<String,String> biPredicate = (precious,philip)-> precious.length() == philip.length();
//        BiPredicate<String,String> biPredicate = (precious,philip)-> precious.length() == philip.length();
//
            BiPredicate<String,Integer> biPredicate = (name,number)-> name.length() == number;
            System.out.println(biPredicate.test("precious", 8));

    }

}
