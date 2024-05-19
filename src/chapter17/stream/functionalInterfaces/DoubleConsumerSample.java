package chapter17.stream.functionalInterfaces;

import java.util.function.DoubleConsumer;

public class DoubleConsumerSample {
    public static void main(String[] args) {
        DoubleConsumer doubleConsumer = System.out::println;
        doubleConsumer.accept(5.6);
    }
}
