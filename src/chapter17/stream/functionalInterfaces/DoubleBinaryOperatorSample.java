package chapter17.stream.functionalInterfaces;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorSample {
    public static void main(String[] args) {
        DoubleBinaryOperator doubleBinaryOperator = (number1,number2)-> number1 + number2;
        System.out.println(doubleBinaryOperator.applyAsDouble(2.5,5.6));
    }


}