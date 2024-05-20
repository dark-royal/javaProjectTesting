package mrFemiTask;

import java.util.Arrays;



public class Lowest {
    public static void main(String[] args) {
        int [] array = {9,3,12};
        System.out.println(Arrays.toString(getLowestPosition(array)));
    }

    public static int[] getLowestPosition(int[] numbers) {
        int [] copyNumber = copying(numbers);
        int [] result = new int[numbers.length];
        int [] sorted =  sortNumbers(numbers);
        for (int outer = 0; outer < copyNumber.length; outer++) {
            for (int innerLoop = 0; innerLoop < copyNumber.length; innerLoop++) {
                if (copyNumber[outer] == sorted[innerLoop]) {
                    result[outer] = innerLoop + 1;
                }
            }
        }
        return result;
    }


    private static int[] copying(int[] numbers) {
        int [] result = new int[numbers.length];
        for (int count = 0; count < numbers.length; count++){
            result[count] = numbers[count];
            //System.out.println(Arrays.toString(result));
        }
        return result;
    }

    private static int [] sortNumbers(int[] numbers) {

        for (int outterloop = 0 ; outterloop < numbers.length; outterloop++){
            for (int innerLoop = 0; innerLoop < numbers.length; innerLoop++) {
                if (numbers[outterloop] < numbers[innerLoop]){
                    int temp = numbers[innerLoop];
                    numbers[innerLoop] = numbers[outterloop];
                    numbers[outterloop] = temp;
                }
            }
        }
        return numbers;
    }


}
/**
 * [10 , 3 , 6]
 * sort through the number in ascending order = [3,6,10]
 * position element in  this array [3,6,10] which is
 * 3 = position 1
 * 6 = position 2
 * 10 = position 3
 *
 * return an array that takes in these position and put them in the index of their value
 *
 */
