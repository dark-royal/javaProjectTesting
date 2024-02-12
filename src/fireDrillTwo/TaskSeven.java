package fireDrillTwo;
import java.util.Scanner;
public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int average = 0;


        for (int count = 1; count <= 10; count++) {
            System.out.println("Enter scores");
            int scores = scanner.nextInt();

            if (scores % 2 == 0) {
                sum += scores;
                average = sum / count;

            }
        }
        System.out.println("The sum is " + sum);
        System.out.println("The average is" + average);

    }
}
