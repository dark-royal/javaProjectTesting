package chapter17.stream.functionalInterfaces;

import java.util.function.ToLongFunction;

public class ToLongFunctionSample {
    public static void main(String[] args) {
        ToLongFunction<Long> toLongFunction = (number)-> number;
        System.out.println(toLongFunction.applyAsLong(78L));
    }
}
