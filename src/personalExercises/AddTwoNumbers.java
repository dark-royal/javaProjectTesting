package personalExercises;

import java.util.Arrays;

public class AddTwoNumbers {

    public static void main(String[] args) {
        int[] array = {5, 4, 3};
        System.out.println(Arrays.toString(addTwoNumber(array, new int[]{2, 3, 4})));
    }


    private static int[] addTwoNumber(int[] firstArray, int[] secondArray) {

        int[] firstReversedArray = reverseSArray(firstArray);
        int[] secondReversedArray = reverseSArray(secondArray);

        for (int i = 0; i < firstReversedArray.length; i++) {
            firstArray[i] = firstReversedArray[i];
        }

            return firstArray;


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



