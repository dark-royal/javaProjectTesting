package chapter17.stream.functionalInterfaces;

import java.util.function.DoubleFunction;

public class DoubleFunctionSample {
    public static void main(String[] args) {
        DoubleFunction<Double> doubleFunction = (number)-> number * number;
        System.out.println(doubleFunction.apply(5.7));
    }
}
