package chapter17.stream.functionalInterfaces;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionSample {
    public static void main(String[] args) {
        ToDoubleFunction<Double> toDoubleFunction = (number)-> number;
        System.out.println(toDoubleFunction.applyAsDouble(4.6));
    }
}
