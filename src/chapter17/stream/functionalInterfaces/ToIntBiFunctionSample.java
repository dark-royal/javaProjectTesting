package chapter17.stream.functionalInterfaces;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionSample {
    public static void main(String[] args) {
        ToIntBiFunction<Double,Double> toIntBiFunction = (number,number1)-> (int) (number * number1);
        System.out.println(toIntBiFunction.applyAsInt(4.6,5.7));
    }
}
