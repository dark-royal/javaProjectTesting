package chapter17;

import java.util.Map;
import java.util.function.Function;

public class Example2 {
    public static void main(String[] args) {
//        Map<String, Integer> map = Map.
//    }
//}
        Function<String, Integer> function = String::length;
        System.out.println(function.apply("praise"));
    }
}