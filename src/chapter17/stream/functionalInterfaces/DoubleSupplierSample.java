package chapter17.stream.functionalInterfaces;

import java.util.function.DoubleSupplier;

public class DoubleSupplierSample {
    public static void main(String[] args) {
        DoubleSupplier doubleSupplier = ()-> Math.random() * 50;
        System.out.println(doubleSupplier.getAsDouble());

    }
}
