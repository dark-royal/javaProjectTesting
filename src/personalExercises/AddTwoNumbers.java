package personalExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTwoNumbers {

    public static void main(String[] args) {
        List<Integer> digits = new ArrayList<Integer>();
        int[] array = {2,4,3};
        int[] array1 ={5,6,4};

        System.out.println(addTwoNumber(array,array1));

        int number = addTwoNumber(array,array1);
        while(number > 0){
            int digit = number % 10;
            number = number / 10;

            digits.add(digit);

            System.out.println(digits);
        }

  }


    private static int addTwoNumber(int[] firstArray, int[] secondArray) {

        int[] firstReversedArray = reverseSArray(firstArray);
        int[] secondReversedArray = reverseSArray(secondArray);
        StringBuilder sum1 = new StringBuilder();
        StringBuilder sum2 = new StringBuilder();
        int sum = 0;

        for (int k : firstReversedArray) {
            sum1.append(k);
        }
        for (int i : secondReversedArray) {
            sum2.append(i);

        }

                    return Integer.parseInt(sum1.toString()) + Integer.parseInt(sum2.toString());


    }
        private static int[] reverseSArray ( int[] array){
            int[] newArray = new int[array.length];
            int count = 0;
            for (int i = array.length - 1; i >= 0; i--) {
                newArray[count] = array[i];
                count++;
            }

            return newArray;
        }


    }



