package chapter17.stream.functionalInterfaces;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionSample {
    public static void main(String[] args) {
        ToDoubleBiFunction<Double,Double> toDoubleBiFunction = (number1, number2)-> number1 - number2;
        System.out.println(toDoubleBiFunction.applyAsDouble(6.8,4.5));
    }
}
