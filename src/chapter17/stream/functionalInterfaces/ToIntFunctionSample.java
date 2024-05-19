package chapter17.stream.functionalInterfaces;

import java.util.function.ToIntFunction;

public class ToIntFunctionSample {
    public static void main(String[] args) {
        ToIntFunction<Integer> toIntFunction = (number)-> number * number;
        System.out.println(toIntFunction.applyAsInt(8));
    }
}
