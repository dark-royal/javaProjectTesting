package inputAndOutput;

import java.util.Arrays;

public class DifferenceOfLargestAndSmallest {
    public static int[] differnce(int[] array) {
        int maximum = array[0];
        int minimum = array[0];
        for (int index = 0; index < array.length; index++) {
                if (array[index] > maximum) {
                    maximum = array[index];
                }
                if (array[index] < minimum) {
                    minimum = array[index];

                }
            }


        return new int[]{maximum - minimum};
    }
}




