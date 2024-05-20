import java.util.Scanner;

public class Esther {
    public static void main(String[] args) {
        int sum = 0;
        double average = 0.0;

        for (int i = 0; i < 10; i++) {
            sum += i;
            average = (double) sum % i;

        }
        System.out.println(sum);
        System.out.println(average);
    }
}
