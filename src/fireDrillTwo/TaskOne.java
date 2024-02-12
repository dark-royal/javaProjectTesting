package fireDrillTwo;
import java.util.Scanner;
public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for(int count = 0; count <= 10; count++){
            System.out.println("Enter scores");
            int scores = scanner.nextInt();

            sum += scores;

        }
        System.out.printf("The sum is %d", sum);
    }
}
