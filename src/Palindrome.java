import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int count = 0;
        int originalNum = number;


        int reverseNumber = 0;
        while (number > 0) {
            int cals = number % 10;
            reverseNumber = (reverseNumber * 10) + cals;
            number = number / 10;

        }

        if(originalNum == reverseNumber){
            System.out.println("it is a palindrome");
        }

        else {
            System.out.println("it is not a palindrome");
        }
    }
}


