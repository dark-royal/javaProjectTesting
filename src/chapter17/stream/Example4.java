package chapter17.stream;

import chapter15.json.Transaction;

import java.math.BigDecimal;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<Transaction> numbers = List.of(new Transaction("12345","200"),
        new Transaction("14345","400"),
        new Transaction("12945","200"));

        numbers.stream()
                .filter((transaction) -> new BigDecimal(transaction.getAmount().substring(1).compareTo(new BigDecimal(100)) <= 0).forEach(System.out::println);


    }
}
