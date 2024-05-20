package chapter17;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<String,Integer,Boolean> biFunction = (name, number)-> name.length() == number;
        System.out.println(biFunction.apply("praise", 6));
    }
}
