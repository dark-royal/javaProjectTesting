package chapter17;

import java.util.Random;
import java.util.function.Supplier;

public class Example1 {
    public static void main(String[] args) {
        Supplier<Integer> supplier = ()->new Random().nextInt();
        System.out.println(supplier.get());
    }
}
