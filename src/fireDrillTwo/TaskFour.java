package fireDrillTwo;

import java.util.Scanner;
public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int count = 1; count <= 10; count++){
            System.out.println("Enter score");
            int score = scanner.nextInt();

            if(count % 2 == 0){
                sum += count;
            }
        }
        System.out.println("The even indexes is " + sum);
    }
}
