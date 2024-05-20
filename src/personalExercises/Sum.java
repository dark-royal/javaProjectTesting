package personalExercises;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter number");
        int number = scanner.nextInt();

        int cals = number % 10;
        number = number / 10;

        sum += number;

        System.out.println("The sum is " + sum);


    }
}
