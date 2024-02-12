package fireDrillTwo;
import java.util.Scanner;
public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int average = 0;

        for(int count = 0; count <= 10; count++) {
            System.out.println("Enter scores");
            int scores = scanner.nextInt();
            sum += scores;
            if (count != 0) {
                average = sum / count;

            }
        }

        System.out.printf("The average is %d%n",average);

    }
}


