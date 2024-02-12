package fireDrillTwo;
import java.util.Scanner;
public class TaskEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for(int count = 1; count <= 10; count++) {
            System.out.println("Enter scores");
            int scores = scanner.nextInt();

            if (scores > 0 && scores <= 100){
            sum += scores;
        }
            else{
                System.out.println("Enter valid scores");
            }

        }
        System.out.println("The sum is " + sum);

    }
}
