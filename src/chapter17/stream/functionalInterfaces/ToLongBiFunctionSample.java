package chapter17.stream.functionalInterfaces;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionSample {
    public static void main(String[] args) {
        ToLongBiFunction<Long, Long> toLongBiFunction= (number1,number2)-> number1 + number2;
        System.out.println(toLongBiFunction.applyAsLong(5L, 60L));
    }
}
