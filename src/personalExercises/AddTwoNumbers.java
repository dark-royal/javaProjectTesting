package personalExercises;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {

    public static void main(String[] args) {
        List<Integer> digits = new ArrayList<Integer>();
        int[] array = {2, 4, 3};
        int[] array1 = {5, 6, 4};

        System.out.println(addTwoNumber(array, array1));

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

        String sum1 = "";
        String sum2 = "";

        for (int k = 0; k < firstReversedArray.length; k++) {
            sum1 = sum1 + firstReversedArray[k];
            System.out.println(sum1);

        }
        for (int i = 0; i < secondReversedArray.length;i ++ ) {
           sum2 = sum2 + secondReversedArray[i];
            System.out.println(sum2);

        }

        int integerValueOfSum1 = Integer.parseInt(sum1);
        int integerValueOfSum2 = Integer.parseInt(sum2);

                    return integerValueOfSum1 + integerValueOfSum2;


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



