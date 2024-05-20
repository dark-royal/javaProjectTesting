package mrFemiTask;


import java.util.ArrayList;
import java.util.Arrays;

public class Multiplication {
    public static void main(String[] args) {
        int[] scores = {3,2,0,-1,7,0,8};
        System.out.println(Arrays.toString(moveZeroToLast(scores)));
    }


    public static int getLargestMultiplication(int [] numbers) {

        if(numbers.length < 2){
            throw new RuntimeException("Enter number greater than 0");
        }
        int largestMultiplication = numbers[0];



        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                int multiplication = numbers[i] * numbers[j];
                if(multiplication > largestMultiplication){
                    largestMultiplication = multiplication;
                }



            }
        }
            return largestMultiplication;
        }

        public static int[] moveZeroToLast(int[] number){
            for(int index = 0; index < number.length; index++){
                for (int i = index + 1; i < number.length; i++) {
                    if(number[index] == 0){
                        number[index] = number[i];
                        number[i] = 0;
                    }

                }
            }
            return number;
        }

    }


